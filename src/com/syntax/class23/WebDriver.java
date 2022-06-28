package com.syntax.class23;

public class WebDriver {

    public void startBroweser(){
        System.out.println("Starting the browser");
    }
public void openUrl(String url){
    System.out.println("opening "+url);
}
public void testLoginPage(){
    System.out.println("checkin if loging page is visible ");
}
public void closeBrowser(){
    System.out.println("closing the browser");
}
}
class Chrome extends WebDriver{
    @Override
    public void startBroweser() {
        System.out.println("opening Google Chrome ");
    }

    @Override
    public void openUrl(String url) {
        System.out.println("opening the URL"+url+" on Google Chrome");
    }

    @Override
    public void testLoginPage() {
        System.out.println("Testing the login page on Google Chrome");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing the Google Chrome");
    }
}
class FireFox extends WebDriver{
    @Override
    public void startBroweser() {
        System.out.println("opening FireFox");
    }

    @Override
    public void openUrl(String url) {
        System.out.println("opening the URL"+url+" on FireFox");
    }

    @Override
    public void testLoginPage() {
        System.out.println("Testing the login page on FireFox");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing the FireFox");
    }
}
class  Safari extends WebDriver{
    @Override
    public void startBroweser() {
        System.out.println("opening Safari");
    }

    @Override
    public void openUrl(String url) {
        System.out.println("opening the URL"+url+" on Safari");
    }

    @Override
    public void testLoginPage() {
        System.out.println("Testing the login page on Safari");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing the Safari");
    }
}