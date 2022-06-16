import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FinalStore here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Store3 extends World
{
    Bulbasaur b = new Bulbasaur();
    Pikachu p = new Pikachu();
    Charmander c = new Charmander();
    Torchic t = new Torchic();
    UpGrade u1 = new UpGrade();
    UpGrade u2 = new UpGrade();
    UpGrade u3 = new UpGrade();
    UpGrade u4 = new UpGrade();
    ToMap t1 = new ToMap();

    private Label tofinalLevel = new Label("click here go to final level",30);
    public Store3()
    {    
        super(900, 506, 1); 

        addObject(p,230,140);

        addObject(c,430,140);

        addObject(b,630,140);

        addObject(t,230, 340);
        
        addObject(u1,230,240);
        addObject(u2,430,240);
        addObject(u3,630,240);
        addObject(u4,230,440);
        addObject(t1, 750, 490);
        
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
            Battle b = new Battle();
            Greenfoot.setWorld(b);
        }
    }
    
}
