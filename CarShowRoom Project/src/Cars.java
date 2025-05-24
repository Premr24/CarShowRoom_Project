import java.util.Scanner;
public class Cars implements utility{

    String car_name;
    String car_type;

    @Override
    public void get_details(){
        System.out.println("CAR NAME: "+car_name);
        System.out.println("CAR TYPE: "+car_type);
    }

    @Override
    public void set_details(){
        Scanner sc = new Scanner(System.in);
        System.out.println("CAR NAME: ");
        car_name = sc.nextLine();
        System.out.println("CAR TYPE: ");
        car_type = sc.nextLine();
    }
}
