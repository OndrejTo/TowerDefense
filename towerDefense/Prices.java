import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Prices here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Prices extends Actor
{
    private String cena;
    /**
     * Act - do whatever the Prices wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        
    }
    public Prices(String cena)
    {
        this.cena = cena;
        setImage(new GreenfootImage(cena, 20, Color.WHITE, Color.BLACK));
    }
}
