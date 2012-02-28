package com.caeit.vo;

public class Task {

  private int id;
  private int pid;
  private int plan_id;
  private String name;
  private String detail;
  private String start_date;
  private String end_date;
  private int percentage;
  private String finished;

  public Task() {
    name="";
    detail="";
    start_date="";
    end_date="";
    finished="";
  }
  public int getId() {
    return id;
  }
  public void setId(int id){
    this.id = id;
  }
  public int getPid() {
    return pid;
  }
  public void setPid(int pid){
    this.pid = pid;
  }
  public int getPlan_id() {
    return plan_id;
  }
  public void setPlan_id(int plan_id){
    this.plan_id = plan_id;
  }
  public String getName() {
    return name;
  }
  public void setName(String name){
    this.name = name;
  }
  public String getDetail() {
    return detail;
  }
  public void setDetail(String detail){
    this.detail = detail;
  }
  public String getStart_date() {
    return start_date;
  }
  public void setStart_date(String start_date){
    this.start_date = start_date;
  }
  public String getEnd_date() {
    return end_date;
  }
  public void setEnd_date(String end_date){
    this.end_date = end_date;
  }
  public int getPercentage() {
    return percentage;
  }
  public void setPercentage(int percentage){
    this.percentage = percentage;
  }
  public String getFinished() {
    return finished;
  }
  public void setFinished(String finished){
    this.finished = finished;
  }
}
