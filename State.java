package state;

public interface State {
	public void lock();
	public void unlock();
	public void getIn();
	public void getOut();
}
