import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Store3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Store2 extends World
{
    Bulbasaur b = new Bulbasaur();
    Pikachu p = new Pikachu();
    Charmander c = new Charmander();
    
    UpGrade u1 = new UpGrade();
    UpGrade u2 = new UpGrade();
    UpGrade u3 = new UpGrade();
    ToMap t = new ToMap();
    
    private Label toThirdLevel = new Label("click here go to Third level",30);
    
    public Store2()
    {    
        super(1280, 720, 1); 
        
        addObject(p,330,200);

        addObject(c,600,200);

        addObject(b,890,200);

        addObject(u1,330,320);

        addObject(u2,600,320);

        addObject(u3,890,320);
        
        addObject(t, 1170, 675);
        
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
            Battle b = new Battle();
            Greenfoot.setWorld(b);
        }
    }
}
