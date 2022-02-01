package cs301.birthdaycake;

public class CakeModel
{
    //instance var
    private boolean isLit = true;
    private int numCandles = 2;
    private boolean isFrosted = true;
    private boolean hasCandles = true;

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

    public boolean isHasCandles() {
        return hasCandles;
    }

    public void setHasCandles(boolean hasCandles) {
        this.hasCandles = hasCandles;
    }
}
