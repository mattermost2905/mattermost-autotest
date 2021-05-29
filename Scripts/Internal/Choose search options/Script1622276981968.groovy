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

WebUI.click(findTestObject('Search/input_Town Square_searchBox'))

String option = 'from'

switch (option) {
    case 'from':
        WebUI.clickOffset(findTestObject('Search/li_FromMessages from a user'), 0, 0)

        WebUI.click(findTestObject('Search/span_quanky'))

        break
    case 'in':
        WebUI.click(findTestObject('Search/li_InMessages in a channel'))

        break
    case 'on':
        WebUI.click(findTestObject('Search/li_OnMessages on a date'))

        break
    case 'exclude':
        WebUI.click(findTestObject('Search/li_Exclude search terms'))

        break
    case 'before':
        WebUI.click(findTestObject('Search/li_BeforeMessages before a date'))

        break
    case 'after':
        WebUI.click(findTestObject('Search/li_AfterMessages after a date'))

        break
    default:
        WebUI.click(findTestObject('Search/h4_Search Options'))

        break
}

