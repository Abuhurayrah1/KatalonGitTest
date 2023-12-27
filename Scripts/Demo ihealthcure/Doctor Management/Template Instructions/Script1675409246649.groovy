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

WebUI.setText(findTestObject('Object Repository/1st Month/day 26/26th day test21/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_username'), 
    'badmin')

WebUI.setEncryptedText(findTestObject('Object Repository/1st Month/day 26/26th day test21/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_password'), 
    'CSt51UwWECc=')

WebUI.click(findTestObject('Object Repository/1st Month/day 26/26th day test21/Page_iHealthCure  Hospital Management and I_3c5153/button_Sign In'))

WebUI.doubleClick(findTestObject('Object Repository/1st Month/day 26/26th day test21/Page_/div_Performance Execution Time_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/1st Month/day 26/26th day test21/Page_/span_Template Instructions'))

WebUI.click(findTestObject('Object Repository/1st Month/day 26/26th day test21/Page_Template Instruction/div_Please Select User Template'))

WebUI.click(findTestObject('Object Repository/1st Month/day 26/26th day test21/Page_Template Instruction/span_ACS Discharge (Dr. Muhammad Asif Iqbal)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/1st Month/day 26/26th day test21/Page_Template Instruction/select_ACS Discharge (Dr. Muhammad Asif Iqb_af08b6'), 
    '8de3664e-fa6f-4ed7-bc49-a23537fc5ed8', true)

WebUI.click(findTestObject('Object Repository/1st Month/day 26/26th day test21/Page_Template Instruction/div_Please Select Instructions'))

WebUI.click(findTestObject('Object Repository/1st Month/day 26/26th day test21/Page_Template Instruction/span_Avoid Red Meat, Oil, Cream And Fatty Foods'))

WebUI.click(findTestObject('Object Repository/1st Month/day 26/26th day test21/Page_Template Instruction/div_Please Select Instructions'))

WebUI.click(findTestObject('Object Repository/1st Month/day 26/26th day test21/Page_Template Instruction/button_Submit'))

WebUI.closeBrowser()

