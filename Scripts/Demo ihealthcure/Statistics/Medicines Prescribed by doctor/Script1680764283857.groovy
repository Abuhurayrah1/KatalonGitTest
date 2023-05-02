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

WebUI.setText(findTestObject('Object Repository/2nd Month/day 15/15th day test11/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_username'), 
    'badmin')

WebUI.setEncryptedText(findTestObject('Object Repository/2nd Month/day 15/15th day test11/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_password'), 
    'CSt51UwWECc=')

WebUI.click(findTestObject('Object Repository/2nd Month/day 15/15th day test11/Page_iHealthCure  Hospital Management and I_3c5153/button_Sign In'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 15/15th day test11/Page_/div_Donor Registration Form_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 15/15th day test11/Page_/div_Donor Registration Form_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 15/15th day test11/Page_/span_Statistics'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 15/15th day test11/Page_/div_Donor Registration Form_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 15/15th day test11/Page_/span_Medicines Prescribed By Doctor'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 15/15th day test11/Page_Medicines Prescribed By Doctor/input__DateRange'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 15/15th day test11/Page_Medicines Prescribed By Doctor/li_Last 30 Days'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 15/15th day test11/Page_Medicines Prescribed By Doctor/div_Select Doctor'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 15/15th day test11/Page_Medicines Prescribed By Doctor/span_Mr. Surgical Booking  Virtual Accounts'))

WebUI.selectOptionByValue(findTestObject('Object Repository/2nd Month/day 15/15th day test11/Page_Medicines Prescribed By Doctor/select_Select DoctorMr. Surgical Booking  V_80893f'), 
    'b63eab0e-d2de-4dc8-9a9d-002b63f564fa', true)

WebUI.click(findTestObject('Object Repository/2nd Month/day 15/15th day test11/Page_Medicines Prescribed By Doctor/button_Select Medicine'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 15/15th day test11/Page_Medicines Prescribed By Doctor/span_Tab Cardnit (Glyceryl Trinitrate) 6.4mg'))

WebUI.selectOptionByValue(findTestObject('Object Repository/2nd Month/day 15/15th day test11/Page_Medicines Prescribed By Doctor/select_Select MedicineTab Cardnit (Glyceryl_4af012'), 
    'a7aba6c8-6289-e811-80be-005056af7162', true)

WebUI.click(findTestObject('Object Repository/2nd Month/day 15/15th day test11/Page_Medicines Prescribed By Doctor/a_Generate Report'))

WebUI.closeBrowser()

