import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SecondLevel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SecondLevel extends World
{
    public Pikachu p = new Pikachu();
    public Charmander c = new Charmander();
    public Lapras l = new Lapras();
    public Squirtle s = new Squirtle();
    public Magikarp m = new Magikarp();
    public Bulbasaur b = new Bulbasaur();
    public Eevee e = new Eevee();
    public int bX;
    public int eX;
    public Label fail = new Label("you failed:(, restart", 50); 
    private SimpleTimer timer = new SimpleTimer();
    
    public SecondLevel()
    {  
        super(1280, 720, 1, false); 
        
        GeneralInformation g = new GeneralInformation();
        
        setBackground(new GreenfootImage("4.png"));
        
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
        
        addObject(l, 250, 150);
        
    }
    
    public void act()
    {
        if(l.lHP < 0)
        {
            setBackground(new GreenfootImage("5.png"));
            removeObject(l);
            addObject(m, 1000, 100);
        }
        if(m.mHP < 0)
        {
            setBackground(new GreenfootImage("6.png"));
            removeObject(m);
            addObject(s, 150, 100);
        }
        if(s.sHP < 0)
        {
            removeObject(s);
            if(bX > 1280 || eX > 1280)
            {
                MapThirdLevel m3 = new MapThirdLevel();
                Greenfoot.setWorld(m3);
            }
            if(p.pikachuX > 1280 || c.CharmanderX > 1280)
            {
                MapThirdLevel m3 = new MapThirdLevel();
                Greenfoot.setWorld(m3);
            }
        }
        if(GeneralInformation.character[0].equals("Pikachu"))
        {
            attackP();
        }
        if(GeneralInformation.character[0].equals("Bulbasaur"))
        {
            attackB();
            bX = b.getX();
        }
        if(GeneralInformation.character[1].equals("Charmander"))
        {
            attackC();
        }
        if(GeneralInformation.character[1].equals("Eevee"))
        {
            attackE();
            eX = e.getX();
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
}
