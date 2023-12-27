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

WebUI.setText(findTestObject('Object Repository/2nd Month/day 2/2nd day test28/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_username'), 
    'badmin')

WebUI.setEncryptedText(findTestObject('Object Repository/2nd Month/day 2/2nd day test28/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_password'), 
    'CSt51UwWECc=')

WebUI.click(findTestObject('Object Repository/2nd Month/day 2/2nd day test28/Page_iHealthCure  Hospital Management and I_3c5153/button_Sign In'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 2/2nd day test28/Page_/div_Performance Execution Time_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 2/2nd day test28/Page_/span_Stores Management'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 2/2nd day test28/Page_/div_Performance Execution Time_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 2/2nd day test28/Page_/span_Rack Drawers'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 2/2nd day test28/Page_Rack Drawers/button_Add Rack Drawers'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 2/2nd day test28/Page_Rack Drawers/span_Select Store'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 2/2nd day test28/Page_Rack Drawers/ul_Select StoreAcademic Affair StoreAccount_a5b975'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 2/2nd day test28/Page_Rack Drawers/span_Select Rack'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 2/2nd day test28/Page_Rack Drawers/span_Select Rackasd'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 2/2nd day test28/Page_Rack Drawers/span_Select Row'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 2/2nd day test28/Page_Rack Drawers/span_Select RowRow 1Row 2Row 3Row 4Row 5'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 2/2nd day test28/Page_Rack Drawers/span_Select Rack_1'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 2/2nd day test28/Page_Rack Drawers/span_Select RackColumn 1Column 2Column 3Col_d30228'))

WebUI.setText(findTestObject('Object Repository/2nd Month/day 2/2nd day test28/Page_Rack Drawers/input__Name'), 'asd')

WebUI.click(findTestObject('Object Repository/2nd Month/day 2/2nd day test28/Page_Rack Drawers/input_Description_SubmitId'))

WebUI.closeBrowser()

