import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class InfoContainer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LevelContainer extends Actor
{
    public GreenfootImage currentImage;
    public int damageLevel;
    public LevelContainer(GreenfootImage currentImage, int damageLevel)
    {
        this.currentImage = currentImage;
        this.damageLevel = damageLevel;
    }
}
