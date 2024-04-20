import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


/**
 * Write a description of class Counter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LifeCounter extends Actor
{
    public static int lives = 10; // životy
    
    /**
     *  Statický counter (objeví se tento counter než hráč ztratí životy)
     */
    public LifeCounter()
    {
        setImage(new GreenfootImage("Lives: 10", 50, Color.WHITE, Color.BLACK));
    }

    /**
     *  Mění počet v countru (zkopčil jsem to z tutoriálu xD)
     */
    public void bumpCount(int amount)
    {
        lives += amount;
        setImage(new GreenfootImage("Lives: " + lives, 50, Color.WHITE, Color.BLACK));
    }
}