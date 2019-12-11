package org.hg.cloud.account.org.hg.cloud.account.rest.rebbon;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author huangggang6135@gmail.com
 */
@RestController
@Slf4j
public class TestController {
    @Autowired
    private RestTemplate restTemplate;
    @RequestMapping(value = "/testCommonServer", method = RequestMethod.GET)
    public String testCommonServer(){
        ResponseEntity<String> forEntity = restTemplate.getForEntity("http://common-server/test/", String.class);
        log.info("test common-server status:[{}] result:[{}]", forEntity.getStatusCode(), forEntity.getBody());
        return forEntity.getBody();
    }
}
