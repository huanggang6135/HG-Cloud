package org.hg.cloud.common.rest.fallback;

import org.hg.cloud.common.rest.ITestService;
import org.springframework.stereotype.Service;

/**
 * @Author huangggang6135@gmail.com
 */
@Service
public class TestServiceFallBack implements ITestService {
    @Override
    public String test() {
        return "服务器开小差了 test";
    }

    @Override
    public String testFall() {
        return "服务器开小差了 testFall";
    }
}
