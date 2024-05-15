import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CannonBall here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CannonBall extends Actor
{
    public int damage;
    public CannonBall(int damage)
    {
        this.damage = damage;
    }
    
    public void act()
    {
        move(6);
        hit();
        if(getWorld() != null)
        {
            
            colision();
        }
    }
    
    public void colision()
    {
        if(isAtEdge())
        {
            getWorld().removeObject(this);
        }
    }
    
    public int getDamage()
    {
        return damage;
    }
    
    public void hit()
    {
        if(isTouching(Enemy.class))
        {
            getWorld().addObject(new FireBall(damage), getX(), getY());
            getWorld().removeObject(this);
        }
    }
}
