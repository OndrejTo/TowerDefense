import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ElectricArea here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ElectricArea extends Actor
{
    private int damage;
    private int cooldown = 180;
    private int damageCooldown = 60;
    public ElectricArea(int damage, int size)
    {
        this.damage = damage;
        getImage().scale(size, size);
    }
    
    public void act()
    {
        cooldown--;
        damageCooldown--;
        if (cooldown == 0) 
        {
            cooldown = 180;
            getWorld().removeObject(this);
        }
    }
}
