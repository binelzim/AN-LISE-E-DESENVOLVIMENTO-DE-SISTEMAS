// Classe de Contexto
public class CalculadoraFrete {
    private EstrategiaFrete estrategia;

    // Permite trocar a estratégia em tempo de execução
    public void setEstrategia(EstrategiaFrete estrategia) {
        this.estrategia = estrategia;
    }

    public double calcularFrete(double peso) {
        if (estrategia == null) {
            throw new IllegalStateException("Estratégia de frete não definida.");
        }
        return estrategia.calcular(peso);
    }
}