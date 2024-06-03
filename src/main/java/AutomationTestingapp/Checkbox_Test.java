package AutomationTestingapp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox_Test {

public static void main(String[] args) throws InterruptedException {
		
		// 1. Selecting a single check box
		
		// Eg. Navigate to https://testautomationpractice.blogspot.com/ and choose monday
		
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
	//	driver.findElement(By.xpath("//input[@id='thursday']")).click();
		
		// 2. Selecting all the check boxes
		List<WebElement> allDaysCheckboxes = driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
           /// For loop
	//	for(int i=0;i<allDaysCheckboxes.size();i++) {
	//		allDaysCheckboxes.get(i).click();
	//		 }
	
		/// for each loop
//		for(WebElement singleDay:allDaysCheckboxes)
//			singleDay.click();

		  // 3. selecting only the last three days
		
  //		for(int i=4;i<allDaysCheckboxes.size();i++) {
	//				allDaysCheckboxes.get(i).click();
		//			 }
	      // 4. Selecting only the first three days
		
		for(int i=0;i<3;i++) {
			allDaysCheckboxes.get(i).click();
			 }
	
	   // 5.un select those selected above or ... Un checking only selected check boxes from above(Validation)
	
	Thread.sleep(5000);
		
		for(int i=0;i<allDaysCheckboxes.size();i++) {
			if(allDaysCheckboxes.get(i).isSelected()) {
				allDaysCheckboxes.get(i).click();
			}
			
			 }
		
		
	}
		
		
	
	}



			
		
		