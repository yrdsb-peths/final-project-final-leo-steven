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
    GreenfootSound explosion = new GreenfootSound("explosion.mp3");
    int speed = 4;
    public void act()
    {
        // Add your action code here.
        GreenfootImage bombImage = getImage();
        bombImage.scale(50, 50);
        
        setLocation(getX(), getY() + 1);
        
        if (getY() >= 700)
        {
            getWorld().removeObject(this);
        }
        
        if(isTouching(Ship.class))
        {
            explosion.play();
            Greenfoot.setWorld(new EndScreen());
        }
        
    }
    
    public void setSpeed(int spd)
    {
        speed = spd;
    }
}
