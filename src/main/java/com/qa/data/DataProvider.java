package com.qa.data;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataProvider  {
	
	FileInputStream input;
    XSSFWorkbook wb;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;
	
	
	public DataProvider () 
	
	{
		try {
			
			//File file = new File(System.getProperty("user.dir")+prop.getProperty("testfile_path"));
			File file = new File("C:\\Users\\PallabDocuments16\\Workspace\\QuantumInvensions\\src\\DataSheet.xlsx");
			input = new FileInputStream(file);
			wb = new XSSFWorkbook(input);
		
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}}
	
	public String getData(String TestName_RowID, String ColumnID)
	{
		
			
					//sheet = wb.getSheet(prop.getProperty("testsheet_name"));
					sheet = wb.getSheet("testData");
					int rownum = 0;
					int colnum = 0;	
					
					for (int i=1;i<sheet.getLastRowNum();i++) 
						
						if  (sheet.getRow(i).getCell(0).getStringCellValue().equalsIgnoreCase(TestName_RowID))
						{
							rownum = i;
						}
						
					
					for (int a=1;a<sheet.getRow(0).getLastCellNum();a++)
						
						if  (sheet.getRow(0).getCell(a).getStringCellValue().equalsIgnoreCase(ColumnID))
						{
							colnum = a;
						}
					
					row = sheet.getRow(rownum);
					cell = row.getCell(colnum);
					
				
					String data= cell.getStringCellValue();
					return data;
								
			}
		
	}


