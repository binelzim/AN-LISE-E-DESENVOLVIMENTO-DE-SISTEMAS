public class PagamentoAdapter implements INovoPagamento {
    private Pagamento pagamentoAntigo;

    public PagamentoAdapter(Pagamento pagamentoAntigo) {
        this.pagamentoAntigo = pagamentoAntigo;
    }

    @Override
    public void realizarPagamento(double montante) {
        pagamentoAntigo.processarPagamento(montante);
    }
}