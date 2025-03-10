public class Pawn extends Piece {
    public Pawn(byte color) {
        super(color);
    }

    @Override
    public String getLetter() {
        return "";
    }

    @Override
    public byte getValue() {
        if(getColor() == 1){return 1;} else return -1;
    }
}