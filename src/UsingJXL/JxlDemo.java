package UsingJXL;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class JxlDemo {

	public static void main(String[] args)
	{
     File file=new File("C:\\Users\\avinash\\Desktop\\Book1.xls");	
      try {
		Workbook book=Workbook.getWorkbook(file);
		Sheet sheet=book.getSheet(0);
		int rows=sheet.getRows();//it will return no of rows which has actual values
		int cols=sheet.getColumns();
		System.out.println("Rows: "+rows+"\t"+"Columns: "+cols);
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				Cell cell=sheet.getCell(j, i);
				System.out.print(cell.getContents()  +"\t");//it returns cell at the specified row and column
			}
			System.out.println();
		}
		//System.out.println(sheet.getCell(0, 0).getContents());
	} catch (BiffException | IOException e)
      {
		System.err.println("unable to open Excel file");
		e.printStackTrace();
	}
	}

}
