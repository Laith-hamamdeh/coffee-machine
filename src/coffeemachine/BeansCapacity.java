package coffeemachine;

public class BeansCapacity {

    private int size;

    public BeansCapacity(int initialSize) {
        this.size = initialSize;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean findBeans(int need) throws BeansException {
        if (size < need) {
            throw new BeansException("You don't have enough beans.");
        }
        size -= need;
        return true;
    }
}