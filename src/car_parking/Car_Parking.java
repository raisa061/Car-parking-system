package car_parking;

import java.util.Scanner;

public class Car_Parking {

    public static void main(String[] args) {
        System.out.println("Welcome to our parking lot");
        System.out.println("Do you want to enter your car?");
        System.out.println("Press any key to continue: ");
        Scanner con = new Scanner(System.in);
        con.next();
        //System.out.println("Enter parking: ");

        User ob1 = new User();
        ob1.input();
        ob1.show();
        System.out.println("");
        System.out.println("To know the nearest place of parking,enter any key");
        con.next();
        ob1.compare();

       Time_Record ob= new Time_Record();
        ob.calculate();
        
        Payment_Process obj=new Payment_Process();
        obj.choice();

    }

}
