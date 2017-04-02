package com.s3corp.ddt.reader;

import java.util.List;

/**
 * Created by toan.nguyenp on 3/30/2017.
 */
public class TestCase {
    private String caseName;
    private List<TestStep> testSteps;
    private List<TestCase> testCases;

    public void add(TestCase testCase){ testCases.add(testCase); }
    public void remove(TestCase testCase){ testCases.remove(testCase); }
    public List<TestCase> getTestCases(){ return testCases; }

    public TestCase(String caseName){
        this.caseName = caseName;
    }

    public String getCaseName() {
        return caseName;
    }

    public void setCaseName(String caseName) {
        this.caseName = caseName;
    }

    public List<TestStep> getTestSteps() {
        return testSteps;
    }

    public void setTestSteps(List<TestStep> testSteps) {
        this.testSteps = testSteps;
    }
}
