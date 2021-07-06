package com.xiao.admin.mapper;

import com.xiao.admin.bean.Account;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Mapper
public interface AccountMapper {


    public Account getAcct(Long id);
}
