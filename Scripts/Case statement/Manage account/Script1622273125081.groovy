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

String var = 'View info'

WebUI.click(findTestObject('account/span_Town Square_channelHeaderDropdownIcon'))

switch (var) {
    case 'View info':
        WebUI.click(findTestObject('account/button_View Info'))

        break
    case 'Edit Channel Header':
        WebUI.click(findTestObject('account/button_Edit Channel Header'))

        break
    case 'Edit Channel Purpose':
        WebUI.click(findTestObject('account/button_Edit Channel Purpose'))

        break
    case 'Mute Channel':
        WebUI.click(findTestObject('account/button_Mute Channel'))

        break
    case 'View Members':
        WebUI.click(findTestObject('account/button_View Members'))

        break
    default:
        break
}

WebUI.closeBrowser()

