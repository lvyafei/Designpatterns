package createType.factoryPattern;

public class ExportFinancialHtmlFile implements ExportFile {

	@Override
	public boolean export(String data) {
		System.out.println("���������HTML�ļ�");
		return true;
	}

}
