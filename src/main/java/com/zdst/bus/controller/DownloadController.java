package com.zdst.bus.controller;

import com.zdst.bus.service.DownloadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sam on 2018/7/27.
 */
@RestController
@RequestMapping("download")
public class DownloadController {

    @Autowired
    private DownloadService downloadService;

    @ResponseBody
    @RequestMapping(value="/downloadImg")
    public String downloadImg() {
        return downloadService.downloadImg();
    }
}
