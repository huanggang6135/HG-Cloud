package org.hg.cloud.common.rest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

/**
 * @Author huangggang6135@gmail.com
 */
@RestController
@Slf4j
public class TestService implements ITestService {
    @Override
    public String test(){
        log.info("test success");
        return "rest success";
    }

    @Override
    public String testFall() {
        int sleepTime = new Random().nextInt(3000);
        log.info("Thread Sleeping [{}] milliseconds", sleepTime);
        try {
            Thread.sleep(sleepTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "test Fall success";
    }
}
