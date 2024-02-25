package at.htl.lego.solution.oobasics.bsp002;

public class Character {

    private String firstName;
    private String lastName;

    //region constructors
    public Character() {
    }

    public Character(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    //endregion

    //region getter and setter
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
    //endregion


    @Override
    public String toString() {
        return String.format("%s %s", firstName, lastName);
    }
}
