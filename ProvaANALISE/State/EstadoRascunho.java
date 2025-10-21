// Estado Concreto: Rascunho
public class EstadoRascunho implements EstadoDocumento {
    @Override
    public void publicar(Documento doc) {
        System.out.println("Publicando o documento para revisão.");
        doc.setEstado(new EstadoEmRevisao());
    }

    @Override
    public void aprovar(Documento doc) {
        System.out.println("Não é possível aprovar um rascunho. Publique primeiro.");
    }
}