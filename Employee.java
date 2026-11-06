import java.util.Scanner;


public class Employee extends Main implements utilities {
    int emp_id;
    String employee_name;
    String dept_name;
    String showroom_name;

    Scanner sc = new Scanner(System.in);

    @Override
    public void getDetails(){
        System.out.println(emp_id);
        System.out.println(employee_name);
        System.out.println(dept_name);
        System.out.println(showroom_name);

    }

    @Override  
    public void setDetails(){
        System.out.println("Enter your emp id : ");
        emp_id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter your name : ");
        employee_name = sc.nextLine();
        System.out.println("Enter your department : ");
        dept_name = sc.nextLine();
        System.out.println("Enter your showroom name : ");
        showroom_name = sc.nextLine();

    }

    
}