import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class GlueSelect here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GlueSelect extends Actor
{
    private int timer;
    /**
     * Act - do whatever the GlueSelect wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        MouseInfo mi = Greenfoot.getMouseInfo();
        if(mi != null)
        {
            setLocation(mi.getX(), mi.getY());
            if (Greenfoot.mouseClicked(this)) 
            {
                getWorld().addObject(new Glue(), getX(), getY());
                getWorld().removeObject(this);
            }
        }
    }
}
