import org.jetlinks.community.rule.engine.entity.DeviceAlarmEntity;
import org.jetlinks.community.rule.engine.entity.DeviceAlarmHistoryEntity;
import org.jetlinks.community.rule.engine.entity.RuleInstanceEntity;
import org.jetlinks.community.rule.engine.entity.TestEntity;
import org.jetlinks.community.rule.engine.service.DeviceAlarmHistoryService;
import org.jetlinks.community.rule.engine.service.DeviceAlarmService;
import org.jetlinks.community.rule.engine.service.RuleInstanceService;
import org.jetlinks.community.rule.engine.service.TestService;
import org.jetlinks.community.standalone.JetLinksApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.atomic.AtomicReference;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = {JetLinksApplication.class})
public class test {
    @Autowired
    TestService testService;
    @Autowired
    RuleInstanceService ruleInstanceService;
    @Test
    public void test(){
        TestEntity testEntity = testService
            .getValue("test001V");
        String value = testEntity.getValue();
        System.out.println("***************************");
        System.out.println(testEntity);
        System.out.println(value);
        System.out.println("***************************");

//        RuleInstanceEntity block = ruleInstanceService
//            .findById("1544879707789897728").block();
//        System.out.println("***************************");
//        System.out.println(block);
//        System.out.println("***************************");



    }
}