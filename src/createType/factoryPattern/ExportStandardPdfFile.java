package createType.factoryPattern;

public class ExportStandardPdfFile implements ExportFile {

	@Override
	public boolean export(String data) {
		System.out.println("������׼PDF�ļ�");
        return true;
	}

}
