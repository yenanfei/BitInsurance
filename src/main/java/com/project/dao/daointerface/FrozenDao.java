/**
 * Created by HCHJ on 2017/5/9.
 */
package com.project.dao.daointerface;

import com.project.model.Frozen;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface FrozenDao {
    List<Frozen> findFrozen();
    List<Frozen> findFrozenByTo(int to);
    void InsertFrozen(@Param("frozen") Frozen frozen);
    void DeleteFrozen(@Param("frozenid") int frozenid);
}