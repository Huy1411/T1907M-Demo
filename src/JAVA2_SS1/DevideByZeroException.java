package JAVA2_SS1;

public class DevideByZeroException extends Exception {
    float x;
    float y;

    public DevideByZeroException(float x, float y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String getMessage() {
        return "Exception / zero ("+x+"/" +y+")";
    }
}
