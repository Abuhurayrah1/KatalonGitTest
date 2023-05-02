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

WebUI.setText(findTestObject('Object Repository/2nd Month/day 15/15th day test14/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_username'), 
    'badmin')

WebUI.setEncryptedText(findTestObject('Object Repository/2nd Month/day 15/15th day test14/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_password'), 
    'CSt51UwWECc=')

WebUI.click(findTestObject('Object Repository/2nd Month/day 15/15th day test14/Page_iHealthCure  Hospital Management and I_3c5153/button_Sign In'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 15/15th day test14/Page_/div_Donor Registration Form_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 15/15th day test14/Page_/div_Donor Registration Form_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 15/15th day test14/Page_/span_Statistics'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 15/15th day test14/Page_/div_Donor Registration Form_ps__rail-y'))

WebUI.waitForElementNotClickable(findTestObject('2nd Month/day 15/15th day test14/Page_/span_PanelEntitle Patients Visits'), 
    20)

WebUI.click(findTestObject('Object Repository/2nd Month/day 15/15th day test14/Page_/span_PanelEntitle Patients Visits'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 15/15th day test14/Page_PanelEntitle Patients Visits Detail/div_Select Organization'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 15/15th day test14/Page_PanelEntitle Patients Visits Detail/span_Cat-IV By Executive Director'))

WebUI.selectOptionByValue(findTestObject('Object Repository/2nd Month/day 15/15th day test14/Page_PanelEntitle Patients Visits Detail/select_Select OrganizationCat-IV By Executi_fb9e12'), 
    '456a6990-1abf-45aa-b3b8-01ce2c4441db', true)

WebUI.click(findTestObject('Object Repository/2nd Month/day 15/15th day test14/Page_PanelEntitle Patients Visits Detail/input_SPD (SUPARCO)_GenerateReport'))

WebUI.closeBrowser()

