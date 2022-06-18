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
    public static int  count = 2;
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
    private SimpleTimer timerRP = new SimpleTimer();
    private SimpleTimer timerRC = new SimpleTimer();
    private SimpleTimer timerEP = new SimpleTimer();
    private SimpleTimer timerEC = new SimpleTimer();
    private SimpleTimer timerAttR = new SimpleTimer();
    private SimpleTimer timerAttE = new SimpleTimer();
    private SimpleTimer timerAttB = new SimpleTimer();
    private SimpleTimer timerFA = new SimpleTimer();
    private SimpleTimer timerFA1 = new SimpleTimer();
    public Label pHPLabel;
    public Label cHPLabel;
    public Label eHPLabel;
    public Label rHPLabel;
    public Label bHPLabel;
    public Label fHPLabel;
    public Label tHPLabel;
    public Label nHPLabel;
    public boolean isThereFire = false; // To detect if there is any fire on the map
    FennekinAttack fa = new FennekinAttack();
    FennekinAttack fa1 = new FennekinAttack();
    FennekinAttack fa2 = new FennekinAttack();
    public static int coins = 0;
    GeneralInformation g;
   
    
    public Battle()
    {    
        super(900, 506, 1, false); 
        timerFA.mark();
        g = new GeneralInformation();
        
        if(count == 1)
        {
            Pikachu.live = true;
            Charmander.live = true;
            setBackground(new GreenfootImage("1.png"));
        
            addObject(p, 250, 400);
        
            addObject(c, 350, 400);
            c.cHP = 65;
        
            addObject(e, 250, 150);
            
            pHPLabel = new Label("PikachuHP: " + Pikachu.pHP, 20);
            addObject(pHPLabel, 800, 50);
            
            cHPLabel = new Label("Charmander: " + Charmander.cHP, 20);
            addObject(cHPLabel, 800, 80);
            
            eHPLabel = new Label("Eevee: " + Eevee.eHP, 20);
            addObject(eHPLabel, 100, 50);
            
            
            rHPLabel = new Label("RowletHP: " + r.rHP, 20);
            addObject(rHPLabel, 100, 80);
            
            
            bHPLabel = new Label("BulbasaurHP: " + b.bHP, 20);
            addObject(bHPLabel, 100, 110);
            
        
        }
        else if(count == 2)
        {
            Pikachu.pHP = 65;
            Charmander.cHP = 65;
            Bulbasaur.bHP = 50;
            Pikachu.live = true;
            Charmander.live = true;
            Bulbasaur.live = true;
            setBackground(new GreenfootImage("7.png"));
            if(GeneralInformation.character[0].equals("Pikachu"))
            {
                addObject(p, 320, 400);
                pHPLabel = new Label("PikachuHP: " + Pikachu.pHP, 20);
                addObject(pHPLabel, 800, 100);
            }
            if(GeneralInformation.character[0].equals("Bulbasaur"))
            {
                addObject(b, 250, 400);
                bHPLabel = new Label("BulbasaurHP: " + Bulbasaur.bHP, 20);
                addObject(bHPLabel, 800, 100);
            }
            if(GeneralInformation.character[1].equals("Charmander"))
            {
                addObject(c, 350, 400);
                cHPLabel = new Label("CharmanderHP: " + Charmander.cHP, 20);
                addObject(cHPLabel, 800, 130);
            }
            
            addObject(f, 250, 150); 
            
            fHPLabel = new Label("FennekinHP: " + f.fHP, 20);
            addObject(fHPLabel, 100, 80);
            
            
            tHPLabel = new Label("TorchicHP: " + t.tHP, 20);
            addObject(tHPLabel, 100, 110);
            
            
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
            eHPLabel.setValue("EeveeHP: " + Eevee.eHP);
            
            if(e.eHP > 0)
            {
                eeveeAtt(pX - 150, pY - 150, new GreenfootImage("EeveeAtt.png"), timerEP);   
                eeveeAtt(cX - 150, cY - 150, new GreenfootImage("EeveeAtt.png"), timerEC); 
                attack3(e.getX(), e.getY(), new GreenfootImage("plantAtt.png"));
            }
            
            if(e.eHP <= 0)
            {
                setBackground(new GreenfootImage("2.png"));
                removeObject(e);
                addObject(r, 750, 100);
                removeObject(eHPLabel);
            
                rHPLabel.setValue("RowletHP: " + r.rHP);
                if(r.rHP > 0)
                {
                    attack3(r.getX(), r.getY(), new GreenfootImage("plantAtt.png"));
                    rowletAtt(pX - 100, pY - 100, new GreenfootImage("RowletAtt.png"), timerRP);
                    rowletAtt(cX - 100, cY - 100, new GreenfootImage("RowletAtt.png"), timerRC);
                }
            }
            if(r.rHP <= 0)
            {
                setBackground(new GreenfootImage("3.png"));
                removeObject(r);
                removeObject(rHPLabel);
                addObject(b, 150, 100);
                
                bHPLabel.setValue("BulbasaurHP: " + b.bHP);
                
                if(b.bHP > 0)
                {
                    attack3(b.getX(), b.getY(), new GreenfootImage("plantAtt.png"));
                    bulbasaurAttack(b.getX(), b.getY(), new GreenfootImage("BulbasaurAtt.png"));
                }
            }
            if(b.bHP <= 0)
            {
                removeObject(b);
                removeObject(bHPLabel);
                ToMap2 t2 = new ToMap2();
                addObject(t2, 450, 250);
                if(pX > 900 || cX > 900)
                {
                    Map2 m2 = new Map2();
                    Greenfoot.setWorld(m2);
                    count++;
                    coins += 10;
                }
            }
            if(p.pHP <= 0 && c.cHP <= 0)
            {
                Restart1 s1 = new Restart1();
                Greenfoot.setWorld(s1);
                Pikachu.live = true;
                Charmander.live = true;
                
            }
        }
        else if(count == 2)
        {
            if(GeneralInformation.character[0].equals("Pikachu"))
            {
                pHPLabel.setValue("PikachuHP: " + Pikachu.pHP);
            }
            if(GeneralInformation.character[0].equals("Bulbasaur"))
            {
                bHPLabel.setValue("BulbasaurHP: " + b.bHP);
            }
            if(GeneralInformation.character[1].equals("Charmander"))
            {
                cHPLabel.setValue("CharmanderHP: " + Charmander.cHP);
            }
            fHPLabel.setValue("FennekinHP: " + f.fHP);
            tHPLabel.setValue("TorchicHP: " + t.tHP);
            
            
            if(f.fHP > 0)
            {
                attack3(f.getX(), f.getY(),  new GreenfootImage("fireAtt.png"));
                fennekinAtt();
            }
            if(f.fHP <= 0)
            {
                setBackground(new GreenfootImage("8.png"));
                removeObject(f);
                removeObject(fHPLabel);
                addObject(t, 750, 100);
                if(t.tHP > 0)
                {
                    attack3(t.getX(), t.getY(),  new GreenfootImage("fireAtt.png"));
                }
            }
            if(t.tHP <= 0)
            {
                removeObject(tHPLabel);
                removeObject(t);
                
                ToMap3 t3 = new ToMap3();
                addObject(t3, 450, 250);
                if(p.pikachuX > 900 || cX > 900 || bX > 900)
                {
                    Map3 s3 = new Map3();
                    Greenfoot.setWorld(s3);
                    count++;
                    coins += 10;
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
                Restart2 r2 = new Restart2();
                Greenfoot.setWorld(r2);
                
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
    
    public void eeveeAtt(int x, int y, GreenfootImage image, SimpleTimer timer)
    {
        EeveeAttack ea = new EeveeAttack(image);
        if(timer.millisElapsed() > 6000)
        {
            addObject(ea,x,y);
            timer.mark();
        }
    }

    
    public void rowletAtt(int x, int y, GreenfootImage image, SimpleTimer timer)
    {
        RowletAttack ra = new RowletAttack(image);
        if(timer.millisElapsed() > 8000)
        {
            addObject(ra, x, y);
            timer.mark();
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
        
        int i = (int)(Math.random()*2)+1;
        int x = (int)(Math.random()*2)+1;
        int y = (int)(Math.random()*2)+1;
        
        
        if(timerFA.millisElapsed() > 5000 && !isThereFire)
        {
            addObject(fa,  200, i * 200);
            addObject(fa1, 400, x * 200);
            addObject(fa2, 600, y * 200);
            isThereFire = true; //
            timerFA.mark();
        }
        
        else if(timerFA.millisElapsed() > 2000 && isThereFire)
        {
            removeObject(fa);
            removeObject(fa1);
            removeObject(fa2);
            isThereFire = false; //
            timerFA.mark();
        }
        
        
    }
}