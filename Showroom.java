import java.util.Scanner;

public class Showroom extends Main implements utilities {
    String showroom_name;
    String showroom_address;
    String Showroom_manager_room;
    int total_employee;


    Scanner sc = new Scanner(System.in);

    public void getDetails(){
        System.out.println(showroom_name);
        System.out.println(showroom_address);
        System.out.println(Showroom_manager_room);
        System.out.println(total_employee);

    }


    public void setDetails(){
        System.out.println("Enter your showroom name : ");
        showroom_name = sc.nextLine();
        System.out.println("Enter your showroom address : ");
        showroom_address = sc.nextLine();
        System.out.println("Enter your manager name : ");
        Showroom_manager_room = sc.nextLine();
        System.out.println("Total number of employees : ");
        total_employee = sc.nextInt();

    }

    
}