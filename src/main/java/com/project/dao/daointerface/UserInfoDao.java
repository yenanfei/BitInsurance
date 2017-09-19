package com.project.dao.daointerface;
import com.project.model.UserInfo;
import org.springframework.data.repository.query.Param;
import java.util.List;
/**
 * Created by ZZDELY on 2017/9/3.
 */
public interface UserInfoDao {
    void InsertUserInfo(UserInfo userInfo);
    void UpdateUserInfobyusername(UserInfo userInfo);
    UserInfo FindUserInfobyusername(String name);
    void Awardbyusername(@Param("name") String name, @Param("score") int score);
}
