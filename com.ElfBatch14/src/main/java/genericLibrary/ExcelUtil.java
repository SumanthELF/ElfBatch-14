package genericLibrary;

import java.io.File;
import java.io.FileInputStream;
import java.util.Date;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * 
 * @author CHETHAN KUMAR M N
 *
 */
public class ExcelUtil {
	public double numericCellvalue(String path,String sheet,int row,int cell) throws Exception
	{
		File abspath=new File(path);
		FileInputStream fis=new FileInputStream(abspath);
		Workbook workbook=WorkbookFactory.create(fis);
		double data = workbook.getSheet(sheet).getRow(row).getCell(cell).getNumericCellValue();
		return data;
	}
	public int numericCellvalue1(String path,String sheet,int row,int cell) throws Exception
	{
		File abspath=new File(path);
		FileInputStream fis=new FileInputStream(abspath);
		Workbook workbook=WorkbookFactory.create(fis);
		int data = (int)workbook.getSheet(sheet).getRow(row).getCell(cell).getNumericCellValue();
		return data;
	}
	public String stringCellValue(String path,String sheet,int row,int cell) throws Exception
	{
		File abspath=new File(path);
		FileInputStream fis=new FileInputStream(abspath);
		Workbook workbook=WorkbookFactory.create(fis);
		String data = workbook.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
		return data;
	}
	public Date dateCellValue(String path,String sheet,int row,int cell) throws Exception
	{
		File abspath=new File(path);
		FileInputStream fis=new FileInputStream(abspath);
		Workbook workbook=WorkbookFactory.create(fis);
		Date data = workbook.getSheet(sheet).getRow(row).getCell(cell).getDateCellValue();
		return data;
	}
	public boolean booleanCellValue(String path,String sheet,int row,int cell) throws Exception
	{
		File abspath=new File(path);
		FileInputStream fis=new FileInputStream(abspath);
		Workbook workbook=WorkbookFactory.create(fis);
		boolean data = workbook.getSheet(sheet).getRow(row).getCell(cell).getBooleanCellValue();
		return data;
	}
	public String cellValue(String path,String sheet,int row,int cell) throws Exception
	{
		File abspath=new File(path);
		FileInputStream fis=new FileInputStream(abspath);
		Workbook workbook=WorkbookFactory.create(fis);
		String data = workbook.getSheet(sheet).getRow(row).getCell(cell).toString();
		return data;
	}
	public String[][] getMultipleData(String path,String Name ) throws Exception
	{
		File file =new File(path);
		FileInputStream fin=new FileInputStream(file);
		Workbook workbook=WorkbookFactory.create(fin);
		Sheet sheet = workbook.getSheet(Name);
		int rowcount =  sheet.getPhysicalNumberOfRows();
		int cellcount = sheet.getRow(0).getPhysicalNumberOfCells();
		String[][] arr=new String[ rowcount][cellcount];
		for (int i = 0; i < rowcount; i++)
		{
			for (int j = 0; j < cellcount; j++)
			{

				try{
					arr[i][j]=sheet.getRow(i).getCell(j).toString();
				}
				catch(Exception e) {

				}
			}
		}
		return arr;
	}
}



