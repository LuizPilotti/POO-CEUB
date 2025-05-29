
public class Fornecedor extends Pessoa {
    private String produtosFornecidos;

    public Fornecedor(String nome, String tipoDocumento, String documento, String telefone, String email, String endereco, String dataCadastro, String produtosFornecidos) {
        super(nome, tipoDocumento, documento, telefone, email, endereco, dataCadastro);
        this.produtosFornecidos = produtosFornecidos;
    }

    public String getProdutosFornecidos() { return produtosFornecidos; }
    public void setProdutosFornecidos(String produtosFornecidos) { this.produtosFornecidos = produtosFornecidos; }
}
