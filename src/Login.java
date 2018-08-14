import java.util.Scanner;
public class Login extends Register {
    private String username;
    private String password;
    public Login(){

    }

    public String getName() {
        System.out.println("Input username");
        Scanner src =new Scanner(System.in);
        username=src.nextLine();
        return username;
    }

//Class to get password
    public String getPassword() {
        Scanner src =new Scanner(System.in);
        String password=src.nextLine();
         return password;
    }



}