import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Select here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Select extends Actor
{
    public void selectMethod(Select select, Actor actor)
    {
        MouseInfo mi = Greenfoot.getMouseInfo();
        if(mi != null)
        {
            setLocation(mi.getX(), mi.getY());
            if (Greenfoot.mouseClicked(null)) 
            {
                getWorld().addObject(actor, getX(), getY());
                getWorld().removeObject(select);
            }
        }
    }
}
