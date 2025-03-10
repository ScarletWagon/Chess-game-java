public class King extends Piece {
    public King(byte color) {
        super(color);
    }

    @Override
    public String getLetter() {
        return "K";
    }

    @Override
    public byte getValue() {
        
        if(getColor() == 1){return 9;} else return -9;
    }
}
