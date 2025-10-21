// Estratégia Concreta: PAC
public class FretePAC implements EstrategiaFrete {
    @Override
    public double calcular(double peso) {
        // Lógica de cálculo para PAC
        return peso * 1.1 + 5;
    }
}