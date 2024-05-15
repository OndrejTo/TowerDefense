import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class FireBall here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FireBall extends Actor
{
    private int damage;
    private int counter = 30;
    public FireBall(int damage)
    {
        this.damage = damage;
    }
    
    public void act()
    {
        if(counter < 0)
        {
            getWorld().removeObject(this);
        }
        counter --;
    }
    
    public int getDamage()
    {
        return damage;
    }
}
