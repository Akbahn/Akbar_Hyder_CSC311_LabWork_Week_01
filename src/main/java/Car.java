public class Car extends Vehicle{
    private String brand;

    public Car(int numberOfWheels, String color, float engineSize, String fuelType, String brand) {
        super(numberOfWheels, color, engineSize, fuelType);
        this.brand = brand;
    }

    public void honk() {
        System.out.println("Honk Honk!");
    }

    public void setBrand(String brand){
        this.brand = brand;
    }


    public String displayInfo(){
        return super.toString() + ", brand=" + brand;
    }


}
