public class Demo {

    public static void main(String[] args){
        System.out.println("Vehicle Class Test");
        Vehicle v1 = new Vehicle(4, "Red", 10, "diesel");
        System.out.print("Vehicle Get Color: ");
        System.out.print(v1.getColor()+ "\n");
        v1.setColor("Blue");
        System.out.print("Vehicle Change Color: ");
        System.out.print(v1.getColor()+ "\n");
        System.out.println(v1.toString());

        System.out.println("\nCar Class Test");
        Car c1 = new Car(4,"Purple", 12, "Octane", "Honda");
        System.out.println(c1.displayInfo());
        c1.setBrand("Toyota");
        System.out.println(c1.displayInfo());
        c1.honk();
    }


}
