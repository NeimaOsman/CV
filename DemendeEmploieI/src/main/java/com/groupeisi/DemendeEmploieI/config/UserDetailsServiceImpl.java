package com.groupeisi.DemendeEmploieI.config;

import com.groupeisi.DemendeEmploieI.model.UserDtls;
import com.groupeisi.DemendeEmploieI.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
private UserRepository useRepo;
    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        UserDtls user=useRepo.findByEmail(email);

        if (user!=null){
            return  new CustomUserDetails(user);
        }
        throw new UsernameNotFoundException("user not available");
    }
}













