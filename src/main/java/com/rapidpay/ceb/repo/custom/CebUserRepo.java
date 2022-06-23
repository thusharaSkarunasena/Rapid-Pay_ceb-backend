package com.rapidpay.ceb.repo.custom;

import com.rapidpay.ceb.model.CebUser;
import com.rapidpay.ceb.repo.CrudRepo;
import org.springframework.stereotype.Repository;

@Repository
public interface CebUserRepo extends CrudRepo<CebUser, Integer> {

}