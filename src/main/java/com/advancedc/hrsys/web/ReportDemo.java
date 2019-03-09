package com.advancedc.hrsys.web;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;


@Controller
@RequestMapping("/report")
public class ReportDemo {
	
	@RequestMapping(value="/v1",method=RequestMethod.GET)
	public void  preTest(/*HttpServletRequest request,*/ HttpServletResponse response) {
		
		try{
			List<Map<String,String>> dataSource=new ArrayList<Map<String,String>>();;
			Map<String,String> m=new HashMap<String,String>();
			m.put("add_name", "Caeser");
			m.put("add_content", "gaofushuai");
			m.put("add_phone_owner", "Caeser");
			m.put("add_phone_number","188888888888");
			dataSource.add(m);
			JRDataSource jrDataSource=new JRBeanCollectionDataSource(dataSource);
			String path=Thread.currentThread().getContextClassLoader().getResource("").toString();
			path=path.replace('/', '\\'); // 将/换成\
			path=path.replace("file:", ""); //去掉file:
			path=path.replace("classes\\", ""); //去掉class\
			path=path.substring(1); //去掉第一个\,如 \D:\JavaWeb...
			path+="report/v1/DemoReport1.jrxml";
			InputStream input=new FileInputStream(new File(path));
			JasperReport jasperReport=JasperCompileManager.compileReport(input);
			JasperPrint jasperPrint=JasperFillManager.fillReport(jasperReport,null,jrDataSource);
			JasperExportManager.exportReportToPdfStream(jasperPrint,response.getOutputStream());
			response.getOutputStream().flush();
			response.getOutputStream().close();
		}catch(Exception e){
			e.printStackTrace();
		}
		return ;
	}
}
