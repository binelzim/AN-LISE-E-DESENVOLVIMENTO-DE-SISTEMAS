public class Adapter implements IPDFFormatter {
    
    private ExcelFormatter clienteA;

    public Adapter(ExcelFormatter clienteA) {
        this.clienteA = clienteA;
    }

    @Override
    public void extraiPlanilhaPDF() {
        System.out.println("Extraindo planilha do PDF");
        this.clienteA.executa();
    }
}