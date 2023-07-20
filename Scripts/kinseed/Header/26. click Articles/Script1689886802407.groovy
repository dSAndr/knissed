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
import java.util.regex.Pattern as Pattern
import java.util.regex.Matcher as Matcher

WebUI.openBrowser('')

WebUI.navigateToUrl('https://kinseed.com/')

classx = WebUI.getAttribute(findTestObject('Page_Home  Kinseed/li_Articles'), 'class')

Pattern pattern = Pattern.compile('.*current-menu-parent.*')

Matcher matcher = pattern.matcher(classx)

boolean foundMatch = matcher.find()

WebUI.verifyEqual(foundMatch, false)

WebUI.mouseOver(findTestObject('Page_Home  Kinseed/span_Insights'))

WebUI.click(findTestObject('Page_Home  Kinseed/span_Articles'))

//kinseed.com/case-studies/ = WebUI.getUrl()
https: urlx = WebUI.getUrl()

WebUI.verifyMatch(urlx, 'https://kinseed.com/case-studies/', true)

classy = WebUI.getAttribute(findTestObject('Page_Home  Kinseed/li_Insights'), 'class')

Matcher matcher2 = pattern.matcher(classy)

boolean foundMatch2 = matcher2.find()

WebUI.verifyEqual(foundMatch2, true)

Pattern pattern2 = Pattern.compile('.*current-menu-item.*')

classz = WebUI.getAttribute(findTestObject('Page_Home  Kinseed/li_Articles'), 'class')

Matcher matcher3 = pattern2.matcher(classz)

boolean foundMatch3 = matcher3.find()

WebUI.verifyEqual(foundMatch3, true)

WebUI.closeBrowser()

