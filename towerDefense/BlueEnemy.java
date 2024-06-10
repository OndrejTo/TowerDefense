import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BlueEnemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BlueEnemy extends Enemy
{
    public int lives = 10;
    private int minReward = 2;
    private int maxReward = 4;
    private FireBall lastFireBall;
    private ElectricArea lastElectricArea;
    private int turn = 0;
    private int initialSpeed = 1;
    private int speed = initialSpeed;
    private int damage = 1;
    public void act()
    {
        speed = slowdown(initialSpeed);
        move(speed);
        turn = pathFinder(this, turn);
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
