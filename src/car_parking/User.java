package car_parking;

import java.util.Scanner;
 

public class User {

    int i, j;
    int rmin, cmin;
    char m = 64;

    int a[][] = new int[3][3];
    Scanner sc = new Scanner(System.in);
    

    void input() {

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                a[i][j] = sc.nextInt(); 
            }

        }
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    void show() {

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                m = ++m;
                if (a[i][j] == 0) {
                    System.out.print(m);
                    System.out.print("-" + "Free" + " ");
                } 
                else if (a[i][j] == 1) {
                    System.out.print(m);
                    System.out.print("-" + "Blocked" + " ");
                }

            }
            System.out.println();
        }
    }
    //seperating the free spaces of the lot

    void compare() {
        int counter = 0;
        int row[] = new int[9];
        int col[] = new int[9];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                if (a[i][j] == 0) {
                    row[counter] = i;
                    col[counter] = j;
                    counter++;

                }
            }
        }
      /*  for (int k = 0; k <= counter; k++) {
            rmin = row[0];
            if (rmin > row[i]) {
                rmin = row[i];
            }
            cmin = col[0];
            if (cmin > col[i]) {
                cmin = col[i];
            }

        } */
        
         for (int k = 0; k <= counter; k++){
             rmin= (row[i]*row[i]+col[i]*col[i]);
                     
                    cmin= (int) Math.sqrt(rmin);
         }

        //System.out.println("rmin="+rmin+"rcol="+cmin);
        System.out.println("the nearest place is  " + "a[" + rmin + "]" + "[" + cmin + "]");

    }
}
