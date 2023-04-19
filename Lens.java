package OPP2;

public class Lens {
    private int focalMin;
    private int focalMax;
    private int serialnumber;
    private static int count;


    public Lens(int focalMin, int focalMax, int serialnumber) {
        count++;
        serialnumber = count;
        this.focalMax = focalMax;
        setFocalMin(focalMin);
        this.serialnumber = serialnumber;
    }

    public int getFocalMin() {
        return focalMin;
    }

    public void setFocalMin(int focalMin) throws IllegalArgumentException {
        if (focalMin >= focalMax) {
            throw new IllegalArgumentException("focalMin must be less than focalMax");
        }
        this.focalMin = focalMin;
    }


    public int getFocalMax() {
        return focalMax;
    }
}


