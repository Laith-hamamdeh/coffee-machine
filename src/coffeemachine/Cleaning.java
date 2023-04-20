package coffeemachine;

public class Cleaning {

    int size;

    Cleaning() {
        this.size = 100;
    }

    Cleaning(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean findClean(int need) throws CleanException {
        if (size <= need) {
            throw new CleanException("you need clean");
        }
        return true;
    }
}
