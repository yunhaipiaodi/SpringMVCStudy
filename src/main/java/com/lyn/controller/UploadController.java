package com.lyn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.UUID;

/**
 * @author lyn
 * @create 2020-04-30 8:22
 */
@Controller
@RequestMapping("/uploadControl")
public class UploadController {

    @RequestMapping("/upload")
    public String upload(HttpServletRequest httpServletRequest,MultipartFile upload) throws IOException {
        System.out.println("文件上传");

        //判断是否存在上传文件保存路径，如果没有则创建
        String savedFilePath =httpServletRequest.getServletContext().getRealPath("/upload/");
        File file = new File(savedFilePath);
        if(!file.exists()){
            file.mkdir();
        }

        //获取上传文件名
        String originalFilename = upload.getOriginalFilename();

        //通过uuId生成随机串，然后拼接文件名，防止文件名重复导致文件覆盖
        String randomUUID = UUID.randomUUID().toString().replace("-","");
        originalFilename = randomUUID + originalFilename;

        System.out.println("savedFilePath:" + savedFilePath + "; originalFilename:" + originalFilename);

        //根据拼接文件名保存文件
        upload.transferTo(new File(savedFilePath,originalFilename));

        return "/success";
    }
}
