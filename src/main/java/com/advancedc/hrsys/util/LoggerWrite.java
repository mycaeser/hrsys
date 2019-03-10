package com.advancedc.hrsys.util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LoggerWrite {
	private static String SIGN = ">>";
	private static String realPath = PathUtil.getLogBasePath();
	private static String extendName = ".log";

	public static boolean createFile(String destFileName) {
		File file = new File(destFileName);
		if (file.exists()) {
			return false;
		}
		if (destFileName.endsWith(File.separator)) {
			return false;
		}
		// 判断目标文件所在的目录是否存在
		if (!file.getParentFile().exists()) {
			// 如果目标文件所在的目录不存在，则创建父目录
			if (!file.getParentFile().mkdirs()) {
				return false;
			}
		}
		// 创建目标文件
		try {
			if (file.createNewFile()) {
				return true;
			} else {
				return false;
			}
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
	}
	public static void WriteStringToFile(String filePath,String tag,String message) {
		try {
			SimpleDateFormat df = new SimpleDateFormat("[yyyy-MM-dd HH:mm:ss]");// 设置日期格式
			String dateDfName = df.format(new Date());// new Date()为获取当前系统时间
            FileWriter fw = new FileWriter(filePath, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("\r\n"+dateDfName+SIGN+tag+SIGN+message);// 往已有的文件上添加字符串
            bw.close();
            fw.close();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
	}
	public static void WriteLog(String tag,String message) {
		SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");// 设置日期格式
		String dateName = df.format(new Date());// new Date()为获取当前系统时间
		String finalFileNameString=realPath+dateName+extendName;
		createFile(finalFileNameString);
		WriteStringToFile(finalFileNameString,tag,message);
	}

}
