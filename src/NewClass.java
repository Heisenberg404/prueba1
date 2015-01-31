
import javax.swing.*;/*libreria visual java*/
//esta linea la modifico alexandra ardila
public class NewClass {

    public NewClass() {
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a,b,s;
        
        a=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a: "));
        b=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite b: "));
        
        s=a+b;
        JOptionPane.showMessageDialog(null,"la suma es: "+s);/*showMessageDialog imprime datos en pantalla con un mensaje*/
        /*println es un salto de un mensaje en la consola print es consecutivo*/
        //System.out.println("la suma es "+s);
    }
}