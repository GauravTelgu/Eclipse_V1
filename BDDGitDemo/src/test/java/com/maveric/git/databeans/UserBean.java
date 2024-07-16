package com.maveric.git.databeans;

public class UserBean {
    private String userName, password;
    public UserBean() {}
    
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    @Override
    public String toString() {
        return "UserBean [userName=" + userName + ", password=" + password + "]";
    }
}