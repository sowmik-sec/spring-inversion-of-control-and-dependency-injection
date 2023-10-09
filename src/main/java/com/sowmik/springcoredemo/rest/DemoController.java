package com.sowmik.springcoredemo.rest;

import com.sowmik.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private Coach myCoach;
    private Coach anotherCoach;

    // constructor injection
    @Autowired
    public DemoController(
            @Qualifier("cricketCoach") Coach theCoach,
            @Qualifier("cricketCoach") Coach theAnotherCoach
    ) {
        System.out.println("In constructor: "+ getClass().getSimpleName());
        myCoach = theCoach;
        anotherCoach = theAnotherCoach;
    }
//    @Autowired
//    public DemoController(Coach theCoach) {
//        myCoach = theCoach;
//    }
    // setter injection
//    @Autowired
//    public void setCoach(Coach theCoach) { // function name can be anything
//        myCoach = theCoach;
//    }
    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }
    @GetMapping("/check")
    public String check() {
        return "Comparing beans: myCoach == anotherCoach, " + (myCoach == anotherCoach);
    }
}
