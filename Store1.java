import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FirstLevel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Store1 extends World
{
   
    ToMap t = new ToMap();
    
    public Store1()
    {    
        super(900, 506, 1); 
        
        setBackground("Store.png");
        Pikachu p = new Pikachu();
        addObject(p,250,160);
        
        Charmander c = new Charmander();
        addObject(c,600,200);
        
        
        addObject(t,1170, 675);
        
        GeneralInformation.character[0] = "Pikachu";
        GeneralInformation.character[1] = "Charmander";
        
    }
    
    public void act()
    {
        if(t.click == true)
        {
            Battle b = new Battle();
            Greenfoot.setWorld(b);
        }
        
    }
}
