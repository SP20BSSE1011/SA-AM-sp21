public class Honda extends Car {

    private String roofType;
    private Engine engine;

    public Honda(String company, String model, String color, String registrationNumber,int power, int numOfCylinders, int speed, int transmission, int torque) {

        super(company,model,color,registrationNumber,power,numOfCylinders,speed,transmission,torque);

        this.engine=new Engine(power,numOfCylinders, speed, transmission,torque);


    }

}
