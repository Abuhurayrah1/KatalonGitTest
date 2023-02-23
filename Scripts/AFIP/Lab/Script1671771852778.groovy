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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://192.168.88.254:399/Account/LogIn?ReturnUrl=%2f')

WebUI.setText(findTestObject('Object Repository/1st Month/day 4/4thday test3/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_username'), 
    'afipadmin')

WebUI.setEncryptedText(findTestObject('Object Repository/1st Month/day 4/4thday test3/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_password'), 
    'CSt51UwWECc=')

WebUI.click(findTestObject('Object Repository/1st Month/day 4/4thday test3/Page_iHealthCure  Hospital Management and I_3c5153/button_Sign In'))

WebUI.click(findTestObject('1st Month/day 3/3rdday test1/Page_/div_Cheque Printing Vault_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/1st Month/day 4/4thday test3/Page_/span_Lab Investigations'))

WebUI.click(findTestObject('Object Repository/1st Month/day 4/4thday test3/Page_/span_Investigations Queue'))

WebUI.click(findTestObject('Object Repository/1st Month/day 4/4thday test3/Page_Investigations Queue/a_Mr. System Administrator  Dec 23, 2022 10_3421dc'))

WebUI.click(findTestObject('Object Repository/1st Month/day 4/4thday test3/Page_Investigations Queue/button_Collect'))

WebUI.click(findTestObject('Object Repository/1st Month/day 4/4thday test3/Page_Investigations Queue/a_Sample Recieving'))

WebUI.click(findTestObject('Object Repository/1st Month/day 4/4thday test3/Page_Investigations Queue/a_Mr. System Administrator  Dec 23, 2022 10_06ca7c'))

WebUI.click(findTestObject('Object Repository/1st Month/day 4/4thday test3/Page_Investigations Queue/button_Receive'))

WebUI.click(findTestObject('Object Repository/1st Month/day 4/4thday test3/Page_Investigations Queue/a_Result Entry'))

WebUI.click(findTestObject('Object Repository/1st Month/day 4/4thday test3/Page_Investigations Queue/a_Mr. System Administrator  Dec 23, 2022 10_65f829'))

WebUI.setText(findTestObject('Object Repository/1st Month/day 4/4thday test3/Page_Enter Test Result/input_(  5) ugL_numeric0'), '5')

WebUI.click(findTestObject('Object Repository/1st Month/day 4/4thday test3/Page_Enter Test Result/input_Report Preview_Submit'))

WebUI.click(findTestObject('Object Repository/1st Month/day 4/4thday test3/Page_Investigations Queue/a_Registrar Verification'))

WebUI.click(findTestObject('Object Repository/1st Month/day 4/4thday test3/Page_Investigations Queue/a_Mr. System Administrator  Dec 23, 2022 10_e72e31'))

WebUI.click(findTestObject('Object Repository/1st Month/day 4/4thday test3/Page_Review Test Result/button_Select Doctor'))

WebUI.click(findTestObject('Object Repository/1st Month/day 4/4thday test3/Page_Review Test Result/span_Brig Hamid  saeed  Malik  Consultant H_4cf77a'))

WebUI.selectOptionByValue(findTestObject('Object Repository/1st Month/day 4/4thday test3/Page_Review Test Result/select_Select DoctorBrig Hamid  saeed  Mali_b96eeb'), 
    '27fbe905-7c41-420a-9865-7e44f827b3e8', true)

WebUI.click(findTestObject('Object Repository/1st Month/day 4/4thday test3/Page_Review Test Result/input_Report Preview_Submit'))

WebUI.click(findTestObject('Object Repository/1st Month/day 4/4thday test3/Page_Investigations Queue/a_Verified'))

WebUI.closeBrowser()

