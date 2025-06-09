import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Title Screen
 * 
 * @author Leo 
 * @version May 2025
 */
public class TitleScreen extends World
{

    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    Label titleLabel = new Label("Meteor Strike", 50);

    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(525, 750, 1); 

        addObject(titleLabel, 270, 150);
        
        StartButton start = new StartButton();
        addObject(start, 275, 300);

        prepare();
    }

    public void act()
    {
        
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Ship ship = new Ship();
        addObject(ship,271,550);
        ship.setLocation(261,600);
        ship.setLocation(269,600);
        Label label = new Label("Use WASD to Move", 40);
        addObject(label,260,413);
        Label label3 = new Label("Press <space> to shoot", 40);
        addObject(label3,260,453);
        label3.setLocation(287,439);
        label.setLocation(316,382);
        label.setLocation(270,382);
        label3.setLocation(243,438);
        label3.setLocation(268,433);
    }
}
