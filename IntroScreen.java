import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Introscreen here.
 * 
 * @author Molly Wu 
 * @version June 2022
 */
public class IntroScreen extends World
{
    GreenfootImage image;
    Dialogue dialogue;
    NextButton nextButton = new NextButton();
    /**
     * Constructor for objects of class Introscreen.
     * 
     */
    
    public IntroScreen()
    {    
        // Create a new world with 853x480 cells with a cell size of 1x1 pixels.
        super(853, 480, 1); 
        
        setBackground(new GreenfootImage("intropageee.jpg"));
        
        dialogue = new Dialogue();
        addObject(dialogue, 300, 50);
        
        
        addObject(nextButton, 700, 430);
    }
    
    public void act()
    {
        if(Greenfoot.mouseClicked(nextButton))
        {
            dialogue.ifNextButtonClicked = true;
            if(dialogue.idx == 5)
            {
                Map1 m1 = new Map1();
                Greenfoot.setWorld(m1);
            }
        }
        
    }
}
