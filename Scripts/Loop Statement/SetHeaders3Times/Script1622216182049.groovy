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
import com.kms.katalon.core.webui.keyword.builtin.VerifyElementPresentKeyword as VerifyElementPresentKeyword
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://mattermost-autotest.herokuapp.com/testauto-hcmus/channels/town-square')

WebUI.callTestCase(findTestCase('Internal/Login'), [:], FailureHandling.STOP_ON_FAILURE)

for (i = 0; i < 3; i += 1) {
    WebUI.click(findTestObject('Page_Town Square - TestAuto-HCMUS Mattermost/button_Set_a_Header'), FailureHandling.STOP_ON_FAILURE)

    WebUI.setText(findTestObject('Page_Town Square - TestAuto-HCMUS Mattermost/textarea_Edit_header_edit_textbox'), 'Header ' + 
        (i + 1))

    WebUI.click(findTestObject('Page_Town Square - TestAuto-HCMUS Mattermost/button_Save_header'))

    WebUI.verifyElementText(findTestObject('Page_Town Square - TestAuto-HCMUS Mattermost/p_Header'), 'Header ' + (i + 
        1))
}

