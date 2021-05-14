package GenericLibrary;

import java.io.File;
import java.io.FileInputStream;
import java.util.Date;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtil implements IAutoConstants{

	public int toGetNumData(String absPath,String sheetName,int rowNum,int cellNum) throws Exception {
		File file=new File(absPath);
		FileInputStream fin= new FileInputStream(file);
		Workbook workbook=WorkbookFactory.create(fin);
		int numData = (int)workbook.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getNumericCellValue();
		return numData;
	}
	public String toGetStringData(String absPath,String sheetName,int rowNum,int cellNum) throws Exception {
		File file=new File(absPath);
		FileInputStream fin= new FileInputStream(file);
		Workbook workbook=WorkbookFactory.create(fin);
		String stringData = workbook.getSheet(sheetName).getRow(rowNum).getCell(cellNum).toString();
		return stringData;
	}
	public Date inputDateInString(String absPath,String sheetName,int rowNum,int cellNum) throws Exception {

		File file=new File(absPath);
		FileInputStream fin= new FileInputStream(file);
		Workbook workbook=WorkbookFactory.create(fin);
		Date dateData = workbook.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getDateCellValue();
		return dateData;
	}
	public boolean inputBooleanData(String absPath,String sheetName,int rowNum,int cellNum) throws Exception {
		File file=new File(absPath);
		FileInputStream fin= new FileInputStream(file);
		Workbook workbook=WorkbookFactory.create(fin);
		boolean boolData = workbook.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getBooleanCellValue();
		return boolData;
	}
	public String[][] readingMultipleData(String absPath,String sheetName) throws Exception {
		File file=new File(absPath);
		FileInputStream fis=new FileInputStream(file);
		Workbook workbook=WorkbookFactory.create(fis);
		Sheet sheet = workbook.getSheet(sheetName);
		int rowCount = sheet.getLastRowNum();
		System.out.println(rowCount);
		int cellCount = sheet.getRow(0).getLastCellNum();
		System.out.println(cellCount);
		String[][] arr=new String[rowCount][cellCount];
		for(int i=0;i<rowCount;i++) {
			for(int j=0;j<cellCount;j++) {
				try {
					arr[i][j]=sheet.getRow(i).getCell(j).toString();
				}catch(Exception e) {

				}

			}
		}
		return arr;
	}
}