package org.hg.cloud.common.rest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author huangggang6135@gmail.com
 */
@RestController
@Slf4j
public class TestService implements ITestService {
    @Override
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test(){
        log.info("test success");
        return "rest success";
    }
}
