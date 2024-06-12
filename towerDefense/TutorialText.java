import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TutorialText here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TutorialText extends Actor
{
    /**
     * Act - do whatever the TutorialText wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        
    }
    
    public TutorialText()
    {
        setImage(new GreenfootImage("Vítej, v naší hře máte za úkol ubránit \n pevnost, která má 100 životů pomocí pokládání věží \n na žlutá políčka, ale pozor \n každá věc něco stojí a ani věže \n nebudou výjimkou (viz tabulka pod textem). \n Na vaši pevnost budou útočit bálónky, \n pokud se dostanou až na konec sníží \n se vaše životy (viz návod v Githubu). \n Pomoci vám můžou speciální ability. \n Aktivujete je talčítky v levo dole. \n To s kamenem vypustí meteority, které vše zničí \n lepidlo zase balónky na jistou dobu \n zpomalí. Na aktivaci však potřebujete \n 150 potažmo 75 mincí. \n Pro pokračování tutoriálu stiskněte MEZERNÍK. \n Pro spuštění hry stiskněte ENTER.", 25, Color.WHITE, Color.BLACK));
    }
    
    
}
