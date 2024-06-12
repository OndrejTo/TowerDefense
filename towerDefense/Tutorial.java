import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tutorial here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tutorial extends World
{
    Tab tab = new Tab();
    TutorialText tutorial = new TutorialText();
    public Tutorial()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1);
        
        //showText("Vítej, v naší hře máte za úkol ubránit \n pevnost, která má 100 životů pomocí pokládání věží \n na žlutá políčka, ale pozor \n každá věc něco stojí a ani věže \n nebudou výjimkou (viz tabulka pod textem). \n Na vaši pevnost budou útočit bálónky, \n pokud se dostanou až na konec sníží \n se vaše životy (viz tabulka). \n Pomoci vám můžou speciální ability. \n Aktivujete je talčítky v levo dole. \n To s kamenem vypustí meteority, které vše zničí \n lepidlo zase balónky na jistou dobu \n zpomalí. Na aktivaci však potřebujete \n 150 potažmo 75 mincí. \n Pro pokračování tutoriálu stiskněte SPACE. Pro spuštění hry stiskněte ENTER", 400, 250); 
        addObject(tab, getWidth()/2, 500);
        addObject(tutorial, 400, 250);
    }
    public void act()
    {
        String klavesa = Greenfoot.getKey();
        if("enter".equals(klavesa))
        {
            Greenfoot.setWorld(new Playground());
        }
        
        if("space".equals(klavesa))
        {
            addObject(new TutorialText2(), 400, 100);
            removeObject(tab);
            removeObject(tutorial);
            addObject(new TabTowers(), 300, 400);
            addObject(new ShootingTowerImage(100), 650, 280);
            addObject(new CannonTowerImage(100), 650, 405);
            addObject(new ElectricTowerImage(100), 650, 525);
        }
    }
}
