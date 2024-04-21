import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CannonBall here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CannonBall extends Actor
{
    private int ballLife = 3; // kolik může kulka zabít nepřátel než sama zmizí
    public CannonBall() 
    {
    }

    public void act()
    {
        if (isTouching(BasicEnemy.class)) 
        {
            // zatím to tak mám
            removeTouching(BasicEnemy.class);
            ballLife--;
            if (ballLife <= 0) getWorld().removeObject(this);
        }
        else if (isTouching(FastEnemy.class)) 
        {
            FastEnemy fe = (FastEnemy)getWorld().getObjects(FastEnemy.class).get(0);
            getWorld().addObject(new BasicEnemy(), fe.getX(),fe.getY());
            removeTouching(FastEnemy.class);
            ballLife = 1;
            if (ballLife <= 0) 
            {
                getWorld().removeObject(this);
            }
        }
        else if (isAtEdge()) 
        {
            getWorld().removeObject(this);
        }
        else {
            move(3);
        }
    }
}

