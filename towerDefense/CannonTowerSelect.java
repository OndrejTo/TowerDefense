import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CannonSelect here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CannonTowerSelect extends Select
{
    /**
     * Act - do whatever the CannonSelect wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        selectMethod(this, new CannonTower());
    }
}
