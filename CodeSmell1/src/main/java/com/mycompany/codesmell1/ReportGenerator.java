package com.mycompany.codesmell1;

import java.util.List;

/**
 *
 * @author andhik
 */
public class ReportGenerator {
    public void generateReport(List<String> data) {
        System.out.println("Report Header");
        for (String item : data) {
            System.out.println("Item: " + item);
        }
        System.out.println("Footer Information");
        System.out.println("Generated by XYZ System");
    }
}