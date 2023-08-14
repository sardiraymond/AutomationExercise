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

//OPEN WEB BROWSER AND URL
WebUI.openBrowser('')

WebUI.navigateToUrl('https://automationexercise.com/')

WebUI.click(findTestObject('Object Repository/AutomationExercise_Web/Navigation Bar/a_Signup  Login'))

WebUI.setText(findTestObject('AutomationExercise_Web/Section_Nav_SignUp_Login/input_New User Signup_name'), 'Momonca')

WebUI.setText(findTestObject('AutomationExercise_Web/Section_Nav_SignUp_Login/input_New User Signup_email'), 'momon@harakiri.com')

WebUI.acceptAlert()

assert ((WebUI.getAttribute(findTestObject('AutomationExercise_Web/Section_Nav_SignUp_Login/input_New User Signup_name'), 'value') == 'Momonca') ||
	(WebUI.getAttribute(findTestObject('AutomationExercise_Web/Section_Nav_SignUp_Login/input_New User Signup_email'), 'value') == 'momon@harakiri.com'))
		

WebUI.click(findTestObject('AutomationExercise_Web/Section_Nav_SignUp_Login/button_Signup'))

WebUI.delay(3)

WebUI.verifyElementVisible(findTestObject('Object Repository/AutomationExercise_Web/Section_Nav_SignUp_Login/Section_SignUP/Section_Account_Information/b_Enter Account Information'))

//FUNCTION RADIOBUTTON ON ACCOUNT INFORMATION
WebUI.click(findTestObject('AutomationExercise_Web/Section_Nav_SignUp_Login/Section_SignUP/Section_Account_Information/input_Mr_title'))

WebUI.check(findTestObject('AutomationExercise_Web/Section_Nav_SignUp_Login/Section_SignUP/Section_Account_Information/input_Mr_title'))

WebUI.delay(2)

WebUI.click(findTestObject('AutomationExercise_Web/Section_Nav_SignUp_Login/Section_SignUP/Section_Account_Information/input_Mrs_title'))

WebUI.check(findTestObject('AutomationExercise_Web/Section_Nav_SignUp_Login/Section_SignUP/Section_Account_Information/input_Mrs_title'))

WebUI.delay(2)

WebUI.click(findTestObject('AutomationExercise_Web/Section_Nav_SignUp_Login/Section_SignUP/Section_Account_Information/input_Sign up for our newsletter_optin'))

WebUI.check(findTestObject('AutomationExercise_Web/Section_Nav_SignUp_Login/Section_SignUP/Section_Account_Information/input_Sign up for our newsletter_optin'))

WebUI.delay(2)

