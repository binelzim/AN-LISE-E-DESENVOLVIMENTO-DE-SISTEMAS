public class Main {
    public static void main(String[] args) {
        Pagamento sistemaAntigo = new Pagamento();

        INovoPagamento adaptador = new PagamentoAdapter(sistemaAntigo);

        System.out.println("Cliente utilizando o novo sistema de pagamentos:");
        realizarCompra(adaptador, 250.50);
    }

    public static void realizarCompra(INovoPagamento servicoPagamento, double valor) {
        servicoPagamento.realizarPagamento(valor);
    }
}