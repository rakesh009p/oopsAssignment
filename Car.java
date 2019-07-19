

//program is to implement class car using polymorphism concepts
class Car {
//declaring variables
    String name;
    boolean engine;
    int cylinders;
    int wheels;
    public Car(String name, int cylinders){
        this.name=name;
        this.cylinders=cylinders;
        this.engine=true;
        this.wheels=4;
    }
//creating getters for the variable
    public String getName() {
        return name;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }
//deeclarin methods 

    public void startEngine(){
        System.out.println("car engine started");
    }
    public void accelerate(){
        System.out.println("car accelerated");
    }
    public void brake(){
        System.out.println("brakes applied");
    }}
//class audi extending class car
    class Audi extends Car{

    public Audi(String name, int cylinders) {
            super(name, cylinders);
        }
//implementing the methods which are used in car class
        public void startEngine(){
            System.out.println("Audi engine started");
    }
    public void accelerate(){
        System.out.println("audi car accelerated");
    }
    public void brake(){
        System.out.println("audi brakes applied");
    }



}
//class Benz extending class car
class Benz extends  Car{

    public Benz(String name, int cylinders) {
        super(name, cylinders);
    }
    public void startEngine(){
        System.out.println("Benz engine started");
    }
    public void accelerate(){
        System.out.println("Benz car accelerated");
    }
    public void brake(){
        System.out.println("Benz brakes applied");
    }
}
//class Hundyai extending class car
class Hyundai extends Car{

    public Hyundai(String name, int cylinders) {
        super(name, cylinders);
    }
    public void startEngine(){
        System.out.println("Hyundai engine started");
    }
    public void accelerate(){
        System.out.println("Hyundai car accelerated");
    }
    public void brake(){
        System.out.println("Hyundai brakes applied");
    }

}
//main method implimentation
class Palindrome{
    public static void main(String[] args){
//objects created for above classes and methods are called

        Hyundai hyundai=new Hyundai("Varan",3);
        hyundai.startEngine();
        hyundai.brake();
        System.out.println(hyundai.getName());
        System.out.println(hyundai.getCylinders());
        Benz benz=new Benz("mercedes",5);
        benz.startEngine();
        benz.accelerate();
        Audi audi=new Audi("R8",5);
        audi.startEngine();
        audi.brake();

    }

}

