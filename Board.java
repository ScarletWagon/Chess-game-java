public class Board {
   private static Piece[][] pieces; 
   private int x; private int y;
   public Board() {
      pieces = new Piece[8][8];
   }

   public Board(Piece[][] pieces) {
      this.pieces = pieces;
   }

   public void setPiece(Piece piece, int x, int y) {
      pieces[x-1][y-1] = piece;
   }

   public static Piece[][] getPieces() { 
      return pieces;
   }
    
   
   public double relativeEvaluation() {
      double sum = 0;
      for (Piece[] row : pieces) {
         for (Piece piece : row) {
            if (piece != null) {
               sum += piece.getValue();
            }
         }
      }
      return sum;
   }

   public double adjustedEvaluation() {
      double sum = 0;
      for (int i = 0; i < pieces.length; i++) {
         for (int j = 0; j < pieces[i].length; j++) {
            Piece piece = pieces[i][j];
            if (piece != null) {
            piece.go(i);
               piece.goo(j);
               sum += piece.computeAdjustedValue();
                           }
         }
      }
      return sum;
   }

   

   @Override
    public String toString() {
      int kings = 0;
      int pawns = 0;
      int majorPieces = 0;
      int minorPieces = 0;
   
      for (Piece[] row : pieces) {
         for (Piece piece : row) {
            if (piece instanceof King) {
               kings++;
            } else if (piece instanceof Pawn) {
               pawns++;
            } else if (piece instanceof MajorPiece) {
               majorPieces++;
            } else if (piece instanceof MinorPiece) {
               minorPieces++;
            }
         }
      }
   
      return "Board has:\n" +
           "- King: " + kings + "\n" +
           "- Pawns: " + pawns + "\n" +
           "- MajorPieces: " + majorPieces + "\n" +
           "- MinorPieces: " + minorPieces + "\n";
   }
}