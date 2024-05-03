package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.LuxianLiuyanEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 旅游路线评论
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("luxian_liuyan")
public class LuxianLiuyanView extends LuxianLiuyanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//当前表

	//级联表 旅游路线
		/**
		* 旅游路线名称
		*/

		@ColumnInfo(comment="旅游路线名称",type="varchar(200)")
		private String luxianName;
		/**
		* 旅游路线编号
		*/

		@ColumnInfo(comment="旅游路线编号",type="varchar(200)")
		private String luxianUuidNumber;
		/**
		* 旅游路线照片
		*/

		@ColumnInfo(comment="旅游路线照片",type="varchar(200)")
		private String luxianPhoto;
		/**
		* 旅游出发地
		*/

		@ColumnInfo(comment="旅游出发地",type="varchar(200)")
		private String luxianChufa;
		/**
		* 旅游途径地
		*/

		@ColumnInfo(comment="旅游途径地",type="varchar(200)")
		private String luxianTujing;
		/**
		* 旅游目的地
		*/

		@ColumnInfo(comment="旅游目的地",type="varchar(200)")
		private String luxianMudi;
		/**
		* 赞
		*/

		@ColumnInfo(comment="赞",type="int(11)")
		private Integer zanNumber;
		/**
		* 踩
		*/

		@ColumnInfo(comment="踩",type="int(11)")
		private Integer caiNumber;
		/**
		* 旅游路线介绍
		*/

		@ColumnInfo(comment="旅游路线介绍",type="longtext")
		private String luxianContent;
		/**
		* 逻辑删除
		*/

		@ColumnInfo(comment="逻辑删除",type="int(11)")
		private Integer luxianDelete;
	//级联表 用户
		/**
		* 用户姓名
		*/

		@ColumnInfo(comment="用户姓名",type="varchar(200)")
		private String yonghuName;
		/**
		* 用户手机号
		*/

		@ColumnInfo(comment="用户手机号",type="varchar(200)")
		private String yonghuPhone;
		/**
		* 用户身份证号
		*/

		@ColumnInfo(comment="用户身份证号",type="varchar(200)")
		private String yonghuIdNumber;
		/**
		* 用户头像
		*/

		@ColumnInfo(comment="用户头像",type="varchar(200)")
		private String yonghuPhoto;
		/**
		* 余额
		*/
		@ColumnInfo(comment="余额",type="decimal(10,2)")
		private Double newMoney;
		/**
		* 用户邮箱
		*/

		@ColumnInfo(comment="用户邮箱",type="varchar(200)")
		private String yonghuEmail;



	public LuxianLiuyanView() {

	}

	public LuxianLiuyanView(LuxianLiuyanEntity luxianLiuyanEntity) {
		try {
			BeanUtils.copyProperties(this, luxianLiuyanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}





	//级联表的get和set 旅游路线

		/**
		* 获取： 旅游路线名称
		*/
		public String getLuxianName() {
			return luxianName;
		}
		/**
		* 设置： 旅游路线名称
		*/
		public void setLuxianName(String luxianName) {
			this.luxianName = luxianName;
		}

		/**
		* 获取： 旅游路线编号
		*/
		public String getLuxianUuidNumber() {
			return luxianUuidNumber;
		}
		/**
		* 设置： 旅游路线编号
		*/
		public void setLuxianUuidNumber(String luxianUuidNumber) {
			this.luxianUuidNumber = luxianUuidNumber;
		}

		/**
		* 获取： 旅游路线照片
		*/
		public String getLuxianPhoto() {
			return luxianPhoto;
		}
		/**
		* 设置： 旅游路线照片
		*/
		public void setLuxianPhoto(String luxianPhoto) {
			this.luxianPhoto = luxianPhoto;
		}

		/**
		* 获取： 旅游出发地
		*/
		public String getLuxianChufa() {
			return luxianChufa;
		}
		/**
		* 设置： 旅游出发地
		*/
		public void setLuxianChufa(String luxianChufa) {
			this.luxianChufa = luxianChufa;
		}

		/**
		* 获取： 旅游途径地
		*/
		public String getLuxianTujing() {
			return luxianTujing;
		}
		/**
		* 设置： 旅游途径地
		*/
		public void setLuxianTujing(String luxianTujing) {
			this.luxianTujing = luxianTujing;
		}

		/**
		* 获取： 旅游目的地
		*/
		public String getLuxianMudi() {
			return luxianMudi;
		}
		/**
		* 设置： 旅游目的地
		*/
		public void setLuxianMudi(String luxianMudi) {
			this.luxianMudi = luxianMudi;
		}

		/**
		* 获取： 赞
		*/
		public Integer getZanNumber() {
			return zanNumber;
		}
		/**
		* 设置： 赞
		*/
		public void setZanNumber(Integer zanNumber) {
			this.zanNumber = zanNumber;
		}

		/**
		* 获取： 踩
		*/
		public Integer getCaiNumber() {
			return caiNumber;
		}
		/**
		* 设置： 踩
		*/
		public void setCaiNumber(Integer caiNumber) {
			this.caiNumber = caiNumber;
		}

		/**
		* 获取： 旅游路线介绍
		*/
		public String getLuxianContent() {
			return luxianContent;
		}
		/**
		* 设置： 旅游路线介绍
		*/
		public void setLuxianContent(String luxianContent) {
			this.luxianContent = luxianContent;
		}

		/**
		* 获取： 逻辑删除
		*/
		public Integer getLuxianDelete() {
			return luxianDelete;
		}
		/**
		* 设置： 逻辑删除
		*/
		public void setLuxianDelete(Integer luxianDelete) {
			this.luxianDelete = luxianDelete;
		}
	//级联表的get和set 用户

		/**
		* 获取： 用户姓名
		*/
		public String getYonghuName() {
			return yonghuName;
		}
		/**
		* 设置： 用户姓名
		*/
		public void setYonghuName(String yonghuName) {
			this.yonghuName = yonghuName;
		}

		/**
		* 获取： 用户手机号
		*/
		public String getYonghuPhone() {
			return yonghuPhone;
		}
		/**
		* 设置： 用户手机号
		*/
		public void setYonghuPhone(String yonghuPhone) {
			this.yonghuPhone = yonghuPhone;
		}

		/**
		* 获取： 用户身份证号
		*/
		public String getYonghuIdNumber() {
			return yonghuIdNumber;
		}
		/**
		* 设置： 用户身份证号
		*/
		public void setYonghuIdNumber(String yonghuIdNumber) {
			this.yonghuIdNumber = yonghuIdNumber;
		}

		/**
		* 获取： 用户头像
		*/
		public String getYonghuPhoto() {
			return yonghuPhoto;
		}
		/**
		* 设置： 用户头像
		*/
		public void setYonghuPhoto(String yonghuPhoto) {
			this.yonghuPhoto = yonghuPhoto;
		}

		/**
		* 获取： 余额
		*/
		public Double getNewMoney() {
			return newMoney;
		}
		/**
		* 设置： 余额
		*/
		public void setNewMoney(Double newMoney) {
			this.newMoney = newMoney;
		}

		/**
		* 获取： 用户邮箱
		*/
		public String getYonghuEmail() {
			return yonghuEmail;
		}
		/**
		* 设置： 用户邮箱
		*/
		public void setYonghuEmail(String yonghuEmail) {
			this.yonghuEmail = yonghuEmail;
		}


	@Override
	public String toString() {
		return "LuxianLiuyanView{" +
			", luxianName=" + luxianName +
			", luxianUuidNumber=" + luxianUuidNumber +
			", luxianPhoto=" + luxianPhoto +
			", luxianChufa=" + luxianChufa +
			", luxianTujing=" + luxianTujing +
			", luxianMudi=" + luxianMudi +
			", zanNumber=" + zanNumber +
			", caiNumber=" + caiNumber +
			", luxianContent=" + luxianContent +
			", luxianDelete=" + luxianDelete +
			", yonghuName=" + yonghuName +
			", yonghuPhone=" + yonghuPhone +
			", yonghuIdNumber=" + yonghuIdNumber +
			", yonghuPhoto=" + yonghuPhoto +
			", newMoney=" + newMoney +
			", yonghuEmail=" + yonghuEmail +
			"} " + super.toString();
	}
}
