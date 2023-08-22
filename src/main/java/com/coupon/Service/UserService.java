package com.coupon.Service;

import com.coupon.Repositary.UserRepositary;
import com.coupon.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepositary userRepositary;

    public void save(User user) {
        System.out.println("i am present in service calss="+user);
        userRepositary.save(user);

    }
}
