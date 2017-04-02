package com.s3corp.ddt.reader;

/**
 * Created by toan.nguyenp on 3/30/2017.
 */
public class TestStep {
    private int line;
    private String testName;
    private String[] arguments;

    public int getLine() {
        return line;
    }

    public void setLine(int line) {
        this.line = line;
    }

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }

    public String[] getArguments() {
        return arguments;
    }

    public void setArguments(String[] arguments) {
        this.arguments = arguments;
    }
}
