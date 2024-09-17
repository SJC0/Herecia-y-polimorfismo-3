package mainbanco;

import java.util.Scanner;

public class Corriente extends Cuenta {

    Scanner entrada = new Scanner(System.in);

    public Corriente(float saldo, int nconsig, int nretiro, String tipocuenta, String tipotrans, float cantretiro, float cantconsig) {
        super(saldo, nconsig, nretiro, tipocuenta, tipotrans, cantretiro, cantconsig);
    }

    @Override
    void calcularSaldo() {
        if (tipotrans.equals("retirar") || tipotrans.equals("Retirar")) {
            System.out.println("Ingrese cantidad");
            cantretiro = entrada.nextFloat();

            saldo -= cantretiro;
            nretiro++;

        } else if (tipotrans.equals("consignar") || tipotrans.equals("Consignar")) {

            System.out.println("Ingrese cantidad");
            cantconsig = entrada.nextFloat();
            saldo += cantconsig;
            nconsig++;
        }
    }

    void mostrarDatos() {
        System.out.printf("Cuenta; %s%nTransacción: %s%nCantidad consignada: %.2f%nCantidad retirada: %.2f%nSaldo $%f%nCantidad de retiros: %d%nCantidad de consignaciones: %d%n",
                getTipocuenta(), getTipotrans(), getCantconsig(), getCantretiro(), getSaldo(), getNretiro(), getNconsig());
    }
}
