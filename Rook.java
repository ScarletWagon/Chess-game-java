public class Rook extends MajorPiece {
    public Rook(byte color) {
        super(color);
    }

    @Override
    public String getLetter() {
        return "R";
    }

    @Override
    public byte getValue() {
        
        if(getColor() == 1){return 5;} else return -5;
    }
}