import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StartButton here.
 * 
 * @author Brejon T
 * @version 4.14.24
 */
public class StartButton extends Button
{
    /**
     * Act - do whatever the StartButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public StartButton(String message, int x, int y){
        super(message, x, y);
    }

    public StartButton(GreenfootImage message, int x, int y){
        super(message, x, y);
    }

    public void act(){
        if(Greenfoot.mousePressed(this)){
            setImage(Button.changeSize(new GreenfootImage("images//background_images//Picture2.png"),200,100));
        } 
        if(Greenfoot.mouseClicked(this)){
            setImage(Button.changeSize(new GreenfootImage("images//background_images//Picture1.png"),200,100));
            Greenfoot.delay(10);
            Greenfoot.setWorld( new BlackJackRunner());
        }
        if(Greenfoot.mouseMoved(this)){
            setImage(Button.changeSize(new GreenfootImage("images//background_images//Picture3.png"),215,115));
        } else if(Greenfoot.mouseMoved(null) && !Greenfoot.mouseMoved(this)){
            setImage(Button.changeSize(new GreenfootImage("images//background_images//Picture1.png"),200,100));
        }
    }
}
