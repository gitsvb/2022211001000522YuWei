package Week4homework;

public class user {
    private String username;
    private String password;
    private String email;
    private String gender;
    private String brithdate;
    public user(String username, String password, String email, String gender, String brithdate){
        this.username = username;
        this.password = password;
        this.email = email;
        this.gender =gender;
        this.brithdate =brithdate;
    }
    public String getUsername(){
        return this.username;
    }
    public String getPassword(){
        return this.password;
    }
    public String getEmail(){
        return this.email;
    }
    public String getGender(){
        return this.gender;
    }
    public String getBrithdate(){
        return this.brithdate;
    }

}
