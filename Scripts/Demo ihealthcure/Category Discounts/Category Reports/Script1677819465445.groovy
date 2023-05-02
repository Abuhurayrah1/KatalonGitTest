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

WebUI.setText(findTestObject('Object Repository/2nd Month/day 7/7th day test2/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_username'), 
    'badmin')

WebUI.setEncryptedText(findTestObject('Object Repository/2nd Month/day 7/7th day test2/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_password'), 
    'CSt51UwWECc=')

WebUI.click(findTestObject('Object Repository/2nd Month/day 7/7th day test2/Page_iHealthCure  Hospital Management and I_3c5153/button_Sign In'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 7/7th day test2/Page_/div_Performance Execution Time_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 7/7th day test2/Page_/div_Performance Execution Time_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 7/7th day test2/Page_/span_Category Discounts'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 7/7th day test2/Page_/span_Category Reports'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 7/7th day test2/Page_Category Reports/input__DateRange'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 7/7th day test2/Page_Category Reports/li_Last 30 Days'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 7/7th day test2/Page_Category Reports/div_Select Patient Category'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 7/7th day test2/Page_Category Reports/span_Cat-II'))

WebUI.selectOptionByValue(findTestObject('Object Repository/2nd Month/day 7/7th day test2/Page_Category Reports/select_Select Patient CategoryCat-IICat-III_86b4eb'), 
    'c2bbc30b-336e-47c2-a8ae-33790fdd3537', true)

WebUI.click(findTestObject('Object Repository/2nd Month/day 7/7th day test2/Page_Category Reports/div_Select State or Province'))

WebUI.setText(findTestObject('Object Repository/2nd Month/day 7/7th day test2/Page_Category Reports/input_Select State or Province_form-control'), 
    'pu')

WebUI.click(findTestObject('Object Repository/2nd Month/day 7/7th day test2/Page_Category Reports/span_Punjab'))

WebUI.selectOptionByValue(findTestObject('Object Repository/2nd Month/day 7/7th day test2/Page_Category Reports/select_Select State or ProvinceUnknownAzad _a2d790'), 
    'a4ac3d33-e8aa-e711-80c1-a0b3cce147ba', true)

WebUI.click(findTestObject('Object Repository/2nd Month/day 7/7th day test2/Page_Category Reports/div_Select City'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 7/7th day test2/Page_Category Reports/span_Rawalpindi'))

WebUI.selectOptionByValue(findTestObject('Object Repository/2nd Month/day 7/7th day test2/Page_Category Reports/select_Select CityMuzafarabadWahJehlumKusur_e99f7a'), 
    'b9ad3d33-e8aa-e711-80c1-a0b3cce147ba', true)

WebUI.click(findTestObject('Object Repository/2nd Month/day 7/7th day test2/Page_Category Reports/a_Generate Report'))

WebUI.closeBrowser()

