public class Login {
    private String username;
    private String password;
    public Login(){

    }

    public String getName() {
        return username;
    }

    public void setName(String name) {
        this.username = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean validate(){
        if(this.username.equals("admin") && this.password.equals("1234")){
            return true;
        }else{
            return false;
        }
    }
}