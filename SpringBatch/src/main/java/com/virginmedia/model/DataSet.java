package com.virginmedia.model;

public class DataSet {

	private String serviceName;
	private String operationName;
	private String parameters;
	private String status;
	private String errorCode;

	public String getId() {
		return serviceName;
	}

	public void setId(String serviceName) {
		this.serviceName = serviceName;
	}

	public String getParameters() {
		return parameters;
	}

	public void setParameters(String parameters) {
		this.parameters = parameters;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	
	public String getOperationName() {
		return operationName;
	}

	public void setOperationName(String operationName) {
		this.operationName = operationName;
	}
	

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	@Override
	public String toString() {
		return "Report [Service=" + serviceName + ", Operation=" +operationName+ ", Parameters=" + parameters + "]";
	}

}