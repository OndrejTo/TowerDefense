import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WrenchIcon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WrenchIcon extends Icon
{
    /**
     * Act - do whatever the WrenchIcon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        iconMehtod(this, new WrenchSelect(), 0);
    }
}
