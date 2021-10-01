package state;

public class OutState implements State {
	DoorKnob doorknob;
	public OutState(DoorKnob doorknob) {
		this.doorknob = doorknob;
	}

	@Override
	public void lock() {
		System.out.println("Locking the door");
		doorknob.setState(doorknob.getLockedState());

	}

	@Override
	public void unlock() {
		System.out.println("Door not locked");
		

	}

	@Override
	public void getIn() {
		System.out.println("Getting inside the room");
		doorknob.setState(doorknob.getInState());
	}

	@Override
	public void getOut() {
		System.out.println("Sorry you are already outside");

	}
	public String toString() {
		return " out State";
	}
}
