package behavioralType.observerPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * �������⣬�����ǿͻ�
 * @author lyf
 *
 */
public class Customer implements ISubject {

	private String customerState;

    private List<JobStation> observers = new ArrayList<JobStation>();

    /**
     * ���ӹ۲���
     * @param observer
     */
    public void Attach(JobStation observer)
    {
        this.observers.add(observer);
    }

    /**
     * �Ƴ��۲���
     * @param observer
     */
    public void Detach(JobStation observer)
    {
        this.observers.remove(observer);
    }
    
	public String getCustomerState() {
		return customerState;
	}

	public void setCustomerState(String customerState) {
		this.customerState = customerState;
	}

	@Override
	public void Notify() {
		for(JobStation o : observers)
        {
            o.Update();
        }
	}

}
