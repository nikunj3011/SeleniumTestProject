package automationFramework;

public class Utils {
	public static final String CHROME_PATH = "D:\\\\Soft\\\\chromedriver_win32\\\\chromedriver.exe";
	public static final String CHROME_CLASS = "webdriver.chrome.driver";
	public static final String GEX_URL = "http://adactinhotelapp.com/index.php";

	
	public static void p(String msg) {
		System.out.println(msg);
	}
	
	public static void s(int seconds) {
        try{
        Thread.sleep(seconds*1000);
        }
        catch(InterruptedException e) {}
    }
}
