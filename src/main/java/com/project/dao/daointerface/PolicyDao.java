package com.project.dao.daointerface;
import com.project.model.Policy;
import com.project.model.UserInfo;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by ZZDELY on 2017/9/3.
 */
public interface PolicyDao {
    void InsertPolicy(Policy policy);
    List<Policy> FindPolicy(String name);
    Policy FindPolicybypolicyid(int Policyid);
}
