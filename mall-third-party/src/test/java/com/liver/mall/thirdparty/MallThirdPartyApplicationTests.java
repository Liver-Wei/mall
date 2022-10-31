package com.liver.mall.thirdparty;

import com.aliyun.oss.OSSClient;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

@SpringBootTest
class MallThirdPartyApplicationTests {

    @Test
    void contextLoads() {
    }
    @Autowired
    OSSClient ossClient;

    @Test
    public void uploadFileTest() throws FileNotFoundException {
        ossClient.putObject("livermall","my.png",new FileInputStream("E:\\Downloads\\icon\\my.png"));
        ossClient.shutdown();
        System.out.println("文件上传成功");
    }

}
