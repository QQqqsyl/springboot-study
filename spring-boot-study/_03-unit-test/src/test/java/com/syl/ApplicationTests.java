package com.syl;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationTests {

    @Test
    void contextLoads() {
        System.out.println("蝴蝶知道他爱谁");
        System.out.println("外面的噪音太多 说什么don't wanna know");

    }


    @Test
    void userAddTest(){
        System.out.println("用户添加成功!");
    }
    @Test
    void  userDeleteTest(){
        System.out.println("用户成功删除!");
    }
    @Test
    void userModifyTest(){
        System.out.println("用户成功修改!");
    }
    @Test
    void userQueryTest(){
        System.out.println("用户查询成功!");
    }


}
