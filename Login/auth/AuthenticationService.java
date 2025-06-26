package auth;

import model.User;

// Classe que implementa a interface LoginService
// conceito de herança via interface
// Polimorfismo para usar LoginService como tipo genérico
public class AuthenticationService implements LoginService {
    private User currentUser; //Atributo encapsulado

    @Override
    public boolean login(String username, String password) { //Tratamento de exceção
        if ("denys".equals(username) && "poo123456".equals(password)) {
            currentUser = new User();
            currentUser.setUsername(username); // Encapsulamento com setter
            currentUser.setPassword(password); // Encapsulamento com setter
            UserSession.setCurrentUser(currentUser); // Sessão iniciada
            return true;
        }
        return false;
    }

    @Override
    public void logout() {
        currentUser = null;
        UserSession.setCurrentUser(null); // Encerrando sessão
    }

    @Override
    public User getCurrentUser() {
        return UserSession.getCurrentUser(); // Retornando usuário da sessão
    }
}