public class UserAccountDTO {
    private String fullName;
    private String city;
    private int zipCode;
    private boolean isActive;

    public UserAccountDTO() {
    }

    public UserAccountDTO(String fullName, String city, int zipCode, boolean isActive) {
        this.fullName = fullName;
        this.city = city;
        this.zipCode = zipCode;
        this.isActive = isActive;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    //Task 3.5 Create a method that can print out the DTO objects in the array in a nice format.
    //__________________________________________________________________________________________
    public void printUserDTONicely(UserAccountDTO[] userAccountDTO){
        System.out.println("Printing our UserDTO Objects");
        System.out.println("__________________________________");
        for(UserAccountDTO userDTO: userAccountDTO){
            System.out.println("Full Name: " + userDTO.getFullName());
            System.out.println("City: " + userDTO.getCity());
            System.out.println("Zipcode: " + userDTO.getZipCode());
            //The questionmark here is an if-else statement - If it's active (true), the value before : will be presented
            //If not, the value after : will be presented (false)
            System.out.println("Active: " + (userDTO.isActive() ? "Yes" : "No"));
            System.out.println("_____________________________________");
        }
    }








}
