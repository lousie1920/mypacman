package pacman;

import java.util.Arrays;

import pacman.MazeMap;

/**
 * Each instance of this class represents a position in a maze, specified by a row index and a column index.
 * The top row and the leftmost column have index 0.
 */
public class Square {
	
	private int rowIndex;
	
	private int columnIndex;
	
	private MazeMap mazeMap;
	
	private Square(MazeMap mazemap, int rowIndex, int columnIndex) {
		this.mazeMap = mazemap;
		this.rowIndex = rowIndex;
		this.columnIndex = columnIndex;
	}
	
	
	public MazeMap getMazeMap() { 
		return mazeMap;
	}
	
	public int getRowIndex() { 
		return rowIndex;
	}
	
	
	public int getColumnIndex() { 
		return columnIndex;
	}
	
	public boolean isPassable() { 
		return mazeMap.isPassable(rowIndex,columnIndex);
	}
	
	public static Square of(MazeMap mazeMap, int rowIndex, int columnIndex) {
		Square square = new Square(mazeMap, rowIndex, columnIndex);
		return square;
	}
	
	/**
	 * Returns this square's neighbor in the given direction.
	 * If this square has no neighbor in the given direction, return the square that is furthest away in the opposite direction.
	 */
	// No formal documentation required
	public Square getNeighbor(Direction direction) {
		
		switch (direction) {
		case RIGHT: 
			return new Square(mazeMap,rowIndex, java.lang.Math.floorMod(columnIndex + 1, mazeMap.getWidth()));
		case LEFT: 
			return new Square(mazeMap,rowIndex, java.lang.Math.floorMod(columnIndex + 1, mazeMap.getWidth()));
		case UP: 
			return new Square(mazeMap,java.lang.Math.floorMod(rowIndex - 1, mazeMap.getHeight()), columnIndex);
		case DOWN: 
			return new Square(mazeMap,java.lang.Math.floorMod(rowIndex - 1, mazeMap.getHeight()), columnIndex);
		default:
			return this;
		}
	}

	/**
	 * Returns whether this square's neighbor in the given direction is passable.
	 */
	// No formal documentation required
	public boolean canMove(Direction direction) {
		return getNeighbor(direction).isPassable();
	}

	/**
	 * Returns the directions that are different from the given excluded direction and such that the neighbor in that direction is passable.
	 * The returned array shall have no null elements and shall have no duplicates.
	 */
	// No formal documentation required
	
	//optimalisatie doen
	public Direction[] getPassableDirectionsExcept(Direction excludedDirection) {
		Direction passabledirections[] = new Direction[] {Direction.RIGHT, Direction.DOWN, Direction.LEFT, Direction.UP};
		for( Direction direction : Direction.values()) {
			if (direction != excludedDirection ) {
				if (canMove(direction)){
					
				}
			}
		}
			
	}
	
	/**
	 * Returns whether the given square refers to the same {@code MazeMap} object and has the same row and column index as this square.  
	 */
	public boolean equals(Square other) {
		return this.mazeMap == other.getMazeMap() && this.columnIndex == other.getColumnIndex() && this.rowIndex == other.getRowIndex();
	}
	
}
