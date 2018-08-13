import java.util.Scanner;
public class Register {


            public String getUsername(){
                Scanner src = new Scanner(System.in);
                String username=src.nextLine();
                return username;

            }

            public String getPassword(){
                Scanner src =new Scanner(System.in);
                String password=src.nextLine();
                return password;
            }
}

