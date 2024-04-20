import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    private int spawncycle = 30;
    private LifeCounter lcount;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Svět, counter a věci
        super(800, 600, 1);
        addObject(new Tower1(), getWidth()/2, getHeight()/2);
        addObject(new BasicEnemy(), 10, getHeight()/2-80);
        lcount = new LifeCounter();
        addObject(lcount, 84, 20);
    }
    
    public void act() 
    {
        /**
         *  Cykl spawnování nepřátel (teď 0.5s)
         */
        
        spawncycle--;
        if (spawncycle <= 0) 
        {
            spawncycle = 30;
            addObject(new BasicEnemy(), 10, getHeight()/2-80);
        }
    }
    
    /**
     *  Vrátí aktuální stav countru.
     */
    
    public LifeCounter getCounter()
    {
        return lcount;
    }
}
