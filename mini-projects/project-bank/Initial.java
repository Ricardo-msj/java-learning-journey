import java.util.Scanner;

public class Initial{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Banco newBanco = new Banco();
        
        System.out.println("What your name: ");
        String username = sc.nextLine();
        newBanco.setNameUser(username);

        System.out.println("What is your CPF: ");
        String cpfUser = sc.nextLine();
        newBanco.setUsercpf(cpfUser);


        System.out.println("\n##########################");
        System.out.println("Bank VOID\n");
        System.out.println("Name User: " + newBanco.getNameUser());
        System.out.println("CPF:  " + newBanco.getUserCPF());
        System.out.println("Account Balance: " + newBanco.getValueAccount());
        System.out.println("##########################\n");


        boolean running = true;
        while (running) {

            System.out.println("\nChoose your option:\n ");
            System.out.println(
            """
            [1] - Consult Balance.
            [2] - Receiv Value.
            [3] - To Transfer Value.
            [4] - Exit.
            """);

            int option = sc.nextInt();

            switch (option) {
                case 1:

                    System.out.println(newBanco.checkBalance());
                    break;

                case 2:

                    System.out.println("What is the value: ");
                    double valueSum = sc.nextDouble();
                    newBanco.receivBalance(valueSum);

                    break;

                case 3:

                    System.out.println("What is the value: ");
                    double valueSubtract = sc.nextDouble();
                    newBanco.transferBalance(valueSubtract);
                    break;

                case 4:

                    running = false;
                    System.out.println("Finish Bank!");
                    break;
            
                default:
                    System.out.println("Option Invalid!!!");
                    break;
            }
        }

    }
}