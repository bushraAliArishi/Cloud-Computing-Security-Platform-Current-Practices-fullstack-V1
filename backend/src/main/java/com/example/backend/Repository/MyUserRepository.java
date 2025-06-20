package com.example.backend.Repository;
import com.example.backend.Model.MyUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MyUserRepository extends JpaRepository<MyUser,Integer> {
    MyUser findMyUserByUsername(String username);
    MyUser findMyUserByEmail(String email);
    MyUser findMyUserById(Integer id);
    List<MyUser> findMyUserByRole(String role);
}