import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FinalStore here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Store3 extends World
{
    BulbLogo2 b = new BulbLogo2();
    PikachuLogo p = new PikachuLogo();
    CharmanderLogo c = new CharmanderLogo();
    TorchicLogo2 t = new TorchicLogo2();
    UpGrade u1 = new UpGrade();
    UpGrade u2 = new UpGrade();
    UpGrade u3 = new UpGrade();
    UpGrade u4 = new UpGrade();
    ToMap t1 = new ToMap();
    private Label coin = new Label(Battle.coins, 30);

    private Label tofinalLevel = new Label("click here go to final level",30);
    public Store3()
    {    
        super(900, 506, 1); 
        
        setBackground("Store.png");
        
        addObject(p,135,125);

        addObject(c,440,125);

        addObject(b,135,360);
        
        addObject(t,440,360);

        
        addObject(u1,135,230);

        addObject(u2,440,230);

        addObject(u3,135,470);
        
        addObject(u4,440,470);
        
        addObject(t1, 750, 400);
        
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
        if(Greenfoot.mouseClicked(t))
        {
            GeneralInformation.character[1] = "Torchic";
            Torchic.enemy = false;
        }
        if(Greenfoot.mouseClicked(c))
        {
            GeneralInformation.character[1] = "Charmander";
        }
        //slect more than two will overwrite the second one

        
        if(t1.click == true)
        {
            Load3 b = new Load3();
            Greenfoot.setWorld(b);
        }
    }
    
}
