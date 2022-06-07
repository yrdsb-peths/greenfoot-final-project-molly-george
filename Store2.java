import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Store2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Store2 extends World
{
    Label select = new Label("This two Pokemons will be the Pokemons you start with!",50);
    Label money = new Label("Now you have 50 coins to ",50);
    
    
    public Store2()
    {    
        super(1280, 720, 1); 
        
        Bulbasaur b = new Bulbasaur();
        //addObject
        
        Pikachu p = new Pikachu();
        //addObject
        
        Charmander c = new Charmander();
    }
}
