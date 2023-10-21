package XYZ.FomatData.model;

public class DataString {
    private String phoneNumber;
    private String email;
    private String date;
    public DataString(String phoneNumber, String email, String date) {
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.date = date;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    @Override
    public String toString() {
        return "DataString [phoneNumber=" + phoneNumber + ", email=" + email + ", date=" + date + "]";
    }
}
