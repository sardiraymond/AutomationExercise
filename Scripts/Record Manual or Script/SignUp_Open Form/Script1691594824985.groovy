import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

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

//OPEN BROWSER AND REDIRECT TO URL
WebUI.openBrowser(null)

WebUI.navigateToUrl('https://www.automationexercise.com')


//VERIFY ELEMENT HOMEPAGE / LANDING PAGE
WebUI.verifyElementVisible(findTestObject('Object Repository/AutomationExercise_Web/Navigation Bar/a_Products'))
String TextProduct = WebUI.getText(findTestObject('Object Repository/AutomationExercise_Web/Navigation Bar/a_Products'))
println ('Text from Element:' + TextProduct)

WebUI.verifyElementVisible(findTestObject('Object Repository/AutomationExercise_Web/Navigation Bar/a_Signup  Login'))
String TextSignuplogin = WebUI.getText(findTestObject('Object Repository/AutomationExercise_Web/Navigation Bar/a_Signup  Login'))
println ('Text from Element:' + TextSignuplogin)

WebUI.verifyElementVisible(findTestObject('Object Repository/AutomationExercise_Web/Navigation Bar/a_API Testing'))
String APITesting = WebUI.getText(findTestObject('Object Repository/AutomationExercise_Web/Navigation Bar/a_API Testing'))
println ('Text from Element:' + APITesting)

WebUI.verifyElementVisible(findTestObject('Object Repository/AutomationExercise_Web/Navigation Bar/a_Cart'))
String Cart = WebUI.getText(findTestObject('Object Repository/AutomationExercise_Web/Navigation Bar/a_Cart'))
println ('Text from Element:' + Cart)


//TRIGER OPEN LOGIN / SIGNUP PAGE
WebUI.click(findTestObject('Object Repository/AutomationExercise_Web/Navigation Bar/a_Signup  Login'))

//VERIFY ELEMENT LOGIN /SIGNUPPAGE
// LOGIN SIDE
WebUI.verifyElementVisible(findTestObject('Object Repository/AutomationExercise_Web/Section_Nav_SignUp_Login/h2_Login to your account'))
String TextLoginToYourAccount = WebUI.getText(findTestObject('Object Repository/AutomationExercise_Web/Section_Nav_SignUp_Login/h2_Login to your account'))
	println('Text From Element:' + TextLoginToYourAccount)
	
WebUI.verifyElementVisible(findTestObject('Object Repository/AutomationExercise_Web/Section_Nav_SignUp_Login/input_Login to your account_email'))  //EMAIL FIELD
//String PlaceholderEmail = WebUI.getAttribute(findTestObject('Object Repository/AutomationExercise_Web/Section_Nav_SignUp_Login/input_Login to your account_email'), 'value')
//	println('Text Placeholder Email:' + PlaceholderEmail)
	
WebUI.verifyElementVisible(findTestObject('Object Repository/AutomationExercise_Web/Section_Nav_SignUp_Login/input_Login to your account_password')) //PASSWORD FIELD
//String Placeholderpwd = WebUI.getAttribute(findTestObject('Object Repository/AutomationExercise_Web/Section_Nav_SignUp_Login/input_Login to your account_password'), 'value')
//	println('Text Placeholder pwd:' + Placeholderpwd)

WebUI.verifyElementClickable(findTestObject('Object Repository/AutomationExercise_Web/Section_Nav_SignUp_Login/button_Login'))		//LOGIN BUTTON

//WebUI.closeBrowser()


////SIGNUP SIDE
WebUI.verifyElementVisible(findTestObject('Object Repository/AutomationExercise_Web/Section_Nav_SignUp_Login/input_New User Signup_email'))
WebUI.verifyElementVisible(findTestObject('Object Repository/AutomationExercise_Web/Section_Nav_SignUp_Login/input_New User Signup_name'))

//TRIGER OPEN SIGNUP FORM
WebUI.setText(findTestObject('Object Repository/AutomationExercise_Web/Section_Nav_SignUp_Login/input_New User Signup_name'), 'sukakamu')
WebUI.setText(findTestObject('Object Repository/AutomationExercise_Web/Section_Nav_SignUp_Login/input_New User Signup_email'), 'suka@kamu.com')

//VERIFY INPUTED VALUE ON SIGNUP NAME & EMAIL FIELD
String TextNameSignup = WebUI.getAttribute(findTestObject('AutomationExercise_Web/Section_Nav_SignUp_Login/input_New User Signup_name'), 'value')
println("Text From Element Name: " + TextNameSignup)

String TextEmailSignup = WebUI.getAttribute(findTestObject('AutomationExercise_Web/Section_Nav_SignUp_Login/input_New User Signup_email'), 'value')
println("Teks From Element Email: " + TextEmailSignup)

WebUI.click(findTestObject('Object Repository/AutomationExercise_Web/Section_Nav_SignUp_Login/button_Signup'))


