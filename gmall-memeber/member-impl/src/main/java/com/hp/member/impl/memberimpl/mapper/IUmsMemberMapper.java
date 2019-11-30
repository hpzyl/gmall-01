package com.hp.member.impl.memberimpl.mapper;

import com.hp.member.api.memberapi.entity.UmsMember;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.common.Mapper;

@Component
public interface IUmsMemberMapper extends Mapper<UmsMember> {
}
