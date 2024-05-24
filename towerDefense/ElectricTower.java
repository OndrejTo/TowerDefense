import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ElectricTower here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ElectricTower extends Tower
{
    public boolean startPosition = true;
    private int cooldown = 300;
    GreenfootImage level1 = new GreenfootImage("ElectricTowerLevel1.png");
    GreenfootImage level2 = new GreenfootImage("ElectricTowerLevel2.png");
    GreenfootImage level3 = new GreenfootImage("ElectricTowerLevel3.png");
    GreenfootImage currentImage = level1;
    public static int currentDamage = 4;
    public static int damageLevel2 = 8;
    public static int damageLevel3 = 12;
    private int level2Cost = 125;
    private int level3Cost = 200;
    private LevelContainer levelContainer;
    /**
     * Act - do whatever the ElectricTower wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(startPosition)
        {
            startPosition = start(this);
        }

        if(getWorld() != null)
        // pokud by oběkt nebyl na spawnplacu tak by další kód po remove... 
        // spustil error protože by se aktér nenacházel ve světě
        {
            shooting();
            upgrading();
        }
    }

    public void shooting()
    {
        cooldown--;
        if (cooldown == 0)
        {
            cooldown = 300;
            if (currentImage == level1)
            {
                getWorld().addObject(new ElectricArea(currentDamage, 400), getX(), getY());
            }
            if (currentImage == level2)
            {
                getWorld().addObject(new ElectricArea(damageLevel2, 600), getX(), getY());
            }
            if (currentImage == level3)
            {
                getWorld().addObject(new ElectricArea(damageLevel3, 800), getX(), getY());
            }
        }
    }

    public void upgrading()
    {
        levelContainer = upgrade(this, level1, level2, level3,
            currentImage, damageLevel2, damageLevel3, level2Cost, level3Cost);
        if (levelContainer != null)
        {
            currentImage = levelContainer.currentImage;
            setImage(currentImage);
            currentDamage = levelContainer.damageLevel;
        }
    }
}