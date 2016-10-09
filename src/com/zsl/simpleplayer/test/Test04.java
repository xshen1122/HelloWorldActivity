package com.zsl.simpleplayer.test;

import com.robotium.solo.Solo;
import java.lang.Thread;


import org.libsdl.app.Log;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.SeekBar;
@SuppressWarnings("rawtypes")
// Play 1 file and do seek etc
public class Test04 extends ActivityInstrumentationTestCase2 {
	private Solo solo;
	private static final String LAUNCHER_ACTIVITY_FULL_CLASSNAME = "com.zsl.simpleplayer.FileBrowser";
	private static Class<?> launcherActivityClass;
    static{
        try {
            launcherActivityClass = Class.forName(LAUNCHER_ACTIVITY_FULL_CLASSNAME);
        } catch (ClassNotFoundException e) {
           throw new RuntimeException(e);
        }
    }
	@SuppressWarnings("unchecked")
    public Test04() throws ClassNotFoundException {
        super(launcherActivityClass);
    }

  	public void setUp() throws Exception {
        super.setUp();
		solo = new Solo(getInstrumentation());
		getActivity();
  	}
  	public void testRun() throws InterruptedException {
        //Wait for activity: 'com.zsl.simpleplayer.test.activity.MainActivity'
		solo.waitForActivity("MainActivity", 2000);
        //choose folder
		solo.clickOnText("#80");
		// choose item 1 , you can use clickInList to choose item1
		solo.clickInList(1);
		// do seek, no effect using setProgressBar, so we use clickOnScreen...
		Thread.sleep(1000);
		int i = 100;
		int randValue = 0;
		int mytime = 0;
		while (mytime<500){
			randValue = (int)(Math.random()*1800);
			i = randValue + 100;
			solo.clickOnScreen(i, 1176);
			mytime += 1;
			Thread.sleep(200);
		}

		Thread.sleep(3000);
		
		
		

		
		
		
		
		
		// Play video
		
		
		// seek for N times
		
		//TBD ..
        //Click on New Tab
	
		
	}
    




	protected void tearDown() throws Exception {
		super.tearDown();
	}

}




