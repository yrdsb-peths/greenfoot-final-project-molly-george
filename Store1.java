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
    Label coin = new Label(Battle.coins, 30);
    
    public Store1()
    {    
        super(900, 506, 1); 
        
        setBackground("Store.png");
        PikachuLogo p = new PikachuLogo();
        addObject(p,130,120);
        
        CharmanderLogo c = new CharmanderLogo();
        addObject(c,450,120);
        
        
        addObject(t,750, 400);
        
        addObject(coin, 720, 200);
        
        GeneralInformation.character[0] = "Pikachu";
        GeneralInformation.character[1] = "Charmander";
        
    }
    
    public void act()
    {
        if(t.click == true)
        {
            Load1 t = new Load1();
            Greenfoot.setWorld(t);
        }
        
    }
}
