package com.hp.member.web.memberweb.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.annotation.Service;
import com.hp.member.api.memberapi.api.IUmsMember;
import com.hp.member.api.memberapi.entity.UmsMember;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class UmsMemberController implements IUmsMember {
    @Reference
    IUmsMember umsMember;
    @PostMapping("/getCatalog1")
    public List<UmsMember> getData() {
        return umsMember.getData();
    }
}
