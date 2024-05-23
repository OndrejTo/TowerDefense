import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Playground here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Playground extends World
{
    public int coins = 1000;
    private int meteoriteCounter = 450;
    private boolean startMeteoriteAtack;
    private boolean startGlueAtack;
    private int timer = 3600;
    public Playground()
    {    
        super(1200, 700, 1); 
        showText("coins:"+coins, 1125, 650);
    }
    
    public void act()
    {
        timer++;
        showText("coins:"+coins, 1125, 650);
        if(startMeteoriteAtack)
        {
            if(meteoriteCounter % 30 == 0 )
            {
                addObject(new Meteorite(), Greenfoot.getRandomNumber(getWidth()-100)+50, 1);
            }
            meteoriteCounter--;
        
            if(meteoriteCounter == 0)
            {
                startMeteoriteAtack = false;
                meteoriteCounter = 450;
            }
        }
        if(startGlueAtack)
        {
            
        }
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
    
    public void meteoritAtack(MeteoriteIcon meteoriteIcon)
    {
        if(timer >= 3600)
        {
            timer = 0;
            if(coins >= 150 && meteoriteCounter > 0)
            {
                coins -= 150;
                startMeteoriteAtack = true;
            }
        }
    }
    
    public void glueAtack()
    {
        if(timer >= 1800)
        {
            timer = 0;
            if(coins >= 75)
            {
                coins -= 75;
                startGlueAtack = true;
            }
        }
    }
}
