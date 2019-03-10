package com.advancedc.hrsys.util;

public class PathUtil {
	private static String seperator = System.getProperty("file.separator");
	public static String filePathInDatabase="images/";
	
	//返回当前文件的绝对路径
	public static String getImgBasePath() {

		String os = System.getProperty("os.name");
		String basePath = "";
		if (os.toLowerCase().startsWith("win")) {
			basePath = "D:/hrsys/v1/";
		} else {
			basePath = "/home/roofso/image/";
		}
		basePath = basePath.replace("/", seperator);
		return basePath;
	}

	public static String getLogBasePath() {

		String os = System.getProperty("os.name");
		String basePath = "";
		if (os.toLowerCase().startsWith("win")) {
			basePath = "D:/hrsys/log/";
		} else {
			basePath = "/home/roofso/log/";
		}
		basePath = basePath.replace("/", seperator);
		return basePath;
	}
	public static String getShopImagePath(long shopId) {
		String imagePath = "/upload/item/shop/" + shopId + "/";
		//return imagePath.replace("/", seperator);
		return imagePath;
	}
}