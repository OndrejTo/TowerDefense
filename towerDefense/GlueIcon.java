import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GlueIcon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GlueIcon extends Actor
{
    /**
     * Act - do whatever the GlueIcon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        MouseInfo mi = Greenfoot.getMouseInfo();
        if(mi != null && Greenfoot.mouseClicked(this) && ((Playground)getWorld()).coins >= 75)
        {
            ((Playground) getWorld()).glueAtack(this);
            getWorld().addObject(new GlueSelect(), mi.getX(), mi.getY());
            getWorld().removeObject(this);
        }
    }
}
