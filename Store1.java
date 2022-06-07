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
    
    public Store1()
    {    
        super(1280, 720, 1); 
        
        Pikachu p = new Pikachu();
        addObject(p,400,300);
        
        Charmander c = new Charmander();
        addObject(c,600,300);
        
        addObject(select,500,500);
        
        GeneralInformation.character[0] = "P";
        GeneralInformation.character[1] = "C";
        
    }
    
    public void act()
    {
        
        if(Greenfoot.isKeyDown("space"))
        {
            FirstLevel firstLevel = new FirstLevel();
            Greenfoot.setWorld(firstLevel);
        }
    }
}
