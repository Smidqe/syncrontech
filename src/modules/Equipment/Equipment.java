package modules.Equipment;

public class Equipment {
	private int room;
	private int chairs;
	private boolean projector;
	private boolean windows;
	private boolean board;
	
	public Equipment() {
		
	}

	public int getRoom() {
		return room;
	}

	public void setRoom(int room) {
		this.room = room;
	}

	public int getChairs() {
		return chairs;
	}

	public void setChairs(int chairs) {
		this.chairs = chairs;
	}

	public boolean isProjector() {
		return projector;
	}

	public void setProjector(boolean projector) {
		this.projector = projector;
	}

	public boolean isWindows() {
		return windows;
	}

	public void setWindows(boolean windows) {
		this.windows = windows;
	}

	public boolean isBoard() {
		return board;
	}

	public void setBoard(boolean board) {
		this.board = board;
	}
}
