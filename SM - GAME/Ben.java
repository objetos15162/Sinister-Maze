import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is a class to represent the Ben.
 * 
 * @author Corpus Sanchez Jose Eduardo 
 * @version 2.0
 */
public class Ben extends Enemy
{
    /**
     * This is the constructor of the class.
     */
    public Ben()
    {
        super.setMoveAux(Greenfoot.getRandomNumber(4));
    }

    /**
     * Act - do whatever the Ben wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        super.act();
    }    
}
