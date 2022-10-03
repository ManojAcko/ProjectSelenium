public class SeleniumTest{
    public static void main(String[] args) throws InterruptedException{

        //This test case should fail because browser name is invalid
            String getBrowserInfo = TestCases.invalidBrowserName();
            HandleDriver.setBrowser(getBrowserInfo);

        //This test case should pass because browser name is valid
            getBrowserInfo = TestCases.validBrowserName();
            HandleDriver.setBrowser(getBrowserInfo);

        //This is a call for implicit wait method
            HandleDriver.defaultWaitImplicitly();

        //This test case should open unacademy website
            HandleDriver.openWebsite();

        //This test case should click start learning button
            HomePage.startLearning(HandleDriver.driver);

        //This test case should click dropdown search bar
            HomePage.searchInput(HandleDriver.driver);

        //This test case should choose IIT-JEE option of dropdown
            HomePage.iitTabClick(HandleDriver.driver);

        //This test case should open a new tab
            HomePage.exploreTab(HandleDriver.driver);

        //Usage of thread to delay the process
            Thread.sleep(20000);

        //This test case should switch the browser window to previous one
            HandleDriver.switchToPreviousTab();

        //This test case should click on get subscription button
            HomePage.clickGetSubscription(HandleDriver.driver);

        //Quiting Driver
            HandleDriver.quitDriver();

    }
}
