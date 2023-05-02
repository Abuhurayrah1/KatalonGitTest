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

WebUI.setText(findTestObject('Object Repository/2nd Month/day 3/3rd day test1/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_username'), 
    'badmin')

WebUI.setEncryptedText(findTestObject('Object Repository/2nd Month/day 3/3rd day test1/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_password'), 
    'CSt51UwWECc=')

WebUI.click(findTestObject('Object Repository/2nd Month/day 3/3rd day test1/Page_iHealthCure  Hospital Management and I_3c5153/button_Sign In'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 3/3rd day test1/Page_/div_Performance Execution Time_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 3/3rd day test1/Page_/span_Stores Management'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 3/3rd day test1/Page_/div_Performance Execution Time_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 3/3rd day test1/Page_/div_Performance Execution Time_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 3/3rd day test1/Page_/span_Stores Managements'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 3/3rd day test1/Page_Store Management/button_Add Store'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 3/3rd day test1/Page_Store Management/div_Select Store Type'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 3/3rd day test1/Page_Store Management/span_Main Store'))

WebUI.selectOptionByValue(findTestObject('Object Repository/2nd Month/day 3/3rd day test1/Page_Store Management/select_Select Store TypeSub StoreMain Store'), 
    'f001c801-2c42-e711-80c0-a0b3cce147ba', true)

WebUI.click(findTestObject('Object Repository/2nd Month/day 3/3rd day test1/Page_Store Management/span_Inventory'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 3/3rd day test1/Page_Store Management/span_Inventory'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 3/3rd day test1/Page_Store Management/span_Select Building'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 3/3rd day test1/Page_Store Management/ul_Select BuildingAzeemFirst FloorGround Fl_6b6978'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 3/3rd day test1/Page_Store Management/span_First'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 3/3rd day test1/Page_Store Management/span_First'))

WebUI.setText(findTestObject('Object Repository/2nd Month/day 3/3rd day test1/Page_Store Management/input__FullName'), 'asd')

WebUI.click(findTestObject('Object Repository/2nd Month/day 3/3rd day test1/Page_Store Management/span_Branch Wise'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 3/3rd day test1/Page_Store Management/span_Branch Wise'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 3/3rd day test1/Page_Store Management/span_Store Wise'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 3/3rd day test1/Page_Store Management/input_Rawalpindi_Send'))

WebUI.closeBrowser()

