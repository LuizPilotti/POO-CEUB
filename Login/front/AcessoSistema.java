package front;

import auth.AuthenticationService;
import auth.LoginService;

import javax.swing.*;

// Classe principal main com interface Swing
// Aplica polimorfismo ao usar LoginService como tipo genérico
public class AcessoSistema {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Acesso ao Sistema");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(300, 180);
            frame.setLocationRelativeTo(null); // Centralizar na tela

            JPanel panel = new JPanel();
            frame.add(panel);
            placeComponents(panel);

            frame.setVisible(true);
        });
    }

    private static void placeComponents(JPanel panel) {
        panel.setLayout(null);

        JLabel userLabel = new JLabel("Usuário:");
        userLabel.setBounds(10, 20, 80, 25);
        panel.add(userLabel);

        JTextField userText = new JTextField(20);
        userText.setBounds(100, 20, 165, 25);
        panel.add(userText);

        JLabel passwordLabel = new JLabel("Senha:");
        passwordLabel.setBounds(10, 50, 80, 25);
        panel.add(passwordLabel);

        JPasswordField passwordText = new JPasswordField(20);
        passwordText.setBounds(100, 50, 165, 25);
        panel.add(passwordText);

        JButton loginButton = new JButton("Entrar");
        loginButton.setBounds(10, 80, 80, 25);
        panel.add(loginButton);

        JButton cancelButton = new JButton("Cancelar");
        cancelButton.setBounds(100, 80, 90, 25);
        panel.add(cancelButton);

        JButton newUserButton = new JButton("Novo Usuário");
        newUserButton.setBounds(200, 80, 130, 25);
        panel.add(newUserButton);

        LoginService service = new AuthenticationService(); // Polimorfismo com LoginService como tipo instanciado a AuthenticationService

        // Ação do botão Entrar
        loginButton.addActionListener(e -> {
            String user = userText.getText();
            String pass = new String(passwordText.getPassword()); // Tratamento de exceção envolvido indiretamente no login
            if (service.login(user, pass)) {
                JOptionPane.showMessageDialog(null, "Bem-vindo, " + user + "!");
            } else {
                JOptionPane.showMessageDialog(null, "Login inválido!", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        });

        cancelButton.addActionListener(e -> System.exit(0)); // Botão Cancelar encerra o sistema

        newUserButton.addActionListener(e -> JOptionPane.showMessageDialog(null, "Em desenvolvimento.", "Informação", JOptionPane.INFORMATION_MESSAGE)); // Botão Novo Usuário informa que está em desenvolvimento
    }
}