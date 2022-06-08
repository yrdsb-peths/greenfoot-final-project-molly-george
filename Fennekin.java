import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fennekin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fennekin extends Characters
{
    public int FennekinX;
    public int FennekinY;
    
    
    public void act()
    {
        int FennekinX = getX();
        int FennekinY = getY();
    }
    
    public void movement()
    {
        
        if(isTouching(Forest.class))
        {
                
        }
        else if(!isTouching(Forest.class))
        {
            if(Greenfoot.isKeyDown("a"))
            {
                setRotation(270);
                setLocation(FennekinX -= 4, FennekinY);
            }
            
            if(Greenfoot.isKeyDown("d"))
            {
                setRotation(90);
                setLocation(FennekinX += 4, FennekinY);    
                    
            }
            
            if(Greenfoot.isKeyDown("w"))
            {
                setRotation(0);
                setLocation(FennekinX , FennekinY -= 4);
                    
            }
                
            if(Greenfoot.isKeyDown("s"))
            {
                setRotation(180);
                setLocation(FennekinX , FennekinY += 4);
                    
            }
        
        
        }   
        
        if(Greenfoot.isKeyDown("a") && Greenfoot.isKeyDown("w"))
        {
            setRotation(-45);
        }
        if(Greenfoot.isKeyDown("a") && Greenfoot.isKeyDown("s"))
        {
            setRotation(-135);
        }
        if(Greenfoot.isKeyDown("d") && Greenfoot.isKeyDown("w"))
        {
            setRotation(45);
        }
        if(Greenfoot.isKeyDown("d") && Greenfoot.isKeyDown("s"))
        {
            setRotation(135);
        }
    
    }
}
