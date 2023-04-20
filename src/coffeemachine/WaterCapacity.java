package coffeemachine;

public class WaterCapacity {

    int size;

    WaterCapacity(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean findWater(int need) throws WaterException {
        if (size <= need) {
            throw new WaterException(" haven't Water");
        }
        return true;
    }
}
