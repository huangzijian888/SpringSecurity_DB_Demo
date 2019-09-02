package cn.huangzijian888.securitydb.mapper;

import cn.huangzijian888.securitydb.bean.Role;
import cn.huangzijian888.securitydb.bean.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author huangzijian888
 */
@Mapper
public interface UserMapper {
    User loadUserByUsername(String username);

    List<Role> getUserRolesById(Integer id);
}
