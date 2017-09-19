/**
 * Created by HCHJ on 2017/5/9.
 */
package com.project.dao.daointerface;
import com.project.model.User;
import org.springframework.data.repository.query.Param;

public interface UserDAO {
int findUser(@Param("name") String name, @Param("password") String password);
void InsertUser(User user);

}