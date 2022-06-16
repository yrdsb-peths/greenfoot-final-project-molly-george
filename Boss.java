import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Boss here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Boss extends World
{
    Ninetales n = new Ninetales();
    Pikachu p = new Pikachu();
    Charmander c = new Charmander();
    Bulbasaur b = new Bulbasaur();
    Eevee e = new Eevee();
    
    Torchic t = new Torchic();
    
    public Boss()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1280, 720, 1);
        
        setBackground(new GreenfootImage("9.png"));
        
        if(GeneralInformation.character[0].equals("Pikachu"))
        {
            addObject(p, 250, 350);
        }
        if(GeneralInformation.character[1].equals("Charmander"))
        {
            addObject(c, 250, 350);
        }
        if(GeneralInformation.character[0].equals("Bulbasaur"))
        {
            addObject(b, 250, 350);
        }
        if(GeneralInformation.character[1].equals("Eevee"))
        {
            addObject(e, 250, 350);
        }
        
        if(GeneralInformation.character[1].equals("Torchic"))
        {
            addObject(t, 250, 350);
        }
        
        addObject(n, 200, 150);
    }
}
