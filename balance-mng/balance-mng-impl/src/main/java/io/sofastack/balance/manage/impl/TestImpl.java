package io.sofastack.balance.manage.impl;


import com.alipay.sofa.runtime.api.annotation.SofaService;
import com.alipay.sofa.runtime.api.annotation.SofaServiceBinding;
import io.sofastack.balance.manage.facade.TestFacade;
import io.sofastack.balance.manage.mapper.TestMapper;
import io.sofastack.balance.manage.model.TestWFW;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@SofaService(interfaceType = TestFacade.class, uniqueId = "${service.unique.id}",bindings = {@SofaServiceBinding(bindingType = "bolt")})
public class TestImpl implements TestFacade {

    @Autowired
    private TestMapper mapper;


    @Override
    public List<TestWFW> query() {
        List<TestWFW> query = mapper.query();
        return query;
    }
}
