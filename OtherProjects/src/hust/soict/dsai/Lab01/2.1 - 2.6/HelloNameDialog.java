
import javax.swing.JOptionPane;
public class HelloNameDialog {
    public static void main(String[] args){
        String result;
        result = JOptionPane.showInputDialog("Chu Dinh Ha - 5712 - Please enter your name");
        JOptionPane.showMessageDialog(null, "Toi la Chu Dinh Ha 5712. Hi" + result + "!");
        System.exit(0);
    }

    
}
