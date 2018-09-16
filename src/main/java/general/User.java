package general;

import lombok.Data;

import static utils.RandomGenerator.*;

@Data
public class User {

    private String firstName;
    private String lastName;
    private String mobileNumber;
    private String emailAddress;
    private String password;

    public User(){
        this.firstName = generateRandomString();
        this.lastName = generateRandomString();
        this.mobileNumber = generateRandomPhoneNumber();
        this.emailAddress = generateRandomEmail();
        this.password = generateRandomString();
    }

    public User(String emailAddress, String password){
        this.emailAddress = emailAddress;
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
