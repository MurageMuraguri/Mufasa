import java.util.Scanner;
public class Register {


    public String getUsername(){
                Scanner src = new Scanner(System.in);
                System.out.println("Enter username.This username is what you shall use in the future to login");
                String username=src.nextLine();

                return username;

            }//Method to get new username from user and input it to datastore for further use

    public  String getPassword(){
        Scanner src =new Scanner(System.in);
       int matchingPassword=1;

        System.out.println("Enter password");
        String password = src.nextLine();
                while(matchingPassword==1) {


                    System.out.println("Repeat entered password");
                    String password2= src.nextLine();

                    if(password.compareTo(password2)==0){
                        matchingPassword=matchingPassword+1;
                    }

                    else{
                        System.out.println("The two passwords do not match.Please Re-enter");
                    }

                }

 return password;
}

}

