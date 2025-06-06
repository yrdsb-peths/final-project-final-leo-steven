import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bomb here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bomb extends Actor
{
    /**
     * Act - do whatever the Bomb wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    int speed = 1;
    public void act()
    {
        // Add your action code here.
        GreenfootImage bombImage = getImage();
        bombImage.scale(90, 90);
        
        setLocation(getX(), getY() + 1);
        
        if (getY() >= 750)
        {
            getWorld().removeObject(this);
        }
        
    }
    
    public void setSpeed(int spd)
    {
        speed = spd;
    }
}
