package com.zsl.simpleplayer.test;

import com.robotium.solo.Solo;
import java.lang.Thread;
import android.test.ActivityInstrumentationTestCase2;
@SuppressWarnings("rawtypes")
// Play a video /exit and replay it/check memory leakage for 1080p+6M
public class Test07 extends ActivityInstrumentationTestCase2 {
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
    public Test07() throws ClassNotFoundException {
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
        //Click on LinearLayout
		//solo.clickOnView(solo.getView("iv_hls"));
        //Click on New Tab
		//solo.enterText((android.widget.EditText) solo.getView("et_url"), "rtmp://10.10.49.37/rmhd/stream");
		//solo.clickOnView(solo.getView("btn_open_url"));
		solo.clickOnText("#82");
		// choose item 1 , you can use clickInList to choose item1
		solo.clickInList(1);
		Thread.sleep(145000);
		solo.clickOnView(solo.getView("iv_back"));
		Thread.sleep(1000);
		int i = 0;
		while (i < 50) {
			
			solo.clickInList(1);
			Thread.sleep(145000);
			solo.clickOnView(solo.getView("iv_back"));
			Thread.sleep(1000);
			i += 1;
		}
		
	}
    




	protected void tearDown() throws Exception {
		super.tearDown();
	}

}




