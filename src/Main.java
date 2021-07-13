import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ui msg = new ui();
        system system = new system();
        int opcion = 0;

        do{
            System.out.println(msg.menuPrincipal());
            opcion = input.nextInt();
            system.mainMenu(opcion);
        }while(opcion != 3);
    }
}
