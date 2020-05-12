/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switch_floorspaceoftheroom;

/**
 *
 * @author Bandi
 */
import java.util.Scanner;

public class Switch_FloorSpaceOfTheRoom {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String shape = sc.nextLine();
       switch (shape) {
           case "triangle":
               double a = sc.nextDouble();
               double b = sc.nextDouble();
               double c = sc.nextDouble();
           
               double s = (a + b + c) / 2;
               System.out.print(Math.sqrt(s * (s - a) * (s - b) * (s - c)));
           break;
           
           case "rectangle":
               double d = sc.nextDouble();
               double e = sc.nextDouble();
               System.out.print(d * e);
               break;
           
           case "cir":
               double r = sc.nextDouble();
               System.out.print(r * r * 3.14);
               break;
                          
               
        }
    }     
}
