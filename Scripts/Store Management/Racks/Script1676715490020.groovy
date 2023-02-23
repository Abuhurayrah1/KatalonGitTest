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

WebUI.navigateToUrl('http://demo.ihealthcure.com/Account/LogIn?ReturnUrl=%2f')

WebUI.setText(findTestObject('Object Repository/2nd Month/day 2/2nd day test27/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_username'), 
    'badmin')

WebUI.setEncryptedText(findTestObject('Object Repository/2nd Month/day 2/2nd day test27/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_password'), 
    'CSt51UwWECc=')

WebUI.click(findTestObject('Object Repository/2nd Month/day 2/2nd day test27/Page_iHealthCure  Hospital Management and I_3c5153/button_Sign In'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 2/2nd day test27/Page_/div_Performance Execution Time_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 2/2nd day test27/Page_/span_Stores Management'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 2/2nd day test27/Page_/div_Performance Execution Time_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 2/2nd day test27/Page_/span_Racks'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 2/2nd day test27/Page_Racks/button_Add Racks'))

WebUI.setText(findTestObject('Object Repository/2nd Month/day 2/2nd day test27/Page_Racks/input__RackName'), 'asd')

WebUI.click(findTestObject('Object Repository/2nd Month/day 2/2nd day test27/Page_Racks/span_Select Store'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 2/2nd day test27/Page_Racks/ul_Select StoreAcademic Affair StoreAccount_a5b975'))

WebUI.setText(findTestObject('Object Repository/2nd Month/day 2/2nd day test27/Page_Racks/input__Location'), 'asd')

WebUI.setText(findTestObject('Object Repository/2nd Month/day 2/2nd day test27/Page_Racks/input__Rows'), '5')

WebUI.setText(findTestObject('Object Repository/2nd Month/day 2/2nd day test27/Page_Racks/input__Cols'), '5')

WebUI.click(findTestObject('Object Repository/2nd Month/day 2/2nd day test27/Page_Racks/button_Submit'))

WebUI.closeBrowser()

