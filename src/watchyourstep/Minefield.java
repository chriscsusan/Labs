package watchyourstep;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Minefield implements ActionListener{
	int boardSizeV = 0;
	int boardSizeH = 0;
	char[][] board;
	private int noOfMines = 0;
	Random rdm = new Random();
	
	JFrame frame = new JFrame("The Bombermen Minesweeper Game");
	JButton reset = new JButton("Play Again");
	JButton[][] buttons = new JButton[20][20];
	int [][] counts = new int[20][20];
	Container grid = new Container();
	
	public Minefield(int v, int h) {
		board = new char[v][h];
		boardSizeH = h;
		boardSizeV = v;
		this.noOfMines = noOfMines;
		generateInitialBoard();
		
		frame.setSize(450,550);
		frame.setLayout(new BorderLayout());
		frame.add(reset, BorderLayout.NORTH);
		reset.addActionListener(this);
		grid.setLayout(new GridLayout(v,h));
		for(int a = 0; a < buttons.length; a++){
			for(int b = 0; b < buttons[a].length; b++){
				buttons[a][b] = new JButton();
				buttons[a][b].addActionListener(this); 
				grid.add(buttons[a][b]);
				
			}
		}
		frame.add(grid, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton button = (JButton) e.getSource();
		button.setText("!");
		button.setEnabled(false);
		
		
	}
	public void changeToFlag(int v, int h){
		board[v+1][h+1] = '!';
	}
	
	//Checks the move entered by the player and sets the visible board to that value.
	public void playerMove(int v, int h, HiddenMinefield hiddenBoard){
		
		if(hiddenBoard.board[v][h].isFlagged()){
			System.out.println("---------------------------------------------------");
			System.out.println("-------Cell is flagged and cannot be chosen.-------");
			System.out.println("---------------------------------------------------");
			return;
		}
		
		if (hiddenBoard.board[v][h].getState()==CellState.BLANK){
			board[v+1][h+1] = hiddenBoard.board[v][h].stateDisplay;
			hiddenBoard.board[v][h].setAsJustRevealed();
			hiddenBoard.checkForNearbyBlanks(v, h);
		}
		if (hiddenBoard.board[v][h].getState()==CellState.NUMBER){
			board[v+1][h+1] = hiddenBoard.board[v][h].stateDisplay;
			hiddenBoard.board[v][h].setAsRevealed();
		}

		
		
	}
	//Creates visible board and fills each index of the array with an equals sign, as well as the coordinates on the edges.
	public void generateInitialBoard() {
		//Generates horizontal coordinate reference
		for (int i = 1; i<board[0].length; i++){
			if ((i+64) > 90 && (i+64) < 97){
				board[0][i] = (char)(i+70);
			}else{
			board[0][i] = (char)(i+64);
			}
		}
		//Generates vertical coordinate reference
		for (int i = 1; i<board.length; i++){
			if ((i+64) > 90 && (i+64) < 97){
				board[i][0] = (char)(i+70);
			}else{
			board[i][0] = (char)(i+64);
			}
		}
		for (int v = 1; v < board.length; v++) {
			for (int h = 1; h < board[v].length; h++) {
				board[v][h] = '=';
			}
		}

	}
	//Displays visible board.
	public void displayBoard() {
		for (int v = 0; v < board.length; v++) {
			for (int h = 0; h < board[v].length; h++) {
				System.out.print(board[v][h]);
				System.out.print(' ');
			}
			System.out.println();
		}
	}
	
	public void revealedCells(HiddenMinefield hiddenBoard){
		for (int v = 0; v < hiddenBoard.board.length; v++) {
			for (int h = 0; h < hiddenBoard.board[v].length; h++) {
				if(hiddenBoard.board[v][h].getChoosableState() == Choosable.REVEALED){
					board[v+1][h+1]=hiddenBoard.board[v][h].stateDisplay;
				}
			}
		}	
	}

	public void revealBoard(HiddenMinefield hiddenBoard){
		for (int v = 0; v < hiddenBoard.board.length; v++) {
			for (int h = 0; h < hiddenBoard.board[v].length; h++) {
				board[v+1][h+1]=hiddenBoard.board[v][h].stateDisplay;
			}
		}	
	}
}
