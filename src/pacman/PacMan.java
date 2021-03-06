package pacman;

/**
 * Each instance of this class represents the player-controlled Pac-Man character in a Pac-Man maze.
 * 
 */
public class PacMan {
	
	/**
	 * @invar | 0 <= pacmanLives
	 * @invar | 0 <= square.getRowIndex() && 
	 * 		  | square.getRowIndex() < square.getMazeMap().getHeight()
	 * @invar | 0 <= square.getColumnIndex() && 
	 * 		  | square.getColumnIndex() < square.getMazeMap().getWidth()
	 * @invar | square.isPassable() == true
	 * @invar | square != null 
	 */
	private int pacmanLives;
	/** @RepresentationObject */
	
	private Square square;
	
	/**
	 * Returns the current position of Pac-Man.
	 * @basic
	 * 
	 * @post | 0 <= result.getRowIndex() && 
	 * 		 | result.getRowIndex() < result.getMazeMap().getHeight()
	 * @post | 0 <= result.getColumnIndex() && 
	 * 		 | result.getColumnIndex() < result.getMazeMap().getWidth()
	 * @post | result.isPassable() == true
	 * @post | result != null
	 */
	
	public Square getSquare() {return square;}
	
	/**
	 * Returns the number of lives the Pac-Man has left.
	 * @basic
	 * @post | result >= 0
	 */
	
	public int getNbLives() { return pacmanLives; }

	/**
	 * Initializes this object so that it represents Pac-Man with a given number of lives left and a position
	 * in the maze given by an object of the class Square.
	 * 
	 * @throws IllegalArgumentException | nbLives <= 0
	 * @inspects | square
	 * 
	 * @post | getNbLives() == nbLives
	 * @post | getSquare() == square
	 * 
	 */
	public PacMan(int nbLives, Square square) {
		if(nbLives < 0)
			throw new IllegalArgumentException("No lives left");
		pacmanLives = nbLives;
		this.square = square;
	}
	
	/**
	 * Changes the position of Pac-Man in the maze.
	 * 
	 * @inspects | square
	 * @mutates | this
	 * 
	 * @post | getSquare() == square
	 * @post | getNbLives() == old(getNbLives())
	 * 
	 */
	public void setSquare(Square square) {
		this.square = square; }
	
	/**
	 * Decreases this Pac-Man character's number of lives by one.
	 * 
	 * @mutates | this 
	 * 
	 * @post | getNbLives() == old(getNbLives()) -1
	 * @post | getSquare() == old(getSquare())
	 */
	public void die() { pacmanLives = getNbLives()-1;}

}