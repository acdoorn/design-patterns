package models;

public class nodeModel {

	private int number;
	private String state;

	public nodeModel(int number, String state) {
		super();
		setNumber(number);
		setState(state);
	}
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
}
