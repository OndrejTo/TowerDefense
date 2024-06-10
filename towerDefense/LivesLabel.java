import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LivesLabel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LivesLabel extends Actor
{
    private int lives = 100;
    public LivesLabel()
    {
        setImage(new GreenfootImage("Životy: " + lives, 32, Color.WHITE, Color.BLACK));
    }
    
    public void reduceLives(int lives)
    {
        this.lives = lives;
        setImage(new GreenfootImage("Životy: " + lives, 32, Color.WHITE, Color.BLACK));
    }
}
