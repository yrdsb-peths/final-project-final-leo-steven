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

        prepare();
    }

    public void act()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Ship ship = new Ship();
        addObject(ship,271,457);
        ship.setLocation(261,500);
        ship.setLocation(269,567);
        Label label = new Label("Use \u2190 and \u2192 to Move", 40);
        addObject(label,260,413);
        Label label2 = new Label("Press <space> to Start", 40);
        addObject(label2,253,346);
        label2.setLocation(269,322);
        label.setLocation(282,382);
        label2.setLocation(315,311);
        label2.setLocation(276,315);
        label2.setLocation(282,319);
        label2.setLocation(341,338);
        Label label3 = new Label("Press <space> to shoot", 40);
        addObject(label3,260,453);
        label3.setLocation(287,439);
        label.setLocation(316,382);
        label.setLocation(270,382);
        label3.setLocation(243,438);
        label3.setLocation(268,433);
        label2.setLocation(279,329);
        label2.setLocation(268,330);
    }
}
