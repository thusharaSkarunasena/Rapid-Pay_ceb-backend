package com.rapidpay.ceb.controller;

import java.util.List;
import java.util.Optional;
import com.rapidpay.ceb.model.CebUser;
import com.rapidpay.ceb.service.custom.CebUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/ceb_user")
public class CebUserController {

    @Autowired
    private CebUserService cebUserService;

    @GetMapping("/getAllCebUsers")
    public List<CebUser> getAllCebUsers() {
        try {
            return cebUserService.getAllCebUsers();
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }

    @GetMapping("/getCebUser/{id}")
    public Optional<CebUser> getCebUser(@PathVariable("id") int id) {
        try {
            return cebUserService.getCebUser(id);
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }

    @GetMapping("/checkCebUser/{account_number}")
    public boolean checkCebUser(@PathVariable("account_number") String account_number) {
        try {
            return cebUserService.checkCebUser(account_number);
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }

    @PostMapping("/saveCebUser")
    public CebUser saveCebUser(@RequestBody CebUser cebUser) {
        try {
            return cebUserService.saveCebUser(cebUser);
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }

    @PutMapping("/updateCebUser")
    public CebUser updateCebUser(@RequestBody CebUser cebUser) {
        try {
            return cebUserService.updateCebUser(cebUser);
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }

    @DeleteMapping("/deleteCebUser/{id}")
    public void deleteCebUser(@PathVariable("id") int id) {
        try {
            cebUserService.deleteCebUser(id);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
