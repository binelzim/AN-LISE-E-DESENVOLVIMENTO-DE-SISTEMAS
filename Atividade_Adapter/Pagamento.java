public class Pagamento {
    public void processarPagamento(double valor) {
        System.out.println("Pagamento de R$ " + String.format("%.2f", valor) + " processado pelo sistema antigo.");
    }
}