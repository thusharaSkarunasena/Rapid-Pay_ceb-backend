package com.rapidpay.ceb.service.custom;

import java.util.List;
import java.util.Optional;
import com.rapidpay.ceb.model.CebUser;
import com.rapidpay.ceb.service.SuperService;
import org.springframework.stereotype.Service;

@Service
public interface CebUserService extends SuperService {
    public List<CebUser> getAllCebUsers() throws Exception;

    public Optional<CebUser> getCebUser(int id) throws Exception;

    public boolean checkCebUser(String account_number) throws Exception;

    public CebUser saveCebUser(CebUser cebUser) throws Exception;

    public CebUser updateCebUser(CebUser cebUser) throws Exception;

    public void deleteCebUser(int id) throws Exception;
}
