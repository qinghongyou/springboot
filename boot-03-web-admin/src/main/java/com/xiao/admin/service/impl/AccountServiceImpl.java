package com.xiao.admin.service.impl;


import com.xiao.admin.bean.Account;
import com.xiao.admin.mapper.AccountMapper;
import com.xiao.admin.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    AccountMapper accountMapper;

    public Account getAcctByid(Long id){
        return accountMapper.getAcct(id);
    }
}
