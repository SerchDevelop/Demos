package com.mx.mouse;

import java.awt.Robot;
import java.util.Random;

public class Mouse {

	public static void main(String[] args) {
	      Robot robot = null;
	      Random rnd = new Random();
	      int x = 0, y = 0;
	      try{
	         robot = new Robot();
	      }
	      catch(Exception e){
	    	  System.out.println( e.toString() );
    	  }
	      while(true) {
	         robot.mouseMove(rnd.nextInt(800), rnd.nextInt(600));
	             try {
					Thread.sleep(60000);
				} catch (InterruptedException e) {
					e.printStackTrace();
			        break;
				}
	      }

	}

}
