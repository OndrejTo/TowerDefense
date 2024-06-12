import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ElectricTower here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ElectricTower extends Tower
{
    private boolean startPosition = true;
    private int cooldown = 180;
    GreenfootImage level1 = new GreenfootImage("ElectricTowerLevel1.png");
    GreenfootImage level2 = new GreenfootImage("ElectricTowerLevel2.png");
    GreenfootImage level3 = new GreenfootImage("ElectricTowerLevel3.png");
    GreenfootImage currentImage = level1;
    public static int currentDamage = 2;
    public static int damageLevel2 = 4;
    public static int damageLevel3 = 8;
    private int level1Cost = 75;
    private int level2Cost = 200;
    private int level3Cost = 350;
    private LevelContainer levelContainer;
    public void act()
    {
        if(startPosition)
        {
            startPosition = start(this, level1Cost);
        }

        if(getWorld() != null)
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
            cooldown = 180;
            if (currentImage == level1)
            {
                getWorld().addObject(new ElectricArea(currentDamage, 300), getX(), getY());
            }
            if (currentImage == level2)
            {
                getWorld().addObject(new ElectricArea(damageLevel2, 400), getX(), getY());
            }
            if (currentImage == level3)
            {
                getWorld().addObject(new ElectricArea(damageLevel3, 600), getX(), getY());
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