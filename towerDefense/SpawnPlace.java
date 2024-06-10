import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SpawnPlace here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SpawnPlace extends Actor
{
    public boolean isEmpty = true;
    private boolean wasCreated = false;
    private int ID;
    /**
     * Act - do whatever the SpawnPlace wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(!wasCreated)
        {
            wasCreated = true;
            ((Playground) getWorld()).moreSpawnPlaces -= 1;
            ID = ((Playground) getWorld()).moreSpawnPlaces;
        }
        
        if (ID < 0)
        {
            getWorld().removeObject(this);
        }
    }
}
