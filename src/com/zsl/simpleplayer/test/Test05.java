package com.zsl.simpleplayer.test;

import com.robotium.solo.Solo;
import java.lang.Thread;


import org.libsdl.app.Log;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.SeekBar;
@SuppressWarnings("rawtypes")
// Play 1 file and do play and pause
public class Test05 extends ActivityInstrumentationTestCase2 {
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
    public Test05() throws ClassNotFoundException {
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
		// do play and pause for 500 times
		Thread.sleep(1000);
		int mytime = 0;
		while (mytime<500){
		
			solo.clickOnView(solo.getView("iv_play"));
			Thread.sleep(200);
			//solo.clickOnView(solo.getView("iv_play"));
			mytime += 1;
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




