import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CoinsLabel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CoinsLabel extends Actor
{
    private int coins = 100;
    public CoinsLabel()
    {
        setImage(new GreenfootImage("Peníze: " + coins, 32, Color.WHITE, Color.BLACK));
    }
    
    public void editCoins(int coins)
    {
        this.coins = coins;
        setImage(new GreenfootImage("Peníze: " + coins, 32, Color.WHITE, Color.BLACK));
    }
}
