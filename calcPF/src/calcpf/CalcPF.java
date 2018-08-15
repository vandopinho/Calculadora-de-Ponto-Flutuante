
package calcpf;


import java.util.Scanner;
public class CalcPF {


    public static void main(String[] args) {
        Metodos m = new Metodos();
        String total;
        Scanner teclado = new Scanner(System.in);
        System.out.println("digite um numero: ");
        String numero = teclado.nextLine();
        System.out.println("valor absoluto: " + numero);
        String decimal = numero.substring(0, 2);
        String fracionado = numero.substring(3, numero.length());
        m.DecimalBin(decimal);
        m.FracionadoBin(fracionado);
        
    }
    
}
