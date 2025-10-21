// Estado Concreto: Em Revisão
public class EstadoEmRevisao implements EstadoDocumento {
    @Override
    public void publicar(Documento doc) {
        System.out.println("O documento já está em revisão.");
    }

    @Override
    public void aprovar(Documento doc) {
        System.out.println("Documento aprovado com sucesso!");
        doc.setEstado(new EstadoAprovado());
    }
}