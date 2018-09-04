package com.mooc.house.api.service;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.google.common.collect.Lists;
import com.mooc.house.api.utils.FileUtil;

@Service
public class FileService {
  
  
  @Value("${file.path}")
  private String filePath;
  
  public List<String> getImgPaths(List<MultipartFile> files) {
    String prefix = this.getClass().getResource("/static/static").getPath();
    List<String> paths = Lists.newArrayList();
    files.forEach(file -> {
      File localFile = null;
      try {
        if (!file.isEmpty()) {
          localFile = FileUtil.saveToLocal(file, prefix+filePath);
          String path = StringUtils.substringAfterLast(localFile.getAbsolutePath().replace("\\","/"), filePath.substring(1,filePath.length()));
          paths.add(path);
        }
      } catch (IOException e) {
        throw new RuntimeException(e.getMessage());
      }
    });
    return paths;
    
  }

}
