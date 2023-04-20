package coffeemachine;

import java.util.ArrayList;

public class Machine {

    private WaterCapacity water;
    private BeansCapacity beans;
    private Cleaning cleaning;

    private int i = 0;
    ArrayList<Coffee> coffees = new ArrayList();

    public Machine(int waterCapacity, int beansCapacity, int cleaningCapacity) throws WaterException, BeansException, CleanException {
   
        water = new WaterCapacity(waterCapacity);
        beans = new BeansCapacity(beansCapacity);
        cleaning = new Cleaning(cleaningCapacity);
    }

    public WaterCapacity Water() {
        return water;
    }

    public BeansCapacity Beans() {
        return beans;
    }

    public Cleaning Clean() {
        return cleaning;
    }

    public int getWater() {
        return water.getSize();
    }

    public void setWater(int water) {
        this.water.setSize(water);
    }

    public int getBeans() {
        return beans.getSize();
    }

    public void setBeans(int beans) {
        this.beans.setSize(beans);
    }

    public int getCleaning() {
        return this.cleaning.getSize();
    }

    public void setCleaning(int cleaning) {
        this.cleaning.setSize(cleaning);
    }

    public void displayInfo() {
        System.out.println("Water level: " + water);
        System.out.println("Beans level: " + beans);
    }

    public void clean() {
        this.cleaning.setSize(100);
    }

    public void makeCoffee(String coffeeType, String coffeeName, int coffeeAmount, int waterAmount, int grind, int notclean) throws BeansException, WaterException {
        coffees.add(new Coffee(coffeeType, coffeeAmount, water.getSize()));
        Coffee coffee = coffees.get(i++);
     
        this.beans.setSize(beans.getSize() - coffeeAmount);
        this.water.setSize(water.getSize() - waterAmount);
        this.cleaning.setSize(cleaning.getSize() - notclean);
        System.out.println("Enjoy your " + coffeeName + " coffee with " + coffee.getCaffeine() * 100 + "mg of caffeine!");
    }

}