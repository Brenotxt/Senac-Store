public class Caixa extends Funcionario {
    private double caixaTotal;

    public Caixa(String nome, String cpf, double caixaTotal) {
        super(nome, cpf);
        this.caixaTotal = caixaTotal;
    }

    public double getCaixaTotal() {
        return caixaTotal;
    }

    public void setCaixaTotal(double caixaTotal) {
        this.caixaTotal = caixaTotal;
    }

    public void registrarVenda(double valorVenda) {
        caixaTotal += valorVenda;
        System.out.println("Venda registrada: " + valorVenda + ". Caixa total agora é: " + caixaTotal);
    }
    
}
