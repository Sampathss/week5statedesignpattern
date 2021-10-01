package state;

public class DoorKnobState {

	public static void main(String[] args) {
		DoorKnob doorKnob = new DoorKnob();
		
		System.out.println(doorKnob);
		doorKnob.getIn();
		doorKnob.getOut();
		doorKnob.lock();
		doorKnob.unlock();
		
		doorKnob.getIn();
		doorKnob.getOut();
		
		System.out.println(doorKnob);
		doorKnob.unlock();
		
		doorKnob.lock();
		doorKnob.getIn();
		doorKnob.unlock();
		doorKnob.getIn();
		doorKnob.unlock();
	}

}
