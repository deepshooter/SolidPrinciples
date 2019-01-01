package com.deepshooter.solidprinciples.isp.withisp;

/**
 * Created by avinashmishra on 28/12/18.
 */

public interface IPrintScanContent {

    boolean printContent(String content);
    boolean scanContent(String content);
    boolean photoCopyContent(String content);

}
