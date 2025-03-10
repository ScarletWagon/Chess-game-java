public class Queen extends MajorPiece {
    public Queen(byte color) {
        super(color);
    }

    @Override
    public String getLetter() {
        return "Q";
    }

    @Override
    public byte getValue() {
        
        if(getColor() == 1){return 9;} else return -9;
    }
}