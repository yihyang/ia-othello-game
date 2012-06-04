package ai.othello.entities;

import java.util.Vector;

import ai.othello.graphic.PlayActivity;

public interface GameI extends Runnable {
	
	public enum COLOR{NONE, DARK, LIGHT};
	
	public abstract void initialize();
	
	public abstract void play();
	
	public abstract void applyMove(MoveI move, boolean draw);
	
	public abstract boolean endCondition();
	
	public abstract Vector<MoveI> getLegalMoves(COLOR color);
	
	public abstract SquareI[][] getBoard();
	
	public abstract int getBoardDim();
	
	public abstract PlayerI getCurrentPlayer();
	
	public abstract int getTotalDisksNum();
	
	public abstract int getCurrentDisksNum();
	
	public abstract int getDarkDisksNum();
	
	public abstract int getLightDisksNum();
	
	public abstract PlayActivity getGui();
	
}