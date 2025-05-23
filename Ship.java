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
            getWorld().addObject(new Laser(), getX(), getY() - 50);
        }
    }
}
