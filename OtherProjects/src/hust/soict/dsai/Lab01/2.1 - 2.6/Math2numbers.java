import javax.swing.JOptionPane;
public class Math2numbers {
    public static void main(String[] args){
        String strNum1, strNum2;

        strNum1 = JOptionPane.showInputDialog(null, "Chu Dinh Ha - 5712 - Please input the first number: ", "Chu Dinh Ha - 5712 - Input the first number", JOptionPane.INFORMATION_MESSAGE);

        strNum2 = JOptionPane.showInputDialog(null, "Chu Dinh Ha - 5712 - Please input the second number: ", "Chu Dinh Ha - 5712 - Input the second number", JOptionPane.INFORMATION_MESSAGE);

        double num1 = Double.parseDouble(strNum1);
        double num2 = Double.parseDouble(strNum2);

        System.out.println("Sum: ");
        System.out.println(num1 + num2);
        System.out.println("Difference: ");
        System.out.println(num1 - num2);
        System.out.println("Product: ");
        System.out.println(num1 * num2);
        System.out.println("Division:");
        System.out.println(num1 / num2);
        System.out.println(num2 / num1);

        System.exit(0);
    }
}

