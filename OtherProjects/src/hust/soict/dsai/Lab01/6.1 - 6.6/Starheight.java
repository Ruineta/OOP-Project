

import java.util.Scanner;

public class Starheight {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
    
        int n = keyboard.nextInt();
        System.out.println("The triangle's height is: " + n);
        
        for(int i = 1; i <= n; i++){
            for(int x = 1; x <= n - i; x++){
                System.out.printf(" ");      
            }
            for(int j = 1; j <= 2*i-1; j++){
                System.out.printf("*");
            }
            System.out.println("");
        }

        keyboard.close();
    }
}
