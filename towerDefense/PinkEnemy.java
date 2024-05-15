import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PinkEnemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PinkEnemy extends Enemy
{
    public int lifes = 20;
    private int minReward = 5;
    private int maxReward = 8;
    private FireBall lastFireBall;
    public void act()
    {
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
