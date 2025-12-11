public class ExcelFormatter implements IExcelFormatter {
    @Override
    public void formataColunas() {
        System.out.println("ColA, ColB, ColC");
    }
    @Override
    public void formataLinhas() {
        System.out.println("Formata linhas...");
    }

    @Override
    public void formataEstilo() {
        System.out.println("Adiciona estilo e logo do cliente");
    }

    public void executa() {
        this.formataColunas();
        this.formataLinhas();
        this.formataEstilo();
    }
}