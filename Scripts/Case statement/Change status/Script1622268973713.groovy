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

WebUI.clickOffset(findTestObject('change language/span_TestAuto-HCMUS_status status-edit edit'), 0, 0)

String status = 'Do Not Disturb'

switch (status) {
    case 'Online':
        WebUI.click(findTestObject('change language/span_Online'))

        break
    case 'Away':
        WebUI.click(findTestObject('change language/span_Away'))

        break
    case 'Do Not Disturb':
        WebUI.click(findTestObject('change language/span_Do Not Disturb'))

        break
    case 'Offline':
        WebUI.click(findTestObject('change language/span_Offline'))

        break
    default:
        WebUI.click(findTestObject('change language/span_Online'))

        break
}

WebUI.closeBrowser()

