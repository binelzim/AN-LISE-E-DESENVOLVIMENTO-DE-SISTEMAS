// Cliente (Classe principal para testar)
public class TesteState {
    public static void main(String[] args) {
        Documento doc = new Documento();

        System.out.println("--- Tentando aprovar no estado Rascunho ---");
        doc.aprovar(); // Saída: Não é possível aprovar um rascunho.

        System.out.println("\n--- Publicando para revisão ---");
        doc.publicar(); // Saída: Publicando o documento para revisão.

        System.out.println("\n--- Tentando publicar novamente ---");
        doc.publicar(); // Saída: O documento já está em revisão.

        System.out.println("\n--- Aprovando o documento ---");
        doc.aprovar(); // Saída: Documento aprovado com sucesso!

        System.out.println("\n--- Tentando aprovar novamente ---");
        doc.aprovar(); // Saída: O documento já está aprovado.
    }
}