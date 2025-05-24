import java.util.Scanner;

interface utility{
    void get_details();
    void set_details();
}
public class Main {
    
    static void menu(){
            System.out.println("==============================Welcome to SMS===========================\n");
            System.out.println("==============================Enter your choice===========================\n");
            System.out.println(String.format("%-20s %-20s %-20s %-20s %-20s %-20s", "[1]. ADD SHOWROOM", "[2]. ADD EMPLOYEE", "[3]. ADD CARS", "[4]. GET SHOWROOM", "[5]. GET EMPLOYEE", "[6]. GET CARS\n"));
            System.out.println("ENTER [0] TO EXIT!\n");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ShowRoom [] showroom = new ShowRoom[5];
        Employee [] employees = new Employee[5];
        Cars [] cars = new Cars[5];
        int car_counter = 0;
        int showroom_counter = 0;
        int employees_counter = 0;
        int choice = 100;
        while(choice != 0){

            menu();
            choice = sc.nextInt();

            while(choice != 9 && choice != 0){

                switch (choice) {
                    case 1:
                    showroom[showroom_counter] = new ShowRoom();
                    showroom[showroom_counter].set_details();
                    showroom_counter++;
                    System.out.println("\n[1]. ADD NEW SHOWROOM");
                    System.out.println("[9]. GO BACK TO MENU");
                    choice = sc.nextInt();
                        break;

                    case 2:
                    employees[employees_counter] = new Employee();
                    employees[employees_counter].set_details();
                    employees_counter++;
                    System.out.println("\n[1]. ADD NEW SHOWROOM");
                    System.out.println("[9]. GO BACK TO MENU");
                    choice = sc.nextInt();
                        break;

                    case 3:
                    cars[car_counter] = new Cars();
                    cars[car_counter].set_details();
                    car_counter++;
                    System.out.println("\n[1]. ADD NEW SHOWROOM");
                    System.out.println("[9]. GO BACK TO MENU");
                    choice = sc.nextInt();
                        break;

                    case 4:
                    for(int i = 0; i < showroom_counter; i++){
                        showroom[i].get_details();
                        System.out.println("\n\n");
                    } 
                    System.out.println("[9]. GO BACK TO MENU");
                    System.out.println("ENTER [0] TO EXIT!\n");
                    choice = sc.nextInt();
                        break; 

                    case 5:
                    for(int i = 0; i < employees_counter; i++){
                         employees[i].get_details();
                        System.out.println("\n\n");
                    } 
                    System.out.println("[9]. GO BACK TO MENU");
                    System.out.println("ENTER [0] TO EXIT!\n");
                    choice = sc.nextInt();
                        break;       
                            
                    case 6:
                    for(int i = 0; i < car_counter; i++){
                         cars[i].get_details();
                        System.out.println("\n\n");
                    } 
                    System.out.println("[9]. GO BACK TO MENU");
                    System.out.println("ENTER [0] TO EXIT!\n");
                    choice = sc.nextInt();
                        break; 
                        
                    default:
                        System.out.println("INVALID CHOICE!!!");
                }
            }
        }
    }
}
 