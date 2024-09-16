package TestPractice;

import java.text.SimpleDateFormat;
import java.util.Date;

import net.bytebuddy.utility.RandomString;

public class TestClass {
public static void main(String[] args) {
//	String random = RandomString.make(5);
//	System.out.println(random);
	
//	 String timeStamp = new SimpleDateFormat("yyyy.MM.dd.hh.mm.ss").format(new Date());
//	 System.out.println(timeStamp);
	
	String localPath = System.getProperty("user.dir");
	System.out.println(localPath);
}
}
