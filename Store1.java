import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * 
 * The class of the first store, tell the player the pokemon they go with
 * 
 * @author George Lu && Molly Wu 
 * @version June 2022
 */
public class Store1 extends World
{
    ToMap t = new ToMap();
    Label coin = new Label(Battle.coins, 30);
    
    
    public Store1()
    {    
        // Create a new world with 900x506 cells with a cell size of 1x1 pixels.
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
        
        Pikachu.pHP = 65;
        Charmander.cHP = 65;
        
        Bulbasaur.enemy = true;
        
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
