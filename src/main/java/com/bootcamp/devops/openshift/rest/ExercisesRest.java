package com.bootcamp.devops.openshift.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

@RestController
public class ExercisesRest {

    @RequestMapping(method = RequestMethod.GET, value = "ejercicio_1")
    public String exerciseOne() {
        String result;
        if (System.getenv("ejercicio_1").equalsIgnoreCase("ok")) {
            result = "Solución correcta";
        } else {
            result = "Solución incorrecta";
        }
        return result;
    }

    @RequestMapping(method = RequestMethod.GET, value = "ejercicio_2")
    public String exerciseTwo() throws IOException {
        String result;
        if (new String(Files.readAllBytes(Paths.get("/opt/ejercicio_2/configmap"))).equalsIgnoreCase("ok")) {
            result = "Solución correcta";
        } else {
            result = "Solución incorrecta";

        }
        return result;
    }

    @RequestMapping(method = RequestMethod.GET, value = "ejercicio_3")
    public String exerciseThree() {
        String result;
        if (System.getenv("ejercicio_3").equalsIgnoreCase("ok")) {
            result = "Solución correcta";
        } else {
            result = "Solución incorrecta";
        }
        return result;
    }

    @RequestMapping(method = RequestMethod.GET, value = "ejercicio_4")
    public String exerciseFour() throws IOException {
        String result;
        if (new String(Files.readAllBytes(Paths.get("/opt/ejercicio_4/secret"))).equalsIgnoreCase("ok")) {
            result = "Solución correcta";
        } else {
            result = "Solución incorrecta";

        }
        return result;
    }


}
