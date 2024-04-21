import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tower here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cannon extends Actor
{
    private int cooldownCannon = 100;
    public Cannon() 
    {
    }

    public void act()
    {
        // shoot();
        // mouse();
        shootAuto();
        lockAuto();
    }

    /**
     *  Věž střílá automaticky, když najde nepřátele ve světě (možná je lepší kombinovat tuto metodu s lockAuto).
     */

    private void shootAuto() 
    {
        cooldownCannon--;
        if (!getWorld().getObjects(BasicEnemy.class).isEmpty() || !getWorld().getObjects(FastEnemy.class).isEmpty()) {
            if (cooldownCannon <= 0) 
            {
                cooldownCannon = 100;
                CannonBall cb = new CannonBall();
                getWorld().addObject(cb, getX(), getY());
                cb.setRotation(this.getRotation());
            }
        }
    }

    /**
     *  Věž míří automaticky na nepřátele, když najde nepřátele ve světě (možná je lepší kombinovat tuto metodu se shootAuto).
     */

    public void lockAuto() 
    {
        if (!getWorld().getObjects(BasicEnemy.class).isEmpty()) {
            BasicEnemy be = (BasicEnemy)getWorld().getObjects(BasicEnemy.class).get(0);
            turnTowards(be.getX(), be.getY());
        }
        if (!getWorld().getObjects(FastEnemy.class).isEmpty()) 
        {
            FastEnemy fe = (FastEnemy)getWorld().getObjects(FastEnemy.class).get(0);
            turnTowards(fe.getX(), fe.getY());
        }
    }

    // Testovací metody:

    /**
     *  Ovládání míření věže s myší (Použít jen při testování!).
     */

    private void mouse() 
    {
        MouseInfo mouseinfo = Greenfoot.getMouseInfo();
        if (mouseinfo != null)
        {
            turnTowards(mouseinfo.getX(), mouseinfo.getY());
        }
    }

    /**
     *  Věž střílá, když stiskneme mezerník (Použít jen při testování!).
     */

    private void shoot() 
    {
        {
            String key = Greenfoot.getKey();
            if ("space".equals(key)) 
            {
                CannonBall cb = new CannonBall();
                getWorld().addObject(cb, getX(), getY());
                cb.setRotation(this.getRotation());
            }
        }
    }
}
