// Cliente (Classe principal para testar)
public class TestePrototype {
    public static void main(String[] args) {
        // Criando os protótipos originais
        Forma circuloVermelho = new Circulo("Vermelho");
        Forma retanguloAzul = new Retangulo("Azul");

        System.out.println("--- Criando novos objetos a partir dos protótipos ---");

        // Clonando os protótipos para criar novos objetos
        Forma novoCirculo = circuloVermelho.clonar();
        Forma novoRetangulo = retanguloAzul.clonar();

        novoCirculo.desenhar();   // Saída: Desenhando um círculo da cor: Vermelho
        novoRetangulo.desenhar(); // Saída: Desenhando um retângulo da cor: Azul

        // Verificando que são instâncias diferentes
        System.out.println("\nOs objetos são os mesmos?");
        System.out.println("Círculo original == Novo Círculo? " + (circuloVermelho == novoCirculo)); // Saída: false
    }
}