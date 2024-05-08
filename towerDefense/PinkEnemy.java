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
    public void act()
    {
        MouseInfo mi = Greenfoot.getMouseInfo();
        if (mi != null)
        {
            setLocation(mi.getX(), mi.getY());
        }
        lifes -= colision();
        destruction(this, lifes, minReward, maxReward);
    }
}
