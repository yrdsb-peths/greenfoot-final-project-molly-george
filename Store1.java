import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FirstLevel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Store1 extends World
{
    Label select = new Label("This two Pokemons will be the Pokemons you start with!",50);
    ToMap t = new ToMap();
    
    public Store1()
    {    
        super(1280, 720, 1); 
        
        Pikachu p = new Pikachu();
        addObject(p,330,200);
        
        Charmander c = new Charmander();
        addObject(c,600,200);
        
        addObject(select,640,35);
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
