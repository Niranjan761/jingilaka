package test_script;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import generic.basetest;
import generic.generic_excel;
import pom.facebooklogin;

public class validlogin extends basetest 
{
	@Test
	public void lodin() throws EncryptedDocumentException, IOException
	{
		String user=generic_excel.getData("Sheet1", 0, 0);
		String pwd=generic_excel.getData("Sheet1", 0, 0);
		facebooklogin fac=new facebooklogin(g);
		fac.un(user);
		fac.pas(pwd);
		fac.login();
	}
	

}
