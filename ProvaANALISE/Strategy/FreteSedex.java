// Estratégia Concreta: Sedex
public class FreteSedex implements EstrategiaFrete {
    @Override
    public double calcular(double peso) {
        // Lógica de cálculo para Sedex
        return peso * 1.5 + 10;
    }
}