import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Dialogue here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dialogue extends Actor
{
    GreenfootImage [] image = new GreenfootImage[6];
    int [][] coordinate = new int[6][2];
    public  int idx=0;
    public Dialogue()
    {
          
         image[0] = new GreenfootImage("welcomeee1.jpg");
         image[1] = new GreenfootImage("introii.jpg");
         image[2] = new GreenfootImage("background2.jpg");
         image[3] = new GreenfootImage("playerline2.jpg");
         image[4] = new GreenfootImage("backgroundintro.jpg");
         image[5] = new GreenfootImage("playerline3.jpg");
         
         coordinate[0][0] = 300;
         coordinate[0][1] = 50;
         
         coordinate[1][0] = 170;
         coordinate[1][1] = 400;
         
         coordinate[2][0] = 400;
         coordinate[2][1] = 350;
         
         coordinate[3][0] = 300;
         coordinate[3][1] = 450;
         
         coordinate[4][0] = 300;
         coordinate[4][1] = 80;
         
         coordinate[5][0] = 500;
         coordinate[5][1] = 400;
         
         setImage(image[idx]);
         setLocation(coordinate[idx][0],coordinate[idx][1]);
    }
    
    /**
     * Act - do whatever the Dialogue wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Greenfoot.mouseClicked(this)){
            if(!(idx+1>5)){
            idx++;
            }
            setImage(image[idx]);
            setLocation(coordinate[idx][0],coordinate[idx][1]);
        }
    }
}
