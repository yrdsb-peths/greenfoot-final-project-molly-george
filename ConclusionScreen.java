import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The conclusion screen class
 * 
 * @author George && Molly
 * @version June 
 */
public class ConclusionScreen extends World
{

    //Create a image to tell the plyaer the end of the game, and change some variable back
    public ConclusionScreen()
    {    
        // Create a new world with 900x506 cells with a cell size of 1x1 pixels.
        super(900, 506, 1); 
        
        Battle.coins = 0;
        Battle.count = 1;
        Pikachu.damage = 4;
        Charmander.damage = 4;
        Bulbasaur.damage = 5;
        Torchic.damage = 5;
        
        setBackground(new GreenfootImage("conclusionscreen.jpg"));
        
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the label and add it to the world.
     */
    private void prepare()
    {
        ConclusionStatement1 conclusionStatement1 = new ConclusionStatement1();
        addObject(conclusionStatement1, 300, 70);
        
        ConStateI constateI = new ConStateI();
        addObject(constateI, 450, 150);
        
        ConStateii constateii = new ConStateii();
        addObject(constateii, 450, 250);
    }
}
