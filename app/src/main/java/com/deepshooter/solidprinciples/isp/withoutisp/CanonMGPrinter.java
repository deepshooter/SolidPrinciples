package com.deepshooter.solidprinciples.isp.withoutisp;

/**
 * Created by avinashmishra on 28/12/18.
 */

public class CanonMGPrinter implements IPrintTask {


    @Override
    public boolean printContent(String content) {
        return false;
    }

    @Override
    public boolean scanContent(String content) {
        return false;
    }

    @Override
    public boolean faxContent(String content) {
        // Cannot Perform This Task
        return false;
    }

    @Override
    public boolean photoCopyContent(String content) {
        return false;
    }

    @Override
    public boolean printDuplexContent(String content) {
        // Cannot Perform This Task
        return false;
    }
}
