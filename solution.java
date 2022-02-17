/*
  Pratik
  Dizideki sayıların harmonik ortalamasını hesaplayan programı yazınız.
*/

import java.util.Scanner;


public class Main
{
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Enter a number: ");
        n = input.nextInt();
        
        int[] nums = new int[n];
        
        
        for (int i=0; i<n; i++) {
            nums[i] = i + 1;
        }
        
        System.out.println("");
        double harmonicSerie = 0, term;
        
        for (int i=0; i<n; i++) {
            term = 1.0 / nums[i];
            harmonicSerie += term;
        }
        
        double harmonicAvg = n / harmonicSerie;
        
        System.out.printf("Harmonic Average: %.3f", harmonicAvg);
    }
}
