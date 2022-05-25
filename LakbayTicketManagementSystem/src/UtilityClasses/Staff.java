package UtilityClasses;

public class Staff extends Person {
    
    private String staffID, userName, passWord, position;
    
    // Setter Methods

    public void setStaffID(String staffID) {
        this.staffID = staffID;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public void setPosition(String position) {
        this.position = position;
    }
    
    //Getter Methods

    public String getStaffID() {
        return staffID;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public String getPosition() {
        return position;
    }
    
}
