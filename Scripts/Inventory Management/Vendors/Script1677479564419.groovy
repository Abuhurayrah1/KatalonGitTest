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

WebUI.setText(findTestObject('Object Repository/2nd Month/day 4/4th day test3/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_username'), 
    'badmin')

WebUI.setEncryptedText(findTestObject('Object Repository/2nd Month/day 4/4th day test3/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_password'), 
    'CSt51UwWECc=')

WebUI.click(findTestObject('Object Repository/2nd Month/day 4/4th day test3/Page_iHealthCure  Hospital Management and I_3c5153/button_Sign In'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 4/4th day test3/Page_/div_Performance Execution Time_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 4/4th day test3/Page_/span_Inventory Management'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 4/4th day test3/Page_/div_Performance Execution Time_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 4/4th day test3/Page_/span_Vendors'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 4/4th day test3/Page_Vendor/button_Add Vendor'))

WebUI.setText(findTestObject('Object Repository/2nd Month/day 4/4th day test3/Page_Vendor/input__Name'), 'asd')

WebUI.click(findTestObject('Object Repository/2nd Month/day 4/4th day test3/Page_Vendor/span_Vendor'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 4/4th day test3/Page_Vendor/span_Vendor'))

WebUI.setText(findTestObject('Object Repository/2nd Month/day 4/4th day test3/Page_Vendor/input__Address'), 'asd')

WebUI.click(findTestObject('Object Repository/2nd Month/day 4/4th day test3/Page_Vendor/span_Registered'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 4/4th day test3/Page_Vendor/span_Registered'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 4/4th day test3/Page_Vendor/span_Resident'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 4/4th day test3/Page_Vendor/span_Resident'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 4/4th day test3/Page_Vendor/span_Filer'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 4/4th day test3/Page_Vendor/span_Filer'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 4/4th day test3/Page_Vendor/span_Registered_1'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 4/4th day test3/Page_Vendor/span_Registered_1'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 4/4th day test3/Page_Vendor/span_Select Country'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 4/4th day test3/Page_Vendor/ul_Select CountryAfghanistanBelgiumChinaEgy_9ef9bf'))

WebUI.setText(findTestObject('Object Repository/2nd Month/day 4/4th day test3/Page_Vendor/input_concat(id(, , select2-CountryId-resul_4d9bb1'), 
    'p')

WebUI.click(findTestObject('Object Repository/2nd Month/day 4/4th day test3/Page_Vendor/span_Azad Jammu  Kashmir'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 4/4th day test3/Page_Vendor/ul_Please Select State or ProvinceAzad Jamm_b067ff'))

WebUI.setText(findTestObject('Object Repository/2nd Month/day 4/4th day test3/Page_Vendor/input_concat(id(, , select2-CountryId-resul_4d9bb1'), 
    'p')

WebUI.sendKeys(findTestObject('Object Repository/2nd Month/day 4/4th day test3/Page_Vendor/input_concat(id(, , select2-CountryId-resul_4d9bb1'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/2nd Month/day 4/4th day test3/Page_Vendor/input__CNo'), '031000000000000')

WebUI.setText(findTestObject('Object Repository/2nd Month/day 4/4th day test3/Page_Vendor/input__Email'), 'asd@gmail.com')

WebUI.click(findTestObject('Object Repository/2nd Month/day 4/4th day test3/Page_Vendor/input_Please enter a value with valid lengt_02b855'))

WebUI.closeBrowser()

