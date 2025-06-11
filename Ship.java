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
    
    private int shootCooldown = 0;
    
    public Ship()
    {
        GreenfootImage shipImage = new GreenfootImage("images/SpaceShip.png");
        shipImage.scale(100, 110);
        setImage(shipImage);
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
        int x = getX();
        int y = getY();
        
        if (Greenfoot.isKeyDown("a"))
        {
            x -= 10;
        }
        if (Greenfoot.isKeyDown("d"))
        {
            x += 10;
        }
        if (Greenfoot.isKeyDown("w"))
        {
            y -= 10;
        }
        if (Greenfoot.isKeyDown("s"))
        {
            y += 10;
        }
        
        setLocation(x, y);
    }   
    
    public void shoot()
    {
        if(Greenfoot.isKeyDown("space") && shootCooldown == 0)
        {
            Laser laser = new Laser();
            getWorld().addObject(laser, getX(), getY() - 50);

            shootCooldown = 20;

            laserSound.play();

        }
    }
}
