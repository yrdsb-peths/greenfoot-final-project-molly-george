import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Torchic here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Torchic extends Characters
{
    public int TorchicX;
    public int TorchicY;
    
    
    public void act()
    {
        int TorchicX = getX();
        int TorchicY = getY();
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
                setLocation(TorchicX -= 4, TorchicY);
            }
            
            if(Greenfoot.isKeyDown("d"))
            {
                setRotation(90);
                setLocation(TorchicX += 4, TorchicY);    
                    
            }
            
            if(Greenfoot.isKeyDown("w"))
            {
                setRotation(0);
                setLocation(TorchicX , TorchicY -= 4);
                    
            }
                
            if(Greenfoot.isKeyDown("s"))
            {
                setRotation(180);
                setLocation(TorchicX , TorchicY += 4);
                    
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
