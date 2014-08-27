package behavioralType.observerPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体主题，这里是客户
 * @author lyf
 *
 */
public class Customer implements ISubject {

	private String customerState;

    private List<JobStation> observers = new ArrayList<JobStation>();

    /**
     * 增加观察者
     * @param observer
     */
    public void Attach(JobStation observer)
    {
        this.observers.add(observer);
    }

    /**
     * 移除观察者
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
