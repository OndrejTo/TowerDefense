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
