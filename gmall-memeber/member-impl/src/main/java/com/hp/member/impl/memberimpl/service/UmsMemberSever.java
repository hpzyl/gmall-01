package com.hp.member.impl.memberimpl.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.hp.member.api.memberapi.api.IUmsMember;
import com.hp.member.api.memberapi.entity.UmsMember;
import com.hp.member.impl.memberimpl.mapper.IUmsMemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Service
public class UmsMemberSever implements IUmsMember {
    @Autowired
    IUmsMemberMapper iUmsMemberMapper;
    /*@RequestMapping("/getUmsMember")*/
    public List<UmsMember>  getData(){
        return iUmsMemberMapper.selectAll();
    }
}
