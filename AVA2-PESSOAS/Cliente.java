
public class Cliente extends Pessoa {
    private String preferencias;

    public Cliente(String nome, String tipoDocumento, String documento, String telefone, String email, String endereco, String dataCadastro, String preferencias) {
        super(nome, tipoDocumento, documento, telefone, email, endereco, dataCadastro);
        this.preferencias = preferencias;
    }

    public String getPreferencias() { return preferencias; }
    public void setPreferencias(String preferencias) { this.preferencias = preferencias; }
}
