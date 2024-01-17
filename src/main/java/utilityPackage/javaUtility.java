package utilityPackage;

import java.util.Random;

public class javaUtility {

	
	public int getRandomNumber() {
		
		Random random=new Random();
		   int num=random.nextInt(10, 999);
		
		return num;
	}
}
