package state;

public class UnLockedState implements State {
	DoorKnob doorknob;
	public UnLockedState(DoorKnob doorknob) {
		this.doorknob = doorknob;
	}

	@Override
	public void lock() {
		System.out.println("The door has been locked");
		doorknob.setState(doorknob.getLockedState());

	}

	@Override
	public void unlock() {
		System.out.println("The door is not locked");

	}

	@Override
	public void getIn() {
		System.out.println("Getting inside the room");
		doorknob.setState(doorknob.getInState());

	}

	@Override
	public void getOut() {
		System.out.println("Getting out of the room");
		doorknob.setState(doorknob.getOutState());

	}
	public String toString() {
		return " unlocked";
	}

}
