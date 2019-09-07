package com.nju.dao;

import com.nju.domain.User;

import java.util.List;

/**
 * @Author: Gu Yaming
 * @Description:
 * @Date:Create：in 2019/9/2 16:00
 * @Modified By：
 */
public interface IUserDao {
    List<User> findALL();
}
