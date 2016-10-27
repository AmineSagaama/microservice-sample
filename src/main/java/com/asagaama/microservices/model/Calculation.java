package com.asagaama.microservices.model;

import java.util.List;

/**
 * Created by asagaama on 26/10/2016.
 */
public class Calculation {

    private String function;
    private List<String> input;
    private List<String> output;

    /**
     * @param function
     * @param input
     * @param output
     */
    public Calculation(List<String> input, List<String> output, String function) {
        this.setFunction(function);
        this.setInput(input);
        this.setOutput(output);
    }


    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    public List<String> getInput() {
        return input;
    }

    public void setInput(List<String> input) {
        this.input = input;
    }

    public List<String> getOutput() {
        return output;
    }

    public void setOutput(List<String> output) {
        this.output = output;
    }
}
