// Interface para o Estado
public interface EstadoDocumento {
    void publicar(Documento doc);
    void aprovar(Documento doc);
}