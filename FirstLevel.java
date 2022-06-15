import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is the actual first level that the player battles in.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FirstLevel extends World
{
    public Pikachu p = new Pikachu();
    public Charmander c = new Charmander();
    public Bulbasaur b = new Bulbasaur();
    public Eevee e = new Eevee();
    public Rowlet r = new Rowlet();
    public Label fail = new Label("you failed:(, restart", 50); 
    private SimpleTimer timer = new SimpleTimer();
    
    public FirstLevel()
    {    
        super(1280, 720, 1, false); 
        
        GeneralInformation g = new GeneralInformation();
        
        setBackground(new GreenfootImage("1.png"));
        
        addObject(p, 250, 600);
        
        addObject(c, 350, 600);
        
        addObject(e, 250, 150);
    }
    
    public void act()
    {
        
        if(e.eHP < 0)
        {
            setBackground(new GreenfootImage("2.png"));
            removeObject(e);
            addObject(r, 1000, 100);
        }
        if(r.rHP < 0)
        {
            setBackground(new GreenfootImage("3.png"));
            removeObject(r);
            addObject(b, 150, 100);
        }
        if(b.bHP < 0)
        {
            removeObject(b);
            if(p.pikachuX > 1280 || c.CharmanderX > 1280)
            {
                MapSecondLevel m2 = new MapSecondLevel();
                Greenfoot.setWorld(m2);
            }
        }
        
        if(p.pHP == 0 && c.cHP == 0)
        {
            
            
            addObject(fail, 640, 360);
        }
        attackP();
        attackC();
    }  
    
    public void attackP()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            if(timer.millisElapsed() > 500)
            {
                Attack1 a = new Attack1();
                addObject(a, Pikachu.pikachuX, Pikachu.pikachuY);
                a.setRotation(p.getRotation());
                timer.mark();
            }
        }
    }
    
    public void attackC()
    {
        if(Greenfoot.isKeyDown("e"))
        {
            if(timer.millisElapsed() > 500)
            {
                Attack1 a = new Attack1();
                addObject(a, c.getX(), c.getY());
                a.setRotation(c.getRotation());
                timer.mark();
                
            }
        }
    }
    
}
