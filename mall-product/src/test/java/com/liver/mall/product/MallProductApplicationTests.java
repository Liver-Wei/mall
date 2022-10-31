package com.liver.mall.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.liver.mall.product.entity.BrandEntity;
import com.liver.mall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootTest
class MallProductApplicationTests {
    @Autowired
    BrandService brandService;

//    @Test
//    public void uploadToAliyunOss() throws FileNotFoundException {
///*
////        // Endpoint以华东1（杭州）为例，其它Region请按实际情况填写。
////        String endpoint = "oss-cn-shenzhen.aliyuncs.com";
////        // 阿里云账号AccessKey拥有所有API的访问权限，风险很高。强烈建议您创建并使用RAM用户进行API访问或日常运维，请登录RAM控制台创建RAM用户。
//        String accessKeyId = "";
//        String accessKeySecret = "";
//        // 填写Bucket名称，例如examplebucket。
//        // 填写Object完整路径，例如exampledir/exampleobject.txt。Object完整路径中不能包含Bucket名称。
//        //String objectName = "\u202AE:\\Downloads\\icon\\waimai.png";
//
//        // 创建OSSClient实例。
//        //OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);
// */
//        String bucketName = "livermall";
//        OSS oss = OssUtils.getOSS();
//        try {
//            //String content = "Hello OSS";
//            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
//            String dateDir = simpleDateFormat.format(new Date())+"/";
////            File file = ResourceUtils.getFile("static/waimai.png");
////            System.out.println(file.getPath());
////            System.out.println(file.getAbsolutePath());
//            oss.putObject(bucketName, "外卖.png", new FileInputStream("E:\\Downloads\\icon\\外卖.png"));
//        } catch (OSSException oe) {
//            System.out.println("Caught an OSSException, which means your request made it to OSS, "
//                    + "but was rejected with an error response for some reason.");
//            System.out.println("Error Message:" + oe.getErrorMessage());
//            System.out.println("Error Code:" + oe.getErrorCode());
//            System.out.println("Request ID:" + oe.getRequestId());
//            System.out.println("Host ID:" + oe.getHostId());
//        } catch (ClientException ce) {
//            System.out.println("Caught an ClientException, which means the client encountered "
//                    + "a serious internal problem while trying to communicate with OSS, "
//                    + "such as not being able to access the network.");
//            System.out.println("Error Message:" + ce.getMessage());
//        } finally {
//            if (oss != null) {
//                oss.shutdown();
//            }
//        }
//
//    }

    @Test
    public void contextLoads() {
//        BrandEntity brandEntity = new BrandEntity();
//        brandEntity.setDescript("华为");
//
//        boolean save = brandService.save(brandEntity);
//        System.out.println(save+"成功");
//        BrandEntity brandEntity = new BrandEntity();
//        brandEntity.setDescript("小米");
//        brandEntity.setBrandId(1L);
//        brandService.updateById(brandEntity);
        QueryWrapper<BrandEntity> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("brand_id", 1L);
        BrandEntity one = brandService.getOne(queryWrapper);
        System.out.println(one.toString());
    }


}
