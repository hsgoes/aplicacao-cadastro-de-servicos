package com.project.cadastrodeservicos.exception;

import java.util.Arrays;
import java.util.List;

public class ApiErrors {

    private List<String> errors;

    public ApiErrors(List<String> erros){
        this.errors = erros;
    }

    public ApiErrors(String message) {
        this.errors = Arrays.asList(message);
    }

    public List<String> getErrors() {
        return errors;
    }
}
