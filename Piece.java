public abstract class Piece {
    private byte color;
    public int ra; public int raa;
    public Piece(byte color) {
        this.color = (color == 1 || color == 2) ? color : 1;
    }

    public byte getColor() {
        return color;
    }

    public String getStringLocation() {
        char col = (char) ('a' + this.getColor() - 1);
        int row = 8 - (this.getColor() - 1);
        return col + String.valueOf(row);
    }
    
   public void go(int x){
   ra = x;}
    public void goo(int y){
   raa = y;}

    public double computeAdjustedValue()
     {
    double x = ra; double y= raa;
         double X = Math.abs(x - 3.5);
    double Y = Math.abs(y - 3.5);
    return getValue() * (5 - X) * (5 - Y);
}
    public String toString() {
        return getLetter() + getStringLocation();
    }

    public abstract String getLetter();
    public abstract byte getValue();
}