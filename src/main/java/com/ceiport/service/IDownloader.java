package com.ceiport.service;

import org.springframework.stereotype.Service;

/**
 *  Downloader下载器
 * @author wanghe
 */
@Service
public interface IDownloader {

    void DownloadPDF(String url);
}
