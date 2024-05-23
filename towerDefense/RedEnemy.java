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
    private int turn = 0;
    private int damage = 1;
    public void act()
    {
        move(3);
        turn = pathFinder(this, turn);
        DamageContainer damageContainer = colision(this, lastFireBall);
        if (damageContainer != null)
        {
            lifes -= damageContainer.damage;
            lastFireBall = damageContainer.lastFireBall;
        }
        damage(this, damage);
        destruction(this, lifes, minReward, maxReward);
    }
}
