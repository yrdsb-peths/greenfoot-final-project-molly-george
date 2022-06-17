import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is the actual first level that the player battles in.
 * 
 * @author (your name) 
 * @version check
 */
public class Battle extends World
{
    public Pikachu p = new Pikachu();
    public Charmander c = new Charmander();
    public Bulbasaur b = new Bulbasaur();
    public Eevee e = new Eevee();
    public Rowlet r = new Rowlet();
    public Fennekin f = new Fennekin();
    public Torchic t = new Torchic();
    public Ninetales n = new Ninetales();
    public static int  count = 1;
    public int bX = 0;
    public int bY;
    public int bZ;
    public int tX;
    public int tY;
    public int tZ;
    public int pX;
    public int pY;
    public int pZ;
    public int cX = 0;
    public int cY;
    public int cZ;
    public int hp1;
    public int hp2;
    public int hp3;
    public int hp4;
    private SimpleTimer timer = new SimpleTimer();
    private SimpleTimer timer1 = new SimpleTimer();
    private SimpleTimer timerAtt = new SimpleTimer();
    private SimpleTimer timerAtt1 = new SimpleTimer();
    private SimpleTimer timerAttR = new SimpleTimer();
    private SimpleTimer timerAttB = new SimpleTimer();
    private SimpleTimer timerAttF = new SimpleTimer();
    public Label pHPLabel;
    public Label cHPLabel;
    public Label eHPLabel;
    public Label rHPLabel;
    public Label bHPLabel;
    public Label fHPLabel;
    public Label tHPLabel;
    public Label nHPLabel;
    int c1 = 0;
    
    public Battle()
    {    
        super(900, 506, 1, false); 
        
        GeneralInformation g = new GeneralInformation();
        
        if(count == 1)
        {
            setBackground(new GreenfootImage("1.png"));
        
            addObject(p, 250, 400);
        
            addObject(c, 350, 400);
            c.cHP = 65;
        
            addObject(e, 250, 150);
            
            pHPLabel = new Label("PikachuHP: " + Pikachu.pHP, 20);
            addObject(pHPLabel, 800, 50);
            
            cHPLabel = new Label("Charmander: " + Charmander.cHP, 20);
            addObject(cHPLabel, 800, 80);
        }
        else if(count == 2)
        {
            Pikachu.pHP = 65;
            Charmander.cHP = 65;
            Bulbasaur.bHP = 50;
            setBackground(new GreenfootImage("7.png"));
            if(GeneralInformation.character[0].equals("Pikachu"))
            {
                addObject(p, 250, 400);
            }
            if(GeneralInformation.character[0].equals("Bulbasaur"))
            {
                addObject(b, 250, 400);
            }
            if(GeneralInformation.character[1].equals("Charmander"))
            {
                addObject(c, 350, 400);
            }
            if(GeneralInformation.character[1].equals("Eevee"))
            {
                addObject(e, 350, 400);
            }
            
            addObject(f, 250, 150); 
        }
        else if(count == 3)
        {
            Pikachu.pHP = 65;
            Charmander.cHP = 65;
            Bulbasaur.bHP = 50;
            Torchic.tHP = 45;
            setBackground(new GreenfootImage("9.png"));
        
            if(GeneralInformation.character[0].equals("Pikachu"))
            {
                addObject(p, 250, 350);
            }
            if(GeneralInformation.character[1].equals("Charmander"))
            {
                addObject(c, 250, 350);
            }
            if(GeneralInformation.character[0].equals("Bulbasaur"))
            {
                addObject(b, 250, 350);
            }
            if(GeneralInformation.character[1].equals("Torchic"))
            {
                addObject(t, 250, 350);
            }
            
            addObject(n, 200, 150);
        }
    }
    
