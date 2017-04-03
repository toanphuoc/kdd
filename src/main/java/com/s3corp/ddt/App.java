package com.s3corp.ddt;

import com.s3corp.ddt.testNG.IReporterCustom;
import com.s3corp.ddt.testNG.SimpleTestFactory;
import org.testng.TestNG;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

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
        TestNG testNG = new TestNG();
        testNG.addListener(new IReporterCustom());

        XmlSuite xmlSuite = new XmlSuite();
        xmlSuite.setName("Keyword Data Driven");

        XmlTest xmlTest = new XmlTest(xmlSuite);
        xmlTest.setPreserveOrder("true");

        List<XmlClass> classes = new ArrayList<XmlClass>();
        classes.add(new XmlClass("com.s3corp.ddt.testNG.SimpleTestFactory"));
        xmlTest.setXmlClasses(classes);

        List<XmlSuite> suites = new ArrayList<XmlSuite>();
        suites.add(xmlSuite);

        testNG.setXmlSuites(suites);
//        testNG.setTestClasses(new Class[]{SimpleTestFactory.class});
        testNG.run();
    }
}
