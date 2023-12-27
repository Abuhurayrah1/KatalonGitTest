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

WebUI.navigateToUrl('https://model.ihealthcure.com/Account/Login')

WebUI.setText(findTestObject('Object Repository/2nd Month/day 10/10th day test1/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_username'), 
    'badmin')

WebUI.setEncryptedText(findTestObject('Object Repository/2nd Month/day 10/10th day test1/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_password'), 
    'CSt51UwWECc=')

WebUI.click(findTestObject('Object Repository/2nd Month/day 10/10th day test1/Page_iHealthCure  Hospital Management and I_3c5153/button_Sign In'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 10/10th day test1/Page_/div_Performance Execution Time_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 10/10th day test1/Page_/div_Performance Execution Time_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 10/10th day test1/Page_/span_Bank Configuration'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 10/10th day test1/Page_/span_Banks'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 10/10th day test1/Page_Banks/button_Add Bank'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 10/10th day test1/Page_Banks/span'))

WebUI.setText(findTestObject('Object Repository/2nd Month/day 10/10th day test1/Page_Banks/input__InsertNametxt'), 'Testing')

WebUI.setText(findTestObject('Object Repository/2nd Month/day 10/10th day test1/Page_Banks/input__InsertCodetxt'), 'asd')

WebUI.setText(findTestObject('Object Repository/2nd Month/day 10/10th day test1/Page_Banks/textarea_Description_InsertDescription'), 
    'asd')

WebUI.setText(findTestObject('Object Repository/2nd Month/day 10/10th day test1/Page_Banks/textarea_Manager Description_ManagerDescription'), 
    'asd')

WebUI.click(findTestObject('Object Repository/2nd Month/day 10/10th day test1/Page_Banks/input_Manager Description_btnInsert'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 10/10th day test1/Page_Banks/a_Testing_Action Update btn btn-sm btn-clea_6c9074'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 10/10th day test1/Page_Banks/input_Manager Description_UpdateButtonId'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 10/10th day test1/Page_Banks/a_Testing_Action Delete btn btn-sm btn-clea_a9ba7f'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 10/10th day test1/Page_Banks/button_Yes'))

WebUI.closeBrowser()

