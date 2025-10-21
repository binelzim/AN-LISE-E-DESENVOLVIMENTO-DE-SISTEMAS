// Cliente (Classe principal para testar)
public class TesteStrategy {
    public static void main(String[] args) {
        CalculadoraFrete calculadora = new CalculadoraFrete();
        double pesoPedido = 5.0; // kg

        // Calculando com Sedex
        calculadora.setEstrategia(new FreteSedex());
        double valorSedex = calculadora.calcularFrete(pesoPedido);
        System.out.println("Valor do frete via Sedex: R$ " + valorSedex);

        // Calculando com PAC
        calculadora.setEstrategia(new FretePAC());
        double valorPAC = calculadora.calcularFrete(pesoPedido);
        System.out.println("Valor do frete via PAC: R$ " + valorPAC);

        // Calculando com Jadlog
        calculadora.setEstrategia(new FreteJadlog());
        double valorJadlog = calculadora.calcularFrete(pesoPedido);
        System.out.println("Valor do frete via Jadlog: R$ " + valorJadlog);
    }
}