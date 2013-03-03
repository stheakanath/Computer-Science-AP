import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

import java.awt.Color;
import java.util.ArrayList;

public class QuickCrab extends CrabCritter
{
    public QuickCrab()
    {
        super();
    }
    public void makeMove(Location loc)
    {
	 	  Grid<Actor> gr = getGrid();
		  Actor westnext = gr.get(loc.getAdjacentLocation(Location.WEST));
		  Actor westnextnext = gr.get(loc.getAdjacentLocation(Location.WEST).getAdjacentLocation(Location.WEST));
		  Actor eastnext = gr.get(loc.getAdjacentLocation(Location.EAST));
		  Actor eastnextnext = gr.get(loc.getAdjacentLocation(Location.EAST).getAdjacentLocation(Location.EAST));
    	  if(westnext == null && westnextnext == null && eastnext == null && eastnextnext == null)
		  {
		  	   double r = Math.random();
            int angle;
            if (r < 0.5)
                angle = Location.LEFT;
            else
                angle = Location.RIGHT;
           	moveTo(loc.getAdjacentLocation(angle).getAdjacentLocation(angle));
		  } else {
            super.makeMove(loc);
  		  }   
	 }    
}
