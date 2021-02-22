package cajeroautommatico;

import java.util.Scanner;

public class ClaseAbstractP {

    protected int transacciones, retiro, deposito;
    private static int saldo;
    Scanner in = new Scanner(System.in);

    public void Operaciones() {
        int bandera = 0;
        int seleccion = 0;
        saldo = 500;
        // este do proboca que se ejecute el siguiente letrero una y otra vez
        do {
            do {
                //este codigo se ejecuta unicamente cuando la bariable bandera sea igual a 0
                System.out.println("por favor selecione una occión:");
                System.out.println("    1. consulta de saldo");
                System.out.println("    2. retiro de efectivo.");
                System.out.println("    3. deposito de efectivo.");
                System.out.println("    4. salir");
                seleccion = in.nextInt();

                if (seleccion >= 1 && seleccion <= 4) {
                    bandera = 1;
                } else {
                    System.out.print("---------------------------------");
                    System.out.print("Opcion erronea, vuelva a intentar");
                    System.out.print("----------------------------------");
                }
            } while (bandera == 0);
            if (seleccion == 1) {
               System.out.println("---------------------");
               System.out.println("su Saldo es: " + saldo);
               System.out.println("---------------------");
            } else if (seleccion == 2) {
                System.out.println("---------------------");
                System.out.print("cuanto desea retirar: ");
                retiro = in.nextInt();
                saldo = saldo - retiro;
                if(retiro <= saldo){
                System.out.println("---------------------");
                System.out.println("acabas de retirar" + retiro +
                                   "tu nuevo saldo es " + saldo);
                System.out.println("---------------------");
                } else{
                System.out.println("---------------------");
                System.out.println("saldo insuficiente, vuelve a intentar");
                System.out.println("---------------------");
                }
            } else if (seleccion == 3) {
                System.out.println("---------------------");
                System.out.print("cuanto deseas depositar: ");
                deposito = in.nextInt();
                
                saldo = deposito + saldo;
                System.out.println("---------------------");
                System.out.println("acabas de depositar" + deposito + 
                                   " tu nuevo saldo es " + saldo);
                System.out.println("---------------------");
            } else if (seleccion == 4) {
                System.out.println("gracias, vuelva pronto");
                bandera = 2;
            }
            // este es el while corespondiente al primer do
        } while (bandera != 2);
    }

}
