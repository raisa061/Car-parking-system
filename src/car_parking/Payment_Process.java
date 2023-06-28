package car_parking;

import java.util.Scanner;

public class Payment_Process extends Time_Record{
    int pin;
    int h,actual,change,give=60;
    
    void amount()
    { 
      //int x;
      // x=Time_Record.A();
       //  x= 60;
    }
    void choice()
    {
        System.out.println("You have to pay"+" "+give+"Tk");
        System.out.println("How do you want to pay?");
        System.out.println("1. Cash"+" "+"2.Card");
        Scanner in = new Scanner(System.in);
        int choose = in.nextInt();
         
        if(choose==1)
        {
            
            System.out.println("How much do you want to pay");
            h=in.nextInt();
            System.out.println("You wanted to pay "+h+"taka");
            
            if(h>=give)
            {
             change = h-give; 
               
                System.out.println("Payment successful!");
                System.out.println("Returned amount :"+change+" ");
            }
        
            else if(h<give)
            {
                change = give-h;
                System.out.println("You have to give more"+change+"Tk");
                System.out.println("How much do you want to pay");
                actual=in.nextInt();
                System.out.println("You paid total "+(actual+h)+"Tk");
                if((actual+h)<give)
                {
                    System.out.println("Sorry. Insufficient balance. You cannot exit");  
                }
                
            }
           
        }
        
        else 
        {
            System.out.println("Please swipe your card");
            in.next();
            System.out.println("Enter pin no");
            pin=in.nextInt();
            
            System.out.println("How much do you want to pay?");
            h=in.nextInt();
            if(h>=give)
            {
             change = h-give; 
               
                System.out.println("Payment successful!");
                System.out.println("Returned amount :"+change+" ");
            }
            
            else if(h<give)
            {
              System.out.println("There is insufficient balance in your card. Please pay through cash."); 
                System.out.println("Do you want to pay in cash?");
                choose = in.nextInt();
            if(choose==1)
               {
                 System.out.println("How much do you want to pay");
                 h=in.nextInt();
                 System.out.println("You wanted to pay "+h+"taka");
            
              if(h>=give)
              {
                change = h-give; 
               
                System.out.println("Payment successful!");
                System.out.println("Returned amount :"+change+" ");
              }
        
             else if(h<give)
             {
                change = give-h;
                System.out.println("You have to give more"+change+"Tk");
                System.out.println("How much do you want to pay");
                actual=in.nextInt();
                System.out.println("You paid total "+(actual+h)+"Tk");
                if((actual+h)<give)
                {
                    System.out.println("Sorry. Insufficient balance. You cannot exit");  
                }
                 
             }
          } 
                
                else
                    System.out.println("Sorry. You cannot exit now.");
                    
              
            }
            
            
            
        }
    }
}
