import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ship here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ship extends Actor
{
    GreenfootSound laserSound = new GreenfootSound("lasersound.mp3");
    
    public Ship()
    {
        GreenfootImage shipImage = getImage();
        shipImage.scale(120, 120);
    }
    
    public void act()
    {
        moveAround();
        shoot();
    }
    
    public void moveAround()
    {
        if(Greenfoot.isKeyDown("left"))
        {
            move(-10);
        }
        else if(Greenfoot.isKeyDown("right"))
        {
            move(10);
        }
    }
    
    public void shoot()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            Laser laser = new Laser();
            getWorld().addObject(laser, getX(), getY() - 50);
            laserSound.play();
        }
    }
}
