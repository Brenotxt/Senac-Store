public class Caixa extends Funcionario {
    private double salario;

    public Caixa(String nome, String cpf, double salario) {
        super(nome, cpf);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void registrarVenda(double valorVenda) {
        System.out.println("Venda registrada: " + valorVenda);
    }
    
}
