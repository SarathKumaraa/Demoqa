package org.reports;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReports {

	public static void generateJVMReport(String json) {
		
		File f = new File("src/test/resources/reports");
		
		Configuration c = new Configuration(f, "CucuTuzzut");
		
		c.addClassifications("Browser name", "Chrome");
		c.addClassifications("Sprint", "10");
		
		List <String> l = new LinkedList();
		l.add(json);
		
		ReportBuilder r = new ReportBuilder(l,c);
		r.generateReports();
		
		
		}
}
