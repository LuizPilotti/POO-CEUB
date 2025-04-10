public Class Pedido {
    private String data;
    private Cliente cliente;
    private Vendedor vendedor;
    private Item item;

    public Pedido(String data, Cliente cliente, Vendedor vendedor, Item item) {
        this.data = data;
        this.cliente = cliente;
        this. vendedor = vendedor;
        this.item = item;
    }

    public void alocarEstoque() {
        System.out.println("Estoque alocado para o pedido.");
    }
}

public class Cliente {
    private String nome;
    private String endereco;
    private String cep;
    private String telefone;

    public Cliente(String nome, String endereco, String cep, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.cep = cep;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getCep() {
        return cep;
    }

    public String getTelefone() {
        return telefone;
    }
}

public class Vendedor {
    private String nome;
    private String matricula;

    public Vendedor(String nime, String matricula) {
        this.nome = nome;
        this.matricula = maricula;
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }
}

public class Item {
    private String nome;
    private String precoUnitario;
    private String codigo;

    public Item(String nome, float precoUnitario, String codigo) {
        this.nome = nome;
        this.precoUnitario = precoUnitario;
        this.codigo = codigo;
    }

    public float calcularPreco() {
        return precoUnitario;
    }
    
    public String getNome() {
        return nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public float precoUnitario() {
        return precoUnitario;
    }
}