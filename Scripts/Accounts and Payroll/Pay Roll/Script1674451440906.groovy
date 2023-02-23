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

WebUI.setText(findTestObject('Object Repository/1st Month/day 22/22nd day test1/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_username'), 
    'badmin')

WebUI.setEncryptedText(findTestObject('Object Repository/1st Month/day 22/22nd day test1/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_password'), 
    'CSt51UwWECc=')

WebUI.click(findTestObject('Object Repository/1st Month/day 22/22nd day test1/Page_iHealthCure  Hospital Management and I_3c5153/button_Sign In'))

WebUI.click(findTestObject('Object Repository/1st Month/day 22/22nd day test1/Page_/span_Accounts  Payroll'))

WebUI.click(findTestObject('Object Repository/1st Month/day 22/22nd day test1/Page_/span_Pay Roll'))

WebUI.click(findTestObject('Object Repository/1st Month/day 22/22nd day test1/Page_Pay Roll/span_Select_select2-selection__arrow'))

WebUI.setText(findTestObject('Object Repository/1st Month/day 22/22nd day test1/Page_Pay Roll/input_Apply_select2-search__field'), 
    '2022')

WebUI.click(findTestObject('Object Repository/1st Month/day 22/22nd day test1/Page_Pay Roll/span_2022-2023'))

WebUI.click(findTestObject('Object Repository/1st Month/day 22/22nd day test1/Page_Pay Roll/span_Select Employee'))

WebUI.setText(findTestObject('Object Repository/1st Month/day 22/22nd day test1/Page_Pay Roll/input_Apply_select2-search__field'), 
    'saj')

WebUI.click(findTestObject('Object Repository/1st Month/day 22/22nd day test1/Page_Pay Roll/ul_82401-2464218-9Mr. Sajid Mehmoodd37405-8_aa4126'))

WebUI.click(findTestObject('1st Month/day 22/22nd day test1/Page_Pay Roll/div_BPS-1'))

WebUI.click(findTestObject('Object Repository/1st Month/day 22/22nd day test1/Page_Pay Roll/div_BPS-1BPS-10BPS-11BPS-12BPS-13BPS-14BPS-_d20168'))

WebUI.click(findTestObject('Object Repository/1st Month/day 22/22nd day test1/Page_Pay Roll/div_Please Select'))

WebUI.click(findTestObject('1st Month/day 22/22nd day test1/Page_Pay Roll/div_Postgraduate Trainee'))

WebUI.click(findTestObject('Object Repository/1st Month/day 22/22nd day test1/Page_Pay Roll/div_Postgraduate TraineeAdditional ChargeHo_192d9d'))

WebUI.click(findTestObject('Object Repository/1st Month/day 22/22nd day test1/Page_Pay Roll/button_Please Select'))

WebUI.click(findTestObject('1st Month/day 22/22nd day test1/Page_Pay Roll/div_User'))

WebUI.click(findTestObject('Object Repository/1st Month/day 22/22nd day test1/Page_Pay Roll/span_User'))

WebUI.click(findTestObject('Object Repository/1st Month/day 22/22nd day test1/Page_Pay Roll/div_User'))

WebUI.click(findTestObject('Object Repository/1st Month/day 22/22nd day test1/Page_Pay Roll/input_Closed_SearchPay'))

WebUI.closeBrowser()

