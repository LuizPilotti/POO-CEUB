package model;

// Classe User com encapsulamento e atributos privados + getters/setters
public class User {
    private String username;
    private String password;

    public String getUsername() {
        return username; // Retorna nome do usuário
    }

    public void setUsername(String username) {
        this.username = username; // Define nome do usuário
    }

    public String getPassword() {
        return password; // Retorna senha
    }

    public void setPassword(String password) {
        this.password = password; // Define senha
    }
}