package main.data;

public class Player extends Data{

	private int id,xp,lv;
	private String name;


	public void Player() {
		this.id = -1;
		this.xp = 0;
		this.lv = 1;
		this.name = ".";

	}



	public Data Player(int id, String name, int xp, int lv) {

		this.name = "1"; // getPlayerName 설정
		this.id = id;
		this.xp = xp;
		this.lv = lv;

		return this;

	}

	public Data getPlayerInfo(int id) {

		this.id = id;
		this.xp = 0;
		this.lv = 1;
		this.name = "";


		// xp,lv,name 3개 초기값

		return this;

	}







}
