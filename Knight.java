public class Knight extends MinorPiece {
    public Knight(byte color) {
        super(color);
    }

    @Override
    public String getLetter() {
        return "N";
    }

    @Override
    public byte getValue() {
        
        if(getColor() == 1){return 3;} else return -3;
    }
}