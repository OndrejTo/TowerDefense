import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tower here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tower extends Actor
{
    private boolean continueUpgrade;
    /**
     * Act - do whatever the Tower wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {

    }
    
    public boolean start(Tower tower)
    {
        SpawnPlace spawnPlace = (SpawnPlace) tower.getOneIntersectingObject(SpawnPlace.class);
        if(spawnPlace != null && spawnPlace.isEmpty)
        {
            spawnPlace.isEmpty = false;
            tower.setLocation(spawnPlace.getX(), spawnPlace.getY());
            ((Playground) getWorld()).towerWasCreated(tower, 35);
        }
        else
        {
            getWorld().removeObject(tower);    
        }
        return false;
    }
    
    public InfoContainer upgrade(Tower tower,GreenfootImage level1,
    GreenfootImage level2, GreenfootImage level3, GreenfootImage currentImage,
    int damageLevel2,int damageLevel3, int level2Cost, int level3Cost)
    {
        if(isTouching(UpgradeWrench.class) && currentImage == level1)
        {
            continueUpgrade = ((Playground) getWorld()).towerWasUpgrated(tower, level2Cost);
            if (continueUpgrade)
            {
                tower.setImage(level2);
                currentImage = level2;
                return new InfoContainer(currentImage, damageLevel2);
            }
            removeTouching(UpgradeWrench.class);
        }
        
        if(isTouching(UpgradeWrench.class) && currentImage == level2)
        {
            continueUpgrade = ((Playground) getWorld()).towerWasUpgrated(tower, level2Cost);
            if (continueUpgrade)
            {
                tower.setImage(level3);
                currentImage = level3;
                return new InfoContainer(currentImage, damageLevel3);
            }
            removeTouching(UpgradeWrench.class);
        }
        
        if(isTouching(UpgradeWrench.class) && currentImage == level3)
        {
            removeTouching(UpgradeWrench.class);
        }
        return null;
    }
}

