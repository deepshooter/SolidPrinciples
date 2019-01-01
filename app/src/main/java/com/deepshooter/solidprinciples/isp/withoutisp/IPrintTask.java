package com.deepshooter.solidprinciples.isp.withoutisp;

/**
 * Created by avinashmishra on 28/12/18.
 */

public interface IPrintTask {

    boolean printContent(String content);
    boolean scanContent(String content);
    boolean faxContent(String content);
    boolean photoCopyContent(String content);
    boolean printDuplexContent(String content);
}
