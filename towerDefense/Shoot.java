import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Shoot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Shoot extends Actor
{
    private int damage;
    public Shoot(int damage)
    {
        this.damage = damage;
    }
    
    public void act()
    {
        move(7);
        colision();
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
}
