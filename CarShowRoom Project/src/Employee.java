import java.util.Scanner;
public class Employee  implements utility{

    int emp_id ;
    String emp_name;
    String emp_address; 
    int emp_age;
    String emp_departrment;

    @Override
    public void get_details(){
        System.out.println("EMP ID: "+emp_id);
        System.out.println("EMP NAME: "+emp_name);
        System.out.println("EMP ADDRESS: "+emp_address);
        System.out.println("EMP AGE: "+emp_age);
        System.out.println("EMP DEPARTMENT: "+emp_departrment);
    }

    @Override
    public void set_details(){
        Scanner sc = new Scanner(System.in);
        System.out.println("EMPLOYEE ID:");
        emp_id = sc.nextInt();
        System.out.println("EMPLOYEE NAME:");
        emp_name = sc.nextLine();
        System.out.println("EMPLOYEE ADDRESS:");
        emp_address = sc.nextLine();
        System.out.println("EMPLOYEE AGE:");
        emp_age = sc.nextInt();
        System.out.println("EMPLOYEE DEPARTMENT:");
        emp_departrment = sc.nextLine();

    }
}
