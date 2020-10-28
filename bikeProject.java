public class bikeProject {

    private int tires, pedals, gearNumber;
    private double tireHeight, tireWidth, weight;

    private boolean tiresBroken, pedalsBroken, gearsBroken = false;
    private int tiresBrokenNumber, pedalsBrokenNumber, gearsBrokenNumber;

    private double receipt = 0.00;
    private double tiresCost = 15.00;
    private double pedalCost = 10.00;
    private double gearCost = 7.25;

    public bikeProject(int tires, int pedals, int gearNumber, double tireHeight, double tireWidth, double weight) {

        this.tires = tires;
        this.pedals = pedals;
        this.gearNumber = gearNumber;

        this.tireHeight = tireHeight;
        this.tireWidth = tireWidth;
        this.weight = weight;

    }

    public void isTiresBroken(boolean tiresBroken) {
        if(tiresBroken == true) {
            this.tiresBroken = true;
        }
    }

    public void tiresBrokenNumber(int tiresBrokenNumber) {
        if(tiresBroken == true) {
            this.tiresBrokenNumber = tiresBrokenNumber;
        }
    }

    public void fixTires() {
        tiresBroken = false;
        receipt += tiresBrokenNumber * tiresCost;
    }


    public double getReceipt() {
        return receipt;
    }

    public void printReceipt() {
        System.out.println("\n\nThe receipt of your bike repair is " + receipt + "$\n\n");
    }

    public static void main (String[] args) {
        bikeProject bike = new bikeProject(2, 2, 3, 23.5, 23.5, 31.33);
        bike.isTiresBroken(true);
        bike.tiresBrokenNumber(2);
        bike.fixTires();
        bike.printReceipt();
    }





}
