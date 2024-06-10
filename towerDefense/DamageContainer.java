import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FireBallContainer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DamageContainer extends Actor
{
    public int damage;
    public FireBall lastFireBall;
    public ElectricArea lastElectricArea;
    public DamageContainer(int damage, FireBall lastFireBall, ElectricArea lastElectricArea)
    {
        this.damage = damage;
        this.lastFireBall = lastFireBall;
        this.lastElectricArea = lastElectricArea;
    }
}
