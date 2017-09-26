package com.olib.maker.util;

import net.lingala.zip4j.core.ZipFile;
import net.lingala.zip4j.model.ZipParameters;
import net.lingala.zip4j.util.Zip4jConstants;

public class OlibZipUtil {

	public static boolean zip(String sourcePath, String distPath){
		try {
			ZipFile zipFile = new ZipFile(distPath);
			ZipParameters parameters = new ZipParameters();
			parameters.setCompressionMethod(Zip4jConstants.COMP_DEFLATE);
			parameters.setCompressionLevel(Zip4jConstants.DEFLATE_LEVEL_NORMAL);
			zipFile.createZipFileFromFolder(sourcePath, parameters, false, 0);
			return true;
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public static boolean unZip(String sourcePath, String distPath){
		try {
			ZipFile zipFile = new ZipFile(sourcePath);
			zipFile.extractAll(distPath);
			return true;
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public static void main(String[] ar){
		String source="/Users/osh/git/olib-maker/backend/olib-maker-core/src/main/resources/olib-template";
		String dist="/Users/osh/git/olib-maker/backend/olib-maker-core/src/main/resources/zip/olib-template.zip";
		zip(source,dist);
//		unZip(dist,source);
	}
	
}
