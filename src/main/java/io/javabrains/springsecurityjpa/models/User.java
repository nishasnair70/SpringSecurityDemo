package io.javabrains.springsecurityjpa.models;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    
    private int id;
    @Column(name = "user_name")
    
    private String userName;
   

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Column(name = "password")
	 
    private String password;
    public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "active")
	 
    private boolean active;
    @Column(name = "roles")
    
    private String roles;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

   

    

	public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }
}
