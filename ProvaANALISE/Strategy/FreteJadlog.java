// Estratégia Concreta: Jadlog
public class FreteJadlog implements EstrategiaFrete {
    @Override
    public double calcular(double peso) {
        // Lógica de cálculo para Jadlog
        return peso * 1.3;
    }
}