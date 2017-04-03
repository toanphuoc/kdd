package com.s3corp.ddt.testNG;

import com.s3corp.ddt.reader.TestCase;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;

/**
 * Created by toan.nguyenp on 3/29/2017.
 */
public class SimpleTestFactory {

    @Factory(dataProvider = "db")
    public Object[] factoryMethod(TestCase testcase){
        return new Object[] {new SimpleTest(testcase)};
    }

    @DataProvider(name="db")
    public Object[][] dataProvider(){
        TestCase[][] dataArray = {
                { new TestCase("Test case 1")},
                { new TestCase("Test case 2")},
                { new TestCase("Test case 3")}
            };
        return dataArray;
    }
}
