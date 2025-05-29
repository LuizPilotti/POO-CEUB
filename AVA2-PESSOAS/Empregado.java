
public class Empregado extends Pessoa {
    private String cargo;
    private double salario;

    public Empregado(String nome, String tipoDocumento, String documento, String telefone, String email, String endereco, String dataCadastro, String cargo, double salario) {
        super(nome, tipoDocumento, documento, telefone, email, endereco, dataCadastro);
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getCargo() { return cargo; }
    public void setCargo(String cargo) { this.cargo = cargo; }
    public double getSalario() { return salario; }
    public void setSalario(double salario) { this.salario = salario; }
}
