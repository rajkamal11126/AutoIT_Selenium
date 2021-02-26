package com.bridgelabz.autoittest;

import com.bridgelabz.base.Base;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.InputEvent;
import java.io.IOException;
import java.util.logging.Logger;

public class AutoIt extends Base{
    public static WebDriver driver;

    @Test
    public void uploadFiles() throws InterruptedException, IOException, AWTException {
        Logger log = Logger.getLogger("devpinoyLogger");
        Robot robot = new Robot();
        robot.mouseMove(540,290);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        System.out.println("Browser Button Clicked");
        Thread.sleep(2000);

        Runtime.getRuntime().exec("C:\\Users\\Rajkamal\\Desktop\\FileUploadScript.exe");
        log.info("File Uploaded Successfully");
        Thread.sleep(2000);

    }
}
