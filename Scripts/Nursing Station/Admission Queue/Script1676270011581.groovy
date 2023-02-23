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

WebUI.setText(findTestObject('Object Repository/1st Month/day 28/28th day test2/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_username'), 
    'badmin')

WebUI.setEncryptedText(findTestObject('Object Repository/1st Month/day 28/28th day test2/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_password'), 
    'CSt51UwWECc=')

WebUI.click(findTestObject('Object Repository/1st Month/day 28/28th day test2/Page_iHealthCure  Hospital Management and I_3c5153/button_Sign In'))

WebUI.click(findTestObject('Object Repository/1st Month/day 28/28th day test2/Page_/div_Performance Execution Time_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/1st Month/day 28/28th day test2/Page_/span_Nursing Station'))

WebUI.click(findTestObject('Object Repository/1st Month/day 28/28th day test2/Page_/span_Admission Queue'))

WebUI.click(findTestObject('Object Repository/1st Month/day 28/28th day test2/Page_Admission Queue/div_All (Admission Queue)'))

WebUI.click(findTestObject('Object Repository/1st Month/day 28/28th day test2/Page_Admission Queue/div_All (Admission Queue)'))

WebUI.click(findTestObject('Object Repository/1st Month/day 28/28th day test2/Page_Admission Queue/a_'))

WebUI.click(findTestObject('Object Repository/1st Month/day 28/28th day test2/Page_Admission Queue/div_Select Building'))

WebUI.click(findTestObject('Object Repository/1st Month/day 28/28th day test2/Page_Admission Queue/a_Select Building'))

WebUI.click(findTestObject('Object Repository/1st Month/day 28/28th day test2/Page_Admission Queue/div_Select Building First'))

WebUI.click(findTestObject('Object Repository/1st Month/day 28/28th day test2/Page_Admission Queue/span_Select Building First'))

WebUI.click(findTestObject('Object Repository/1st Month/day 28/28th day test2/Page_Admission Queue/div_Select Floor First'))

WebUI.click(findTestObject('Object Repository/1st Month/day 28/28th day test2/Page_Admission Queue/span_Select Floor First'))

WebUI.click(findTestObject('Object Repository/1st Month/day 28/28th day test2/Page_Admission Queue/button_Bed_btnCloseBedModal'))

WebUI.click(findTestObject('Object Repository/1st Month/day 28/28th day test2/Page_Admission Queue/a__PateintMedicalRecordModal service-grid b_64bbde'))

WebUI.click(findTestObject('Object Repository/1st Month/day 28/28th day test2/Page_Admission Queue/input_Yes_5bbf356e-e809-ed11-80fa-005056af756c'))

WebUI.click(findTestObject('Object Repository/1st Month/day 28/28th day test2/Page_Admission Queue/td_Yes      No'))

WebUI.click(findTestObject('Object Repository/1st Month/day 28/28th day test2/Page_Admission Queue/label_Yes'))

WebUI.click(findTestObject('Object Repository/1st Month/day 28/28th day test2/Page_Admission Queue/button_Submit'))

WebUI.click(findTestObject('Object Repository/1st Month/day 28/28th day test2/Page_Admission Queue/div_Select Head Nurse'))

WebUI.click(findTestObject('Object Repository/1st Month/day 28/28th day test2/Page_Admission Queue/span_Miss Jacinta Inayat  Head Nurse'))

WebUI.selectOptionByValue(findTestObject('Object Repository/1st Month/day 28/28th day test2/Page_Admission Queue/select_Select Head NurseMiss Jacinta Inayat_1b665a'), 
    '15a12da3-e9bc-4a15-b1e8-d9cdd373c328', true)

WebUI.click(findTestObject('Object Repository/1st Month/day 28/28th day test2/Page_Admission Queue/button_Submit'))

WebUI.closeBrowser()

