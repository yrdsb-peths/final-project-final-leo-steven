import greenfoot.*;

public class MyWorld extends World 
{
    
    private int wave = 0;
    private int metrosSpawn = 0;
    private int spawnDelay = 0;
    private int currentDelay = 0;
    private int timer = 0;
    private final int minute = 60 * 60;
    private Label waveLabel; 
    
    public MyWorld() 
    {
        super(525,750, 1);
        createM();
        
        waveLabel = new Label ("Wave 0", 40);
        addObject(waveLabel, 60, 50);
    }
    
    public void act()
    {
        timer++;
        
        if (timer >= minute)
        {
            timer = 0;
            startNextWave();
        }
    }
    
    private void startNextWave()
    {
        wave++;
        waveLabel.setValue("Wave" + wave);
        
        metrosSpawn = 
    }
    
    public void createM()
    {
        Metro m = new Metro();
        int x = Greenfoot.getRandomNumber(525);
        int y = 0;
        addObject(m, x, y);        
    }
}
