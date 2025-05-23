import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Laser here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Laser extends Actor
{
    /**
     * Act - do whatever the Laser wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Laser()
    {
        GreenfootImage laser = getImage();
        setRotation(270);
        laser.scale(50, 20);
    }
    
    public void act()
    {
        moveLaser();
        if(getY() == 0)
        {
            getWorld().removeObject(this);
        }
    }
    
    public void moveLaser()
    {
        setLocation(getX(), getY() - 10);
    }
}
