package auth;

import model.User;

// Classe com atributo estático para manter a sessão
public class UserSession {
    private static User currentUser; 

    public static void setCurrentUser(User user) {
        currentUser = user; // Armazena usuário atual
    }

    public static User getCurrentUser() {
        return currentUser; // Retorna usuário atual
    }
}