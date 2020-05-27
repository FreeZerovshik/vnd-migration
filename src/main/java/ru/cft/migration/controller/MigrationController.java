package ru.cft.migration.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import ru.cft.migration.service.MigrationServie;


@Controller
@RequestMapping("service")
public class MigrationController {
    private static final Logger log = LoggerFactory.getLogger(MigrationController.class);

    @Autowired
    private MigrationServie ms;

    /**
     * curl -X POST -i localhost:8090/service/join -d "service_name=docs"
     */
    @RequestMapping(
            path = "join",
            method = RequestMethod.GET,
            produces = MediaType.TEXT_PLAIN_VALUE)
    @ResponseBody
    public ResponseEntity join() {
        log.info(">>> test request");

        return ResponseEntity.ok().body(String.valueOf(ms.count()));
    }

}
