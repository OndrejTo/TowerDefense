import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Playground here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Playground extends World
{
    private LivesLabel livesLabel = new LivesLabel(); 
    private CoinsLabel coinsLabel = new CoinsLabel();
    
    private int lives = 100;
    public int coins = 100;
    public int moreSpawnPlaces = 6;
    
    private int meteoriteTimer = 3600;
    private int meteoriteCounter = 450;
    private boolean startMeteoriteAtack;
    private boolean meteoriteIconInGame = true;
    
    private int glueTimer;
    private boolean startGlueAtack;
    private boolean glueIconInGame = true;
    
    private int spawnTimer;
    private int redF = 120;
    private int blueF = 240;
    private int pinkF = 300;
    private int airF = 600;
    public Playground()
    {    
        super(1200, 700, 1);
        addObject(new GlueIcon(), 950, 600);
        addObject(new MeteoriteIcon(), 950, 650);
        addObject(new ShootingTowerIcon(), 150, 625);
        addObject(new CannonTowerIcon(), 210, 625);
        addObject(new ElectricTowerIcon(), 270, 625);
        addObject(new WrenchIcon(), 330, 625);
        addObject(new RemoveIcon(), 80, 625);
        
        addObject(livesLabel, 1100, 600);
        addObject(coinsLabel, 1100, 650);
        
        addObject(new SpawnPlace(), 72, 288);
        addObject(new SpawnPlace(), 320, 288);
        addObject(new SpawnPlace(), 610, 288);
        addObject(new SpawnPlace(), 610, 575);
        addObject(new SpawnPlace(), 1100, 200);
        addObject(new SpawnPlace(), 900, 440);
        addObject(new Prices("35",20), 148, 675);
        addObject(new Prices("50",20), 210, 675);
        addObject(new Prices("75",20), 270, 675);
        //addObject(new Prices("x"), 330, 675);
        addObject(new Prices("75",20), 900, 603);
        addObject(new Prices("150",20), 900, 650);
    }

    public void act()
    {
        meteoriteTimer++;
        glueTimer++;
        spawnTimer++;
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
        
        if(meteoriteTimer >= 3600 && !meteoriteIconInGame)
        {
            meteoriteIconInGame = true;
            startMeteoriteAtack = false;
            addObject(new MeteoriteIcon(), 950, 650);
        }
        
        if(startGlueAtack && glueTimer >= 1800)
        {
            startGlueAtack = false;
            addObject(new GlueIcon(), 950, 600);
        }
    }

    public void towerWasCreated(Tower tower, int cost)
    {
        if(coins >= cost)
        {
            coins -= cost;
            coinsLabel.editCoins(coins);
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
            coinsLabel.editCoins(coins);
            return true;
        }
        else
        {
            return false;
        }
    }

    public void meteoriteAtack()
    {
        if(meteoriteTimer >= 3600)
        {
            meteoriteTimer = 0;
            coins -= 150;
            coinsLabel.editCoins(coins);
            startMeteoriteAtack = true;
            meteoriteIconInGame = false;
        }
        else
        {
            addObject(new MeteoriteIcon(), 950, 650);
        }
    }

    public void glueAtack()
    {
        if(startGlueAtack == false)
        {
            glueTimer = 0;
            coins -= 75;
            coinsLabel.editCoins(coins);
            startGlueAtack = true;
        }
    }

    public void spawnEnemy()
    {
        if(spawnTimer % redF == 0)
        {
            addObject(new RedEnemy(), 50, 380);
        }
        if(spawnTimer >= 3600 && spawnTimer % blueF == 0)
        {
            addObject(new BlueEnemy(), 50, 380);
        }
        if(spawnTimer >= 7200 && spawnTimer % pinkF == 0)
        {
            addObject(new PinkEnemy(), 50, 380);
        }
        if(spawnTimer >= 10800 && spawnTimer % airF == 0)
        {
            addObject(new Airship(), 50, 380);
        }
        
        if(spawnTimer == 10800 || spawnTimer == 21600 || spawnTimer == 50400)
        {
            redF -= 30;
        }
        if(spawnTimer == 14400 || spawnTimer == 28800 || spawnTimer == 57600)
        {
            blueF -= 60;
        }
        if(spawnTimer == 18000 || spawnTimer == 36000 || spawnTimer == 64800)
        {
            pinkF -= 75;
        }
        if(spawnTimer == 21600 || spawnTimer == 43200 || spawnTimer == 72000)
        {
            airF -= 150;
        }
    }
    
    public void livesControl(int damage)
    {
        lives -= damage;
        livesLabel.reduceLives(lives);
        if (lives <= 0)
        {
            livesLabel.reduceLives(0);
            addObject(new Prices("KONEC HRY", 200), getWidth()/2, getHeight()/2);
            addObject(new Prices("Hra se restartuje za 5 sekund...", 50), getWidth()/2, getHeight()/2+200); 
            Greenfoot.delay(300);
            Greenfoot.setWorld(new Playground());
        }
    }
    
    public void coinsControl(int coins)
    {
        this.coins += coins;
        coinsLabel.editCoins(this.coins);
    }
}
