package org.rent;

import com.bqmart.beiquan.AddressTransferService;
import com.bqmart.beiquan.domain.BaseAddressResult;
import com.bqmart.beiquan.domain.BeiquanAddressQuery;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/** Created by wuyujia on 17/4/13. */
public class TestAddressTransferService extends BasicTestClass{

    @Autowired
    private AddressTransferService service;

    @Test
    public void testTransferAddress() {
        BeiquanAddressQuery query = new BeiquanAddressQuery();
        query.setProvinceId(799);
        query.setCityId(851);
        query.setDistrictId(852);
        BaseAddressResult result = service.transferAddress(query);
        System.out.println(result);
    }
}
