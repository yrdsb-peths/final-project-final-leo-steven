import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Buff1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Buff1 extends Actor
{
    /**
     * Act - do whatever the Buff1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public static int timer = 0;
    private final int sec = 30 * 60;
    public void act()
    {
        if (isTouching(Ship.class))
        {
            getWorld().removeObject(this);
            Laser.atk++;
            timer = 30 * sec;
        }
    }
}
