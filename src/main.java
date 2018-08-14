import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        System.out.println("1 for new users");
        System.out.println("2 for returning users");
        int entranceChoice = src.nextInt();
        //Variable entranceChoice to assert whether a registration or a  login is needed

        if (entranceChoice == 1) {
            Register r1 = new Register();
            r1.getUsername();
            r1.getPassword();

        }
        else if (entranceChoice == 2) {
            Login l1 = new Login();
            l1.getName();
            l1.getPassword();

        }

        else {
            System.out.println("Invalid choice,choose again");

        }

    }
}





