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

WebUI.callTestCase(findTestCase('Record Manual or Script/SignUp_Open Form'), [:], FailureHandling.STOP_ON_FAILURE)

//VERIFY ON SIGNUP FORM
//SECTION ACCOUNT INFORMATION
WebUI.verifyElementVisible(findTestObject('Object Repository/AutomationExercise_Web/Section_Nav_SignUp_Login/Section_SignUP/Section_Account_Information/b_Enter Account Information'))

//TITLE SECTION (RADIOBUTTONS)
//VERIFY TEXT 
WebUI.verifyElementText(findTestObject('AutomationExercise_Web/Section_Nav_SignUp_Login/Section_SignUP/Section_Account_Information/label_Title'), 
    'Title')

WebUI.verifyElementText(findTestObject('Object Repository/AutomationExercise_Web/Section_Nav_SignUp_Login/Section_SignUP/Section_Account_Information/label_Mr'), 
    'Mr.')

WebUI.verifyElementText(findTestObject('Object Repository/AutomationExercise_Web/Section_Nav_SignUp_Login/Section_SignUP/Section_Account_Information/label_Mrs'), 
    'Mrs.')

//TRIGER RADIOBUTTONS & CHECK OR VERIF
//RADIOBUTTONS MR
WebUI.verifyElementClickable(findTestObject('Object Repository/AutomationExercise_Web/Section_Nav_SignUp_Login/Section_SignUP/Section_Account_Information/input_Mr_title'))
WebUI.click(findTestObject('Object Repository/AutomationExercise_Web/Section_Nav_SignUp_Login/Section_SignUP/Section_Account_Information/input_Mr_title'))
WebUI.check(findTestObject('Object Repository/AutomationExercise_Web/Section_Nav_SignUp_Login/Section_SignUP/Section_Account_Information/input_Mr_title'))
println ("clicked and checked 'Mr.' title input element")

//RADIOBUTTON MRS
WebUI.verifyElementClickable(findTestObject('Object Repository/AutomationExercise_Web/Section_Nav_SignUp_Login/Section_SignUP/Section_Account_Information/input_Mrs_title'))
WebUI.click(findTestObject('Object Repository/AutomationExercise_Web/Section_Nav_SignUp_Login/Section_SignUP/Section_Account_Information/input_Mrs_title'))
WebUI.check(findTestObject('Object Repository/AutomationExercise_Web/Section_Nav_SignUp_Login/Section_SignUP/Section_Account_Information/input_Mrs_title'))
println ("clicked and checked 'Mrs.' title input element")

//FIELD NAME, EMAIL & PASSWORD
String TextInputname = WebUI.getText(findTestObject('Object Repository/AutomationExercise_Web/Section_Nav_SignUp_Login/Section_SignUP/Section_Account_Information/input_name2'))
println('Teks dari elemen input: ' + TextInputname)

String TextInputEmail = WebUI.getText(findTestObject('Object Repository/AutomationExercise_Web/Section_Nav_SignUp_Login/Section_SignUP/Section_Account_Information/input_email2'))
println('Teks dari elemen input: ' + TextInputEmail)

WebUI.setText(findTestObject('AutomationExercise_Web/Section_Nav_SignUp_Login/Section_SignUP/Section_Account_Information/input__password'), 'P@ssw0rd')
//String TextPwd = WebUI.getAttribute(findTestObject('AutomationExercise_Web/Section_Nav_SignUp_Login/Section_SignUP/Section_Account_Information/input__password'))
//	println('text inputted :' + Textpwd)

//DATE OF BIRTH

WebUI.selectOptionByIndex(findTestObject('Object Repository/AutomationExercise_Web/Section_Nav_SignUp_Login/Section_SignUP/Section_Account_Information/select_Day'), '20', FailureHandling.STOP_ON_FAILURE)
//String SelectDay = WebUI.selectOptionByIndex(findTestObject('Object Repository/AutomationExercise_Web/Section_Nav_SignUp_Login/Section_SignUP/Section_Account_Information/select_Day'))

WebUI.selectOptionByValue(findTestObject('AutomationExercise_Web/Section_Nav_SignUp_Login/Section_SignUP/Section_Account_Information/select_Month'), '3', false)
//String SelectMonth = WebUI.selectOptionByValue(findTestObject('AutomationExercise_Web/Section_Nav_SignUp_Login/Section_SignUP/Section_Account_Information/select_Month'))

WebUI.selectOptionByLabel(findTestObject('AutomationExercise_Web/Section_Nav_SignUp_Login/Section_SignUP/Section_Account_Information/select_Year'), '2020', false)
//String SelectYears = WebUI.selectOptionByLabel(findTestObject('AutomationExercise_Web/Section_Nav_SignUp_Login/Section_SignUP/Section_Account_Information/select_Year'))

//println('Day Selected: ' + SelectDay)
//println('Month Selected: ' + SelectMonth)
//println('year Selected: ' + SelectYears)

WebUI.closeBrowser()

