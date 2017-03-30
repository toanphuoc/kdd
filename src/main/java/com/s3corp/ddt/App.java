package com.s3corp.ddt;

import com.s3corp.ddt.testNG.IReporterCustom;
import com.s3corp.ddt.testNG.SimpleTestFactory;
import org.testng.TestNG;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        List<String> testNames = new ArrayList<String>();
        testNames.add("Test case1");
        testNames.add("Test case2");
        testNames.add("Test case3");

        TestNG testNG = new TestNG();
        testNG.addListener(new IReporterCustom());
        testNG.setDefaultSuiteName("Keyword Data Driven");

        testNG.setTestNames(testNames);
        testNG.setTestClasses(new Class[]{SimpleTestFactory.class});
        testNG.run();
    }
}
