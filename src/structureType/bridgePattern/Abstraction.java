package structureType.bridgePattern;

/**
 * ���󻯽�ɫ
 * @author lyf
 *
 */
public abstract class Abstraction {
	// �����ʵ�ֻ���ɫ������
    private Implementor imp;
    // ���ʵ�ֻ���ɫ
    public Implementor getImp() {
        return this.imp;
    }
    // Լ���������ʵ�ָù��캯��
    public Abstraction(Implementor _imp) {
        this.imp = _imp;
    }

    // �������Ϊ������
    public void requestbaseadd(int a,int b) {
        this.imp.Addition(a, b);
    }
    // �������Ϊ������
    public void requestbasesub(int a,int b) {
        this.imp.Subtraction(a, b);
    }
    public void requestnewMultiplication(int a,int b){
    	System.out.println("��˽��:"+String.valueOf(a*b));
    }
    public void requestnewDivision(int a,int b){
    	System.out.println("������:"+String.valueOf(a/b));
    }
   
}
