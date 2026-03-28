package sait.sll.problemdomain;

import java.io.Serializable;

public class User implements Serializable {

    private static final long serialVersionUID = 1L;
    private int id;
    private String name;
    private String email;
    private transient String password;

    public User(int id, String name, String email, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public boolean isCorrectPassword(String password) {
        if (this.password == null && password == null) {
            return true;
        } else if (this.password == null || password == null) {
            return false;
        } else {
            return this.password.equals(password);
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof User)) return false;
        User other = (User) obj;
        boolean namesEqual = (this.name == null) ? (other.name == null) : this.name.equals(other.name);
        boolean emailsEqual = (this.email == null) ? (other.email == null) : this.email.equals(other.email);
        
        return this.id == other.id && namesEqual && emailsEqual;
    }
}
