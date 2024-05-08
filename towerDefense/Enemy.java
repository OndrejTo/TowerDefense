import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Actor
{
    private int lifes = 100;
    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    
    public int colision()
    {
        Shoot shoot = (Shoot) getOneIntersectingObject(Shoot.class);
        if(shoot != null)
        {
            removeTouching(Shoot.class);
            return shoot.getDamage();
        }
        return 0;
    }
    
    public void destruction(Enemy enemy, int lifes, int minReward, int maxReward)
    {
        if(lifes<=0)
        {
            ((Playground) getWorld()).coins += (Greenfoot.getRandomNumber(maxReward-minReward+1)+minReward);
            getWorld().removeObject(enemy);
        }
    }
}
