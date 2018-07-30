package com.zdst.bus.service.impl;

import com.zdst.bus.domain.CheckDangerExtend;
import com.zdst.bus.domain.CheckRecordByForm;
import com.zdst.bus.service.CheckDangerExtendService;
import com.zdst.bus.service.CheckRecordByFormService;
import com.zdst.bus.service.DownloadService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

/**
 * Created by sam on 2018/7/27.
 */
@Service
public class DownloadServiceImpl implements DownloadService {

    public static final String IMG_URL = "";

    @Autowired
    CheckRecordByFormService checkRecordByFormService;

    @Autowired
    CheckDangerExtendService checkDangerExtendService;

    public static void main(String[] args) {
        String img = "group3/M00/06/12/Ch1CB1pSz7OAIBxTAAEMRnm2NiM813.jpg";

        String prefix = img.substring(0, img.lastIndexOf("/"));
        String fileName = img.substring(img.lastIndexOf("/") + 1, img.length());
        System.out.println(prefix);
        System.out.println(fileName);
    }

    @Override
    public String downloadImg() {
//        List<CheckRecordByForm> fromList = checkRecordByFormService.queryAll();
//
//        if (fromList != null && !fromList.isEmpty()) {
//            for (CheckRecordByForm checkRecordByForm : fromList) {
//                createImg(checkRecordByForm.getSignPhoto());
//                System.out.println(checkRecordByForm.getSignPhoto());
//            }
//        }


        List<CheckDangerExtend> extendList = checkDangerExtendService.queryAll();

        if (extendList != null && !extendList.isEmpty()) {
            for (CheckDangerExtend checkDangerExtend : extendList) {
                createImg(checkDangerExtend.getDangerPhoto());

            }
        }
        System.out.println("download end");
        return "success";
    }


    private void createImg(String imgUrl) {
        String[] imgArr = null;
        if (StringUtils.isNotBlank(imgUrl) && imgUrl.indexOf(",") != -1) {
            imgArr = imgUrl.split(",");
        } else {
            imgArr = new String[]{imgUrl};
        }


        if (imgArr != null && imgArr.length > 0) {
            for (String img : imgArr) {
                if (img != null && img.length() > 0 && !img.equals("null") && img.contains("group")) {
                    String prefix = img.substring(0, img.lastIndexOf("/"));
                    String fileName = img.substring(img.lastIndexOf("/"), img.length());
                    try {
                        download(IMG_URL + img, fileName, "D:\\" + prefix);
                    } catch (Exception e) {
                        System.out.println("error img urls = " + imgUrl);
                        // e.printStackTrace();
                    }
                }
            }
        }
    }


    public void download(String urlString, String filename, String savePath) throws Exception {
        // 构造URL
        URL url = new URL(urlString);
        // 打开连接
        URLConnection con = url.openConnection();
        //设置请求超时为5s
        con.setConnectTimeout(5 * 1000);
        // 输入流
        InputStream is = con.getInputStream();

        // 1K的数据缓冲
        byte[] bs = new byte[1024];
        // 读取到的数据长度
        int len;
        // 输出的文件流
        File sf = new File(savePath);
        if (!sf.exists()) {
            sf.mkdirs();
        }
        OutputStream os = new FileOutputStream(sf.getPath() + "\\" + filename);
        // 开始读取
        while ((len = is.read(bs)) != -1) {
            os.write(bs, 0, len);
        }
        // 完毕，关闭所有链接
        os.close();
        is.close();
    }


}
