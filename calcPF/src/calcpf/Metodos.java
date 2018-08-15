
package calcpf;


public class Metodos {
    public void DecimalBin(String s){
        int convertido = Integer.parseInt(s);
        int resto =0;
        String total = "";
        while(convertido > 0){
            resto = convertido % 2;
            total = resto + total;
            convertido = convertido / 2;
        }
        System.out.print(total + ",");
        
}
    public void FracionadoBin(String s){
        int convertido = Integer.parseInt(s);
        int resto =0;
        int i =0;
        String total = "";
        while(i<=5){
            if (convertido*2 > 100){
                total += 1;
            }
            else {
                total += 0;
            }
            convertido = convertido*2;
            i++;
    }
        System.out.println(total);
        BinDecimal(total);
    }
    
    public void BinDecimal(String s){
        int resto =0;
        double total =0;
        String totalString ="";
        if (s.charAt(0) == '1'){
            total = total + 0.5;
        }
        if (s.charAt(1) == '1'){
            total = total + 0.250;
        }
        if (s.charAt(2) == '1'){
            total = total + 0.125;
        }
        if (s.charAt(3) == '1'){
            total = total + 0.0625;
        }
        if (s.charAt(4) == '1'){
            total = total + 0.03125;
        }
        if (s.charAt(5) == '1'){
            total = total + 0.015625;
        }
        System.out.println("valor relativo:" + total);
    }
}
