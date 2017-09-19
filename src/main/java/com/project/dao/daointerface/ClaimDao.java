/**
 * Created by HCHJ on 2017/5/9.
 */
package com.project.dao.daointerface;

import com.project.model.Claim;
import org.springframework.data.repository.query.Param;
import java.util.List;

/**
 *
 */
public interface ClaimDao {
    void InsertClaim(Claim user);
    List<Claim> findClaim();
    List<Claim> findClaimByPolicyId(@Param("PolicyId") int PolicyId);
    Claim findClaimByClaimid(@Param("Claimid") int Claimid);
    void UpdateClaimbyClaimId(@Param("Claimid") Claim claim);
    void DeleteClaimById(@Param("Claimid") Claim claim);
}