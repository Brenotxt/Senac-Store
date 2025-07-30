public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Nathan", "nathanblabla@gmail.com", "81 00000-0000");
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Email: " + cliente.getEmail());
        System.out.println("Telefone: " + cliente.getTelefone());
    }
}
