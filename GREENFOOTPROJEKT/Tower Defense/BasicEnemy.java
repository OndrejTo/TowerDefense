import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BasicEnemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BasicEnemy extends Actor
{
    /**
     * Act - do whatever the BasicEnemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(1); 
        if (isAtEdge()) 
        {
            getRekt();
            getWorld().removeObject(this);
        }
    }
    
    
    /**
     *  Sníží počet životů o 1, když se dotkne strany světa. (zatím to bude stačit)
     */    
    private void getRekt()
    {
        MyWorld world = (MyWorld) getWorld();
        LifeCounter lcount = world.getCounter();
        lcount.bumpCount(-1);
    }
}
