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

WebUI.setText(findTestObject('Object Repository/1st Month/day 29/29th day test10/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_username'), 
    'badmin')

WebUI.setEncryptedText(findTestObject('Object Repository/1st Month/day 29/29th day test10/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_password'), 
    'CSt51UwWECc=')

WebUI.click(findTestObject('Object Repository/1st Month/day 29/29th day test10/Page_iHealthCure  Hospital Management and I_3c5153/button_Sign In'))

WebUI.click(findTestObject('Object Repository/1st Month/day 29/29th day test10/Page_/div_Performance Execution Time_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/1st Month/day 29/29th day test10/Page_/span_Diagnostics Investigations Services'))

WebUI.click(findTestObject('Object Repository/1st Month/day 29/29th day test10/Page_/span_Services Rate List'))

WebUI.click(findTestObject('Object Repository/1st Month/day 29/29th day test10/Page_Rate List/span_Select Organization'))

WebUI.click(findTestObject('Object Repository/1st Month/day 29/29th day test10/Page_Rate List/ul_Select OrganizationCat-IV By Executive D_8e94a2'))

WebUI.click(findTestObject('Object Repository/1st Month/day 29/29th day test10/Page_Rate List/div_Select Package'))

WebUI.click(findTestObject('Object Repository/1st Month/day 29/29th day test10/Page_Rate List/span_testing m'))

WebUI.selectOptionByValue(findTestObject('Object Repository/1st Month/day 29/29th day test10/Page_Rate List/select_Select Packagetesting mtest'), 
    '4068b473-d354-46b2-9de4-458e76e864e1', true)

WebUI.setText(findTestObject('Object Repository/1st Month/day 29/29th day test10/Page_Rate List/input_Services_select2-search__field'), 
    'asd')

WebUI.click(findTestObject('Object Repository/1st Month/day 29/29th day test10/Page_Rate List/div_Select Service Type'))

WebUI.click(findTestObject('Object Repository/1st Month/day 29/29th day test10/Page_Rate List/span_Admission'))

WebUI.selectOptionByValue(findTestObject('Object Repository/1st Month/day 29/29th day test10/Page_Rate List/select_Select Service TypeAdmissionPhysioth_c6112e'), 
    '281a6ce7-e580-e811-80be-005056af7162', true)

WebUI.closeBrowser()

