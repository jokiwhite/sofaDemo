package io.sofastack.balance.manage.mapper;


import io.sofastack.balance.manage.model.TestWFW;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface TestMapper {

    @Select("SELECT * FROM `testwfw`")
    List<TestWFW> query();
}
