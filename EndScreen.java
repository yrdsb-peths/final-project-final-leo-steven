import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EndScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EndScreen extends World
{

    /**
     * Constructor for objects of class EndScreen.
     * 
     */
    public EndScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(525, 750, 1); 
        
        GreenfootImage endBG = new GreenfootImage("images/end.jpg");
        setBackground(endBG);
        
        GameOver over = new GameOver();
        addObject(over, 265, 275);
        
        PlayAgain again = new PlayAgain();
        addObject(again, 265, 500);
    }
}
