package com.voloshyn.spring.rest.exception_handling;

import com.voloshyn.spring.rest.entity.Employee;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@ControllerAdvice
public class EmployeeGlobalExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<EmployeeInccorectData> handleException(NoSuchEmployeeException exception){
        EmployeeInccorectData data = new EmployeeInccorectData();
        data.setInfo(exception.getMessage());
        return new ResponseEntity<EmployeeInccorectData>(data, HttpStatus.NOT_FOUND);

    }

    @ExceptionHandler
    public ResponseEntity<EmployeeInccorectData> handleException(Exception exception){
        EmployeeInccorectData data = new EmployeeInccorectData();
        data.setInfo(exception.getMessage());
        return new ResponseEntity<EmployeeInccorectData>(data, HttpStatus.BAD_REQUEST);

    }

}
