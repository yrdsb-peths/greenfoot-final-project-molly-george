import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ThirdLevel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ThirdLevel extends World
{
    public Pikachu p = new Pikachu();
    public Charmander c = new Charmander();
    
    public Bulbasaur b = new Bulbasaur();
    public Eevee e = new Eevee();
    public Fennekin f = new Fennekin();
    public Torchic t = new Torchic();
    public int bX;
    public int eX;
    public Label fail = new Label("you failed:(, restart", 50); 
    private SimpleTimer timer = new SimpleTimer();
    
    public ThirdLevel()
    {   
        super(1280, 720, 1, false); 
        
        GeneralInformation g = new GeneralInformation();
        
        setBackground(new GreenfootImage("7.png"));
        
        if(GeneralInformation.character[0].equals("Pikachu"))
        {
            addObject(p, 250, 600);
        }
        if(GeneralInformation.character[0].equals("Bulbasaur"))
        {
            addObject(b, 250, 600);
        }
        if(GeneralInformation.character[1].equals("Charmander"))
        {
            addObject(c, 250, 600);
        }
        if(GeneralInformation.character[1].equals("Eevee"))
        {
            addObject(e, 250, 600);
        }
        
        
        addObject(f, 250, 150); 
        
    }
    
    public void act()
    {
        if(f.fHP < 0)
        {
            setBackground(new GreenfootImage("8.png"));
            removeObject(f);
            addObject(t, 1000, 100);
        }
        if(t.tHP < 0)
        {
            removeObject(t);
            if(p.pikachuX > 1280 || c.CharmanderX > 1280 || bX > 1280 || eX > 1280)
            {
                Map3 s3 = new Map3();
                Greenfoot.setWorld(s3);
            }
        }
        
        
        
    }
    
    
    
    public void attackS()
    {
        
    }
}
