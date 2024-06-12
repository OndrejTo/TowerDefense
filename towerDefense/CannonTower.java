import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CannonTower here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CannonTower extends Tower
{
    public boolean startPosition = true;
    private int cooldown = 60;
    GreenfootImage level1 = new GreenfootImage("CannonLevel1.png");
    GreenfootImage level2 = new GreenfootImage("CannonLevel2.png");
    GreenfootImage level3 = new GreenfootImage("CannonLevel3.png");
    GreenfootImage currentImage = level1;
    private int currentDamage = 3;
    private int damageLevel2 = 6;
    private int damageLevel3 = 9;
    private int level1Cost = 50;
    private int level2Cost = 150;
    private int level3Cost = 250;
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
        if(!getWorld().getObjects(Enemy.class).isEmpty())
        {
            Enemy enemy = (Enemy) getWorld().getObjects(Enemy.class).get(0);
            turnTowards(enemy.getX(), enemy.getY());
        }
        cooldown--;
        if (!getWorld().getObjects(Enemy.class).isEmpty() && cooldown <= 0) 
        {
            cooldown = 60;
            CannonBall cannonBall = new CannonBall(currentDamage);
            getWorld().addObject(cannonBall, getX(), getY());
            cannonBall.setRotation(this.getRotation());
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
