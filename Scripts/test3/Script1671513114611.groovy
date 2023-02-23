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

WebUI.navigateToUrl('http://192.168.88.254:399/Account/LogIn?ReturnUrl=%2f')

WebUI.setText(findTestObject('Object Repository/1st Month/day 1/testfour/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_username'), 
    'afipadmin')

WebUI.setEncryptedText(findTestObject('Object Repository/1st Month/day 1/testfour/Page_iHealthCure  Hospital Management and I_3c5153/input_Sign In_password'), 
    'CSt51UwWECc=')

WebUI.click(findTestObject('Object Repository/1st Month/day 1/testfour/Page_iHealthCure  Hospital Management and I_3c5153/button_Sign In'))

WebUI.click(findTestObject('Object Repository/1st Month/day 1/testfour/Page_/span_Patient Management'))

WebUI.click(findTestObject('Object Repository/1st Month/day 1/testfour/Page_/span_Add Patient'))

WebUI.click(findTestObject('1st Month/day 1/testfour/Page_Add Patient/label_Entitle'))

WebUI.setText(findTestObject('Object Repository/1st Month/day 1/testfour/Page_Add Patient/input_Testing Type_ArmedForcesServiceNumber'), 
    'test5')

WebUI.click(findTestObject('1st Month/day 1/testfour/Page_Add Patient/span_Select Name'))

WebUI.click(findTestObject('1st Month/day 1/testfour/Page_Add Patient/li_01 WING'))

WebUI.setText(findTestObject('Object Repository/1st Month/day 1/testfour/Page_Add Patient/input__FirstName'), 'testfive')

WebUI.setText(findTestObject('Object Repository/1st Month/day 1/testfour/Page_Add Patient/input__yb'), '26')

WebUI.setText(findTestObject('Object Repository/1st Month/day 1/testfour/Page_Add Patient/input__Address'), 'rwp')

WebUI.setText(findTestObject('Object Repository/1st Month/day 1/testfour/Page_Add Patient/input__CellNumber'), '03121212121')

WebUI.click(findTestObject('Object Repository/1st Month/day 1/testfour/Page_Add Patient/span_1'))

WebUI.click(findTestObject('Object Repository/1st Month/day 1/testfour/Page_Add Patient/button_Submit'))

WebUI.click(findTestObject('Object Repository/1st Month/day 1/testfour/Page_Add Patient/button_Check In PA-test4 2nd Lt Testfour_cl_345139'))

WebUI.click(findTestObject('Object Repository/1st Month/day 1/testfour/Page_Add Patient/span_Entitle Vault'))

WebUI.click(findTestObject('Object Repository/1st Month/day 1/testfour/Page_Entitlevault/i_Dec 20, 2022 1014_glyphicon glyphicon-edit'))

WebUI.click(findTestObject('Object Repository/1st Month/day 1/testfour/Page_Entitlevault/label_CNE'))

WebUI.click(findTestObject('Object Repository/1st Month/day 1/testfour/Page_Entitlevault/button_Submit'))

WebUI.closeBrowser()

