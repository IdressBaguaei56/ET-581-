public class Car{
    String color;
    int year;
    // constructor 
    Car(){
        System.out.println(" default constructor is called");
        this.color = "default"
        this.year = 1000;

    }
    Car(String color){
        System.out.println("one String colro contructor is called")
        this.color = color;
    }
    Car(String color, int year){
        System.out.println("two param constructor is called.")
        this.color = color;
        this.year = year;
    }
    Car(int y){
        this.y = y;
    }
    void drive(){
        System.out.println("The" + this.color + this.year + "car is driving")
    }
}