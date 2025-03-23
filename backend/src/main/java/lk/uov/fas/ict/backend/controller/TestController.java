package lk.uov.fas.ict.backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/app/api")
public class TestController {

    //get student name 
    @GetMapping("/student")
    public String getStudentName() {
        return "Minindu";
    }

    //get student course
    @GetMapping("/course")
    public String getCourseName() {
        return "Ict";
    }
}
