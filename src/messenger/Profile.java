package messenger;

import java.util.Date;

public class Profile {
    private long id;
    private String profileName;
    private String firstName;
    private String lastName;
    public Profile(){
        }
    public Profile(long id,String profileName, String firstName, String lastName){
        this.id=id;
        this.profileName=profileName;
        this.firstName=firstName;
        this.lastName=lastName;
        }

    public void setProfileName(String profileName) {
        this.profileName = profileName;
    }

    public String getProfileName() {
        return profileName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }


    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }
}
