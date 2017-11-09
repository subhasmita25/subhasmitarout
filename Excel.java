package generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel 
{
	public static int getRowCount(String xlpath,String sheet)
	{
		int rc = 0;
		try 
		{
			FileInputStream fis=new FileInputStream(xlpath);
			
				Workbook wb= WorkbookFactory.create(fis);
			  rc = wb.getSheet(sheet).getLastRowNum();
		} 
		catch (FileNotFoundException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		catch (EncryptedDocumentException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (InvalidFormatException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rc;
		
	}
	
	public static String getCellValue(String xlpath,String sheet,int r,int c) throws Exception
	{
		
		FileInputStream fis=new FileInputStream(xlpath);
		Workbook wb=WorkbookFactory.create(fis);
		Cell cell = wb.getSheet(sheet).getRow(r).getCell(c);
		String v = cell.toString();
		return v;
		
	}

}
