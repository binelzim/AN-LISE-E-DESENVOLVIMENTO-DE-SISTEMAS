// Protótipo Concreto: Retângulo
public class Retangulo implements Forma {
    private String cor;

    public Retangulo(String cor) {
        this.cor = cor;
    }

    @Override
    public Forma clonar() {
        try {
            return (Forma) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public void desenhar() {
        System.out.println("Desenhando um retângulo da cor: " + cor);
    }
}