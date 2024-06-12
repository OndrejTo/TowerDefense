import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MeteoritIcon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MeteoriteIcon extends Icon
{
    public void act()
    {
        MouseInfo mi = Greenfoot.getMouseInfo();
        if(mi != null && Greenfoot.mouseClicked(this)&&((Playground)getWorld()).coins >= 150)
        {
            ((Playground) getWorld()).meteoriteAtack();
            getWorld().removeObject(this);
        }
    }
}
