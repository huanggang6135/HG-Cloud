package org.hg.cloud.common.rest;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Author huangggang6135@gmail.com
 */
@FeignClient("COMMON-SERVER")
public interface ITestService {
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    String test();
}
