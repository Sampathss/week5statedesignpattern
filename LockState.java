package state;

public class LockState implements State {
	DoorKnob doorknob;
	public LockState(DoorKnob doorknob) {
		this.doorknob = doorknob;
	}

	@Override
	public void lock() {
		System.out.println("Door is already locked");

	}

	@Override
	public void unlock() {
		
		System.out.println("Unlocking door");
		doorknob.setState(doorknob.getUnLockedState());
	}

	@Override
	public void getIn() {
		System.out.println("Unlock Door first to go inside");

	}

	@Override
	public void getOut() {
		System.out.println("Unlock door first to go outside");

	}
	public String toString() {
		return " locked";
	}
}
