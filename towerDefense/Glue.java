import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class Glue here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Glue extends Actor
{
    private int timer;
    /**
     * Act - do whatever the Glue wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        timer++;
        if(timer == 240)
        {
            getWorld().removeObject(this);
        }
    }
}
