package state;

public class DoorKnob {
	State lockedState;
	State unlockedState;
	State inState;
	State outState;
	State state;
	public DoorKnob() {
		lockedState = new LockState(this);
		unlockedState = new UnLockedState(this);
		inState = new InState(this);
		outState = new OutState(this);
		state = lockedState;
	}
	public State getLockedState() {
		return lockedState;
	}
	public State getUnLockedState() {
		return unlockedState;
	}
	public State getInState() {
		return inState;
	}
	public State getOutState() {
		return outState;
	}
	public State getState() {
		return state;
	}
	public void setState(State state) {
		this.state = state;
	}
	public void unlock() {
		state.unlock();
	}
	public void lock() {
		state.lock();
	}
	public void getIn() {
		state.getIn();
	}
	public void getOut() {
		state.getOut();
	}
	public String toString() {
		StringBuilder result = new StringBuilder();
		result.append("\n---------Monte Carlo Casino ----------\n");
		result.append("Door knob " + state + "\n");
		
		return result.toString();
		
		
		
	}

}
