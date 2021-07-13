import java.util.Scanner;

public class system {
    Scanner input = new Scanner(System.in);
    int inputDays = 0;

    public void mainMenu(int opcion){

        switch (opcion){
            case 1:
                if (inputDays<1){
                    System.out.println("You need more than one day to start the simulation.");
                }else{
                    startSimulation(inputDays);
                }
                break;
            case 2:
            System.out.println("Enter the number of days for the simulation.");
            inputDays = input.nextInt();
            break;
        }
    }
    public void startSimulation(int inputDays){
        double initialQ = 7000;
        int cont = 0;

        while (cont<inputDays){
            if(initialQ<28000){
                initialQ = initialQ + initialQ * 0.40;
            }else{
                initialQ = initialQ + initialQ * 0.31;
            }
            ++cont;
        }
        System.out.println("The number of Megabytes available is: " + (float)initialQ);
    }
}
