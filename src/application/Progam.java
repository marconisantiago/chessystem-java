package application;

import chess.ChessMatch;

public class Progam {

	
	public static void main(String[] args) {
				
	ChessMatch chessMatch = new ChessMatch();
	UI.printBoard(chessMatch.getPieces());

	}

}
