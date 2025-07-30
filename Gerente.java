public class Gerente extends Funcionario {
    private double salario;
    private String departamento;

    public Gerente(String nome, String cpf, String cargo, double salario, String departamento) {
        super(nome, cpf);
        this.salario = salario;
        this.departamento = departamento;
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

    public void cadastrarProduto(String nome, int quantidadeEstocavel, String categoria, String marca, double custo, double precoVenda) {
        System.out.println("Produto cadastrado: " + nome);
        // Futura lógica de cadastro de produto
    }
}