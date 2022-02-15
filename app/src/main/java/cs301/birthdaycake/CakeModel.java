package cs301.birthdaycake;

public class CakeModel
{
    //instance var
    private boolean isLit = true;
    private int numCandles = 2;
    private boolean isFrosted = true;
    private boolean hasCandles = true;
    public int x, y;
    public boolean hasTouched = false;
    public int CoordX = 0;
    public int CoordY = 0;

    //setters and getters below
    public boolean isLit() {
        return isLit;
    }

    public void setLit(boolean lit) {
        isLit = lit;
    }

    public int getNumCandles() {
        return numCandles;
    }

    public void setNumCandles(int numCandles) {
        this.numCandles = numCandles;
    }

    public boolean isFrosted() {
        return isFrosted;
    }

    public void setFrosted(boolean frosted) {
        isFrosted = frosted;
    }

    public boolean hasCandles() {
        return hasCandles;
    }

    public void setCandles(boolean hasCandles) {
        this.hasCandles = hasCandles;
    }

    public void setHasTouched(boolean hasTouched) { this.hasTouched = hasTouched;}

    public boolean hasTouched() { return hasTouched; }

    public void setCoordX(int coordX) { this.CoordX = coordX; }

    public int getCoordX() { return CoordX; }

    public void setCoordY(int coordY) { this.CoordY = coordY; }

    public int getCoordY() { return CoordY; }

    public void setX(int x) { this.x = x; }

    public int getX() { return x; }

    public void setY(int y) { this.y = y; }

    public int getY() { return y; }
}
