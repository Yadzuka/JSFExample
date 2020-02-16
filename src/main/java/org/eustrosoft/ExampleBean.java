package org.eustrosoft;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

@Named
@RequestScoped
public class ExampleBean implements Serializable {
    private String login;
    private String password;
    private boolean logged;
    private boolean createSuccess;

    @EJB
    private ExampleEJB exampleEJB;

    public void doLogin(){
        logged = true;
    }

    public boolean isLogged() {
        return logged;
    }

    public void setLogged(boolean logged) {
        this.logged = logged;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isCreateSuccess() {
        return createSuccess;
    }

    public void setCreateSuccess(boolean createSuccess) {
        this.createSuccess = createSuccess;
    }

    public ExampleEJB getExampleEJB() {
        return exampleEJB;
    }

    public void setExampleEJB(ExampleEJB exampleEJB) {
        this.exampleEJB = exampleEJB;
    }

    public void checkPassword(){
        logged = exampleEJB.checkPassword(login, password);
    }

    public void createUser(){
        createSuccess = exampleEJB.createUser(login, password);
    }

    public List<UserEntity> getAllUsers(){
        return exampleEJB.getAllUsers();
    }
}
