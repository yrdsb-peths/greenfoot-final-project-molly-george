import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Store3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Store3 extends World
{
    Bulbasaur b = new Bulbasaur();
    Pikachu p = new Pikachu();
    Charmander c = new Charmander();
    Eevee e = new Eevee();
    Squirtle s = new Squirtle();
    UpGrade u1 = new UpGrade();
    UpGrade u2 = new UpGrade();
    UpGrade u3 = new UpGrade();
    UpGrade u4 = new UpGrade();
    UpGrade u5 = new UpGrade();
    ToMap t = new ToMap();
    
    private Label toThirdLevel = new Label("click here go to Third level",30);
    
    public Store3()
    {    
        super(1280, 720, 1); 
        
        addObject(p,330,200);

        addObject(c,600,200);

        addObject(b,890,200);

        addObject(e,330,490);
        
        addObject(s,600, 490);

        addObject(u1,330,320);

        addObject(u2,600,320);

        addObject(u3,890,320);

        addObject(u4,330,610);
        
        addObject(u5,600,610);
        
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
            ThirdLevel t = new ThirdLevel();
            Greenfoot.setWorld(t);
        }
    }
}
