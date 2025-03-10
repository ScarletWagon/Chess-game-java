public class Bishop extends MinorPiece {
    public Bishop(byte color) {
        super(color);
    }

    @Override
    public String getLetter() {
        return "B";
    }

    @Override
    public byte getValue() {
                if(getColor() == 1){return 3;} else return -3;
    }
}
