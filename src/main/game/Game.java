package main.game;

import assets.Route;
import main.data.Data;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Game implements Route {

	private String args;


	public String getMsg(String address) {



		try {
			args = new String(Files.readAllBytes(Paths.get(address)));
			System.out.println(args);

		} catch (Exception e) {
			System.out.println("직접 오류를 고치시오\r\n" + e);

		}

		return args;







	}

	public void run() {


		init();
		show();

		//(This part determines terminate this window, 'll be automatically closed.)
	}

	public void init() {








	}

	public void show() {
		
		System.out.println("시작");

		System.out.println(getMsg(defaultName));





	}

	public void loop() {

		System.out.println(getMsg("src/main/data/World/Info"));
		// get Custom Message from map


	}


}
