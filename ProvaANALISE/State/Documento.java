// Classe de Contexto
public class Documento {
    private EstadoDocumento estado;

    public Documento() {
        // O estado inicial é Rascunho
        this.estado = new EstadoRascunho();
    }

    public void setEstado(EstadoDocumento estado) {
        this.estado = estado;
    }

    public void publicar() {
        estado.publicar(this);
    }

    public void aprovar() {
        estado.aprovar(this);
    }
}