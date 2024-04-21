import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BasicEnemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BasicEnemy extends Actor
{
    private int pathTimer;
    /**
     * Act - do whatever the BasicEnemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // pathFinder();
        // pathFinder2(); nevím jak udělat pronásledování trasy, ale nějak to vyřešíme lol
        // zatím tu bude:
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
    
    
    /**
     *  Nepřátel pronásleduje trasu pomocí timeru pathTimer (Varianta 1).
     */
    private void pathFinder() 
    {
        pathTimer++;
        if (pathTimer < 150) 
        {
            setLocation(getX()+1, getY());
        }
        if (pathTimer >= 150 && pathTimer < 360) 
        {
            setLocation(getX(), getY()+1);
        }
        if (pathTimer >= 360 && pathTimer < 470) 
        {
            setLocation(getX()+1, getY());
        }
        if (pathTimer >= 470) 
        {
            setLocation(getX(), getY()-1);
        }
    }

    /**
     *  Nepřátel pronásleduje trasu pomocí své pozice ve světě (Varianta 2).
     */
    
    private void pathFinder2() 
    {
        if (getX() < 160) 
        {
            setLocation(getX()+1, getY());
        }

        if (getX() >= 160 && getY() < getWorld().getHeight()/2+200) 
        {
            setLocation(getX(), getY()+1);
        }

        if (getY() >= getWorld().getHeight()/2+200) 
        {
            setLocation(getX()+1, getY());
        }
    }
}
