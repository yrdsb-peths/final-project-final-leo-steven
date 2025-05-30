import greenfoot.*;

public class MyWorld extends World 
{
    public MyWorld() 
    {
        super(525, 750, 1);
        createm();
        
        Ship ship = new Ship();
        addObject(ship, 275, 675);
        
        int numBombs = Greenfoot.getRandomNumber(3);
        for(int i = 0; i < numBombs; i++)
        {
            createBomb();
        }
    }
    
    public void createm()
    {
        Metro m = new Metro();
        int x = Greenfoot.getRandomNumber(525);
        int y = 0;
        addObject(m, x, y);        
    }
    
    public void createBomb()
    {
        Bomb bomb = new Bomb();
        int x = Greenfoot.getRandomNumber(525);
        int y = 0;
        addObject(bomb, x, y);
    }
}
