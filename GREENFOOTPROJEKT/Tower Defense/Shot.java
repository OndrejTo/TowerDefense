import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Shot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Shot extends Actor
{
    public Shot() 
    {
    }

    public void act()
    {
        if (isTouching(BasicEnemy.class)) 
        {
            // zatím to tak mám
            removeTouching(BasicEnemy.class);
            getWorld().removeObject(this);
        }
        else if (isTouching(FastEnemy.class)) 
        {
            FastEnemy fe = (FastEnemy)getWorld().getObjects(FastEnemy.class).get(0);
            getWorld().addObject(new BasicEnemy(), fe.getX(),fe.getY());
            removeTouching(FastEnemy.class);
            getWorld().removeObject(this);
        }
        else if (isAtEdge()) 
        {
            getWorld().removeObject(this);
        }
        else {
            move(15);
        }
    }
}

