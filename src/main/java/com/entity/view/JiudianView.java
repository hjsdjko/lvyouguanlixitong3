package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.JiudianEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 酒店
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("jiudian")
public class JiudianView extends JiudianEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//当前表
	/**
	* 酒店类型的值
	*/
	@ColumnInfo(comment="酒店类型的字典表值",type="varchar(200)")
	private String jiudianValue;




	public JiudianView() {

	}

	public JiudianView(JiudianEntity jiudianEntity) {
		try {
			BeanUtils.copyProperties(this, jiudianEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	//当前表的
	/**
	* 获取： 酒店类型的值
	*/
	public String getJiudianValue() {
		return jiudianValue;
	}
	/**
	* 设置： 酒店类型的值
	*/
	public void setJiudianValue(String jiudianValue) {
		this.jiudianValue = jiudianValue;
	}




	@Override
	public String toString() {
		return "JiudianView{" +
			", jiudianValue=" + jiudianValue +
			"} " + super.toString();
	}
}
