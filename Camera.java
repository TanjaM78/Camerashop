package OPP2;
public class Camera {
    private String brand;
    private String model;
    private String format;
    private String megaPixels;
    private String displaySize;
    private boolean colored;
    private int serialNumber;
    private Lens lens;

    public Camera(String brand, String model, String format, String megaPixels, String displaySize, boolean colored, int serialNumber) {
        this.brand = brand;
        this.model = model;
        this.format = format;
        this.megaPixels = megaPixels;
        this.displaySize = displaySize;
        this.colored = colored;
        this.serialNumber = serialNumber;

    }

   // public Camera(String fujifilm, String model, String apsc, String megaPixels, String s, boolean colored, int serialNumber) {

  //  }

    // Getters and setters
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getFormat() {
        return format;
    }


    public String getMegaPixels() {
        return megaPixels;
    }


    public String getDisplaySize() {
        return displaySize;
    }

    public boolean isColored() {
        return colored;
    }


    public int getSerialNumber() {
        return serialNumber;
    }
    public Lens getLens() {
        return lens;
    }
    public void setLens(Lens lens) {
        if (lens.getFocalMin() > lens.getFocalMax()) {
            throw new IllegalArgumentException("Invalid lens focal length range.");
        }
        this.lens = lens;
    }

    }














