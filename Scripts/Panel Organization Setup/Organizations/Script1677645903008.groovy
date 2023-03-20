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

WebUI.setText(findTestObject('Object Repository/2nd Month/day 6/6th day test1/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_username'), 
    'badmin')

WebUI.setEncryptedText(findTestObject('Object Repository/2nd Month/day 6/6th day test1/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_password'), 
    'CSt51UwWECc=')

WebUI.click(findTestObject('Object Repository/2nd Month/day 6/6th day test1/Page_iHealthCure  Hospital Management and I_3c5153/button_Sign In'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 6/6th day test1/Page_/div_Performance Execution Time_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 6/6th day test1/Page_/span_Panel Organization Setup'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 6/6th day test1/Page_/div_Performance Execution Time_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 6/6th day test1/Page_/span_Organizations'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 6/6th day test1/Page_Organizations/button_Add Organization'))

WebUI.setText(findTestObject('Object Repository/2nd Month/day 6/6th day test1/Page_Organizations/input__name'), 'asd')

WebUI.setText(findTestObject('Object Repository/2nd Month/day 6/6th day test1/Page_Organizations/input__code'), '001')

WebUI.click(findTestObject('Object Repository/2nd Month/day 6/6th day test1/Page_Organizations/div_Select Organization Category'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 6/6th day test1/Page_Organizations/span_Government'))

WebUI.selectOptionByValue(findTestObject('Object Repository/2nd Month/day 6/6th day test1/Page_Organizations/select_Select Organization CategoryArmed Fo_d67935'), 
    '23d9cefa-cc6e-e811-80bc-005056af7162', true)

WebUI.click(findTestObject('Object Repository/2nd Month/day 6/6th day test1/Page_Organizations/div_Select Organization Type'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 6/6th day test1/Page_Organizations/div_Select Organization Type'))

WebUI.setText(findTestObject('Object Repository/2nd Month/day 6/6th day test1/Page_Organizations/input__Email'), 'asd@gmail.com')

WebUI.setText(findTestObject('Object Repository/2nd Month/day 6/6th day test1/Page_Organizations/input__telno'), '0511234567')

WebUI.setText(findTestObject('Object Repository/2nd Month/day 6/6th day test1/Page_Organizations/input__cellnoone'), '03001234567')

WebUI.click(findTestObject('Object Repository/2nd Month/day 6/6th day test1/Page_Organizations/span_Select Country'))

WebUI.setText(findTestObject('Object Repository/2nd Month/day 6/6th day test1/Page_Organizations/input_Set Waiting Time_select2-search__field'), 
    'p')

WebUI.click(findTestObject('Object Repository/2nd Month/day 6/6th day test1/Page_Organizations/ul_Select CountryAfghanistanBelgiumChinaEgy_9ef9bf'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 6/6th day test1/Page_Organizations/span_Pakistan_1'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 6/6th day test1/Page_Organizations/span_Punjab'))

WebUI.click(findTestObject('Object Repository/2nd Month/day 6/6th day test1/Page_Organizations/span_Punjab'))

WebUI.setText(findTestObject('Object Repository/2nd Month/day 6/6th day test1/Page_Organizations/input__address'), 'asd')

WebUI.click(findTestObject('Object Repository/2nd Month/day 6/6th day test1/Page_Organizations/button_Submit'))

WebUI.closeBrowser()

