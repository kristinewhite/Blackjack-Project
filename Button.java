import greenfoot.*;
/**
 * A should be abstract class that is the blueprint to buttons
 * Concrete only for experimentation purposes
 * 
 * @author Brejon T 
 * @version 4.13.24
 */

public class Button extends Actor
{
    // instance variables - replace the example below with your own
    private GreenfootImage message;
    private int x;
    private int y;
    private static final int DEFAULT_FONT_SIZE = 100;

    /**
     * Constructor for objects of class Button
     */
    public Button(String message, int x, int y)
    {
        this.message = new GreenfootImage(message, DEFAULT_FONT_SIZE, Color.RED, Color.GREEN);
        setImage(this.message);
        this.x = x;
        this.y = y;
        setLocation(x,y);
    }
    public Button(String message,int x, int y, int fontSize){
        this.message = new GreenfootImage(message, fontSize, Color.RED, Color.GREEN);
        setImage(this.message);
        this.x = x;
        this.y = y;
    }
    /**
     * This initalizes a button object that has a specific image to pair with it
     * @param picture   A GreenfootImage that serves as the image of the button
     * @param x   The x coordinate of the button
     * @param y   The y coordinate of the button
     */
    public Button(GreenfootImage img, int x, int y){
        img.scale(200,100);
        this.message = img;
        setImage(this.message);
        this.x = x;
        this.y = y;
    }
    /**
     * Sets the location of the actor AND updates the x and y coordinate of the button object 
     */
    @Override
    public void setLocation(int x, int y){
        super.setLocation(x, y);
        this.x = x;
        this.y = y;
    }
    
    /**
     * This methods allows a Button object to have an x coordinate before being added to a world.
     */
    @Override
    public int getX(){
        return x;
    }
    
    /**
     * This methods allows a Button object to have an y coordinate before being added to a world.
     */
    @Override
    public int getY(){
        return y;
    }
    
    public void setX(int x){
        this. x = x;
    }
    
    public void setY(int y){
        this.y = y;
    }
    
    public GreenfootImage scale(GreenfootImage img, int x, int y){
        img.scale(x,y);
        return img;
    }
    
    public void act(){

    }
    
    public void animate(String btnType){
        if(Greenfoot.mousePressed(this)){
            setImage(scale(new GreenfootImage("images//"+btnType+"1.png"),200,100));
            Greenfoot.delay(20);
        } 
        if(Greenfoot.mouseClicked(this)){
            setImage(scale(new GreenfootImage("images//"+btnType+"2.png"),210,110));
            Greenfoot.delay(10);
            if (this instanceof Start){ Greenfoot.setWorld( new BlackJackRunner()); }
        }
        if(Greenfoot.mouseMoved(this)){
            setImage(scale(new GreenfootImage("images//"+btnType+"2.png"),210,110));
        } else if(Greenfoot.mouseMoved(null) && !Greenfoot.mouseMoved(this)){
            setImage(scale(new GreenfootImage("images//"+btnType+"3.png"),200,100));
        }
    }
}

/*
 * Buttons will NEVER move or turn therefore only certain methods will need to be overriden
 * A method (such as turnTowards) will not need to be overriden to update the instance x and y values
 * as it will never need to use those methods
 */
