package org.hg.cloud.account.rest.feign;

import lombok.extern.slf4j.Slf4j;
import org.hg.cloud.common.rest.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author huangggang6135@gmail.com
 */
@RestController
@Slf4j
public class TestController2 {
    @Autowired
    private ITestService testService;

    @RequestMapping("/testCommonServer2")
    public String testCommonServer2(){
        return testService.test();
    }
}
