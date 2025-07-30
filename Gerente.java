public class Gerente extends Funcionario {
    private double salario;
    private String departamento;
    private String senhaGerente;

    public Gerente(String nome, String cpf, double salario, String departamento, String senhaGerente) {
        super(nome, cpf);
        this.salario = salario;
        this.departamento = departamento;
        this.senhaGerente = senhaGerente;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getSenhaGerente() {
        return senhaGerente;
    }

    public void setSenhaGerente(String senhaGerente) {
        this.senhaGerente = senhaGerente;
    }

    public void cadastrarProduto(String nome, int quantidadeEstocavel, String categoria, String marca, double custo, double precoVenda) {
        System.out.println("Produto cadastrado: " + nome);
        // Futura lógica de cadastro de produto
    }
}