    public void act()
    {
        if(count == 1)
        {
            pHPLabel.setValue("PikachuHP: " + Pikachu.pHP);
            cHPLabel.setValue("CharmanderHP: " + Charmander.cHP);
            if(e.eHP > 0)
            {
                attack3(e.getX(), e.getY(), new GreenfootImage("plantAtt.png"));
                eeveeAtt(pX - 150, pY - 150, new GreenfootImage("EeveeAtt.png"));
                
            }
            if(e.eHP <= 0)
            {
                setBackground(new GreenfootImage("2.png"));
                removeObject(e);
                addObject(r, 750, 100);
                if(r.rHP > 0)
                {
                    attack3(r.getX(), r.getY(), new GreenfootImage("plantAtt.png"));
                    rowletAtt(pX - 100, pY - 100, new GreenfootImage("RowletAtt.png"));
                }
            }
            if(r.rHP <= 0)
            {
                setBackground(new GreenfootImage("3.png"));
                removeObject(r);
                addObject(b, 150, 100);
                if(b.bHP > 0)
                {
                    attack3(b.getX(), b.getY(), new GreenfootImage("plantAtt.png"));
                    bulbasaurAttack(b.getX(), b.getY(), new GreenfootImage("BulbasaurAtt.png"));
                }
            }
            if(b.bHP <= 0)
            {
                removeObject(b);
                if(p.getX() > 900 || c.getX() > 900)
                {
                    Map2 m2 = new Map2();
                    Greenfoot.setWorld(m2);
                    count++;
                }
            }
            if(p.pHP <= 0 && c.cHP <= 0)
            {
                
                Store1 s1 = new Store1();
                Greenfoot.setWorld(s1);
            }
        }
        else if(count == 2)
        {
            if(f.fHP > 0)
            {
                attack3(f.getX(), f.getY(),  new GreenfootImage("fireAtt.png"));
                fennekinAtt();
            }
            if(f.fHP <= 0)
            {
                setBackground(new GreenfootImage("8.png"));
                removeObject(f);
                addObject(t, 750, 100);
                if(t.tHP > 0)
                {
                    attack3(t.getX(), t.getY(),  new GreenfootImage("fireAtt.png"));
                }
            }
            if(t.tHP <= 0)
            {
                
                removeObject(t);
                if(p.pikachuX > 900 || cX > 900 || bX > 900)
                {
                    Map3 s3 = new Map3();
                    Greenfoot.setWorld(s3);
                    count++;
                }
            }
            if(GeneralInformation.character[0].equals("Pikachu"))
            {
                hp1 = p.pHP;
            }
            if(GeneralInformation.character[0].equals("Bulbasaur"))
            {
                hp1 = b.bHP;
            }
            if(GeneralInformation.character[1].equals("Charmander"))
            {
                hp2 = c.cHP;
            }
            if(hp1 <= 0 && hp2 <= 0)
            {
                Map2 m2 = new Map2();
                Greenfoot.setWorld(m2);
            }
            
        }
        else if(count == 3)
        {
            if(n.nHP > 0)
            {
                attack3(n.getX(), n.getY(),  new GreenfootImage("fireAtt.png"));
            }
            if(GeneralInformation.character[0].equals("Pikachu"))
            {
                hp1 = p.pHP;
            }
            if(GeneralInformation.character[0].equals("Bulbasaur"))
            {
                hp1 = b.bHP;
            }
            if(GeneralInformation.character[1].equals("Charmander"))
            {
                hp2 = c.cHP;
            }
            if(GeneralInformation.character[1].equals("Torchic"))
            {
                hp2 = t.tHP;
            }
            if(n.nHP <= 0)
            {
                removeObject(n);
            }
        }
        
        if(GeneralInformation.character[0].equals("Pikachu"))
        {
            pX = p.getX();
            pY = p.getY();
            pZ = p.getRotation();
            attack1(pX, pY, pZ, Pikachu.damage, new GreenfootImage("pikachuatt.png"));
        }
        if(GeneralInformation.character[1].equals("Charmander"))
        {
            cX = c.getX();
            cY = c.getY();
            cZ = c.getRotation();
            attack2(cX, cY, cZ, Charmander.damage, new GreenfootImage("fireAtt.png"));
        }
        if(GeneralInformation.character[0].equals("Bulbasaur"))
        {
            bX = b.getX();
            bY = b.getY();
            bZ = b.getRotation();
            if(Bulbasaur.enemy != true)
            {
                attack1(bX, bY, bZ, Bulbasaur.damage, new GreenfootImage("plantAtt.png"));
            }
        }
        if(GeneralInformation.character[1].equals("Torchic"))
        {
            tX = t.getX();
            tY = t.getY();
            tZ = t.getRotation();
            if(Torchic.enemy != true)
            {
                attack2(tX, tY, tZ, Torchic.damage, new GreenfootImage("fireAtt.png"));
            }
        }
    }  
    
    
    
    public void attack1(int x, int y, int z, int damage, GreenfootImage image)
    {
        if(Greenfoot.isKeyDown("space"))
        {
            if(timer.millisElapsed() > 500)
            {
                NormalAttack a = new NormalAttack(image, damage);
                addObject(a,x,y);
                a.setRotation(z);
                timer.mark();
                
            }
        }
    }
    
    public void attack2(int x, int y, int z, int damage, GreenfootImage image)
    {
        if(Greenfoot.isKeyDown("r"))
        {
            if(timer.millisElapsed() > 500)
            {
                NormalAttack a = new NormalAttack(image, damage);
                addObject(a,x,y);
                a.setRotation(z);
                timer.mark();
                
            }
        }
    }
    
    
    public void attack3(int x, int y, GreenfootImage image)
    {
        if(timer1.millisElapsed() > 2000)
        {
            for(int i = 1; i < 9; i++)
            {
                EnemyAttack e = new EnemyAttack(image);
                addObject(e,x,y);
                e.setRotation(i * 45);
                timer1.mark();
            }
            
        }
    }
    
    public void eeveeAtt(int x, int y, GreenfootImage image)
    {
        EeveeAttack ea = new EeveeAttack(image);
        if(timerAtt.millisElapsed() > 6000)
        {
            addObject(ea,x,y);
            
            timerAtt.mark();
        }
    }
    
    public void rowletAtt(int x, int y, GreenfootImage image)
    {
        RowletAttack ra = new RowletAttack(image);
        
        if(timerAttR.millisElapsed() > 8000)
        {
            addObject(ra, x, y);
            timerAttR.mark();
        }
    }
    
    public void bulbasaurAttack(int x, int y, GreenfootImage image)
    {
        if(timerAttB.millisElapsed() > 5000)
        {
            for(int i = 1; i < 9; i++)
            {
                BulbasaurAttack ba = new BulbasaurAttack(image);
                addObject(ba,x,y);
                ba.setRotation(i * 45);
                timerAttB.mark();
            }
            
        }
    }
    
    public void fennekinAtt()
    {
        if(timerAttF.millisElapsed() > 20000)
        {
            for(int i = 0; i < 3; i++)
            {
                FennekinAttack fa = new FennekinAttack();
                addObject(fa, 150 + i*300, 100 + i*200);
            }
            timerAttF.mark();
        }
        
    }
}
