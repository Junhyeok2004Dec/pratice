package main.data.Item;

import main.data.Data;

public class Item extends Data {

	private int id, cost;
	private String name;

	public void init() {
		this.id = -1;
		this.cost = 0;
		this.name = "없는 아이템입니다.";

	}

	public Item Item(int id) {

		this.id = id;
		this.cost = 0;
		this.name = "임시";

		return this;


	}


	public int getCost(Item item) {

		this.cost = 0;

		return this.cost;


	}
}
