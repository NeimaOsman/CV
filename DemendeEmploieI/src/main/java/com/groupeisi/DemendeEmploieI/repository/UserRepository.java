package com.groupeisi.DemendeEmploieI.repository;

import com.groupeisi.DemendeEmploieI.model.UserDtls;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserDtls,Integer> {
    public boolean existsByEmail(String email);
    public UserDtls findByEmail(String email);
}

