
public class Vendedor extends Empregado {
    private double comissao;

    public Vendedor(String nome, String tipoDocumento, String documento, String telefone, String email, String endereco, String dataCadastro, String cargo, double salario, double comissao) {
        super(nome, tipoDocumento, documento, telefone, email, endereco, dataCadastro, cargo, salario);
        this.comissao = comissao;
    }

    public double getComissao() { return comissao; }
    public void setComissao(double comissao) { this.comissao = comissao; }
}
