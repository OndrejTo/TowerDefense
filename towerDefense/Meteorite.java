import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Meteorit here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Meteorite extends Actor
{
    public Meteorite()
    {
        getImage().scale(75, 75);
        turn(90);
    }
    
    public void act()
    {
        if(getWorld() != null)
        {
            move(3);
            colision();
        }
        
    }
    
    public void colision()
    {
        if(isAtEdge())
        {
            getWorld().removeObject(this);
        }
    }
}
