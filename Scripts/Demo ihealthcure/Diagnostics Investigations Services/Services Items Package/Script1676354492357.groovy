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

WebUI.setText(findTestObject('Object Repository/1st Month/day 29/29th day test14/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_username'), 
    'badmin')

WebUI.setEncryptedText(findTestObject('Object Repository/1st Month/day 29/29th day test14/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_password'), 
    'CSt51UwWECc=')

WebUI.click(findTestObject('Object Repository/1st Month/day 29/29th day test14/Page_iHealthCure  Hospital Management and I_3c5153/button_Sign In'))

WebUI.click(findTestObject('Object Repository/1st Month/day 29/29th day test14/Page_/div_Performance Execution Time_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/1st Month/day 29/29th day test14/Page_/span_Diagnostics Investigations Services'))

WebUI.click(findTestObject('Object Repository/1st Month/day 29/29th day test14/Page_/span_Services Items Package'))

WebUI.click(findTestObject('Object Repository/1st Month/day 29/29th day test14/Page_Service Items Package/button_Add Service Item'))

WebUI.click(findTestObject('Object Repository/1st Month/day 29/29th day test14/Page_Service Items Package/span_Select Store'))

WebUI.click(findTestObject('Object Repository/1st Month/day 29/29th day test14/Page_Service Items Package/ul_Select StoreAcademic Affair StoreAccount_a5b975'))

WebUI.click(findTestObject('Object Repository/1st Month/day 29/29th day test14/Page_Service Items Package/div_Please Select'))

WebUI.click(findTestObject('Object Repository/1st Month/day 29/29th day test14/Page_Service Items Package/span_Coronary Angiography 40 Coronary Angiography'))

WebUI.selectOptionByValue(findTestObject('Object Repository/1st Month/day 29/29th day test14/Page_Service Items Package/select_Please SelectCoronary Angiography 40_0f19e8'), 
    '92c04ddd-5427-ed11-80fa-005056af756c', true)

WebUI.click(findTestObject('Object Repository/1st Month/day 29/29th day test14/Page_Service Items Package/span_Search Item'))

WebUI.setText(findTestObject('Object Repository/1st Month/day 29/29th day test14/Page_Service Items Package/input_concat(id(, , select2-NewMedicineName_c582de'), 
    'a')

WebUI.click(findTestObject('Object Repository/1st Month/day 29/29th day test14/Page_Service Items Package/span_Search Item'))

WebUI.setText(findTestObject('Object Repository/1st Month/day 29/29th day test14/Page_Service Items Package/input__txtQuantity'), 
    '5')

WebUI.click(findTestObject('Object Repository/1st Month/day 29/29th day test14/Page_Service Items Package/button_Add'))

WebUI.closeBrowser()

