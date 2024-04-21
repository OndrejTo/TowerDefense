import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tower here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Turret extends Actor
{
    private int cooldownShot = 30;
    public Turret() 
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
        cooldownShot--;
        if (!getWorld().getObjects(BasicEnemy.class).isEmpty() || !getWorld().getObjects(FastEnemy.class).isEmpty()) {
            if (cooldownShot <= 0) 
            {
                cooldownShot = 30;
                Shot sh = new Shot();
                getWorld().addObject(sh, getX(), getY());
                sh.setRotation(this.getRotation());
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
                Shot sh = new Shot();
                getWorld().addObject(sh, getX(), getY());
                sh.setRotation(this.getRotation());
            }
        }
    }
}
