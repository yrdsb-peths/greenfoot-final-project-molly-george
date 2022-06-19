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
    public static int  count = 3;
    public int bX;
    public int bY;
    public int bZ;
    public int tX;
    public int tY;
    public int tZ;
    public int pX;
    public int pY;
    public int pZ;
    public int cX;
    public int cY;
    public int cZ;
    public int hp1;
    public int hp2;
    public int hp3;
    public int hp4;
    private int[] cordinate = new int[12];
    private SimpleTimer[] timerArray = new SimpleTimer[11];
    private Label[] labelArray = new Label[8];
    public boolean isThereFire = false; // To detect if there is any fire on the map
    FennekinAttack fa = new FennekinAttack();
    FennekinAttack fa1 = new FennekinAttack();
    FennekinAttack fa2 = new FennekinAttack();
    public static int coins = 0;
    GeneralInformation g;
    public static boolean right;
    public static boolean left;
    public static boolean up;
    public static boolean down;
   
    
    public Battle()
    {    
        super(900, 506, 1, false); 
        for( int i = 0; i < 11; i++)
        {
            timerArray[i] =  new SimpleTimer();
        }
        timerArray[7].mark();
        g = new GeneralInformation();
        labelArray[0] = new Label("PikachuHP: " + Pikachu.pHP, 20);
        labelArray[1] = new Label("Charmander: " + Charmander.cHP, 20);
        labelArray[2] = new Label("Eevee: " + Eevee.eHP, 20);
        labelArray[3] = new Label("RowletHP: " + r.rHP, 20);
        labelArray[4] = new Label("BulbasaurHP: " + b.bHP, 20);
        labelArray[5] = new Label("FennekinHP: " + f.fHP, 20);
        labelArray[6] = new Label("TorchicHP: " + t.tHP, 20);
        labelArray[7] = new Label("NinetalesHP: " + n.nHP, 20);
        
        for(int i = 0; i < 12; i++)
        {
            cordinate[i] = 0;
        }
        
        if(count == 1)
        {
            Pikachu.live = true;
            Charmander.live = true;
            setBackground(new GreenfootImage("1.png"));
        
            addObject(p, 250, 400);
        
            addObject(c, 350, 400);
            c.cHP = 65;
        
            addObject(e, 250, 150);
            
            addObject(labelArray[0], 800, 50);
            
            addObject(labelArray[1], 800, 80);
            
            addObject(labelArray[2], 100, 50);
            
            addObject(labelArray[3], 100, 80);
            
            addObject(labelArray[4], 100, 110);
            
            
            
        
        }
        else if(count == 2)
        {
            
            setBackground(new GreenfootImage("7.png"));
            if(GeneralInformation.character[0].equals("Pikachu"))
            {
                addObject(p, 320, 400);
                labelArray[0] = new Label("PikachuHP: " + Pikachu.pHP, 20);
                addObject(labelArray[0], 800, 100);
                hp1 = p.pHP;
            }
            if(GeneralInformation.character[0].equals("Bulbasaur"))
            {
                addObject(b, 250, 400);
                
                addObject(labelArray[4], 800, 100);
                hp1 = b.bHP;
            }
            if(GeneralInformation.character[1].equals("Charmander"))
            {
                addObject(c, 350, 400);
                addObject(labelArray[1], 800, 130);
                hp2 = c.cHP;
            }
            
            
            
            addObject(f, 250, 150); 
            
            addObject(labelArray[5], 100, 80);
            
            
            
            addObject(labelArray[6] , 100, 110);
            
            
        }
        else if(count == 3)
        {
            Pikachu.pHP = 65;
            Charmander.cHP = 65;
            Bulbasaur.bHP = 50;
            Torchic.tHP = 45;
            
            addObject(labelArray[7], 100, 80);
            setBackground(new GreenfootImage("9.png"));
        
            if(GeneralInformation.character[0].equals("Pikachu"))
            {
                addObject(p, 250, 350);
                labelArray[0] = new Label("PikachuHP: " + Pikachu.pHP, 20);
                addObject(labelArray[0], 800, 100);
            }
            if(GeneralInformation.character[1].equals("Charmander"))
            {
                addObject(c, 250, 350);
                
                addObject(labelArray[1], 800, 130);
            }
            if(GeneralInformation.character[0].equals("Bulbasaur"))
            {
                addObject(b, 250, 350);
                addObject(labelArray[4], 800, 100);
            }
            if(GeneralInformation.character[1].equals("Torchic"))
            {
                addObject(t, 250, 350);
                labelArray[6] = new Label("TorchicHP: " + Torchic.tHP, 20);
                addObject(labelArray[6] , 800, 130);
            }
            
            addObject(n, 200, 150);
        }
    }
    
    public void act()
    {
        direction();
        if(count == 1)
        {
            labelArray[0].setValue("PikachuHP: " + Pikachu.pHP);
            labelArray[1].setValue("CharmanderHP: " + Charmander.cHP);
            labelArray[2].setValue("EeveeHP: " + Eevee.eHP);
            
            if(e.eHP > 0)
            {
                eeveeAtt(pX - 150, pY - 150, new GreenfootImage("EeveeAtt.png"), timerArray[4]);   
                eeveeAtt(cX - 150, cY - 150, new GreenfootImage("EeveeAtt.png"), timerArray[5]); 
                attack3(e.getX(), e.getY(), new GreenfootImage("plantAtt.png"));
            }
            
            if(e.eHP <= 0)
            {
                setBackground(new GreenfootImage("2.png"));
                removeObject(e);
                addObject(r, 750, 100);
                removeObject(labelArray[2]);
            
                labelArray[3].setValue("RowletHP: " + r.rHP);
                if(r.rHP > 0)
                {
                    attack3(r.getX(), r.getY(), new GreenfootImage("plantAtt.png"));
                    rowletAtt(pX - 100, pY - 100, new GreenfootImage("RowletAtt.png"), timerArray[2]);
                    rowletAtt(cX - 100, cY - 100, new GreenfootImage("RowletAtt.png"), timerArray[3]);
                }
            }
            if(r.rHP <= 0)
            {
                setBackground(new GreenfootImage("3.png"));
                removeObject(r);
                removeObject(labelArray[3]);
                addObject(b, 150, 100);
                
                labelArray[4].setValue("BulbasaurHP: " + b.bHP);
                
                if(b.bHP > 0)
                {
                    attack3(b.getX(), b.getY(), new GreenfootImage("plantAtt.png"));
                    bulbasaurAttack(b.getX(), b.getY(), new GreenfootImage("BulbasaurAtt.png"));
                }
            }
            if(b.bHP <= 0)
            {
                removeObject(b);
                removeObject(labelArray[4]);
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
                Load1 s1 = new Load1();
                Greenfoot.setWorld(s1);
                Pikachu.live = true;
                Charmander.live = true;
                
            }
        }
        else if(count == 2)
        {
            
            if(GeneralInformation.character[0].equals("Pikachu"))
            {
                hp1 = p.pHP;
                labelArray[0].setValue("PikachuHP: " + Pikachu.pHP);
            }
            if(GeneralInformation.character[0].equals("Bulbasaur"))
            {
                hp1 = b.bHP;
                labelArray[4].setValue("BulbasaurHP: " + b.bHP);
            }
            if(GeneralInformation.character[1].equals("Charmander"))
            {
                hp2 = c.cHP;
                labelArray[1].setValue("CharmanderHP: " + Charmander.cHP);
            }
            labelArray[5].setValue("FennekinHP: " + f.fHP);
            labelArray[6].setValue("TorchicHP: " + t.tHP);
            
            
            if(f.fHP > 0)
            {
                attack3(f.getX(), f.getY(),  new GreenfootImage("fireAtt.png"));
                fennekinAtt();
            }
            if(f.fHP <= 0)
            {
                setBackground(new GreenfootImage("8.png"));
                removeObject(f);
                removeObject(labelArray[5]);
                addObject(t, 750, 100);
                if(t.tHP > 0)
                {
                    attack3(t.getX(), t.getY(),  new GreenfootImage("fireAtt.png"));
                }
            }
            if(t.tHP <= 0)
            {
                removeObject(labelArray[6] );
                removeObject(t);
                
                ToMap3 t3 = new ToMap3();
                addObject(t3, 450, 250);
                if(p.pikachuX > 900 || cX > 900 || bX > 900)
                {
                    Map3 s3 = new Map3();
                    Greenfoot.setWorld(s3);
                    count++;
                    coins += 20;
                }
            }
            
            if(hp1 <= 0 && hp2 <= 0)
            {
                Load2 s2 = new Load2();
                Greenfoot.setWorld(s2);
                Pikachu.live = true;
                Charmander.live = true;
                Bulbasaur.live = true;
                
            }
    
            
        }
        else if(count == 3)
        {
            labelArray[7].setValue("Ninetales: " + n.nHP);
            if(n.nHP > 0)
            {
                attack3(n.getX(), n.getY(),  new GreenfootImage("fireAtt.png"));
            }
            if(GeneralInformation.character[0].equals("Pikachu"))
            {
                hp1 = p.pHP;
                labelArray[0].setValue("PikachuHP: " + Pikachu.pHP);
            }
            if(GeneralInformation.character[0].equals("Bulbasaur"))
            {
                hp1 = b.bHP;
                labelArray[4].setValue("BulbasaurHP: " + b.bHP);
            }
            if(GeneralInformation.character[1].equals("Charmander"))
            {
                hp2 = c.cHP;
                labelArray[1].setValue("CharmanderHP: " + c.cHP);
            }
            if(GeneralInformation.character[1].equals("Torchic"))
            {
                hp2 = t.tHP;
                labelArray[7].setValue("NinetalesHP: " + n.nHP);
            }
            if(n.nHP <= 0)
            {
                removeObject(n);
            }
            if(hp1 <= 0 && hp2 <= 0)
            {
                Load2 s2 = new Load2();
                Greenfoot.setWorld(s2);
                Pikachu.live = true;
                Charmander.live = true;
                Bulbasaur.live = true;
                Torchic.live = true;
                
            }
            
            if(n.nHP <= 0)
            {
                removeObject(labelArray[7]);
                removeObject(n);
                
                ToMapFinal tf = new ToMapFinal();
                addObject(tf, 450, 250);
                if(p.pikachuX > 900 || cX > 900 || bX > 900 || tX > 900)
                {
                    ConclusionScreen cs = new ConclusionScreen();
                    Greenfoot.setWorld(cs);
                    
                }
            }
        }
        
        if(GeneralInformation.character[0].equals("Pikachu"))
        {
            pX = p.getX();
            pY = p.getY();
            pZ = p.getRotation();
            attack1(pX, pY, Pikachu.damage, new GreenfootImage("pikachuatt.png"));
        }
        if(GeneralInformation.character[1].equals("Charmander"))
        {
            cX = c.getX();
            cY = c.getY();
            cZ = c.getRotation();
            attack2(cX, cY, Charmander.damage, new GreenfootImage("fireAtt.png"));
        }
        if(GeneralInformation.character[0].equals("Bulbasaur"))
        {
            bX = b.getX();
            bY = b.getY();
            bZ = b.getRotation();
            if(Bulbasaur.enemy != true)
            {
                attack1(bX, bY,Bulbasaur.damage, new GreenfootImage("plantAtt.png"));
            }
        }
        if(GeneralInformation.character[1].equals("Torchic"))
        {
            tX = t.getX();
            tY = t.getY();
            tZ = t.getRotation();
            if(Torchic.enemy != true)
            {
                attack2(tX, tY, Torchic.damage, new GreenfootImage("fireAtt.png"));
            }
        }
    }  
    
    public void direction()
    {
        if(Greenfoot.isKeyDown("a") || Greenfoot.isKeyDown("left"))
        {
            left = true;
            right = false;
            up = false;
            down = false;
        }
        
        if(Greenfoot.isKeyDown("d") || Greenfoot.isKeyDown("right"))
        {
            left = false;
            right = true;
            up = false;
            down = false;
        }
        if(Greenfoot.isKeyDown("w") || Greenfoot.isKeyDown("up"))
        {
            up = true;
            left = false;
            right = false;
            down = false;
        }
        if(Greenfoot.isKeyDown("s") || Greenfoot.isKeyDown("down"))
        {
            up = false;
            left = false;
            right = false;
            down = true;
        }
        
        if((Greenfoot.isKeyDown("a") && Greenfoot.isKeyDown("w")) || (Greenfoot.isKeyDown("left") && Greenfoot.isKeyDown("up")))
        {
            up = true;
            left = true;
            right = false;
            down = false;
        }
        
        if(Greenfoot.isKeyDown("a") && Greenfoot.isKeyDown("s") || (Greenfoot.isKeyDown("left") && Greenfoot.isKeyDown("down")))
        {
            up = false;
            left = true;
            right = false;
            down = true;
        }
        if(Greenfoot.isKeyDown("d") && Greenfoot.isKeyDown("s") || Greenfoot.isKeyDown("right") && Greenfoot.isKeyDown("down"))
        {
            up = false;
            left = false;
            right = true;
            down = true;
        }
        if(Greenfoot.isKeyDown("d") && Greenfoot.isKeyDown("w") || Greenfoot.isKeyDown("right") && Greenfoot.isKeyDown("up"))
        {
            up = true;
            left = false;
            right = true;
            down = false;;
        }
        
    }
    
    
    public void  attack1(int x, int y,  int damage, GreenfootImage image)
    {
        if(Greenfoot.isKeyDown("space"))
        {
            if(timerArray[0].millisElapsed() > 500)
            {
                NormalAttack a = new NormalAttack(image, damage);
                addObject(a,x,y);
                timerArray[0].mark();
                
            }
        }
    }
    
    public void attack2(int x, int y,  int damage, GreenfootImage image)
    {
        if(Greenfoot.isKeyDown("r"))
        {
            if(timerArray[0].millisElapsed() > 500)
            {
                NormalAttack a = new NormalAttack(image, damage);
                addObject(a,x,y);
                timerArray[0].mark();
                
            }
        }
    }
    
    
    public void attack3(int x, int y, GreenfootImage image)
    {
        if(timerArray[1].millisElapsed() > 3000)
        {
            for(int i = 1; i < 9; i++)
            {
                EnemyAttack e = new EnemyAttack(image);
                addObject(e,x,y);
                e.setRotation(i * 45);
                timerArray[1].mark();
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
        if(timerArray[6].millisElapsed() > 5000)
        {
            for(int i = 1; i < 9; i++)
            {
                BulbasaurAttack ba = new BulbasaurAttack(image);
                addObject(ba,x,y);
                ba.setRotation(i * 45);
                timerArray[6].mark();
            }
            
        }
    }
    
    public void fennekinAtt()
    {
        
        int i = (int)(Math.random()*2)+1;
        int x = (int)(Math.random()*2)+1;
        int y = (int)(Math.random()*2)+1;
        
        
        if(timerArray[7].millisElapsed() > 5000 && !isThereFire)
        {
            addObject(fa,  200, i * 200);
            addObject(fa1, 400, x * 200);
            addObject(fa2, 600, y * 200);
            isThereFire = true; //
            timerArray[7].mark();
        }
        
        else if(timerArray[7].millisElapsed() > 2000 && isThereFire)
        {
            removeObject(fa);
            removeObject(fa1);
            removeObject(fa2);
            isThereFire = false; //
            timerArray[7].mark();
        }
        
        
    }
}