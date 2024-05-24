import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tutorial here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tutorial extends World
{

    /**
     * Constructor for objects of class Tutorial.
     * 
     */
    public Tutorial()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1);
        showText("Tutoriál", getWidth()/2, 20);
        showText("Váš cíl je zničit, co nejvíce nepřátel", getWidth()/2, 60);
        showText("s obrannými věži.", getWidth()/2, 80);
        showText("Stavíte věže v pravém dropdownu, když kliknete na věž pravým a dáte new().", getWidth()/2, 80);
        showText("Pomocí vylepšovacího klíče můžete vylepšovat.", getWidth()/2, 120);
        showText("(Musíte přetáhnout klíč k stanovišti na stavbu/vylepšování.)", getWidth()/2, 160);
        showText("Čím déle přežijete, tak se začnou objevovat silnější nepřátele.", getWidth()/2, 200);
        showText("Pak jsou speciální schopnosti viz. zadání hry.", getWidth()/2, 220);
        
    }
}
