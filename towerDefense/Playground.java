import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Playground here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Playground extends World
{
    public int coins = 100;
    public Playground()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 700, 1); 
    }
    
    public void towerWasCreated(Tower tower, int cost)
    {
        if(coins >= cost)
        {
            coins -= cost;
        }
        else
        {
            removeObject(tower);            
        }
    }
    
    public boolean towerWasUpgrated(Tower tower, int cost)
    {
        if(coins >= cost)
        {
            coins -= cost;
            return true;
        }
        else
        {
            return false;
        }
    }
}
