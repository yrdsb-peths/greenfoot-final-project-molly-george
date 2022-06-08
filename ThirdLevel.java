import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ThirdLevel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ThirdLevel extends World
{

    /**
     * Constructor for objects of class ThirdLevel.
     * 
     */
    public ThirdLevel()
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
        if(GeneralInformation.character[1].equals("Lapras"))
        {
            Lapras l = new Lapras();
            //addObject
        }
        if(GeneralInformation.character[1].equals("Squirtle"))
        {
            Squirtle s = new Squirtle();
            //addObject
        }
    }
}
