package com.rapidpay.ceb.service.custom.impl;

import java.util.List;
import java.util.Optional;

import com.rapidpay.ceb.model.CebUser;
import com.rapidpay.ceb.repo.custom.CebUserRepo;
import com.rapidpay.ceb.service.custom.CebUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CebUserServiceImpl implements CebUserService {

    @Autowired
    private CebUserRepo cebUserRepo;

    @Override
    public List<CebUser> getAllCebUsers() throws Exception {
        return cebUserRepo.findAll();
    }

    @Override
    public Optional<CebUser> getCebUser(int id) throws Exception {
        return cebUserRepo.findById(id);
    }

    @Override
    public boolean checkCebUser(String account_number) throws Exception {
        List<CebUser> cebUsers = cebUserRepo.findAll();

        for (CebUser cebUser: cebUsers){
            if(cebUser.getAccount_number().equals(account_number)){
                return true;
            }
        }
        
        return false;
    }

    @Override
    public CebUser saveCebUser(CebUser cebUser) throws Exception {
        return cebUserRepo.save(cebUser);
    }

    @Override
    public CebUser updateCebUser(CebUser cebUser) throws Exception {
        if(!cebUserRepo.findById(cebUser.getId()).isEmpty()){
            return cebUserRepo.save(cebUser);
        }else{
            return null;
        }
    }

    @Override
    public void deleteCebUser(int id) throws Exception {
        cebUserRepo.deleteById(id);
    }

}
