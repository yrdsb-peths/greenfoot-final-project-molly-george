import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Store3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Store2 extends World
{
    BulbLogo2 b = new BulbLogo2();
    PikachuLogo p = new PikachuLogo();
    CharmanderLogo c = new CharmanderLogo();
    
    UpGrade u1 = new UpGrade();
    UpGrade u2 = new UpGrade();
    UpGrade u3 = new UpGrade();
    ToMap t = new ToMap();
    private Label coin = new Label(Battle.coins, 30);
    
    private Label toThirdLevel = new Label("click here go to Third level",30);
    
    public Store2()
    {    
        super(900, 506, 1); 
        
        setBackground("Store.png");
        addObject(p,135,125);

        addObject(c,440,125);

        addObject(b,135,360);

        addObject(u1,135,230);

        addObject(u2,440,230);

        addObject(u3,135,470);
        
        addObject(t, 750, 400);
        
        addObject(coin, 725, 200);
        
        GeneralInformation.character[0] = "Pikachu";
        
        GeneralInformation.character[1] = "Charmander";
    }
    
    public void act()
    {
        
        if(Greenfoot.mouseClicked(p))
        {
            GeneralInformation.character[0] = "Pikachu";
        }
        if(Greenfoot.mouseClicked(b))
        {
            GeneralInformation.character[0] = "Bulbasaur";
            Bulbasaur.enemy = false;
        }
        if(Greenfoot.mouseClicked(c))
        {
            GeneralInformation.character[1] = "Charmander";
        }
        
        
        //slect more than two will overwrite the second one

        if(t.click == true)
        {
            Load2 b = new Load2();
            Greenfoot.setWorld(b);
        }
    }
}
