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

WebUI.setText(findTestObject('Object Repository/1st Month/day 9/9th day test9/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_username'), 
    'badmin')

WebUI.setEncryptedText(findTestObject('Object Repository/1st Month/day 9/9th day test9/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_password'), 
    'CSt51UwWECc=')

WebUI.click(findTestObject('Object Repository/1st Month/day 9/9th day test9/Page_iHealthCure  Hospital Management and I_3c5153/button_Sign In'))

WebUI.click(findTestObject('Object Repository/1st Month/day 9/9th day test9/Page_/span_Organization Setup'))

WebUI.click(findTestObject('Object Repository/1st Month/day 9/9th day test9/Page_/span_Sub Services'))

WebUI.click(findTestObject('Object Repository/1st Month/day 9/9th day test9/Page_Sub Services/button_Add Sub Service'))

WebUI.click(findTestObject('Object Repository/1st Month/day 9/9th day test9/Page_Sub Services/div_Please Select'))

WebUI.click(findTestObject('Object Repository/1st Month/day 9/9th day test9/Page_Sub Services/span_Cardiology'))

WebUI.click(findTestObject('Object Repository/1st Month/day 9/9th day test9/Page_Sub Services/div_Cardiology'))

WebUI.click(findTestObject('Object Repository/1st Month/day 9/9th day test9/Page_Sub Services/div_Select Service'))

WebUI.click(findTestObject('Object Repository/1st Month/day 9/9th day test9/Page_Sub Services/span_Investigations'))

WebUI.selectOptionByValue(findTestObject('Object Repository/1st Month/day 9/9th day test9/Page_Sub Services/select_Select ServiceAdmissionPhysiotherapy_d1162f'), 
    '06ec9bcc-0cff-4bd6-95ca-4a4c577f4924', true)

WebUI.setText(findTestObject('Object Repository/1st Month/day 9/9th day test9/Page_Sub Services/input__Name'), 'test sub service 01')

WebUI.setText(findTestObject('Object Repository/1st Month/day 9/9th day test9/Page_Sub Services/input_CPT Code_Code'), '0011')

WebUI.setText(findTestObject('Object Repository/1st Month/day 9/9th day test9/Page_Sub Services/input_Description_Description'), '01/03/2023')

WebUI.setText(findTestObject('Object Repository/1st Month/day 9/9th day test9/Page_Sub Services/input_Sample Code_SampleCollectionCode'), 
    '0011')

WebUI.click(findTestObject('Object Repository/1st Month/day 9/9th day test9/Page_Sub Services/button_Select Specimen'))

WebUI.click(findTestObject('Object Repository/1st Month/day 9/9th day test9/Page_Sub Services/span_012-C-80 Peritoneal fluid ( Labeled as_11a8b6'))

WebUI.selectOptionByValue(findTestObject('Object Repository/1st Month/day 9/9th day test9/Page_Sub Services/select_Select SpecimenNAME Hydatid cyst012-_430742'), 
    'e10342e9-cd59-4643-bacd-e22be9e1eb49', true)

WebUI.click(findTestObject('Object Repository/1st Month/day 9/9th day test9/Page_Sub Services/div_Select Specimen Container'))

WebUI.click(findTestObject('Object Repository/1st Month/day 9/9th day test9/Page_Sub Services/span_Blue Stool Container'))

WebUI.selectOptionByValue(findTestObject('Object Repository/1st Month/day 9/9th day test9/Page_Sub Services/select_Select Specimen ContainerBlue Stool _1bd4dc'), 
    'c37b4d06-b741-ea11-80d4-000c296575d1', true)

WebUI.setText(findTestObject('Object Repository/1st Month/day 9/9th day test9/Page_Sub Services/input_Specimen Quantity_SpecimenQuantity'), 
    '1')

WebUI.click(findTestObject('Object Repository/1st Month/day 9/9th day test9/Page_Sub Services/div_Select Test Method'))

WebUI.click(findTestObject('Object Repository/1st Month/day 9/9th day test9/Page_Sub Services/span_24 hrs. creatinine clearance'))

WebUI.selectOptionByValue(findTestObject('Object Repository/1st Month/day 9/9th day test9/Page_Sub Services/select_Select Test Method24 hrs. creatinine_350910'), 
    'ca4c5159-a99d-4c92-ba48-5d2f30fd459d', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/1st Month/day 9/9th day test9/Page_Sub Services/select_EquipmentService'), '732f6373-0452-e911-80cb-005056af7162', 
    true)

WebUI.click(findTestObject('Object Repository/1st Month/day 9/9th day test9/Page_Sub Services/div_Service'))

WebUI.setText(findTestObject('Object Repository/1st Month/day 9/9th day test9/Page_Sub Services/input__Amount'), '0')

WebUI.click(findTestObject('Object Repository/1st Month/day 9/9th day test9/Page_Sub Services/div_Select Department'))

WebUI.setText(findTestObject('Object Repository/1st Month/day 9/9th day test9/Page_Sub Services/input_Select Department_form-control'), 
    'test')

WebUI.click(findTestObject('Object Repository/1st Month/day 9/9th day test9/Page_Sub Services/span_Test Department'))

WebUI.selectOptionByValue(findTestObject('Object Repository/1st Month/day 9/9th day test9/Page_Sub Services/select_Select DepartmentAccountsAdmin  Secu_13f63c'), 
    '1507d8b1-03af-4aa0-b513-54d19576bbcc', true)

WebUI.click(findTestObject('Object Repository/1st Month/day 9/9th day test9/Page_Sub Services/div_Please Select Day Closing'))

WebUI.click(findTestObject('Object Repository/1st Month/day 9/9th day test9/Page_Sub Services/span_Accounts'))

WebUI.selectOptionByValue(findTestObject('Object Repository/1st Month/day 9/9th day test9/Page_Sub Services/select_Please Select Day ClosingAccountsAdm_a137f0'), 
    '6fae4466-fe2a-4851-a61a-cb868d89b549', true)

WebUI.setText(findTestObject('Object Repository/1st Month/day 9/9th day test9/Page_Sub Services/input_Barcode Indicators_BarCodeIndicators'), 
    'test1')

WebUI.click(findTestObject('Object Repository/1st Month/day 9/9th day test9/Page_Sub Services/span'))

WebUI.click(findTestObject('Object Repository/1st Month/day 9/9th day test9/Page_Sub Services/input_Elements path_SubmitService'))

WebUI.closeBrowser()

