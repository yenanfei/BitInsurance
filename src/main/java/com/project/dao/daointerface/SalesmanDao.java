package com.project.dao.daointerface;

import com.project.model.SalesmanInfo;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by ZZDELY on 2017/9/3.
 */
public interface SalesmanDao {
    void InsertSalesmaninfobyname(SalesmanInfo salesmanInfo);
    void DeleteSalesmaninfobyname(String name);
    List<SalesmanInfo> FindSalesmaninfo();
}
