package com.olib.maer.test;

import java.util.HashMap;
import java.util.Map;

import com.olib.maker.core.OlibMaker;
import com.olib.maker.util.OlibZipUtil;

public class OlibMakerTest {

	public static void test1(){
		OlibMaker maker = OlibMaker.getInstance();
		String templatePath="/Users/osh/git/olib-maker/backend/olib-maker-core/src/main/resources/template";
		String distPath="/Users/osh/git/olib-maker/backend/olib-maker-core/src/main/resources/dist";
		
		Map<String, String> dataMap = new HashMap<>();
		dataMap.put("package", "test.package;");
		dataMap.put("name", "HelloWorldservice");
		dataMap.put("return", "String");
		dataMap.put("methodname", "hello");
		dataMap.put("params", "String name");
		dataMap.put("body", "String res= \"Hi\" + name;\n System.out.println(res);");
		dataMap.put("val", "res;");
		
		maker.run(templatePath, distPath, dataMap);
	}
	
	public static void olibTemplateTest(){
		OlibMaker maker = OlibMaker.getInstance();
		String templatePath="/Users/osh/git/olib-maker/backend/olib-maker-core/src/main/resources/olib-template";
		String distPath="/Users/osh/git/olib-maker/backend/olib-maker-core/src/main/resources/dist";
		
		Map<String, String> dataMap = new HashMap<>();
		dataMap.put("projectSpringBootVersion", "1.5.7.RELEASE");
		dataMap.put("projectName", "olib-project");
		dataMap.put("projectClass", "OlibProject");
		dataMap.put("projectRootArtifactId", "olib-project");
		dataMap.put("projectGroup", "com.olib");
		dataMap.put("projectPath", "com/olib/");
		
		maker.run(templatePath, distPath, dataMap);
		
	}
	
	public static void kiwiTemplateTest(){
		OlibMaker maker = OlibMaker.getInstance();
		String templatePath="/Users/osh/git/olib-maker/backend/olib-maker-core/src/main/resources/olib-template";
		String distPath="/Users/osh/git/olib-maker/backend/olib-maker-core/src/main/resources/dist-kiwi";
		String zipPath="/Users/osh/git/olib-maker/backend/olib-maker-core/src/main/resources/zip";
		
		Map<String, String> dataMap = new HashMap<>();
		dataMap.put("projectSpringBootVersion", "1.5.7.RELEASE");
		dataMap.put("projectName", "kiwi");
		dataMap.put("projectClass", "Kiwi");
		dataMap.put("projectRootArtifactId", "kiwi");
		dataMap.put("projectGroup", "com.kiwi");
		dataMap.put("projectPath", "com/kiwi/");
		dataMap.put("projectModules", "land,land2,land3");
		
		maker.run(templatePath, distPath, dataMap);
		OlibZipUtil.zip(distPath, zipPath+"/kiwi.zip");
		
	}
	public static void masTemplateTest(){
		OlibMaker maker = OlibMaker.getInstance();
		String templatePath="/Users/osh/git/olib-maker/backend/olib-maker-core/src/main/resources/olib-template";
		String distPath="/Users/osh/git/olib-maker/backend/olib-maker-core/src/main/resources/dist-mars";
		String zipPath="/Users/osh/git/olib-maker/backend/olib-maker-core/src/main/resources/zip";
		
		Map<String, String> dataMap = new HashMap<>();
		dataMap.put("projectSpringBootVersion", "1.5.7.RELEASE");
		dataMap.put("projectName", "mas");
		dataMap.put("projectClass", "Mas");
		dataMap.put("projectRootArtifactId", "mas");
		dataMap.put("projectGroup", "kr.co.openbase.mas");
		dataMap.put("projectPath", "kr/co/openbase/mas/");
		dataMap.put("projectModules", "");
		
		maker.run(templatePath, distPath, dataMap);
		OlibZipUtil.zip(distPath, zipPath+"/dist-mas.zip");
		
	}
	
	public static void main(String[] ar){
		masTemplateTest();
	}
}
