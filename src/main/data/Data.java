package main.data;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.Array;
import java.util.ArrayList;

public class Data {

	private String name;
	private int id;
	private int[] data;

	private String[] dataStrArr;
	private String dataStr;


	//
	// 맵 데이터 name : 맵이름
	// 유저 데이터 name : 유저 닉네임(플레이어)


	public void Data() {
		this.name = "기본이름";
		this.id = -1;
		this.data = new int[]{};
		this.dataStrArr = new String[]{};

	}


	public Data Data(int id, String name) {

		this.id = id;
		this.name = name;
		this.data = new int[]{};
		this.dataStrArr = new String[]{/* getter 함수 설정(각 데이터에서 읽어오기 */};


		return this;
	}



	public void DataSplit(String filepath, int type) {

		try {
			dataStr = new String(Files.readAllBytes(Path.of(filepath)));
			dataStrArr = dataStr.split("\\s+");

			id = Integer.parseInt(dataStrArr[0]);
			name = dataStrArr[1];



			switch(type) {

				case 0: {

					userData(Integer.parseInt(dataStrArr[0]), )


//Todo :: userData 함수 Player.java에 구현
				}


			}




		} catch (IOException e) {
			System.err.println(e + "\r\n 파일 IO 오류가 발생하였습니다.");

		} catch (Exception e) {
			System.err.println(e + "\r\n 디버깅 요함.");
		}


	}
}
