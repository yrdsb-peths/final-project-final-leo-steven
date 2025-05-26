import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ship here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ship extends Actor
{
    /**
     * Act - do whatever the Ship wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private int shootCooldown = 0;
    
    public Ship()
    {
        GreenfootImage shipImage = getImage();
        shipImage.scale(120, 120);
    }
    
    public void act()
    {
        moveAround();
        shoot();
    
        if(shootCooldown > 0)
        {
            shootCooldown--;
        }
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
        if(Greenfoot.isKeyDown("space") && shootCooldown == 0)
        {
            Laser laser = new Laser();
            getWorld().addObject(laser, getX(), getY() - 50);
            shootCooldown = 20;
        }
    }
}
