
public class UserAccount {
    private String firstName;
    private String lastName;
    private String birthDate;
    private Address address;
    private AccountDetails accountDetails;

    public UserAccount(String firstName, String lastName, String birthDate, Address address, AccountDetails accountDetails) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.address = address;
        this.accountDetails = accountDetails;
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

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public AccountDetails getAccountDetails() {
        return accountDetails;
    }

    public void setAccountDetails(AccountDetails accountDetails) {
        this.accountDetails = accountDetails;
    }


    public AccountDetails getAccountInfo(){
        return accountDetails;
    }

    public void setAccountInfo(AccountDetails accountDetails){
        this.accountDetails = accountDetails;
    }






}
