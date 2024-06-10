import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Airship here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Airship extends Enemy
{
    private int lives = 100;
    private int minReward = 10;
    private int maxReward = 20;
    private FireBall lastFireBall;
    private ElectricArea lastElectricArea;
    private int turn = 0;
    private int initialSpeed = 1;
    private int speed = initialSpeed;
    private int damage = 5; 
    public void act()
    {
        move(speed);
        turn = pathFinder(this, turn);
        speed = slowdown(initialSpeed);
        DamageContainer damageContainer = colision(this, lastFireBall, lastElectricArea);
        if (damageContainer != null)
        {
            lives -= damageContainer.damage;
            lastFireBall = damageContainer.lastFireBall;
            lastElectricArea = damageContainer.lastElectricArea;
        }
        damage(this, damage);
        destruction(this, lives, minReward, maxReward);
    }
}
