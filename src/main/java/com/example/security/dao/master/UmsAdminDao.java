package com.example.security.dao.master;

import com.example.security.vo.UmsAdmin;
import com.example.security.vo.UmsAdminExample;

import java.util.List;

/**
 * Created by kobe on 2019/1/22.
 */
public interface UmsAdminDao {

    public List<UmsAdmin> queryAdmin();

    public List<UmsAdmin> selectByExample(UmsAdminExample example);
}
