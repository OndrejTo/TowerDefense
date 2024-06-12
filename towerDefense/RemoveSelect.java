import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RemoveSelect here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RemoveSelect extends Select
{
    public RemoveSelect()
    {
        getImage().scale(50, 50);
    }
    
    public void act()
    {
        MouseInfo mi = Greenfoot.getMouseInfo();
        if(mi != null)
        {
            setLocation(mi.getX(), mi.getY());
            if(Greenfoot.mouseClicked(null))
            {
                removeTouching(Tower.class);
                getWorld().removeObject(this);
            }
        }
    }
}
