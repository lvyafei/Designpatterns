package createType.factoryPattern;

public class ExportStandardHtmlFile implements ExportFile {

	@Override
	public boolean export(String data) {
		System.out.println("������׼HTML�ļ�");
		return true;
	}

}
