import java.util.ArrayList;

public class Airport {
    public ArrayList<Object> planes = new ArrayList<Object>(5);

    public void landPlane(Object plane) {
        planes.add(plane);
    }

    public ArrayList<Object> getPlanes() {
        return planes;
    }
}
