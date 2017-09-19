package com.project.dao.daointerface;

import com.project.model.Insurance;
import org.springframework.data.repository.query.Param;
import java.util.List;
/**
 * Created by ZZDELY on 2017/9/3.
 */
public interface InsuranceInfoDao {
    void InsertInsurance(Insurance insurance);
    List<Insurance> FindInsurance();
    void DeleteInsurancebyproductid(int productid);
    Insurance FindInsurancebyproductid(int productid);
}
