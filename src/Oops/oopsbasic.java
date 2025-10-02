package Oops;

public class oopsbasic {
    public static class car{
        String color = "red";
        String Com = "volvo";
        String model = "i5";

        public void write(){
            System.out.println("drive volvo");
        }
    }

    public static void main(String[] args) {
        car brand = new car();
        System.out.println(brand.model);
        System.out.println(brand.Com);
        System.out.println(brand.color);
        brand.write();

    }
}
