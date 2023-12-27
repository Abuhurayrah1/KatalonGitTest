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

WebUI.setText(findTestObject('Object Repository/1st Month/day 29/29th day test2/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_username'), 
    'badmin')

WebUI.setEncryptedText(findTestObject('Object Repository/1st Month/day 29/29th day test2/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_password'), 
    'CSt51UwWECc=')

WebUI.click(findTestObject('Object Repository/1st Month/day 29/29th day test2/Page_iHealthCure  Hospital Management and I_3c5153/button_Sign In'))

WebUI.click(findTestObject('Object Repository/1st Month/day 29/29th day test2/Page_/div_Performance Execution Time_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/1st Month/day 29/29th day test2/Page_/span_Procedure Management'))

WebUI.click(findTestObject('Object Repository/1st Month/day 29/29th day test2/Page_/span_Procedure Reports'))

WebUI.click(findTestObject('Object Repository/1st Month/day 29/29th day test2/Page_Procedures Report/input__DateRange'))

WebUI.click(findTestObject('Object Repository/1st Month/day 29/29th day test2/Page_Procedures Report/li_Today'))

WebUI.click(findTestObject('Object Repository/1st Month/day 29/29th day test2/Page_Procedures Report/div_Select User'))

WebUI.click(findTestObject('Object Repository/1st Month/day 29/29th day test2/Page_Procedures Report/span_Mr. Muhammad Mudassar'))

WebUI.selectOptionByValue(findTestObject('Object Repository/1st Month/day 29/29th day test2/Page_Procedures Report/select_Select UserMr. Muhammad MudassarMiss_cffc88'), 
    '2654a4df-df02-476e-88aa-cc2c7e592cfb', true)

WebUI.click(findTestObject('Object Repository/1st Month/day 29/29th day test2/Page_Procedures Report/label_OPD'))

WebUI.click(findTestObject('Object Repository/1st Month/day 29/29th day test2/Page_Procedures Report/label_Male'))

WebUI.click(findTestObject('Object Repository/1st Month/day 29/29th day test2/Page_Procedures Report/div_All'))

WebUI.click(findTestObject('Object Repository/1st Month/day 29/29th day test2/Page_Procedures Report/span_Zakat'))

WebUI.selectOptionByValue(findTestObject('Object Repository/1st Month/day 29/29th day test2/Page_Procedures Report/select_AllZakatBait-ul-MalHealth CardFull P_c714bc'), 
    '702f6373-0452-e911-80cb-005056af7162', true)

WebUI.click(findTestObject('Object Repository/1st Month/day 29/29th day test2/Page_Procedures Report/input_Emergency Booking (FOC)_GenerateReport'))

WebUI.closeBrowser()

