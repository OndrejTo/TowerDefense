import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Airship here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Airship extends Enemy
{
    private int lifes=100;
    private int minReward = 10;
    private int maxReward = 20;
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
