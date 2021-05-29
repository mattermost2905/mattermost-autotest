import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.googlecode.javacv.cpp.opencv_flann.SavedIndexParams as SavedIndexParams
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

WebUI.navigateToUrl('https://mattermost-autotest.herokuapp.com/testauto-hcmus/channels/town-square')

WebUI.callTestCase(findTestCase('Internal/Login'), [:], FailureHandling.STOP_ON_FAILURE)

for (i = 0; i < 5; i += 1) {
    WebUI.mouseOver(findTestObject('Page_Town Square - TestAuto-HCMUS Mattermost/div_phong_hello3'), FailureHandling.STOP_ON_FAILURE)

    WebUI.click(findTestObject('Page_Town Square - TestAuto-HCMUS Mattermost/button_phong_save'), FailureHandling.STOP_ON_FAILURE)

    if (i%2 == 0) {
        WebUI.verifyElementPresent(findTestObject('Page_Town Square - TestAuto-HCMUS Mattermost/div_phong_saved'), 0)
    }
}

WebUI.closeBrowser()

