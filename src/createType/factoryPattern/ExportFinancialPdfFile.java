package createType.factoryPattern;

public class ExportFinancialPdfFile implements ExportFile {

	@Override
	public boolean export(String data) {
		System.out.println("���������PDF�ļ�");
        return true;
	}

}
