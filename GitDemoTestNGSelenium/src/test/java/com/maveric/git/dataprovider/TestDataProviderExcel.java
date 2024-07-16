package com.maveric.git.dataprovider;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

public class TestDataProviderExcel {

	private static Workbook workbook;
	
	static {
		try {
			workbook = WorkbookFactory.create(new FileInputStream(new File("C:\\Users\\gauravra\\Downloads\\GitTestData.xlsx")));
		}
	catch(EncryptedDocumentException | IOException e)
	{
		e.printStackTrace();
	}
	}
	
	@DataProvider
	public Object[][] getInValidUsernameorInvalidPassword(){
		
		Object[][] testdata;
		
		Sheet workSheet = workbook.getSheet("SignIn-Test1");
		int rows = workSheet.getLastRowNum()+1;
		int columns = workSheet.getRow(workSheet.getLastRowNum()).getLastCellNum();
		testdata = new Object [rows][columns];
		for(int i=0; i<=testdata.length;i++)
			for(int j=0; j<workSheet.getRow(i).getLastCellNum();j++)
				testdata [i][j] = workSheet.getRow(i).getCell(j).toString();
		return testdata;
		}
	
	@DataProvider
	public Object[][] getUsernameandPassword(){
		
		Object[][] testdata;
		
		Sheet workSheet = workbook.getSheet("SignIn-Test2");
		int rows = workSheet.getLastRowNum()+1;
		int columns = workSheet.getRow(workSheet.getLastRowNum()).getLastCellNum();
		testdata = new Object [rows][columns];
		for(int i=0; i<=testdata.length;i++)
			for(int j=0; j<workSheet.getRow(i).getLastCellNum();j++)
				testdata [i][j] = workSheet.getRow(i).getCell(j).toString();
		return testdata;
		}
	
}
