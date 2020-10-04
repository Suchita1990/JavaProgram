package UsingJXL;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ReadExcelByDataProvider
{
   public static String[][] readExcel()
   {
	   File file=new File("C:\\Users\\avinash\\Desktop\\Book1.xls");
	   String[][] content = null;
	      try {
			Workbook book=Workbook.getWorkbook(file);
			Sheet sheet=book.getSheet("Sheet2");
			int rows=sheet.getRows();//it will return no of rows which has actual values
			int cols=sheet.getColumns();
			content=new String[rows][cols];
			
			System.out.println("Rows: "+rows+"\t"+"Columns: "+cols);
			for(int i=0;i<rows;i++)
			{
				for(int j=0;j<cols;j++)
				{
					Cell cell=sheet.getCell(j, i);
					content[i][j]=cell.getContents();
					
				}
				//System.out.println();
			}
	      }
	      catch (BiffException | IOException e)
	      {
			System.err.println("unable to open Excel file");
			e.printStackTrace();
		}
		  return content;
		}

	
}

