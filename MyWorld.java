import greenfoot.*;

public class MyWorld extends World 
{
    public MyWorld() 
    {
        super(525,750, 1);
        createm();
        
        Ship ship = new Ship();
        addObject(ship, 275, 650);
    }
    
    public void createm()
    {
        Metro m = new Metro();
        int x = Greenfoot.getRandomNumber(525);
        int y = 0;
        addObject(m, x, y);        
    }
}
