
package mainbanco;
import java.util.Scanner;

public class Mainbanco {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String tipocuenta,tipotrans;
        float cantretiro = 0, cantconsig = 0,saldo=15000;
        int nconsig=0,nretiro=0;
        
        
        System.out.println("Ingrese tipo de cuenta: ");
        tipocuenta = entrada.nextLine();
        System.out.println("Ingrese tipo de transacción (retirar, consignar): ");
        tipotrans = entrada.nextLine();
        if (tipotrans.equals("retirar")){
            System.out.println("Ingrese cantidad a retirar");
            cantretiro = entrada.nextFloat();
        }else if (tipotrans.equals("consignar")){
            System.out.println("Ingrese cantidad a consignar");
            cantconsig = entrada.nextFloat();
        }
        
        if(tipocuenta.equals("ahorros")){
            var ahorros = new Ahorros(saldo,  nconsig,  nretiro, tipocuenta,  tipotrans, cantretiro, cantconsig);
            ahorros.mostrarDatos();
        }
    }
    
}
