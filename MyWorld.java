import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() {
        super(600, 400, 1);
        
        Jet jet = new Jet();
        addObject(jet, 300, 300);
    }
}
