package Data_Driven_Testing;

import java.io.FileInputStream;
import java.io.IOException;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xslf.usermodel.XSLFSheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ByUsing_ApachePoi 
{

	@Test(dataProvider="Excelfile")
	public void SignIn(String uname,String Password)
	{
      System.out.println("uname:"+uname+"\t"+"Password:"+Password);
	}
    @DataProvider(name="Excelfile")
    public Object[][] readExcelfile() throws IOException
    {
     //---Initialize an Empty 2D Array--//	
    	Object[][] obj=null;
     //---code to read data from Excel file---//
    	
    	FileInputStream fis=new FileInputStream("E:\\Java program\\Sheet.xlsx");
    	XSSFWorkbook book=new XSSFWorkbook(fis);
    	XSSFSheet sheet=book.getSheet("Sheet1");
    	
    	int rows=sheet.getLastRowNum();
    	int cols=sheet.getRow(0).getLastCellNum();
    	obj=new Object[rows][cols-1];
    	
    	for (int i = 1; i <= rows; i++)
    	{
			Row row=sheet.getRow(i);
			int columns=row.getLastCellNum();
			
				for (int j = 1; j < columns; j++)
				{
					Cell cell=row.getCell(j);
					switch(cell.getCellType())
					{
					case Cell.CELL_TYPE_BLANK:
						obj[i-1][j-1]="";
						break;
						
					case Cell.CELL_TYPE_BOOLEAN:
						 obj[i-1][j-1]=cell.getBooleanCellValue();
						 
					case Cell.CELL_TYPE_ERROR:
						 obj[i-1][j-1]="ERROR";
						 break;
						 
					case Cell.CELL_TYPE_NUMERIC:
						 obj[i-1][j-1]=cell.getNumericCellValue();
						 break;
						 
					case Cell.CELL_TYPE_STRING:
						 obj[i-1][j-1]=cell.getStringCellValue();
						 break;
					}
				}
			}
		
    	  return obj;
    }
}
