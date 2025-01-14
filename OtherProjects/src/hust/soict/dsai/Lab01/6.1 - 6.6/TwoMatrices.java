import java.util.Scanner;
public class TwoMatrices {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the size of matrix (n x m): ");
    
        int n = keyboard.nextInt();
        int m = keyboard.nextInt();

        int[][] a;
        a = new int[20][20];

        System.out.println("Enter matrix A: ");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                a[i][j]= keyboard.nextInt();
                 
            }
            System.out.println("");
        }

        int[][] b;
        b = new int[20][20];
        System.out.println("Enter matrix B: ");
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                b[i][j] = keyboard.nextInt();
            }
            System.out.println("");
        }
        
        int[][] c;
        c = new int[20][20];
        System.out.println("A + B = ");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                c[i][j] = a[i][j] + b[i][j];
                System.out.printf(c[i][j] + " ");
            }
            System.out.printf("\n");
        }

        keyboard.close();
    }
}
