package com.virginmedia.processor;

import org.springframework.batch.item.ItemProcessor;

import com.virginmedia.model.DataSet;

//process before writing
public class DataProcessor implements ItemProcessor<DataSet, DataSet> {

	@Override
	public DataSet process(DataSet item) throws Exception {
		try {
			System.out.println(">>" + item.toString());
			if (item.getServiceName().equalsIgnoreCase("manageuser")) {
				throw new Exception("exception");
			} else {
				item.setStatus("success");
				item.setErrorCode("0");
			}
			
			Thread t2 = new Thread();
			t2.sleep(0); 
			System.out.println("Step 2.Process it..");

		} catch (Exception e) {
			item.setStatus("failed");
			item.setErrorCode("999");
		}
		System.out.println("================================");
		System.out.println(">> Status :" + item.getStatus());
		System.out.println("================================");

		return item;
	}
}