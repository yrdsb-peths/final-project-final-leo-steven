import greenfoot.*;

public class MyWorld extends World 
{  
    private int wave = 0;
    public int speed = 1;
    private int metrosToSpawn = 0;
    private int spawnedMetros = 0;
    private int spawnDelay = 60;
    private int currentDelay = 0;
    private final int minute = 60 * 60;
    private Label waveLabel; 
    private Label timerLabel;
    private static int spawnCounter = 0;
    private static int spawnInterval = Greenfoot.getRandomNumber(600) + 400;
    
    private int bombSpawnCounter = 0;
    private int bombSpawnInterval = Greenfoot.getRandomNumber(300) + 300;
    
    public MyWorld() 
    {

        super(525,750, 1);
        Ship ship = new Ship();
        addObject(ship, 250, 700);
        waveLabel = new Label ("Wave 0", 40);
        addObject(waveLabel, 65, 30);
        timerLabel = new Label (Buff1.timer, 30);
        addObject(timerLabel, 470,50);
        createM();
        createBuff();
        
        int numBombs = 1+ Greenfoot.getRandomNumber(2);
        for(int i = 0; i < numBombs; i++)
        {
            createBomb();
        }

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
        timer();
        spawnBuff();
        spawnBomb();
        ShopWorld(); 
    }
    
    public void startNextWave()
    {
        wave++;
        waveLabel.setValue("Wave " + wave);
        
        metrosToSpawn = wave + 1;
        spawnedMetros = 0;
        currentDelay = 0;
        speed++;
    }
    
    public void createM()
    {
        Metro m = new Metro();
        int x = Greenfoot.getRandomNumber(525);
        int y = 0;
        addObject(m, x, y);        
    }
    
    public void createBuff()
    {
        Buff1 b = new Buff1();
        int x = Greenfoot.getRandomNumber(525);
        int y = Greenfoot.getRandomNumber(750);
        addObject(b, x, y);
    }
        
    public void timer()
    {
        if (Buff1.timer > 0) {
            Buff1.timer--;
            timerLabel.setValue("Timer: " + Buff1.timer / 60 + "s");

            if (Buff1.timer / 60 < 10) {
                timerLabel.setFillColor(Color.RED);
            }
        }
    }
        
    public void spawnBuff()
    {
        spawnCounter++;
        if (spawnCounter >= spawnInterval) {
            spawnCounter = 0;
            spawnInterval = Greenfoot.getRandomNumber(600) + 400;

            if (getObjects(Buff1.class).size() < 1) {
                int x = Greenfoot.getRandomNumber(getWidth());
                int y = Greenfoot.getRandomNumber(getHeight());
                Buff1 b = new Buff1();
                addObject(b, x, y);
            }
        }
    }

    public void spawnBomb()
    {
        bombSpawnCounter++;
        if (bombSpawnCounter >= bombSpawnInterval) {
            bombSpawnCounter = 0;
            bombSpawnInterval = Greenfoot.getRandomNumber(300) + 300;

            createBomb();
        }
    }

    public void createBomb()
    {
        Bomb bomb = new Bomb();
        bomb.setSpeed(speed); // Pass current wave speed
        int x = Greenfoot.getRandomNumber(getWidth());
        int y = 0;
        addObject(bomb, x, y);
    }
    
    public void ShopWorld()
    {
        if (Greenfoot.isKeyDown("t"))
        {
            Greenfoot.setWorld(new ShopWorld());
        }
    }
}