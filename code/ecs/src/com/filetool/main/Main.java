package com.filetool.main;

import com.elasticcloudservice.predict.Predict;
import com.filetool.util.FileUtil;
import com.filetool.util.LogUtil;

/**
 * 
 * 工具入口
 * 
 * @version [版本号, 2017-12-8]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public class Main {
	public static void main(String[] args) {

//		if (args.length != 3) {
//			System.err
//					.println("please input args: ecsDataPath, inputFilePath, resultFilePath");
//			return;?
//		}

//		String ecsDataPath = args[0];
//		String inputFilePath = args[1];
//		String resultFilePath = args[2];

		String ecsDataPath = "E:\\HW\\练习数据\\初赛文档\\用例示例\\TestData_2015.2.20_2015.2.27.txt";
		String inputFilePath = "E:\\HW\\练习数据\\初赛文档\\用例示例\\input_5flavors_cpu_7days.txt";
		String resultFilePath = "E:\\HW\\练习数据\\初赛文档\\用例示例\\ans.txt";

		LogUtil.printLog("Begin");

		// 读取输入文件
		String[] ecsContent = FileUtil.read(ecsDataPath, null);
		String[] inputContent = FileUtil.read(inputFilePath, null);

		// 功能实现入口
		String[] resultContents = Predict.predictVm(ecsContent, inputContent);

		// 写入输出文件
		if (hasResults(resultContents)) {
			FileUtil.write(resultFilePath, resultContents, false);
		} else {
			FileUtil.write(resultFilePath, new String[] { "NA" }, false);
		}
		LogUtil.printLog("End");
	}

	private static boolean hasResults(String[] resultContents) {
		if (resultContents == null) {
			return false;
		}
		for (String contents : resultContents) {
			if (contents != null && !contents.trim().isEmpty()) {
				return true;
			}
		}
		return false;
	}

}