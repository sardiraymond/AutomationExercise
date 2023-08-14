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

'Landing page\n'
WebUI.click(findTestObject('Object Repository/AutomationExercise_Web/Navigation Bar/a_Signup  Login'))

'Login/signup page\n'
WebUI.setText(findTestObject('AutomationExercise_Web/Section_Nav_SignUp_Login/input_New User Signup_name'), 'Momonca')

'Login/signup page\n'
WebUI.setText(findTestObject('AutomationExercise_Web/Section_Nav_SignUp_Login/input_New User Signup_email'), 'momon@harakiri.com')

WebUI.click(findTestObject('AutomationExercise_Web/Section_Nav_SignUp_Login/button_Signup'))

WebUI.verifyElementVisible(findTestObject('Object Repository/AutomationExercise_Web/Section_Nav_SignUp_Login/Section_SignUP/Section_Account_Information/b_Enter Account Information'))

WebUI.selectOptionByIndex(findTestObject('Object Repository/AutomationExercise_Web/Section_Nav_SignUp_Login/Section_SignUP/Section_Account_Information/select_Day'), '20', FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('AutomationExercise_Web/Section_Nav_SignUp_Login/Section_SignUP/Section_Account_Information/select_Month'), '3', false)

WebUI.selectOptionByLabel(findTestObject('AutomationExercise_Web/Section_Nav_SignUp_Login/Section_SignUP/Section_Account_Information/select_Year'), '2020', false)

