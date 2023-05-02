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

WebUI.setText(findTestObject('Object Repository/2nd Month/day 2/2nd day test2/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_username'), 
    'badmin')

WebUI.setEncryptedText(findTestObject('Object Repository/2nd Month/day 2/2nd day test2/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_password'), 
    'CSt51UwWECc=')

WebUI.click(findTestObject('Object Repository/2nd Month/day 2/2nd day test2/Page_iHealthCure  Hospital Management and I_3c5153/button_Sign In'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 2/2nd day test2/Page_/div_Performance Execution Time_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 2/2nd day test2/Page_/span_Medicines  Disposables'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 2/2nd day test2/Page_/div_Performance Execution Time_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 2/2nd day test2/Page_/span_Medicine Favourite Group'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 2/2nd day test2/Page_Medicine Favourite Group/button_Add Medicine Favourite Group'))

WebUI.setText(findTestObject('Object Repository/2nd Month/day 2/2nd day test2/Page_Medicine Favourite Group/input__Name'), 
    'asd')

WebUI.click(findTestObject('Object Repository/2nd Month/day 2/2nd day test2/Page_Medicine Favourite Group/div_Select Doctor'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 2/2nd day test2/Page_Medicine Favourite Group/span_Dr. Abdul Malik  Associate Professor O_baf57c'))

WebUI.selectOptionByValue(findTestObject('Object Repository/2nd Month/day 2/2nd day test2/Page_Medicine Favourite Group/select_Select DoctorDr. Aasifa Siddiqa  Ass_56dbc1'), 
    'b9e45666-1398-40b6-b450-4183d3b11caf', true)

WebUI.click(findTestObject('Object Repository/2nd Month/day 2/2nd day test2/Page_Medicine Favourite Group/div_Please Select'))

WebUI.setText(findTestObject('Object Repository/2nd Month/day 2/2nd day test2/Page_Medicine Favourite Group/input_Please Select_form-control'), 
    '')

WebUI.click(findTestObject('Object Repository/2nd Month/day 2/2nd day test2/Page_Medicine Favourite Group/div_Please Select'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 2/2nd day test2/Page_Medicine Favourite Group/input_Description_SubmitId'))

WebUI.closeBrowser()

