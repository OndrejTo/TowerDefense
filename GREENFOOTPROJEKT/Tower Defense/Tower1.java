import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tower here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tower1 extends Actor
{
    public Tower1() 
    {
        GreenfootImage image = getImage();
        image.scale(50, 50);
        setImage(image);
    }

    public void act()
    {
        shoot();
    }

    private void shoot() 
    {
        {
            String key = Greenfoot.getKey();
            if ("space".equals(key)) 
            {
                getWorld().addObject(new Shot(), getX(), getY());
            }
        }
    }
}
