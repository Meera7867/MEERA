package test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;


/*open the notepad
  enter input
  save file
  open new page
 
 */


public class Notepad 
{
	public static void main(String[] args) throws IOException, AWTException, InterruptedException
	{
		//open notepad
	Runtime.getRuntime().exec("notepad.exe");
	Thread.sleep(3000);
	//maximize notepad
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_ALT);
	r.keyPress(KeyEvent.VK_SPACE);
	r.keyRelease(KeyEvent.VK_SPACE);
	r.keyRelease(KeyEvent.VK_ALT);
	Thread.sleep(2000);
	for(int i=1;i<=4;i++)
	{
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(3000);
	}
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
    Thread.sleep(3000);
    //enter input1
	StringSelection s=new StringSelection("hi sir");
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s,null);
	//paste data in notepad
     r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_V);
	r.keyRelease(KeyEvent.VK_V);
	r.keyRelease(KeyEvent.VK_CONTROL);
	Thread.sleep(2000);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
    Thread.sleep(3000);
    //save file
    r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_S);
	r.keyRelease(KeyEvent.VK_S);
	r.keyRelease(KeyEvent.VK_CONTROL);
	Thread.sleep(3000);
	StringSelection s1=new StringSelection("E:\\selenium\\java3.txt");
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s1,null);
	Thread.sleep(3000);
	//copying data from clipboard and paste in window
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_V);
	r.keyRelease(KeyEvent.VK_V);
	r.keyRelease(KeyEvent.VK_CONTROL);
	Thread.sleep(2000);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
    Thread.sleep(3000);
    //open new notepad
    r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_N);
	r.keyRelease(KeyEvent.VK_N);
	r.keyRelease(KeyEvent.VK_CONTROL);
	Thread.sleep(2000);
	//enter input2
	StringSelection s2=new StringSelection("HELLO ENGINEERS");
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s2,null);
	Thread.sleep(3000);
	//paste input2 from clipboard and send to screen
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_V);
	r.keyRelease(KeyEvent.VK_V);
	r.keyRelease(KeyEvent.VK_CONTROL);
	Thread.sleep(2000);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
    Thread.sleep(3000);
    //save file
    r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_S);
	r.keyRelease(KeyEvent.VK_S);
	r.keyRelease(KeyEvent.VK_CONTROL);
	Thread.sleep(3000);
	//give file path
	StringSelection s3=new StringSelection("E:\\selenium\\java4.txt");
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s3,null);
	Thread.sleep(3000);
	//copy path from clipboard and paste on screen
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_V);
	r.keyRelease(KeyEvent.VK_V);
	r.keyRelease(KeyEvent.VK_CONTROL);
	Thread.sleep(2000);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
    Thread.sleep(3000);
    //close window
    r.keyPress(KeyEvent.VK_ALT);
	r.keyPress(KeyEvent.VK_F4);
	r.keyRelease(KeyEvent.VK_F4);
	r.keyRelease(KeyEvent.VK_ALT);
	
	}

}
