package behavioralType.mementoPattern;

public class Originator {
	public String state;
    /**
     * �ı�״̬
     */
    public void changeState(String state){
        this.state = state;
        System.out.println("״̬�ı�Ϊ��" + state);
    }
    /**
     * ��������������һ���µı���¼����
     */
    public Memento createMemento(){
        return new Memento(this);
    }
    /**
     * �������˻ָ�������¼��������¼��״̬��
     */
    public void restoreMemento(MementoIF memento){
        Memento m = (Memento)memento;
        changeState(m.state);
    }
    
    private class Memento implements MementoIF{
        
        private String state;
        /**
         * ���췽��
         */
        private Memento(Originator o){
            this.state = o.state;
        }
        private String getState() {
            return state;
        }
        
    }
}