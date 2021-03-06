package org.crazyit.activiti;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngineConfiguration;

public class DatabaseSchemaUpdateCreateDrop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 读取Activiti配置
		ProcessEngineConfiguration config = ProcessEngineConfiguration
				.createProcessEngineConfigurationFromResource("schemaUpdate-create-drop.xml");
		// 启动Activiti
		ProcessEngine engine = config.buildProcessEngine();
		// 关闭流程引擎
		engine.close();
	}

}
