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

WebUI.setText(findTestObject('Object Repository/2nd Month/day 15/15th day test3/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_username'), 
    'badmin')

WebUI.setEncryptedText(findTestObject('Object Repository/2nd Month/day 15/15th day test3/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_password'), 
    'CSt51UwWECc=')

WebUI.click(findTestObject('Object Repository/2nd Month/day 15/15th day test3/Page_iHealthCure  Hospital Management and I_3c5153/button_Sign In'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 15/15th day test3/Page_/div_Donor Registration Form_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 15/15th day test3/Page_/div_Donor Registration Form_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 15/15th day test3/Page_/span_Statistics'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 15/15th day test3/Page_/div_Donor Registration Form_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 15/15th day test3/Page_/span_ADT IPD Stats'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 15/15th day test3/Page_ADT IPD Stats/input__DateRange'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 15/15th day test3/Page_ADT IPD Stats/li_Last 30 Days'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 15/15th day test3/Page_ADT IPD Stats/div_Select Department Category'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 15/15th day test3/Page_ADT IPD Stats/span_Cardiology(Dept)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/2nd Month/day 15/15th day test3/Page_ADT IPD Stats/select_Select Department CategoryCardiology_3faef8'), 
    '9024acb1-a706-45ed-a746-57ccb0e5ad93', true)

WebUI.click(findTestObject('Object Repository/2nd Month/day 15/15th day test3/Page_ADT IPD Stats/input_Department_GenerateReport'))

WebUI.closeBrowser()

