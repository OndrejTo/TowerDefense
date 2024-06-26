import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Actor
{
    
    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    
    public DamageContainer colision(Enemy enemy, FireBall lastFireBall, ElectricArea lastElectricArea)
    {
        Shoot shoot = (Shoot) getOneIntersectingObject(Shoot.class);
        if(shoot != null)
        {
            removeTouching(Shoot.class);
            return new DamageContainer(shoot.getDamage(), null, null);
        }
        FireBall fireBall = (FireBall) getOneIntersectingObject(FireBall.class);
        if(fireBall != null && fireBall != lastFireBall)
        {
           return new DamageContainer(fireBall.getDamage(), fireBall, null); 
        }
        Actor meteorite = getOneIntersectingObject(Meteorite.class);
        if(meteorite != null)
        {
            removeTouching(Meteorite.class);
            return new DamageContainer(100, null, null);
        }
        ElectricArea electricArea = (ElectricArea) getOneIntersectingObject(ElectricArea.class);
        if(electricArea != null && electricArea != lastElectricArea)
        {
           return new DamageContainer(electricArea.getDamage(), null, electricArea); 
        }
        return null;
    }
    
    public void destruction(Enemy enemy, int lives, int minReward, int maxReward)
    {
        if(lives<=0)
        {
            ((Playground) getWorld()).coinsControl(Greenfoot.getRandomNumber(maxReward-minReward+1)+minReward);
            getWorld().removeObject(enemy);
        }
    }
    
    public int pathFinder(Enemy enemy, int turn)
    {
        if(enemy.getX() >= 200 && turn==0)
        {
            enemy.turn(-90);
            turn++;
            return turn;
        }
        if(enemy.getX() >= 200 && enemy.getY() <= 180 && turn==1)
        {
            enemy.turn(90);
            turn++;
            return turn;
        }
        if(enemy.getX() >= 437 && enemy.getY() <= 180 && turn==2)
        {
            enemy.turn(90);
            turn++;
            return turn;
        }
        if(enemy.getX() >= 437 && enemy.getY() >= 444 && turn==3)
        {
            enemy.turn(-90);
            turn++;
            return turn;
        }
        if(enemy.getX() >= 754 && enemy.getY() >= 444 && turn==4)
        {
            enemy.turn(-90);
            turn++;
            return turn;
        }
        if(enemy.getX() >= 754 && enemy.getY() <= 320 && turn==5)
        {
            enemy.turn(90);
            turn++;
            return turn;
        }
        return turn;
    }
    
    public int slowdown(int initialSpeed)
    {
        if(isTouching(Glue.class))
        {
            return 0;
        }
        return initialSpeed;
    }
    
    public void damage(Enemy enemy, int damage)
    {
        if (enemy.isAtEdge())
        {
            ((Playground) getWorld()).livesControl(damage);
            getWorld().removeObject(enemy);
        }
    }
}
