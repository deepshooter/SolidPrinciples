package com.deepshooter.solidprinciples.isp.withoutisp;

/**
 * Created by avinashmishra on 28/12/18.
 */

public class HPLaserPrinter implements IPrintTask {

    @Override
    public boolean printContent(String content) {
        System.out.println("Print Done");
        return true;
    }

    @Override
    public boolean scanContent(String content) {
        System.out.println("Scan Done");
        return true;

    }

    @Override
    public boolean faxContent(String content) {
        System.out.println("Fax Done");
        return true;

    }

    @Override
    public boolean photoCopyContent(String content) {
        System.out.println("Photo Copy  Done");
        return true;

    }

    @Override
    public boolean printDuplexContent(String content) {
        return false;
    }
}
