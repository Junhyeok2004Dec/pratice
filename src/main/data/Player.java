package main.data;

public class Player extends Data{

	private int id,xp,lv;
	private String name;


	public void init() {
		this.id = -1;
		this.xp = 0;
		this.lv = 1;
		this.name = ".";

	}



	public Data Data(int id, String name, int xp, int lv) {

		this.name = "1"; // getPlayerName 설정
		this.id = id;
		this.xp = xp;
		this.lv = lv;

		return this;

	}



}
