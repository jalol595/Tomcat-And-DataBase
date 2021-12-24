package uz.pdp.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class Users {

    private String username;
    private String name;
    private String  password;

    public String getUsername() {
        return username;
    }

    public String getName() {
        return name;
    }

    public String  getPassword() {
        return password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String  password) {
        this.password = password;
    }
}
