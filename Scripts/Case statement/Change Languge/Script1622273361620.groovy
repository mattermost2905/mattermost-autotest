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

WebUI.callTestCase(findTestCase('Internal/Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('change language/button_quanky_style--none sidebar-header-dropdown__icon'))

WebUI.click(findTestObject('change language/span_Account Settings'))

WebUI.click(findTestObject('change language/button_Display'))

WebUI.click(findTestObject('change language/span_Edit'))

WebUI.click(findTestObject('change language/div_English'))

String lang = 'English'

switch (lang) {
    case 'Deutsch':
        WebUI.enhancedClick(findTestObject('change language/div_Deutsch'))

        break
    case 'English':
        WebUI.enhancedClick(findTestObject('change language/div_English'))

        break
    default:
        WebUI.click(findTestObject('change language/button_Save'), FailureHandling.STOP_ON_FAILURE)}

WebUI.click(findTestObject('change language/button_Save'))

WebUI.click(findTestObject('change language/span_'))

WebUI.closeBrowser()

