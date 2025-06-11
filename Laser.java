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
        
        public static int atk = 1;
        GreenfootSound explosion = new GreenfootSound("explosion.mp3");
        
        public Laser()
        {
            GreenfootImage laser = new GreenfootImage("images/laser.png");
            setRotation(270);
            laser.scale(50, 20);
            setImage(laser);
        }
        
        public void act()
        {
            moveLaser();
            timer();
            
            if(isTouching(Bomb.class))
            {
                explosion.play();
                Greenfoot.setWorld(new EndScreen());
            }
            
            if (getY() == 0)
            {
                getWorld().removeObject(this);
            }
        }
          
        public void moveLaser()
        {
            setLocation(getX(), getY() - 10);
        }
        
    
        public void timer()
        {
            if (Buff1.timer > 0)
            {
                Buff1.timer--;
                if(Buff1.timer == 0)
                {
                    atk--;
                }
            }
        }
    }
