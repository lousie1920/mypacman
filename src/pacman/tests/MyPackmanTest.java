package pacman.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import pacman.Direction;
import pacman.MazeMap;
import pacman.Square;

class MyPackmanTest {

	
		
		//Square tests 
		
		boolean[] myPassable1 = new boolean[] {false,true};
		MazeMap myMazeMap = new MazeMap(1,2, myPassable1 );
		Square mySquare = Square.of(myMazeMap, 0, 0);
		Square neighborSquare;
		Direction[] myPassableDirections;
				
		//Constructor tests
		assertEquals(mySquare.isPassable(),myMazeMap.isPassable(0,0));
				
		//exception tests for constructor
				
				
		//getneighbor test 
		neighborSquare = mySquare.getNeighbor(Direction.LEFT);
		System.out.print("neighborSquare " + neighborSquare.getRowIndex() + "," + neighborSquare.getColumnIndex() + "\n");
		assertEquals(neighborSquare.getColumnIndex(),mySquare.getColumnIndex());
		
		//getPassableDirectionsExcept
		
		myPassableDirections = mySquare.getPassableDirectionsExcept(Direction.UP);
		System.out.print("myPassableDirections " + myPassableDirections[0] );
		
	}

}
