import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bulbasaur here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bulbasaur extends Characters
{
    public static int bulbasaurX;
    public static int bulbasaurY;
    public static int bHP = 50;
    public static boolean enemy = true;
    public static int damage = 4;
    public static int speed = 4;
    public static boolean live = true;
    private SimpleTimer timer = new SimpleTimer();
    private GreenfootImage[] faceRight = new GreenfootImage[7];
    private GreenfootImage[] faceLeft = new GreenfootImage[7];
    private int stepCheck = 0;
    
    public Bulbasaur()
    {
        bHP = 50;
        setImage(new GreenfootImage("bulbasaur.png"));
        for(int i = 1; i <= faceRight.length; i++){
            faceRight[i - 1] = new GreenfootImage("b" + (i ) + ".png");
            faceRight[i - 1].mirrorHorizontally();
            
            faceLeft[i - 1] =new GreenfootImage("b" + (i ) + ".png");
            setImage(faceLeft[0]);
            
            timer.mark();
        }
    }
    
    public void act()
    {
        int bulbasaurX = getX();
        int bulbasaurY = getY();
        
        if(enemy == true)
        {
            removeTouching(NormalAttack.class);
            movementC(bulbasaurX, bulbasaurY);
        }
        if(enemy != true)
        {
            if(live == true)
            {
                movementA(bulbasaurX, bulbasaurY, speed);
                removeTouching(EnemyAttack.class);
                if(timer.millisElapsed() < 100)
                {
                    return;
                }
                
                if(Greenfoot.isKeyDown("a"))
                {
                    setImage(faceLeft[stepCheck]);
                    stepCheck++;
                    stepCheck %= 7;
                }
                else if(Greenfoot.isKeyDown("d"))
                {
                    setImage(faceRight[stepCheck]);
                    stepCheck++;
                    stepCheck %= 7;
                }
                else if(Greenfoot.isKeyDown("w"))
                {
                    setRotation(270);
                    setImage(faceLeft[stepCheck]);
                    stepCheck++;
                    stepCheck %= 7;
                }
                else if(Greenfoot.isKeyDown("s"))
                {
                    setRotation(90);
                    setImage(faceLeft[stepCheck]);
                    stepCheck++;
                    stepCheck %= 7;
                }
                if(Greenfoot.isKeyDown("a") && Greenfoot.isKeyDown("s"))
                {
                    setRotation(45);
                    setImage(faceRight[stepCheck]);
                    stepCheck++;
                    stepCheck %= 7;
                }
                
                timer.mark();
            }
            if(bHP <= 0)
            {
                live = false;
                bHP = 0;
            }
            
        }
        
        
    }
    
    
    
    

}
