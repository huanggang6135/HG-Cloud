package org.hg.cloud.common.rest;

import org.hg.cloud.common.rest.fallback.TestServiceFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Author huangggang6135@gmail.com
 */
@FeignClient(name = "COMMON-SERVER", fallback = TestServiceFallBack.class)
public interface ITestService {
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    String test();
    @RequestMapping(value = "/testFall", method = RequestMethod.GET)
    String testFall();
}
