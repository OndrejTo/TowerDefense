import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Icon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Icon extends Actor
{
    public void iconMehtod(Icon icon, Select select, int cost)
    {
        MouseInfo mi = Greenfoot.getMouseInfo();
        if(mi != null && Greenfoot.mouseClicked(icon) && ((Playground)getWorld()).coins >= cost)
        {
            getWorld().addObject(select, mi.getX(), mi.getY());
        }
    }
}
