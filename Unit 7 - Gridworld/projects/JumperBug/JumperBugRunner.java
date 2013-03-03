/* 
 * AP(r) Computer Science GridWorld Case Study:
 * Copyright(c) 2005-2006 Cay S. Horstmann (http://horstmann.com)
 *
 * This code is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * @author Cay Horstmann
 * @author Chris Nevison
 * @author Barbara Cloud Wells
 */

import info.gridworld.actor.*;
import info.gridworld.grid.Location;

import java.awt.Color;

class JumperBug extends Bug
{
	public void act()
	{
		if(canMove())
		{
      	move();
		}
		else
		{
			turn();
		}
	}
	
	public boolean canMove()
   {
        if (getGrid() == null)
            return false;
        if (!getGrid().isValid(getLocation().getAdjacentLocation(getDirection()).getAdjacentLocation(getDirection())))
            return false;
       return (getGrid().get(getLocation().getAdjacentLocation(getDirection()).getAdjacentLocation(getDirection())) == null);
   }
	 
	 public void move()
    {
        if (getGrid() == null)
            return;
        if (getGrid().isValid(getLocation().getAdjacentLocation(getDirection()).getAdjacentLocation(getDirection())))
            moveTo(getLocation().getAdjacentLocation(getDirection()).getAdjacentLocation(getDirection()));
        else
            removeSelfFromGrid();
    }
}

public class JumperBugRunner
{
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld();
        JumperBug alice = new JumperBug();
		  Rock rockey = new Rock();
		  Flower flowery = new Flower();
        world.add(new Location(7, 8), alice);
		  world.add(rockey);
		  world.add(flowery);
        world.show();
    }
}