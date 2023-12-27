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

WebUI.navigateToUrl('https://model.ihealthcure.com/Account/Login')

WebUI.setText(findTestObject('Object Repository/1st Month/day 10/10th day test2/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_username'), 
    'badmin')

WebUI.setEncryptedText(findTestObject('Object Repository/1st Month/day 10/10th day test2/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_password'), 
    'CSt51UwWECc=')

WebUI.click(findTestObject('Object Repository/1st Month/day 10/10th day test2/Page_iHealthCure  Hospital Management and I_3c5153/button_Sign In'))

WebUI.click(findTestObject('Object Repository/1st Month/day 10/10th day test2/Page_/span_Organization Setup'))

WebUI.click(findTestObject('Object Repository/1st Month/day 10/10th day test2/Page_/span_Sub Sub Services'))

WebUI.click(findTestObject('Object Repository/1st Month/day 10/10th day test2/Page_Sub Sub Service/button_Add Sub Sub Service'))

WebUI.click(findTestObject('Object Repository/1st Month/day 10/10th day test2/Page_Sub Sub Service/div_Select Service'))

WebUI.click(findTestObject('Object Repository/1st Month/day 10/10th day test2/Page_Sub Sub Service/span_Procedures'))

WebUI.selectOptionByValue(findTestObject('Object Repository/1st Month/day 10/10th day test2/Page_Sub Sub Service/select_Select ServiceAdmissionPhysiotherapy_d1162f'), 
    '563bc65d-8d1f-e911-80c9-005056af7162', true)

WebUI.click(findTestObject('Object Repository/1st Month/day 10/10th day test2/Page_Sub Sub Service/div_Select Sub Service'))

WebUI.click(findTestObject('Object Repository/1st Month/day 10/10th day test2/Page_Sub Sub Service/span_Open Heart Surgery (Coarctation Repair)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/1st Month/day 10/10th day test2/Page_Sub Sub Service/select_Select Sub ServiceIliac Artery Angio_02e82a'), 
    '93ac1ea3-49d5-493b-9360-0ac15da39b57', true)

WebUI.setText(findTestObject('Object Repository/1st Month/day 10/10th day test2/Page_Sub Sub Service/input__Name'), 'test sub sub service 01')

WebUI.setText(findTestObject('Object Repository/1st Month/day 10/10th day test2/Page_Sub Sub Service/input_CPT Code_Code'), 
    '0012')

WebUI.setText(findTestObject('Object Repository/1st Month/day 10/10th day test2/Page_Sub Sub Service/input_Description_Description'), 
    '01/04/2023')

WebUI.setText(findTestObject('Object Repository/1st Month/day 10/10th day test2/Page_Sub Sub Service/input__Amount'), '0100')

WebUI.click(findTestObject('Object Repository/1st Month/day 10/10th day test2/Page_Sub Sub Service/div_Select Test Method'))

WebUI.click(findTestObject('Object Repository/1st Month/day 10/10th day test2/Page_Sub Sub Service/span_24 hrs. creatinine clearance'))

WebUI.selectOptionByValue(findTestObject('Object Repository/1st Month/day 10/10th day test2/Page_Sub Sub Service/select_Select Test Method24 hrs. creatinine_350910'), 
    'ca4c5159-a99d-4c92-ba48-5d2f30fd459d', true)

WebUI.click(findTestObject('Object Repository/1st Month/day 10/10th day test2/Page_Sub Sub Service/div_Once'))

WebUI.click(findTestObject('Object Repository/1st Month/day 10/10th day test2/Page_Sub Sub Service/span_Once'))

WebUI.click(findTestObject('Object Repository/1st Month/day 10/10th day test2/Page_Sub Sub Service/input_Please enter a value with valid lengt_2af778'))

WebUI.closeBrowser()

