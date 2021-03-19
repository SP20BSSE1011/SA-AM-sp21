public class Toyota extends Car {


    private int maximumSpeed;

    public Toyota(String company, String model, String color, String registrationNumber,int power, int numOfCylinders, int speed, int transmission, int torque){

        super(company,model,color,registrationNumber,power,numOfCylinders,speed,transmission,torque);

        Engine engine=new Engine(power,numOfCylinders, speed, transmission,torque);

    }


}
