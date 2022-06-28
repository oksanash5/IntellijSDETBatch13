package com.syntax.class23;

public class BrowserTester {
    public static void main(String[] args) {
        WebDriver chrome = new Chrome();// just change to name of object new Safari to execute new browser
        chrome.startBroweser();
        chrome.openUrl("www.google.com");
        chrome.testLoginPage();
        chrome.closeBrowser();

       // Chrome chrome=new WebDriver();  // nor available

        //inhensted loop
        WebDriver[] browser = {new Chrome(), new Safari(), new FireFox()};
        for (WebDriver driver : browser) {
            driver.startBroweser();
            driver.openUrl("www.google.com");
            driver.testLoginPage();
            driver.closeBrowser();

            // simple loop

            for (int i = 0; i < browser.length; i++) {
                browser[i].startBroweser();
                browser[i].openUrl("www.google.com");
                browser[i].testLoginPage();
                browser[i].closeBrowser();

            }

        }
       WebDriver v =new Chrome(); // widding
        Chrome chrome1 =(Chrome) v; // narrowing

    }}