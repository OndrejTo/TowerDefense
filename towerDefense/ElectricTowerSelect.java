import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ElectricTowerSelect here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ElectricTowerSelect extends Select
{
    /**
     * Act - do whatever the ElectricTowerSelect wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        selectMethod(this, new ElectricTower());
    }
}
