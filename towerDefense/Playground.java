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
    private int timerG;
    private GlueIcon currentGlueIcon;
    public static int lives = 100;
    private int spawnTimer;
    public Playground()
    {    
        super(1200, 700, 1); 
        showText("coins:"+coins, 1125, 650);
        showText("Lives: "+lives, 1125, 600);
        addObject(new GlueIcon(), 1000, 600);
        addObject(new MeteoriteIcon(), 1000, 550);
        addObject(new SpawnPlace(), 72, 288);
        addObject(new SpawnPlace(), 320, 288);
        addObject(new SpawnPlace(), 610, 288);
        addObject(new SpawnPlace(), 610, 575);
        addObject(new SpawnPlace(), 1100, 200);
        addObject(new SpawnPlace(), 900, 440);
    }

    public void act()
    {
        timer++;
        timerG++;
        spawnTimer++;
        showText("coins:"+coins, 1125, 650);
        showText("Lives: "+lives, 1125, 600);
        spawnEnemy();
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
            removeObject(currentGlueIcon);
        }
        if(timerG >= 1800)
        {
            timerG = 0;
            startGlueAtack = false;
            addObject(new GlueIcon(), 1000, 600);
        }
        if(timer >= 3600)
        {
            timer = 0;
            addObject(new MeteoriteIcon(), 1000, 550);
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

    public void glueAtack(GlueIcon glueIcon)
    {
        currentGlueIcon = glueIcon;
        if(coins >= 75 && startGlueAtack == false)
        {
            coins -= 75;
            startGlueAtack = true;
        }
    }

    public void spawnEnemy()
    {
        if(spawnTimer % 120 == 0)
        {
            addObject(new RedEnemy(), 50, 380);
        }
        if(spawnTimer >= 3600 && spawnTimer % 240 == 0)
        {
            addObject(new BlueEnemy(), 50, 380);
        }
        if(spawnTimer >= 7200 && spawnTimer % 300 == 0)
        {
            addObject(new PinkEnemy(), 50, 380);
        }
        if(spawnTimer >= 10800 && spawnTimer % 600 == 0)
        {
            addObject(new Airship(), 50, 380);
        }
    }
}
