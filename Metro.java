import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Metro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Metro extends Actor
{
    /**
     * Act - do whatever the Metro wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act()
    {
        // Add your action code here.
        hit();   
        if(getWorld() == null)
        {
            return;
        }
        
        setLocation(getX(), getY() + 2);

        if (getY() >= 725)
        {
            int newX =  Greenfoot.getRandomNumber(getWorld().getWidth());
            setLocation(newX,0);
        }
    }
    
    public void hit()
    {
        if (isTouching(Laser.class))
        {
            getWorld().removeObject(this);
        }
    }
}
