package org.mapper;

import org.model.Userful;

public interface UserfulMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Userful record);

    int insertSelective(Userful record);

    Userful selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Userful record);

    int updateByPrimaryKey(Userful record);
}