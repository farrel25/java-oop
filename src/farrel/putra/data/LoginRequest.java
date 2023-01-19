package farrel.putra.data;

public class LoginRequest {

    private String username;
    private String password;

    public LoginRequest() {
        System.out.println("Membuat object LoginRequest");
        this.username = "";
        this.password = "";
    }

    public LoginRequest(String username) {
        System.out.println("Membuat object LoginRequest");
        this.username = username;
        this.password = "";
    }

    public LoginRequest(String username, String password) {
        System.out.println("Membuat object LoginRequest");
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
