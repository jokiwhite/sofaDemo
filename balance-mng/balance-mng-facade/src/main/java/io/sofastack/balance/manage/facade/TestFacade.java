package io.sofastack.balance.manage.facade;

import io.sofastack.balance.manage.model.TestWFW;

import java.util.List;

/**
* @Description: 测试微服务用
* @Param:
* @return:
* @Author: jokiwhite
* @Date: 2021/4/26
*/
public interface TestFacade {
    /**
    * @Description: 查询全部
    * @Param: []
    * @return: io.sofastack.balance.manage.model.TestWFW
    * @Author: jokiwhite
    * @Date: 2021/4/26
    */
    List<TestWFW> query();
}
