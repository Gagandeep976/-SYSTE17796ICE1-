/*
 * Gagandeep Singh
 * Student ID: 991616664
 * SYST10199 - Web Programming
 */
package exercise1;

import java.util.Scanner;
public class Exercise1 {

    public static void main(String[] args) {
       int []temps;
       temps=new int[14];
       Scanner in = new Scanner(System.in);
       System.out.println("Enter the 14 temperatures collected in one week");
       for(int i=0;i<temps.length;i++){
             temps[i]=in.nextInt();
       }
       System.out.println(calcAvg(temps));
       System.out.println("Hello; i am Gagan");
       System.out.println("Maximum temperature is : "+calcMax(temps));
    }
    
    
    static int calcAvg(int []temps){
        int num=0;
        int total=0;
        for(int i=0;i<temps.length;i++){
            if(temps[i]<50 && temps[i]>-50){
                total=total+temps[i];
                num++;
            }
        }
        int average=total/num;
        System.out.println("Sum of all valid temperatures: "+total);
        System.out.println("Number of accepted temperatures: "+num);
        System.out.println("Average is:");
        return average;
    }
    
    static int calcMax(int []temps){
        int max=0;
        for(int i=0;i<13;i++){
            
            if(temps[i]>temps[i+1]){
                max=temps[i];
                temps[i]=temps[i+1];
                temps[i+1]=max;
            
            } 
        }
        int maxtemps=temps[13];
        return maxtemps;
    }
    
}
