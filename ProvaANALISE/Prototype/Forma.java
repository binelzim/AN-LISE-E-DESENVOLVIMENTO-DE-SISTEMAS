// Interface Prototype com o método de clonagem
// Note que estendemos Cloneable para usar o super.clone()
public interface Forma extends Cloneable {
    Forma clonar();
    void desenhar();
}