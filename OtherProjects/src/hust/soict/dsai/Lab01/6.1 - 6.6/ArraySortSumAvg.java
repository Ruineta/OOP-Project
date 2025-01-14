import java.util.Scanner;
public class ArraySortSumAvg {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        int[] arr = new int[30];
        System.out.println("Enter array's length: ");
        int n = keyboard.nextInt();

        int sum = 0;
        System.out.println("Enter array");
        for(int i = 0; i < n; i++){
            arr[i] = keyboard.nextInt();
            sum += arr[i];
        }

        double avg = sum/arr.length;
        for(int i = 0; i < n - 1; i++){
            for(int j = 0; j < n - i - 1; j++){
                if(arr[j] > arr[j + 1]){
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }

        System.out.println("Array after sorted: ");
        for(int i = 0; i < n; i++)
            System.out.printf(arr[i] + " ");
        System.out.println("");
        System.out.println("Sum of array: " + sum);
        System.out.println("Average value: " + avg);

        keyboard.close();
    }
}
