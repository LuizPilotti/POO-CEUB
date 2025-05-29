
public class Usuario {
    private String username;
    private String senha;
    private Empregado empregado;

    public Usuario(String username, String senha, Empregado empregado) {
        this.username = username;
        this.senha = senha;
        this.empregado = empregado;
    }

    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }
    public String getSenha() { return senha; }
    public void setSenha(String senha) { this.senha = senha; }
    public Empregado getEmpregado() { return empregado; }
    public void setEmpregado(Empregado empregado) { this.empregado = empregado; }
}
