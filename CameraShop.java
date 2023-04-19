package OPP2;

import java.util.ArrayList;
import java.util.List;
public class CameraShop {
    public static void main(String[] args) throws Exception {
        List<Camera> cameras = new ArrayList<>();

        Camera c1 = new Camera("Nikon", "D5500", "DX", "24.2 MP", "22", true, 1);
        Camera c2 = new Camera("Canon", "EOS 200D II", "APSC", "24.1 MP", "24", true, 2);
        Camera c3 = new Camera("Sony", "A7 III", "Full Frame", "24.2 MP", "24 ", true, 3);
        Camera c4 = new Camera("Fujifilm", "X-T4", "APSC", "26.1 MP", "24", true, 4);
        Lens l1 = new Lens(20, 80, 1);
        Lens l2 = new Lens(40, 90, 2);
        Lens l3 = new Lens(50, 120, 3);
        Lens l4 = new Lens(40, 50, 4);

        cameras.add(c1);
        cameras.add(c2);
        cameras.add(c3);
        cameras.add(c4);

        cameras.get(0).setLens(l1);
        cameras.get(1).setLens(l2);
        cameras.get(2).setLens(l3);
        cameras.get(3).setLens(l4);

        printList(cameras);
    }

    public static void printList(List<Camera> cameras) throws Exception {
        for (Camera camera : cameras) {
            System.out.println("Brand: " + camera.getBrand());
            System.out.println("Model: " + camera.getModel());
            System.out.println("Format: " + camera.getFormat());
            System.out.println("MegaPixels: " + camera.getMegaPixels());
            System.out.println("DisplaySize: " + camera.getDisplaySize());
            System.out.println("Colored: " + camera.isColored());
            System.out.println("Serialnumber: " + camera.getSerialNumber());
            if (camera.getLens() != null) {
                try {
                    System.out.println("Objektive: " + camera.getLens().getFocalMin() + " - " + camera.getLens().getFocalMax());
                } catch (IllegalArgumentException e) {
                    System.out.println("Objektive: Invalid focal length range");
                }
            } else {
                System.out.println("Objektive: Not available");
            }
            System.out.println();
        }
    }

}








