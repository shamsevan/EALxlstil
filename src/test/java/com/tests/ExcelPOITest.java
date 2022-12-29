package com.tests;

import java.util.Arrays;

import com.shams.excel.reader.EALExcelXLSReader;

public class ExcelPOITest {

	public static void main(String[] args) {

		
		EALExcelXLSReader reader = new EALExcelXLSReader("testdata.xlsx");
		int col = reader.getColumnCount("register");
		System.out.println(col);
		
		String cell = reader.getCellData("register", "firstname", 2);
		System.out.println(cell);
		
		//reader.addSheet("naveen");
		
		Object data[][] = reader.getSheetData("register");
		System.out.println(Arrays.deepToString(data));
	}

}
