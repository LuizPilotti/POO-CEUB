package auth;

import model.User;

// Interface que define o contrato para serviços de login
// Interface para aplicar polimorfismo com diferentes classes podem implementar esta interface com lógicas distintas.
public interface LoginService {
    boolean login(String username, String password); //Login
    void logout(); //Encerra
    User getCurrentUser(); //Retorna
}