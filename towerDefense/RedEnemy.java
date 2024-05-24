import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RedEnemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RedEnemy extends Enemy
{
    public int lifes = 5;
    private int minReward = 1;
    private int maxReward = 3;
    private FireBall lastFireBall;
    private ElectricArea lastElectricArea;
    private int turn = 0;
    private int damage = 1;
    private int speed = 1;
    public void act()
    {
        speed = slowdown(speed);
        move(speed);
        turn = pathFinder(this, turn);
        DamageContainer damageContainer = colision(this, lastFireBall, lastElectricArea);
        if (damageContainer != null)
        {
            lifes -= damageContainer.damage;
            lastFireBall = damageContainer.lastFireBall;
            lastElectricArea = damageContainer.lastElectricArea;
        }
        damage(this, damage);
        destruction(this, lifes, minReward, maxReward);
    }
}
