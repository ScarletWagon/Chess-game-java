
public class MainApp {
	
	public static void main(String[] args) {
		Board board = new Board();
		System.out.println(board);
		System.out.println();
		System.out.println(board.relativeEvaluation());
		System.out.println(board.adjustedEvaluation());
		System.out.println();
		
		board.setPiece(new Pawn((byte)2), 1, 8);
		System.out.println(board);
		System.out.println();
		System.out.println(board.relativeEvaluation());
		System.out.println(board.adjustedEvaluation());
		System.out.println();
		
		board.setPiece(new Pawn((byte)1), 8, 8);
		System.out.println(board);
		System.out.println();
		System.out.println(board.relativeEvaluation());
		System.out.println(board.adjustedEvaluation());
		System.out.println();
		
		board.setPiece(new Queen((byte)1), 7, 8);
		System.out.println(board);
		System.out.println();
		System.out.println(board.relativeEvaluation());
		System.out.println(board.adjustedEvaluation());
		System.out.println();
		
		
		System.out.println(Board.getPieces()[6][7]);
		System.out.println(Board.getPieces()[0][7]);
		System.out.println(Board.getPieces()[7][7]);
		
		/*
		 * Expected outputs:
Board has:
-King:0
-Pawns:0
-MajorPieces:0
-MinorPieces:0

0.0
0.0

Board has:
-King:0
-Pawns:1
-MajorPieces:0
-MinorPieces:0

-1.0
-2.25

Board has:
-King:0
-Pawns:2
-MajorPieces:0
-MinorPieces:0

0.0
0.0

Board has:
-King:0
-Pawns:2
-MajorPieces:1
-MinorPieces:0

9.0
33.75

Qg8
a8
h8
		 */

	}

}
