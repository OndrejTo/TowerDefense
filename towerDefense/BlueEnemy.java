import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BlueEnemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BlueEnemy extends Enemy
{
    public int lifes = 10;
    private int minReward = 2;
    private int maxReward = 4;
    private FireBall lastFireBall;
    private int turn = 0;
    public void act()
    {
        move(3);
        turn = pathFinder(this, turn);
        MouseInfo mi = Greenfoot.getMouseInfo();
        if (mi != null)
        {
            setLocation(mi.getX(), mi.getY());
        }
        DamageContainer damageContainer = colision(this, lastFireBall);
        if (damageContainer != null)
        {
            lifes -= damageContainer.damage;
            lastFireBall = damageContainer.lastFireBall;
        }
        destruction(this, lifes, minReward, maxReward);
    }
}
