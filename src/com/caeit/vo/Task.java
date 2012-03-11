package com.caeit.vo;

/**
 * PtpTask entity. @author MyEclipse Persistence Tools
 */

public class Task implements java.io.Serializable {

	// Fields

	private long id;
	private long pid;
	private long planId;
	private String name;
	private String detail;
	private String startDate;
	private String endDate;
	private long percentage;
	private char finished;

	// Constructors

	/** default constructor */
	public Task() {
	}

	/** full constructor */
	public Task(long pid, long planId, String name,
			String detail, String startDate, String endDate,
			long percentage, char finished) {
		this.pid = pid;
		this.planId = planId;
		this.name = name;
		this.detail = detail;
		this.startDate = startDate;
		this.endDate = endDate;
		this.percentage = percentage;
		this.finished = finished;
	}

	// Property accessors

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getPid() {
		return this.pid;
	}

	public void setPid(long pid) {
		this.pid = pid;
	}

	public long getPlanId() {
		return this.planId;
	}

	public void setPlanId(long planId) {
		this.planId = planId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDetail() {
		return this.detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getStartDate() {
		return this.startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return this.endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public long getPercentage() {
		return this.percentage;
	}

	public void setPercentage(long percentage) {
		this.percentage = percentage;
	}

	public char getFinished() {
		return this.finished;
	}

	public void setFinished(char finished) {
		this.finished = finished;
	}

}