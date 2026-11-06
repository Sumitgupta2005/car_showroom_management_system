import java.util.Scanner;

interface utilities{
    public void setDetails();
    public void getDetails();
} 

public class Main {
    static void mainMenu(){
    System.out.println("############# Car Showroom Management System #################");
    System.out.println();
    System.out.println("\t\t\t 1) Add Showrooms\t\t 2) Add Employees\t\t 3) Add Cars");
    System.out.println();
    System.out.println("\t\t\t 4) Get Showrooms\t\t 5) Get Employees\t\t 6) Get Cars");
    System.out.println();
    System.out.println("\t\t\t\t\t\t 0) Exit");

}

    static void exits() {
            System.exit(0);
        }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        

        int emp_counter = 0;
        int car_counter = 0;
        int showroom_counter = 0;
        Employee emp[] = new Employee[5];
        Showroom shroom[] = new Showroom[5];
        Car car[] = new Car[5];

        while(true){
            mainMenu();
            System.out.println("Enter choice : ");
            int choice = sc.nextInt();
            switch(choice){

                case 0 :
                exits();
                break;

                case 1 :
                    if (showroom_counter < 5){
                        shroom[showroom_counter] = new Showroom();
                        shroom[showroom_counter].setDetails();
                        showroom_counter++;
                        mainMenu();
                    } else {
                        System.out.println("Showroom limit reached");
                    }
                    break;

                case 2 :
                    if (emp_counter < 5){
                        emp[emp_counter] = new Employee();
                        emp[emp_counter].setDetails();
                        emp_counter++;
                        mainMenu();
                    } else {
                        System.out.println("Employee limit reached");
                    }
                    break;

                case 3 :
                    if (car_counter < 5) {
                        car[car_counter] = new Car();
                        car[car_counter].setDetails();
                        car_counter++;
                        mainMenu();
                    } else {
                        System.out.println("Car limit reached");
                    }
                    break;

                case 4 :
                    if (showroom_counter == 0){
                        System.out.println("No showroom availabe");
                    } else {
                        for(int i = 0; i<showroom_counter; i++){
                            shroom[i].getDetails();
                        }
                    }
                    break;
                
                case 5 :
                    if (emp_counter == 0){
                        System.out.println("No employee availabe");
                    } else {
                        for(int i = 0; i<emp_counter; i++){
                            emp[i].getDetails();
                        }
                        
                    }
                    break;

                case 6 :
                    if (car_counter == 0){
                        System.out.println("No car availabe");
                    } else {
                        for(int i = 0; i<car_counter; i++){
                            car[i].getDetails();
                        }
                        
                    }
                    break;

        
        }
        }
        

        

        
    }
}