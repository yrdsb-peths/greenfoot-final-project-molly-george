import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SecondLevel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SecondLevel extends World
{

    
    public SecondLevel()
    {  
        super(1280, 720, 1); 
        
        if(GeneralInformation.character[0].equals("Pikachu"))
        {
            Pikachu p = new Pikachu();
            //addObject
        }
        if(GeneralInformation.character[1].equals("Charmander"))
        {
            Charmander c = new Charmander();
            //addObject
        }
        if(GeneralInformation.character[1].equals("Bulbasaur"))
        {
            Bulbasaur b = new Bulbasaur();
            //addObject
        }
    }
    
    public void act()
    {
        
    }
}
