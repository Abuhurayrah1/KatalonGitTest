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

WebUI.setText(findTestObject('Object Repository/1st Month/day 12/12th day test6/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_username'), 
    'badmin')

WebUI.setEncryptedText(findTestObject('Object Repository/1st Month/day 12/12th day test6/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_password'), 
    'CSt51UwWECc=')

WebUI.click(findTestObject('Object Repository/1st Month/day 12/12th day test6/Page_iHealthCure  Hospital Management and I_3c5153/button_Sign In'))

WebUI.click(findTestObject('Object Repository/1st Month/day 12/12th day test6/Page_/span_Organization Setup'))

WebUI.click(findTestObject('Object Repository/1st Month/day 12/12th day test6/Page_/div_Cheque Printing Vault_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/1st Month/day 12/12th day test6/Page_/span_Airlines'))

WebUI.click(findTestObject('Object Repository/1st Month/day 12/12th day test6/Page_Airlines/button_Airlines'))

WebUI.setText(findTestObject('Object Repository/1st Month/day 12/12th day test6/Page_Airlines/input__Code'), 'ZA')

WebUI.setText(findTestObject('Object Repository/1st Month/day 12/12th day test6/Page_Airlines/input__Name'), 'zeeshan')

WebUI.click(findTestObject('Object Repository/1st Month/day 12/12th day test6/Page_Airlines/button_Select Organization Type'))

WebUI.click(findTestObject('Object Repository/1st Month/day 12/12th day test6/Page_Airlines/span_Armed Forces'))

WebUI.selectOptionByValue(findTestObject('Object Repository/1st Month/day 12/12th day test6/Page_Airlines/select_Select Organization TypeArmed Forces_4fe1ac'), 
    'b0b03d33-e8aa-e711-80c1-a0b3cce147ba', true)

WebUI.setText(findTestObject('Object Repository/1st Month/day 12/12th day test6/Page_Airlines/input__Email'), 'ze@gmail.com')

WebUI.setText(findTestObject('Object Repository/1st Month/day 12/12th day test6/Page_Airlines/input_UAN_UAN'), '111222333')

WebUI.setText(findTestObject('Object Repository/1st Month/day 12/12th day test6/Page_Airlines/input__TelNo'), '051570505050')

WebUI.setText(findTestObject('Object Repository/1st Month/day 12/12th day test6/Page_Airlines/input__CellNoOne'), '03100123456789')

WebUI.setText(findTestObject('Object Repository/1st Month/day 12/12th day test6/Page_Airlines/input__Address'), 'scheme 3')

WebUI.click(findTestObject('Object Repository/1st Month/day 12/12th day test6/Page_Airlines/button_Save'))

WebUI.closeBrowser()

