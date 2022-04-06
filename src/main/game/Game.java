package main.game;

import assets.Route;
import main.Tools;
import main.data.Data;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.Buffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Game implements Route {

	private String args;


	public String getMsg(String address) {


		String[] totalSTring;

		Tools tools = new Tools();
		tools.ClearConsole();

		try {


			BufferedReader bf = new BufferedReader(new FileReader(address));

			args = String.valueOf(bf.readLine());
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
		
		System.out.println("this.valueof");

		System.out.println(getMsg(defaultName));




	}

	public void loop() {

		System.out.println(getMsg("src/main/data/World/Info"));
		// get Custom Message from map


	}


}
