package com.ithaima.dao;/*
@outhor shkstart
@date 2019/12/14-9:00
*/

import com.ithaima.domain.Role;

import java.util.List;

public interface IRoleDao {
    /**
     * 查询所有角色
     * @return
     */
    List<Role> findAll();
}
