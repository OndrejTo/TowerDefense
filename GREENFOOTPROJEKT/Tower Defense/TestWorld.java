import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TestWorld extends World
{
    private int spawncycle = 30;
    private LifeCounter lcount;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public TestWorld()
    {    
        // Svět, counter a věci
        super(800, 600, 1);
        addObject(new Cannon(), getWidth()/2-100, getHeight()/2-100);
        addObject(new Turret(), getWidth()/2+100, getHeight()/2+100);
        lcount = new LifeCounter();
        addObject(lcount, 84, 20);
    }
    
    public void act() 
    {
        /**
         *  Cykl spawnování nepřátel (teď se přepíná mezi rychlým a základním)
         */
        
        spawncycle--;
        if (spawncycle == 15) 
        {
            addObject(new BasicEnemy(), 10, getHeight()/2);
        }
        if (spawncycle <= 0) 
        {
            spawncycle = 30;
            addObject(new FastEnemy(), 10, getHeight()/2);
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
