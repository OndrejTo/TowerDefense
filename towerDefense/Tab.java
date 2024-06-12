import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tab here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tab extends Actor
{
    /**
     * Act - do whatever the Tab wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        String key = Greenfoot.getKey();
        if ("space".equals(key)) 
        {
            getWorld().removeObject(this);
        }
    }
}
