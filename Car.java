public class Car {

    private String company;
    private String model;
    private String color;
    private String registrationNumber;
    private Engine engine;

    public Car(){

    }

    public Car(String company, String model, String color, String registrationNumber,int power, int numOfCylinders, int speed, int transmission, int torque) {
        Engine engine=new Engine(power,numOfCylinders, speed, transmission,torque);
        this.company = company;
        this.model = model;
        this.color = color;
        this.registrationNumber = registrationNumber;
        this.engine = engine;

    }


}
