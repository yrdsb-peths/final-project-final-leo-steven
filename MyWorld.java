import greenfoot.*;

public class MyWorld extends World 
{
    
    private int wave = 0;
    private int metrosToSpawn = 0;
    private int spawnedMetros = 0;
    private int spawnDelay = 60;
    private int currentDelay = 0;
    private int timer = 0;
    private final int minute = 60 * 60;
    private Label waveLabel; 
    
    public MyWorld() 
    {
        super(525,750, 1);
        Ship ship = new Ship();
        waveLabel = new Label ("Wave 0", 40);
        addObject(waveLabel, 60, 50);
        createM();
    }
    
    public void act()
    {
        timer++;
        
        if(timer >= minute)
        {
            timer = 0;
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
