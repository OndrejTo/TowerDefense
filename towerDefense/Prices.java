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
    private int size;
    /**
     * Act - do whatever the Prices wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        
    }
    public Prices(String cena, int size)
    {
        this.cena = cena;
        this.size = size;
        setImage(new GreenfootImage(cena, size, Color.WHITE, Color.BLACK));
    }
}
