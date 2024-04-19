import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Shot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Shot extends Actor
{
    public Shot() 
    {
        GreenfootImage image = getImage();
        image.scale(10, 20);
        setImage(image);
    }
    public void act()
    {
        if (isAtEdge()) 
        {
        getWorld().removeObject(this);
        }
        else setLocation(getX(), getY()-10);
    }
}
