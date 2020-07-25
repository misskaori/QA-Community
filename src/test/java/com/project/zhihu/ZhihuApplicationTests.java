package com.project.zhihu;

import com.project.zhihu.Dao.UserDao;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.project.zhihu.Model.*;
import org.springframework.test.context.junit4.SpringRunner;


@SpringBootTest
class ZhihuApplicationTests {

    @Autowired
    UserDao userdao;
    User user = new User("MingyueSUN","zlxsmy940305","smyxixi","haha");
    @Test
    void contextLoads() {
        user.setId(userdao.selectMaxID());
        System.out.println(user);
    }

}
