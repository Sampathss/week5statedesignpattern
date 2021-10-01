package state;

public class InState implements State {
	DoorKnob doorKnob;
	public InState(DoorKnob doorKnob) {
		this.doorKnob = doorKnob;
	}

	@Override
	public void lock() {
		
		System.out.println("Locking door");
		doorKnob.setState(doorKnob.getLockedState());
	}

	@Override
	public void unlock() {
		System.out.println("Door not locked");
		
	}

	@Override
	public void getIn() {
		System.out.println("You are already inside the room");

	}

	@Override
	public void getOut() {
		System.out.println("Getting out of the room");
		doorKnob.setState(doorKnob.getOutState());

	}
	public String toString() {
		return " inside state";
	}
}
