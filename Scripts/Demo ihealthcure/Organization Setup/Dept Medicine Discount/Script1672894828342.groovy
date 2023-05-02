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

WebUI.setText(findTestObject('Object Repository/1st Month/day 11/11th day test2/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_username'), 
    'badmin')

WebUI.setEncryptedText(findTestObject('Object Repository/1st Month/day 11/11th day test2/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_password'), 
    'CSt51UwWECc=')

WebUI.click(findTestObject('Object Repository/1st Month/day 11/11th day test2/Page_iHealthCure  Hospital Management and I_3c5153/button_Sign In'))

WebUI.click(findTestObject('Object Repository/1st Month/day 11/11th day test2/Page_/span_Organization Setup'))

WebUI.click(findTestObject('1st Month/day 11/11th day test2/Page_DepartmentMedicineDiscount/div_Cheque Printing Vault_ps__rail-y'))

WebUI.click(findTestObject('Object Repository/1st Month/day 11/11th day test2/Page_/span_Dept Medicine Discount'))

WebUI.click(findTestObject('Object Repository/1st Month/day 11/11th day test2/Page_DepartmentMedicineDiscount/button_Add Medicines Discount'))

WebUI.click(findTestObject('Object Repository/1st Month/day 11/11th day test2/Page_DepartmentMedicineDiscount/div_Please Select Department'))

WebUI.click(findTestObject('Object Repository/1st Month/day 11/11th day test2/Page_DepartmentMedicineDiscount/span_Cath Lab'))

WebUI.click(findTestObject('1st Month/day 11/11th day test2/Page_DepartmentMedicineDiscount/div_Please Select'))

WebUI.click(findTestObject('Object Repository/1st Month/day 11/11th day test2/Page_DepartmentMedicineDiscount/button_Select All'))

WebUI.selectOptionByValue(findTestObject('Object Repository/1st Month/day 11/11th day test2/Page_DepartmentMedicineDiscount/select_Cath Lab'), 
    '32a7b6ce-1408-497b-9412-132d17ecad1d', true)

WebUI.click(findTestObject('Object Repository/1st Month/day 11/11th day test2/Page_DepartmentMedicineDiscount/div_Cath Lab'))

WebUI.click(findTestObject('1st Month/day 11/11th day test2/Page_DepartmentMedicineDiscount/div_Cap asdf (Olopatadine 0.2) 0.125mg'))

WebUI.click(findTestObject('1st Month/day 11/11th day test2/Page_DepartmentMedicineDiscount/span_Cap asdf (Olopatadine 0.2) 0.125mg'))

WebUI.click(findTestObject('1st Month/day 11/11th day test2/Page_DepartmentMedicineDiscount/div_Cap asdf (Olopatadine 0.2) 0.125mg'))

WebUI.click(findTestObject('Object Repository/1st Month/day 11/11th day test2/Page_DepartmentMedicineDiscount/button_Submit'))

WebUI.closeBrowser()

