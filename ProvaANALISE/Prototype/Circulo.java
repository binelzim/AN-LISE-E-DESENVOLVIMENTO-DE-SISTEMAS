// Protótipo Concreto: Círculo
public class Circulo implements Forma {
    private String cor;

    public Circulo(String cor) {
        this.cor = cor;
    }

    @Override
    public Forma clonar() {
        try {
            // Utiliza a clonagem superficial (shallow copy) padrão do Java
            return (Forma) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public void desenhar() {
        System.out.println("Desenhando um círculo da cor: " + cor);
    }
}