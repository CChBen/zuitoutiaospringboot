package com.cb.web.zuitoutiao.utils;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class FileUploadUtil {
    public static final List<String> ALLOW_TYPES = Arrays.asList(
            "image/jpg", "image/jpeg", "image/png", "image/gif"
    );

    //文件重命名
    public static String rename(String fileName) {
        int i = fileName.lastIndexOf(".");
        String str = fileName.substring(i);
        return System.currentTimeMillis() + "" + new Random().nextInt(99999999) + str;
    }

    //校验文件类型是否是被允许的
    public static boolean allowUpload(String postfix) {
        return ALLOW_TYPES.contains(postfix);
    }
}
