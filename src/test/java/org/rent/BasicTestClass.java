package org.rent;

import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/** Created by wuyujia on 17/4/13. */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = {App.class})
public abstract class BasicTestClass {

    protected Logger logger = LoggerFactory.getLogger(this.getClass());
}
