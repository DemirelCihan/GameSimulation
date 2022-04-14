public class NewMemberInfo {
    private int id;
    private String firstName;
    private String lastName;
    private int birthyear;

    public NewMemberInfo(int id, String firstName, String lastName, int birthyear){

        this.id = id;
        this.firstName=firstName;
        this.lastName = lastName;
        this.birthyear = birthyear;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getBirthyear() {
        return birthyear;
    }

    public void setBirthyear(int birthyear) {
        this.birthyear = birthyear;
    }

}
