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
    public Squirtle s = new Squirtle();
    public Bulbasaur b = new Bulbasaur();
    public Eevee e = new Eevee();
    public Fennekin f = new Fennekin();
    public Torchic t = new Torchic();
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
        if(GeneralInformation.character[1].equals("Squirtle"))
        {
            addObject(s, 250, 600);
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
            if(p.pikachuX > 1280 || c.CharmanderX > 1280 || b.BulbasaurX > 1280 || e.EeveeX > 1280 || s.SquirtleX > 1280)
            {
                FinalMap f = new FinalMap();
                Greenfoot.setWorld(f);
            }
        }
        
        if(GeneralInformation.character[0].equals("Pikachu"))
        {
            attackP();
        }
        if(GeneralInformation.character[0].equals("Bulbasaur"))
        {
            attackB();
        }
        if(GeneralInformation.character[1].equals("Charmander"))
        {
            attackC();
        }
        if(GeneralInformation.character[1].equals("Eevee"))
        {
            attackE();
        }
        if(GeneralInformation.character[1].equals("Squirtle"))
        {
            attackS();
        }
    }
    
    public void attackP()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            if(timer.millisElapsed() > 500)
            {
                Attack1 a = new Attack1();
                addObject(a, p.getX(), p.getY());
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
    
    public void attackB()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            if(timer.millisElapsed() > 500)
            {
                Attack1 a = new Attack1();
                addObject(a, b.getX(), b.getY());
                a.setRotation(b.getRotation());
                timer.mark();
                
            }
        }
    }
    
    public void attackE()
    {
        if(Greenfoot.isKeyDown("e"))
        {
            if(timer.millisElapsed() > 500)
            {
                Attack1 a = new Attack1();
                addObject(a, e.getX(), e.getY());
                a.setRotation(e.getRotation());
                timer.mark();
                
            }
        }
    }
    
    public void attackS()
    {
        if(Greenfoot.isKeyDown("e"))
        {
            if(timer.millisElapsed() > 500)
            {
                Attack1 a = new Attack1();
                addObject(a, s.getX(), s.getY());
                a.setRotation(s.getRotation());
                timer.mark();
                
            }
        }
    }
}
