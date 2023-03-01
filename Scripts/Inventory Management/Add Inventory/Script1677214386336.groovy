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

WebUI.setText(findTestObject('Object Repository/2nd Month/day 3/3rd day test4/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_username'), 
    'badmin')

WebUI.setEncryptedText(findTestObject('Object Repository/2nd Month/day 3/3rd day test4/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_password'), 
    'CSt51UwWECc=')

WebUI.click(findTestObject('Object Repository/2nd Month/day 3/3rd day test4/Page_iHealthCure  Hospital Management and I_3c5153/button_Sign In'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 3/3rd day test4/Page_/div_Performance Execution Time_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 3/3rd day test4/Page_/span_Inventory Management'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 3/3rd day test4/Page_/span_Add Inventory'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 3/3rd day test4/Page_Add Inventory/button_Add Inventory'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 3/3rd day test4/Page_Add Inventory/span_Select Vendor'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 3/3rd day test4/Page_Add Inventory/ul_Select VendorSunny EnterprisesMedequips _c73914'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 3/3rd day test4/Page_Add Inventory/span_Regular'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 3/3rd day test4/Page_Add Inventory/span_RegularDonationCNEfgegadasd'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 3/3rd day test4/Page_Add Inventory/span_Search Item'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 3/3rd day test4/Page_Add Inventory/ul_Searching Oxygenator Small  Adults -  0 _f4545a'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 3/3rd day test4/Page_Add Inventory/input__ManufacturingDate'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 3/3rd day test4/Page_Add Inventory/td_23'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 3/3rd day test4/Page_Add Inventory/input__ExpiryDate'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 3/3rd day test4/Page_Add Inventory/td_11'))

WebUI.setText(findTestObject('Object Repository/2nd Month/day 3/3rd day test4/Page_Add Inventory/input__UnitSellingPrice'), 
    '1950')

WebUI.click(findTestObject('Object Repository/2nd Month/day 3/3rd day test4/Page_Add Inventory/span_Please Select Store'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 3/3rd day test4/Page_Add Inventory/ul_Please Select StoreAcademic Affair Store_6aba86'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 3/3rd day test4/Page_Add Inventory/button_Add'))

WebUI.closeBrowser()

