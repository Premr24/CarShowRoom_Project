import java.util.Scanner;

public class ShowRoom implements utility{

    String showroom_name;
    String showroom_address;
    int total_employee;
    int total_cars_stock = 0;
    String manager_name;

    @Override
    public void get_details(){
        System.out.println("ShowRoom name:"+showroom_name);
        System.out.println("ShowRoom address:"+showroom_address);
        System.out.println("Manager name:"+manager_name);
        System.out.println("Total Employee:"+total_employee);
        System.out.println("Total car in Stock:"+total_cars_stock);
    }

    @Override
    public void set_details(){
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER SHOWROOM DETAILS\n");
        System.out.println("SHOWROOM NAME:");
        showroom_name = sc.nextLine();
        System.out.println("SHOWROOM ADDRESS:");
        showroom_address = sc.nextLine();
        System.out.println("MANAGER NAME:");
        manager_name = sc.nextLine();
        System.out.println("TOTAL EMPLOYEE:");
        total_employee = sc.nextInt();
        System.out.println("TOTAL CAR IN STOCK:");
        total_cars_stock = sc.nextInt();
    }
}
