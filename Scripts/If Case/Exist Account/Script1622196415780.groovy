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

WebUI.navigateToUrl('https://mattermost-autotest.herokuapp.com/signup_email?id=bjz71s5p83g3ix13eth98bo7aw&fbclid=IwAR3R54HjPAKlm9IYu5u0ofSi_RT75MYITTGlO-0rb3RAByX4NuwHUiV51W8')

WebUI.setText(findTestObject('Object Repository/Exist Account/Page_Mattermost/input_concat(What, , s your email address)_email'), 
    'danguyen0801@gmail.com')

WebUI.setText(findTestObject('Object Repository/Exist Account/Page_Mattermost/input_Choose your username_name'), 'testing4')

WebUI.setEncryptedText(findTestObject('Object Repository/Exist Account/Page_Mattermost/input_Choose your password_password'), 
    'uJP2zD606ggyMy7smuw6tQ==')

WebUI.click(findTestObject('Object Repository/Exist Account/Page_Mattermost/button_Create Account'))

if (findTestObject('Object Repository/Exist Account/Page_Mattermost/label_An account with that email already exists')) {
    WebUI.setText(findTestObject('Object Repository/Exist Account/Page_Mattermost/input_concat(What, , s your email address)_email'), 
        '1712894@student.hcmus.edu.vn')

    WebUI.click(findTestObject('Object Repository/Exist Account/Page_Mattermost/span_Create Account'))
}

