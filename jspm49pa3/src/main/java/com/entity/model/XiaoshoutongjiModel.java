package com.entity.model;

import com.entity.XiaoshoutongjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 销售统计
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2020-11-09 14:52:21
 */
public class XiaoshoutongjiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 月份
	 */
	
	private String yuefen;
		
	/**
	 * 销售额
	 */
	
	private Integer xiaoshoue;
		
	/**
	 * 登记日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date dengjiriqi;
				
	
	/**
	 * 设置：月份
	 */
	 
	public void setYuefen(String yuefen) {
		this.yuefen = yuefen;
	}
	
	/**
	 * 获取：月份
	 */
	public String getYuefen() {
		return yuefen;
	}
				
	
	/**
	 * 设置：销售额
	 */
	 
	public void setXiaoshoue(Integer xiaoshoue) {
		this.xiaoshoue = xiaoshoue;
	}
	
	/**
	 * 获取：销售额
	 */
	public Integer getXiaoshoue() {
		return xiaoshoue;
	}
				
	
	/**
	 * 设置：登记日期
	 */
	 
	public void setDengjiriqi(Date dengjiriqi) {
		this.dengjiriqi = dengjiriqi;
	}
	
	/**
	 * 获取：登记日期
	 */
	public Date getDengjiriqi() {
		return dengjiriqi;
	}
			
}
