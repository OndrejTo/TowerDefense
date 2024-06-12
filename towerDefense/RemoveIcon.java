import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RemoveIcon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RemoveIcon extends Icon
{
    public RemoveIcon()
    {
        getImage().scale(75, 75);
    }
    
    public void act()
    {
        iconMehtod(this, new RemoveSelect(), 0);
    }
}
