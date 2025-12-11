public class Executa {
    public static void main(String[] args) {
        PDFFormatter pdf = new PDFFormatter();
        Adapter adaptador = new Adapter(new ExcelFormatter()); 

        IPDFFormatter[] clientes = {pdf, adaptador};
        for (IPDFFormatter c : clientes) {
            c.extraiPlanilhaPDF();
            System.out.println();
        }
    }
}