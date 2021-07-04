package com.xiao.admin.service;


import com.xiao.admin.bean.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

public interface AccountService {

    Account getAcctByid(Long id);
}
