import java.util.Scanner; // Importa a classe Scanner para entrada de dados

// Classe Pessoa
class Pessoa {
    private String nomePessoa;
    private double pesoPessoa;
    private double alturaPessoa;
    private double imcPessoa;

    // Construtor da Classe Pessoa
    public Pessoa(String nomePessoa, double pesoPessoa, double alturaPessoa) {
        this.nomePessoa = nomePessoa;
        this.pesoPessoa = pesoPessoa;
        this.alturaPessoa = alturaPessoa;
        this.imcPessoa = calcularImcPessoa();
    }

    // Método para cálculo do IMC
    private double calcularImcPessoa() {
        return pesoPessoa / (Math.pow(alturaPessoa, 2));
    }

    // Método para análise do IMC
    private String analisarImc() {
        if (imcPessoa < 18.5) {
            return "Baixo peso. É recomendado procurar um médico.";
        } else if (imcPessoa >= 18.5 && imcPessoa <= 24.9) {
            return "Peso adequado. Continue mantendo hábitos saudáveis.";
        } else if (imcPessoa >= 25 && imcPessoa <= 29.9) {
            return "Sobrepeso. Consulte um médico e reveja hábitos para reverter o quadro.";
        } else if (imcPessoa >= 30 && imcPessoa <= 34.9) {
            return "Obesidade grau I. Busque orientação médica e nutricional.";
        } else if (imcPessoa >= 35 && imcPessoa <= 39.9) {
            return "Obesidade grau II. Atenção! Busque ajuda médica.";
        } else {
            return "Obesidade grau III. O risco de doenças é elevado. Consulte um médico urgentemente.";
        }
    }

    // Método para mostrar os dados da Pessoa
    public void mostrarImcPessoa() {
        System.out.println("\n===== Resultado do IMC =====");
        System.out.println("Nome: " + this.nomePessoa);
        System.out.println("Peso: " + this.pesoPessoa + " kg");
        System.out.println("Altura: " + this.alturaPessoa + " m");
        System.out.println("IMC: " + String.format("%.2f", this.imcPessoa));
        System.out.println("Análise: " + analisarImc());
        System.out.println("============================");
    }
}

// Classe principal para executar o programa
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Criando um Scanner para entrada de dados

        // Solicitando informações ao usuário
        System.out.println("===== Cálculo do IMC =====");
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();
        
        System.out.print("Digite seu peso (kg): ");
        double peso = scanner.nextDouble();
        
        System.out.print("Digite sua altura (m): ");
        double altura = scanner.nextDouble();

        // Criando um objeto da classe Pessoa com os dados do usuário
        Pessoa pessoa = new Pessoa(nome, peso, altura);
        
        // Mostrando os resultados
        pessoa.mostrarImcPessoa();
        
        scanner.close(); // Fechando o scanner
    }
}