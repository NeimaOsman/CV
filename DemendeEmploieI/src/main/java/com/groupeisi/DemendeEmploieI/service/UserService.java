package com.groupeisi.DemendeEmploieI.service;

import com.groupeisi.DemendeEmploieI.model.UserDtls;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
public interface UserService {
@Autowired
    public UserDtls createUser(UserDtls user);
public boolean checkEmail(String email);


}
