package com.zsl.simpleplayer.test;

import com.robotium.solo.Solo;
import java.lang.Thread;
import android.test.ActivityInstrumentationTestCase2;
@SuppressWarnings("rawtypes")
// Play all local files in #80 folder
public class Test03 extends ActivityInstrumentationTestCase2 {
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
    public Test03() throws ClassNotFoundException {
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
		// choose item 1 - N
		solo.clickOnView(solo.getView("iv_multi_select"));
		
		solo.clickOnView(solo.getView("iv_select_all"));
		
		solo.clickOnView(solo.getView("iv_play_all"));
		
		Thread.sleep(1000000);

		
		
		
		
		
		// Play video
		
		
		// seek for N times
		
		//TBD ..
        //Click on New Tab
	
		
	}
    




	protected void tearDown() throws Exception {
		super.tearDown();
	}

}




