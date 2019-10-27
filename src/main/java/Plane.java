public class Plane {
    private boolean landed = false;

    public void land() {
        setLandedStatus(true);
    }

    // Getter
    public boolean getLandedStatus() {
        return landed;
    }

    // Setter
    public void setLandedStatus(boolean newStatus) {
        this.landed = newStatus;
    }
}

