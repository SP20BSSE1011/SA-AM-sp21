public class Engine {

    private int power;
    private int numOfCylinders;
    private int speed;
    private int transmission;
    private int torque;

    public Engine() {
    }

    public Engine(int power, int numOfCylinders, int speed, int transmission, int torque) {
        this.power = power;
        this.numOfCylinders = numOfCylinders;
        this.speed = speed;
        this.transmission = transmission;
        this.torque = torque;
    }
}
