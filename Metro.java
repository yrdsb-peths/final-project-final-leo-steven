import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Metro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Metro extends Actor
{
    public Metro() {
        //setImage("images/metro.png");
    }
    private int hp = 2;

    public void act()
    {
        
        // Add your action code here.
        hit();  
        MyWorld world = (MyWorld)getWorld();
        if(getWorld() == null)
        {
            return;
        }
        
        setLocation(getX(), getY() + world.speed);

        if (getY() >= 725)
        {
            int newX =  Greenfoot.getRandomNumber(getWorld().getWidth());
            setLocation(newX,0);
            Greenfoot.setWorld(new EndScreen());
        }
    }
    
    public void hit()
    {
        if (isTouching(Laser.class))
        {
            removeTouching(Laser.class);
            hp = hp - Laser.atk; 
            if(hp <= 0)
            {
                getWorld().removeObject(this);
            }
        }
    }
}
