//Sony Theakanath
//Inherit-Asg6: Snake Game

import info.gridworld.actor.*;
import info.gridworld.grid.*;
import java.util.ArrayList;

/** Basically creates the finished SnakeBug for the SnakeGame. Methods are
	 described below
*/
class SnakeBug extends Bug
{
	private int grow; //Current number of pieces the snake should grow
	private ArrayList<Location>snake;//List of Locations of the snake body
	
	/** Default constructor */
	public SnakeBug()
	{
		grow = 4;
		snake = new ArrayList<Location>();
	}
	/** Modified form of act. This checks if it goes outside the grid
		 or if it goes against the rock and ends the game. Currently there
		 is a bug that won't let you quit (tested on a mac) so you have to end
		 it. It adds the rocks behind the bug and deletes them according 
		 to how much you have
	*/
	public void act()
	{
		Grid<Actor> gr = getGrid();
		if(!canMove()) //Ending Game
		{
			 javax.swing.JOptionPane.showMessageDialog(null, "Score: " + snake.size(), "GAME OVER!", 0); 
		}else {
		 	Location loc = getLocation();
    	   Location next = loc.getAdjacentLocation(getDirection());
			Actor inFront = gr.get(next);
			if (inFront instanceof Flower) //Checking if Flower is infront of the bug
			{
				gr.remove(next);
				grow+= 3;
				randomFlower();
				moveTo(next);
				addRockBehindHead(loc);
			} else { //Just moving the Bug normally and using rocks also
				moveTo(next);
				addRockBehindHead(loc);
				eraseTail();
			}
		}
	}
	
	/** Random flower creates a random flower on the grid. It checks all
		 the locations and loops if it is occupied. If it is occupied then
		 it creates another random location. Once it gets past the loop it
		 creates the flower
	*/
	public void randomFlower()
	{
		Grid<Actor> gr = getGrid();
		int x = (int)(Math.random()*18); //Making the row
		int y = (int)(Math.random()*18); //Making the column
		Location tempempty = new Location(x, y); //The location
		ArrayList<Location> areas = gr.getOccupiedLocations();
		for(int z = 0; z < areas.size(); z++) //Checking all the locations in the grid and testing
		{
			if ( areas.get(z).equals(tempempty) )
			{
				x = (int)(Math.random()*18);
				y = (int)(Math.random()*18);
				tempempty = new Location(x, y);
				z = 0;
			}
		}
		Flower food = new Flower();
		food.putSelfInGrid(gr, tempempty);
	}
	
	/** This function adds the rock behind the head and also adds the location
		 to the ArrayList.
	*/
	public void addRockBehindHead(Location loc)
	{
		Grid<Actor> gr = getGrid();
		Rock snaketail = new Rock();
		snaketail.putSelfInGrid(gr, loc); //Adding to Grid
		snake.add(0, loc); //Adding to ArrayList
	}
	
	/**As the name states it erases the rock according to the last arrraylist
		element. Wee.
	*/
	public void eraseTail()
	{
		Grid<Actor> gr = getGrid();
		Location lastrock = snake.get(snake.size()-1);
		gr.remove(lastrock); //Remove from grid
		snake.remove(snake.size()-1); //Remove from ArrayList
	}

	
}


/**********************IGNORE BELOW*//////////////////////////////

/**
* This is a clone of the classic Snake game (a.k.a. Nibbles).
* The GUI is the standard for GridWorld and the snake
* is controlled by the arrow keys on the keyboard.
* (the code is provided for KeyEvent handling in the main)
*/
public class SnakeGame_Theakanath
{

  /**
  * World variable used for GUI...
  * Initialized to 19x19 Grid for aesthetic viewing.
  */
  public static ActorWorld world = new ActorWorld(new BoundedGrid(19, 19));
  
  /**
  * The only Actor that actually moves in the game.
  * Its direction is controlled by the keyboard arrow keys.
  */
  public static SnakeBug head = new SnakeBug();
  
  /**
  * Handles game simulation with one bug whose moves
  * NOTE: YOU DO NOT NEED TO WRITE ANY CODE IN THE main()
  */
  public static void main(String[] args) {
     
    head.setDirection(0);//facing North
    world.add(new Location(17, 9), head);
    
    head.randomFlower();//<==UNCOMMENT AFTER randomFlower() HAS BEEN IMPLEMENTED!
    
    java.awt.KeyboardFocusManager.getCurrentKeyboardFocusManager()
        .addKeyEventDispatcher(new java.awt.KeyEventDispatcher() {
          public boolean dispatchKeyEvent(java.awt.event.KeyEvent event) {
            String key = javax.swing.KeyStroke.getKeyStrokeForEvent(event)
                .toString();
            if (key.equals("pressed UP"))
              head.setDirection(0);
            if (key.equals("pressed RIGHT"))
              head.setDirection(90);
            if (key.equals("pressed DOWN"))
              head.setDirection(180);
            if (key.equals("pressed LEFT"))
              head.setDirection(270);
            return true;
          }
        });
    world.show();
  }
}