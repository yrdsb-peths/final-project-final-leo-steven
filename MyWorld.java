import greenfoot.*;

public class MyWorld extends World 
{
    
    private int wave = 0;
    private int metrosToSpawn = 0;
    private int spawnedMetros = 0;
    private int spawnDelay = 60;
    private int currentDelay = 0;
    private final int minute = 60 * 60;
    private Label waveLabel; 
    
    public MyWorld() 
    {
        super(525,750, 1);
        Ship ship = new Ship();
        addObject(ship, 250, 700);
        waveLabel = new Label ("Wave 0", 40);
        addObject(waveLabel, 60, 50);
        createM();
    }
    
    public void act()
    {
        int numOfMetro = getObjects(Metro.class).size();
        
        if(numOfMetro == 0 && spawnedMetros >= metrosToSpawn)
        {
            startNextWave();
        }
        
        if(spawnedMetros < metrosToSpawn)
        {
            currentDelay++;
            if(currentDelay >= spawnDelay)
            {
                createM();
                spawnedMetros++;
                currentDelay = 0;
            }
        }
    }
    
    public void startNextWave()
    {
        wave++;
        waveLabel.setValue("Wave " + wave);
        
        metrosToSpawn = wave + 1;
        spawnedMetros = 0;
        currentDelay = 0;
        

    }
    
    public void createM()
    {
        Metro m = new Metro();
        int x = Greenfoot.getRandomNumber(525);
        int y = 0;
        addObject(m, x, y);        
    }
}
