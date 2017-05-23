package org.rent;

import com.bqmart.jd.service.JdStockService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.concurrent.ExecutionException;

/** Created by wuyujia on 17/4/13. */
public class TestAsync extends BasicTestClass{

    @Autowired
    JdStockService stockService;

    @Test
    public void AsyncTaskTest() throws InterruptedException, ExecutionException {
//        Future<JdAddress> jdAddressFuture = stockService.doTask1();
//        while(!jdAddressFuture.isDone()) {
//            Thread.sleep(1000);
//            stockService.doTask2();
//        }
//        System.out.println(jdAddressFuture.get());
    }
}
