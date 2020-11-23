package Test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Random;

public class nosleep {
	
	public static void main(String[] args) throws AWTException {
		Robot robot = new Robot();
		Random random = new Random();
		robot.delay(8000);
		int a = 200;
		while(true) {
			robot.delay(10000);
			robot.keyPress(KeyEvent.VK_A);
			robot.keyRelease(KeyEvent.VK_A);
			a = Math.abs(random.nextInt())%100+50;
			robot.delay(a);

			
			robot.keyPress(KeyEvent.VK_SPACE);
			robot.keyRelease(KeyEvent.VK_SPACE);
	
 
			a = Math.abs(random.nextInt())%2000+10000;
			System.out.println(a);
			robot.delay(a);
		}
	}
	
	

	public static void main1(String[] args) {
		
		
		
		
		
		
		
		
		try {
			int i = 0;
			while(true) {
			Thread.sleep(1000);
			System.out.println(i++);
			
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
