package com.ssafy.edu.vue.util;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import com.ssafy.edu.vue.dto.CommercialDto;

public class CommercialCSV {
	
	public CommercialCSV() {
		
	}
	
	public static ArrayList<CommercialDto> getCommInfo(String code) {
		ArrayList<CommercialDto> commInfo;
		
		commInfo = new ArrayList<>();
		CommercialDto dto = null;
		String csvFileName = "C:\\SSAFY\\springwork\\happyhouseboot\\src\\main\\resources\\static\\data\\상가업소정보_201912_01.csv";
		try(BufferedReader br = new BufferedReader(new FileReader(csvFileName))){
			String line;
			int cnt = 0;
			while((line = br.readLine()) != null){
				if(cnt++ != 0) {
					String[] values = line.split("\\|");
					if(values[17].equals(code)) {
						dto = new CommercialDto(values[1],values[4],values[6],values[8],values[12],values[14],
								values[17],values[18],values[24],values[30],values[35],values[37],values[38]);
						commInfo.add(dto);
					}
				}
			}
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
		
		return commInfo;
	}
}
