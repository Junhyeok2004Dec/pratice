package main.game;

import assets.Route;
import main.data.Data;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Game implements Route {


	public void defaultMsg() {

		String data;

		try {
			data = new String(Files.readAllBytes(Paths.get(defaultName)));
			System.out.println(data);

		} catch (Exception e) {
			System.out.println("직접 오류를 고치시오\r\n" + e);

		}







	}

	public void run() {


		init();
		loop();

		//(This part determines terminate this window, 'll be automatically closed.)
	}

	public void init() {

		defaultMsg();






	}

	public void loop() {



	}


}
