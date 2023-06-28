package car_parking;

import java.util.Scanner;

public class Time_Record {

    public int x,y;
    int starthr,startmin,stophr,stopmin;
     void input()
     {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter entry hours");
     starthr=sc.nextInt();
     System.out.println("Enter entry minutes");
     startmin=sc.nextInt();
     
         System.out.println("Enter exit hours");
         stophr = sc.nextInt();
         System.out.println("Enter exit minutes");
         stopmin = sc.nextInt();
     }
     
      void calculate()
     {
         input();
         int n,n2;
         
         if(stopmin>startmin)
         {
           x=stopmin-startmin; //minutes
           y=stophr-starthr; //hours
             System.out.println("Time spent "+y+"hours"+x+"minutes");
         }
         else {
              n = stophr-1;
              n2 = stopmin+60;
             
             x=n2-startmin;
             y=n-starthr;
              System.out.println("Time spent "+y+"hours"+x+"minutes"); 
         }   
     }
      
      /*int A()
      {
          return x;
      }*/
     
}
