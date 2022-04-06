package main.game;

import assets.Route;
import main.Tools;
import main.data.Data;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Game implements Route {

	private String args;


	public String getMsg(String address) {

		Tools tools = new Tools();
		tools.ClearConsole();

		try {


			args = new String(Files.readAllBytes(Paths.get(address)), StandardCharsets.UTF_8);
			return args;

		} catch (Exception e) {
			System.out.println("직접 오류를 고치시오\r\n" + e);
			return "err" + e;

		}









	}

	public void run() {


		init();
		show();

		//(This part determines terminate this window, 'll be automatically closed.)
	}

	public void init() {








	}

	public void show() {
		
		System.out.println("ㅏㅜㅑㅜㅑ");

		System.out.println(getMsg(defaultName));




	}

	public void loop() {

		System.out.println(getMsg("src/main/data/World/Info"));
		// get Custom Message from map


	}


}
