package com.jike.mastersel;

import java.io.Serializable;
/**
 * 
 * @author mazhifei
 *
 */
public class RunningData implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4260577459043203630L;
	
	
	
	private Long cid;//服务器的id
	private String name;//服务器的名称
	public Long getCid() {
		return cid;
	}
	public void setCid(Long cid) {
		this.cid = cid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
