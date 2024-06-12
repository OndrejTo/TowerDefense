import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CannonIcon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CannonTowerIcon extends Icon
{
    /**
     * Act - do whatever the CannonIcon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        iconMehtod(this, new CannonTowerSelect(), 50);
    }
}