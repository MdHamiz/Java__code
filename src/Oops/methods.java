package Oops;
   class car{
     String color;
     String brand;
     int speed;

     //constructor
     public car(String color,String brand,int speed){
         this.color = color;
         this.brand = brand;
         this.speed = speed;
     }
     //MEthod
     public void start(){
         System.out.println( brand + " is starting");
     }
       public void col(){
           System.out.println(  "this is "+ color + "car" );
       }
       public void run(){
           System.out.println(" the car running at "  + speed);
       }
 }
public class methods {
    public static void main(String[] args) {


        car mycar = new car("RED","VOLOVO", 100);


      mycar.start();
      mycar.col();

      mycar.run();
    }
}
