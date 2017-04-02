package com.s3corp.ddt.testNG;

import org.testng.IReporter;
import org.testng.ISuite;
import org.testng.ISuiteResult;
import org.testng.ITestContext;
import org.testng.xml.XmlSuite;
import java.util.List;
import java.util.Map;

/**
 * Created by toan.nguyenp on 3/29/2017.
 */
public class IReporterCustom implements IReporter{

    public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites, String outputDirectory) {
        ISuite iSuite = suites.get(0);
        String suiteName = iSuite.getName();

        Map<String, ISuiteResult> suiteResults = iSuite.getResults();
        for (ISuiteResult sr : suiteResults.values()) {
            ITestContext tc = sr.getTestContext();
         //   System.out.println(tc.get)
            System.out.println(tc.getName());

            System.out.println("Passed tests for suite '" + suiteName + "' is:" + tc.getPassedTests().getAllResults().size());
            System.out.println("Failed tests for suite '" + suiteName + "' is:" + tc.getFailedTests().getAllResults().size());
            System.out.println("Skipped tests for suite '" + suiteName + "' is:" + tc.getSkippedTests().getAllResults().size());
        }
    }
}
