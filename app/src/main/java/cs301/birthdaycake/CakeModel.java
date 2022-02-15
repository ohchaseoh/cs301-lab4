package cs301.birthdaycake;

import android.graphics.Canvas;

public class CakeModel
{
    //instance var
    private boolean isLit = true;
    private int numCandles = 2;
    private boolean isFrosted = true;
    private boolean hasCandles = true;
    public boolean hasTouched = false;
    public int x, y;

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


    public void setHasTouched(boolean hasTouched) {this.hasTouched = hasTouched; }

    public boolean getHasTouched() { return hasTouched; }

    public void setX(int x) { this.x = x; }

    public float getX() { return x; }

    public void setY(int y) { this.y = y; }

    public float getY() { return y; }
}
