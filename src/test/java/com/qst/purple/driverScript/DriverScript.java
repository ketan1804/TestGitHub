package com.qst.purple.driverScript;

import java.io.IOException;
import java.util.Scanner;

import com.qst.purple.actionScript.ActionScript;

public class DriverScript extends ActionScript {
	public static int respo;
		
	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
for (int i=1;i<=5;i++)
	{
	Scanner sc1=new Scanner(System.in);
	System.out.println("Please choose your browser -> 1 for Chrome and 2 for Edge");
	respo=sc1.nextInt();
	excel_initiate();

if (respo==1)
		{
	launch_chrome();
	break;
		}
else if (respo==2)
{
launch_edge();
break;
}
else 
	{
	System.out.println("Please enter the correct Input");
	}
sc1.close();

	}
/*for (int i=3;i<=7;i++)
{*/
if    (sheet2.getRow(1).getCell(2).getStringCellValue().equals("Y")
	&& sheet2.getRow(1).getCell(3).getStringCellValue().equals("login_NT")
	&& sheet22.getRow(1).getCell(0).getStringCellValue().equals("login_NT")
	&& sheet22.getRow(1).getCell(1).getStringCellValue().equals("Y"))
			{
	login_NT();
	//continue;
	
			}
if    (sheet2.getRow(1).getCell(2).getStringCellValue().equals("Y")
		&& sheet2.getRow(1).getCell(4).getStringCellValue().equals("comparetit_NT")
		&& sheet22.getRow(2).getCell(0).getStringCellValue().equals("comparetit_NT")
		&& sheet22.getRow(2).getCell(1).getStringCellValue().equals("Y"))
				{
	comparetit_NT();
	//System.out.println("Hi");
	//continue;
				}
if    (sheet2.getRow(1).getCell(2).getStringCellValue().equals("Y")
		&& sheet2.getRow(1).getCell(5).getStringCellValue().equals("flightbook_NT")
		&& sheet22.getRow(3).getCell(0).getStringCellValue().equals("flightbook_NT")
		&& sheet22.getRow(3).getCell(1).getStringCellValue().equals("Y"))
				{
	flightbook_NT();
	//System.out.println("HI");
	//continue;
				}
if (sheet2.getRow(1).getCell(2).getStringCellValue().equals("Y")
		&& sheet2.getRow(1).getCell(6).getStringCellValue().equals("signout_NT")
		&& sheet22.getRow(4).getCell(0).getStringCellValue().equals("signout_NT")
		&& sheet22.getRow(4).getCell(1).getStringCellValue().equals("Y"))
				{
	signout_NT();
	//.close();
	//System.out.println("HI");
	//continue;
				}
if (sheet2.getRow(2).getCell(2).getStringCellValue().equals("Y")
		&& sheet2.getRow(2).getCell(3).getStringCellValue().equals("launch_PB")
		&& sheet22.getRow(5).getCell(0).getStringCellValue().equals("launch_PB")
		&& sheet22.getRow(5).getCell(1).getStringCellValue().equals("Y"))
				{
	launch_PB();
	//System.out.println("HI");
	//continue;
				}
if (sheet2.getRow(2).getCell(2).getStringCellValue().equals("Y")
		&& sheet2.getRow(2).getCell(4).getStringCellValue().equals("totlinks_PB")
		&& sheet22.getRow(6).getCell(0).getStringCellValue().equals("totlinks_PB")
		&& sheet22.getRow(6).getCell(1).getStringCellValue().equals("Y"))
				{
	totlinks_PB();
	//System.out.println("HI");
	//continue;
				}
if (sheet2.getRow(2).getCell(2).getStringCellValue().equals("Y")
		&& sheet2.getRow(2).getCell(5).getStringCellValue().equals("two_we_PB")
		&& sheet22.getRow(7).getCell(0).getStringCellValue().equals("two_we_PB")
		&& sheet22.getRow(7).getCell(1).getStringCellValue().equals("Y"))
				{
	two_we_PB();
	//System.out.println("HI");
	//continue;
				}
if (sheet2.getRow(2).getCell(2).getStringCellValue().equals("Y")
		&& sheet2.getRow(2).getCell(6).getStringCellValue().equals("cptrht_src_PB")
		&& sheet22.getRow(8).getCell(0).getStringCellValue().equals("cptrht_src_PB")
		&& sheet22.getRow(8).getCell(1).getStringCellValue().equals("Y"))
				{
	cptrht_src_PB();
	//System.out.println("HI");
	//continue;
				}

else 
	{
//	continue;
	}
}
//}

	
}
