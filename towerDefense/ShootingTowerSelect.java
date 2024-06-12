import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ShootingTowerSelect here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ShootingTowerSelect extends Select
{
    /**
     * Act - do whatever the ShootingTowerSelect wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        selectMethod(this, new ShootingTower());
    }
}
