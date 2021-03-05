package pacman.tests;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;

import pacman.Direction;
import pacman.Dot;
import pacman.Ghost;
import pacman.MazeMap;
import pacman.Square;

import org.junit.jupiter.api.Test;

class DotTest {

	@Test
	void test() {

		
		MazeMap mazemap = new MazeMap(2,2,new boolean[] {true,true,false,true});
		
		Square square = Square.of(mazemap, 0, 1);
		Dot dotValid = new Dot(square);
		
		// getSquare Test
		
		assertEquals(square,dotValid.getSquare());
	
	
	}

}
