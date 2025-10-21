// Estado Concreto: Aprovado
public class EstadoAprovado implements EstadoDocumento {
    @Override
    public void publicar(Documento doc) {
        System.out.println("O documento já foi aprovado e publicado.");
    }

    @Override
    public void aprovar(Documento doc) {
        System.out.println("O documento já está aprovado.");
    }
}