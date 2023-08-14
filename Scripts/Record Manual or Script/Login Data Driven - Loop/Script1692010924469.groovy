import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys


for ( int row=1; row<=2; row++) 
//for (int row=1; row<=findTestData('Data Files/AutomationExe Internal Data').getNumbersRow(); row++)
  {
	WebUI.openBrowser('')
	
	WebUI.navigateToUrl('https://automationexercise.com/')
	
	WebUI.click(findTestObject('Object Repository/AutomationExercise_Web/Navigation Bar/a_Signup  Login'))
	
	//SELECT DATA EMAIL & PASSWORD FROM DATA FILES DIRECT
	WebUI.setText(findTestObject('AutomationExercise_Web/Section_Nav_SignUp_Login/input_Login to your account_email'), findTestData('Data Files/AutomationExe Internal Data').getValue(1, 1))
	WebUI.setEncryptedText(findTestObject('AutomationExercise_Web/Section_Nav_SignUp_Login/input_Login to your account_password'), findTestData('Data Files/AutomationExe Internal Data').getValue(2, 1))
	
	WebUI.click(findTestObject('Object Repository/AutomationExercise_Web/Section_Nav_SignUp_Login/button_Login'))
	
	WebUI.delay(5)
	
	WebUI.verifyElementVisible(findTestObject('Object Repository/AutomationExercise_Web/Navigation Bar/a_Logged in as saya'))
	
	WebUI.closeBrowser()
	
}

