package de.florianstendel.apps.wildflyswarm.jaxrs.entity;

/**
 * Created by Florian on 08.12.2016.
 */
public class User {

    private String firstName;

    private String lastName;

    private String login;

    public User(String firstName, String lastName, String login) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.login = login;
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

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
}
