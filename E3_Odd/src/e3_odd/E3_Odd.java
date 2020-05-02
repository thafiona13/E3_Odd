/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e3_odd;

    import java.util.ArrayList;
 
public class E3_Odd {

    
    public static void main(String[] args) {
        //creating arrays to store numbers of odd and even
        ArrayList<Integer> Even = new ArrayList<Integer>();
        ArrayList<Integer> Odd = new ArrayList<Integer>();
        //array to generate the 25 random numbers
        int num[]=new int[25];
        //setting max and min values
        int min = 0;
        int max = 99;
        
        //for an array of 25
        for (int i=0; i<25; i++){
            double r = Math.random();
	    num[i] = (int) ((max - min + 1) * r + min); // generates random number
            if (num[i]%2==0){ //determines if number is even
               Even.add(num[i]); // if number is even, adds it to even array
            }
            else{
                Odd.add(num[i]); // adds to odd array
            }
          
        }
        System.out.print("Even : "); 
        //prints out stored number for even numbers
        for (int i : Even){
            System.out.print(i+", " );  
        }
        
        System.out.print("\nOdd : ");
        //prints out stored number for odd numbers
        for (int i : Odd){
            System.out.print(i+", " );  
        }
        
    }
    
}
