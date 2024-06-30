package org.vasanthgk02.freecodecamp_springboot.run;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class RunNotFoundException extends RuntimeException {
    RunNotFoundException() {
        super("Run not found");
    }
}
