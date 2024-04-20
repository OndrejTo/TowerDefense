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
    }

    public void act()
    {
        shoot();
        mouse();
    }

    private void shoot() 
    {
        {
            String key = Greenfoot.getKey();
            if ("space".equals(key)) 
            {
                Shot shot = new Shot();
                getWorld().addObject(shot, getX(), getY());
                shot.setRotation(this.getRotation());
            }
        }
    }

    private void mouse() 
    {
        MouseInfo mouseinfo = Greenfoot.getMouseInfo();
        if (mouseinfo != null)
        {
            turnTowards(mouseinfo.getX(), mouseinfo.getY());
        }
    }
}
