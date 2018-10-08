package test;

import java.io.File;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.write.WritableCell;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.Number;



public class Excel_Frame_Work 
{

	public static void main(String[] args) throws Exception
	{
		// connect to excel file
		File f=new File("Book1.xls");
		//open that excel file for reading
		Workbook rwb=Workbook.getWorkbook(f);
		Sheet rsh=rwb.getSheet(0);
		int nour=rsh.getRows();
		//open excel file for writing
		WritableWorkbook wwb=Workbook.createWorkbook(f,rwb);
		WritableSheet wsh=wwb.getSheet(0);
		//data driven from 2nd row(index is 1)
		for(int i=1;i<nour;i++)
		{
			int x=Integer.parseInt(rsh.getCell(0,i).getContents());
			int y=Integer.parseInt(rsh.getCell(1,i).getContents());
			int z=x+y;
	           Number n=new Number(2,i,z);
	           wsh.addCell(n);
	           }
		//save excel
		wwb.write();//save
		wwb.close();
		rwb.close();
		
		

	}

}
