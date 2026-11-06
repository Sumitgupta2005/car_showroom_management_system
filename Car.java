import java.util.Scanner;

public class Car extends Main implements utilities {

    String car_name;
    String car_color;
    String car_fuel_type;
    int car_price;
    String car_type;
    String car_transmission;

    Scanner sc = new Scanner(System.in);

    public void getDetails(){
        System.out.println(car_name);
        System.out.println(car_color);
        System.out.println(car_fuel_type);
        System.out.println(car_price);
        System.out.println(car_type);
        System.out.println(car_transmission);

    }


    public void setDetails(){
        System.out.println("Enter your car name : ");
        car_name = sc.nextLine();
        System.out.println("Enter your car color  : ");
        car_color = sc.nextLine();
        System.out.println("Car's fuel type : ");
        car_fuel_type = sc.nextLine();
        System.out.println("Car's price : ");
        car_price = sc.nextInt();
        sc.nextLine();
        System.out.println("Car type : ");
        car_type = sc.nextLine();
        System.out.println("Car transmission : ");
        car_transmission = sc.nextLine();

    }

    
}