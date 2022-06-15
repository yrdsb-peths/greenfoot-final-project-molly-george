import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FinalStore here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FinalStore extends World
{
    Bulbasaur b = new Bulbasaur();
    Pikachu p = new Pikachu();
    Charmander c = new Charmander();
    Eevee e = new Eevee();
    Squirtle s = new Squirtle();
    Ninetales n = new Ninetales();
    UpGrade u1 = new UpGrade();
    UpGrade u2 = new UpGrade();
    UpGrade u3 = new UpGrade();
    UpGrade u4 = new UpGrade();
    UpGrade u5 = new UpGrade();
    UpGrade u6 = new UpGrade();
    ToMap t = new ToMap();
    
    
    private Label tofinalLevel = new Label("click here go to final level",30);
    
    public FinalStore()
    {    
        super(1280, 720, 1); 
        
        addObject(p,330,200);

        addObject(c,600,200);

        addObject(b,890,200);

        addObject(e,330,490);
        
        addObject(s,600, 490);
        
        addObject(n,890, 490);

        addObject(u1,330,320);

        addObject(u2,600,320);

        addObject(u3,890,320);

        addObject(u4,330,610);
        
        addObject(u5,600,610);
        
        addObject(u6,890,610);
        
        addObject(t, 1170, 675);
        
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
        }
        if(Greenfoot.mouseClicked(n))
        {
            GeneralInformation.character[0] = "Ninetales";
        }
        if(Greenfoot.mouseClicked(c))
        {
            GeneralInformation.character[1] = "Charmander";
        }
        //slect more than two will overwrite the second one
        if(Greenfoot.mouseClicked(e))
        {
            GeneralInformation.character[1] = "Eevee";
        }
        if(Greenfoot.mouseClicked(s))
        {
            GeneralInformation.character[1] = "Squirtle";
        }
        
        if(t.click == true)
        {
            Boss b = new Boss();
            Greenfoot.setWorld(b);
        }
    }
}
