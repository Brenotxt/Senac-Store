import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Gerente gerentePrincipal = new Gerente("Breno", "12345678900", 5000.0, "Vendas", "senha123");
        Caixa caixaPrincipal = new Caixa("Gabi", "09876543211", 2000.0);

        while (true) {
            System.out.println("Bem-vindo à Senac Store!");
            System.out.println("1. Cadastrar Gerente ou Caixa");
            System.out.println("2. Cadastrar Produto");
            System.out.println("3. Registrar Venda");
            System.out.println("4. Sair");
            
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Gerente ou Caixa? (G/C): ");
                    char tipo = scanner.next().toUpperCase().charAt(0);

                    if (tipo == 'G') {
                        System.out.print("Nome do Gerente: ");
                        String nomeGerente = scanner.next();
                        System.out.print("CPF do Gerente: ");
                        String cpfGerente = scanner.next();
                        System.out.print("Salário do Gerente: ");
                        double salarioGerente = scanner.nextDouble();
                        System.out.print("Departamento do Gerente: ");
                        String departamentoGerente = scanner.next();
                        System.out.print("Senha do Gerente: ");
                        String senhaGerente = scanner.next();

                        Gerente gerente = new Gerente(nomeGerente, cpfGerente, salarioGerente, departamentoGerente, senhaGerente);
                    } else if (tipo == 'C') {
                        System.out.print("Nome do Caixa: ");
                        String nomeCaixa = scanner.next();
                        System.out.print("CPF do Caixa: ");
                        String cpfCaixa = scanner.next();
                        System.out.print("Salário do Caixa: ");
                        double salarioCaixa = scanner.nextDouble();


                        Caixa caixa = new Caixa(nomeCaixa, cpfCaixa, salarioCaixa);
                    } else {
                        System.out.println("Opção inválida!");
                    }
                    break;

                case 2:
                    System.out.print("Digite a senha do gerente principal: ");
                    String senha = scanner.next();

                    if (senha.equals(gerentePrincipal.getSenhaGerente())) {
                        System.out.print("Nome do Produto: ");
                        String nomeProduto = scanner.next();
                        System.out.print("Quantidade Estocável: ");
                        int quantidadeEstocavel = scanner.nextInt();
                        System.out.print("Categoria do Produto: ");
                        String categoria = scanner.next();
                        System.out.print("Marca do Produto: ");
                        String marca = scanner.next();
                        System.out.print("Custo do Produto: ");
                        double custo = scanner.nextDouble();
                        System.out.print("Preço de Venda do Produto: ");
                        double precoVenda = scanner.nextDouble();

                        gerentePrincipal.cadastrarProduto(nomeProduto, quantidadeEstocavel, categoria, marca, custo, precoVenda);
                    } else {
                        System.out.println("Senha incorreta!");
                    }
                    break;
                
                case 3:
                    System.out.print("Digite o valor da venda: ");
                    double valorVenda = scanner.nextDouble();

                    caixaPrincipal.registrarVenda(valorVenda);
                    break;

                case 4:
                    System.out.println("Saindo do sistema. Até logo!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }
}
