package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.JiudianOrderEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 酒店订单
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("jiudian_order")
public class JiudianOrderView extends JiudianOrderEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//当前表
	/**
	* 订单类型的值
	*/
	@ColumnInfo(comment="订单类型的字典表值",type="varchar(200)")
	private String jiudianOrderValue;

	//级联表 酒店
		/**
		* 酒店名称
		*/

		@ColumnInfo(comment="酒店名称",type="varchar(200)")
		private String jiudianName;
		/**
		* 酒店编号
		*/

		@ColumnInfo(comment="酒店编号",type="varchar(200)")
		private String jiudianUuidNumber;
		/**
		* 酒店照片
		*/

		@ColumnInfo(comment="酒店照片",type="varchar(200)")
		private String jiudianPhoto;
		/**
		* 酒店地点
		*/

		@ColumnInfo(comment="酒店地点",type="varchar(200)")
		private String jiudianAddress;
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
		* 酒店视频
		*/

		@ColumnInfo(comment="酒店视频",type="varchar(200)")
		private String jiudianVideo;
		/**
		* 酒店类型
		*/
		@ColumnInfo(comment="酒店类型",type="int(11)")
		private Integer jiudianTypes;
			/**
			* 酒店类型的值
			*/
			@ColumnInfo(comment="酒店类型的字典表值",type="varchar(200)")
			private String jiudianValue;
		/**
		* 酒店入住人数
		*/

		@ColumnInfo(comment="酒店入住人数",type="int(11)")
		private Integer jiudianKucunNumber;
		/**
		* 现价/积分
		*/
		@ColumnInfo(comment="现价/积分",type="decimal(10,2)")
		private Double jiudianNewMoney;
		/**
		* 酒店介绍
		*/

		@ColumnInfo(comment="酒店介绍",type="longtext")
		private String jiudianContent;
		/**
		* 逻辑删除
		*/

		@ColumnInfo(comment="逻辑删除",type="int(11)")
		private Integer jiudianDelete;
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



	public JiudianOrderView() {

	}

	public JiudianOrderView(JiudianOrderEntity jiudianOrderEntity) {
		try {
			BeanUtils.copyProperties(this, jiudianOrderEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	//当前表的
	/**
	* 获取： 订单类型的值
	*/
	public String getJiudianOrderValue() {
		return jiudianOrderValue;
	}
	/**
	* 设置： 订单类型的值
	*/
	public void setJiudianOrderValue(String jiudianOrderValue) {
		this.jiudianOrderValue = jiudianOrderValue;
	}


	//级联表的get和set 酒店

		/**
		* 获取： 酒店名称
		*/
		public String getJiudianName() {
			return jiudianName;
		}
		/**
		* 设置： 酒店名称
		*/
		public void setJiudianName(String jiudianName) {
			this.jiudianName = jiudianName;
		}

		/**
		* 获取： 酒店编号
		*/
		public String getJiudianUuidNumber() {
			return jiudianUuidNumber;
		}
		/**
		* 设置： 酒店编号
		*/
		public void setJiudianUuidNumber(String jiudianUuidNumber) {
			this.jiudianUuidNumber = jiudianUuidNumber;
		}

		/**
		* 获取： 酒店照片
		*/
		public String getJiudianPhoto() {
			return jiudianPhoto;
		}
		/**
		* 设置： 酒店照片
		*/
		public void setJiudianPhoto(String jiudianPhoto) {
			this.jiudianPhoto = jiudianPhoto;
		}

		/**
		* 获取： 酒店地点
		*/
		public String getJiudianAddress() {
			return jiudianAddress;
		}
		/**
		* 设置： 酒店地点
		*/
		public void setJiudianAddress(String jiudianAddress) {
			this.jiudianAddress = jiudianAddress;
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
		* 获取： 酒店视频
		*/
		public String getJiudianVideo() {
			return jiudianVideo;
		}
		/**
		* 设置： 酒店视频
		*/
		public void setJiudianVideo(String jiudianVideo) {
			this.jiudianVideo = jiudianVideo;
		}
		/**
		* 获取： 酒店类型
		*/
		public Integer getJiudianTypes() {
			return jiudianTypes;
		}
		/**
		* 设置： 酒店类型
		*/
		public void setJiudianTypes(Integer jiudianTypes) {
			this.jiudianTypes = jiudianTypes;
		}


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

		/**
		* 获取： 酒店入住人数
		*/
		public Integer getJiudianKucunNumber() {
			return jiudianKucunNumber;
		}
		/**
		* 设置： 酒店入住人数
		*/
		public void setJiudianKucunNumber(Integer jiudianKucunNumber) {
			this.jiudianKucunNumber = jiudianKucunNumber;
		}

		/**
		* 获取： 现价/积分
		*/
		public Double getJiudianNewMoney() {
			return jiudianNewMoney;
		}
		/**
		* 设置： 现价/积分
		*/
		public void setJiudianNewMoney(Double jiudianNewMoney) {
			this.jiudianNewMoney = jiudianNewMoney;
		}

		/**
		* 获取： 酒店介绍
		*/
		public String getJiudianContent() {
			return jiudianContent;
		}
		/**
		* 设置： 酒店介绍
		*/
		public void setJiudianContent(String jiudianContent) {
			this.jiudianContent = jiudianContent;
		}

		/**
		* 获取： 逻辑删除
		*/
		public Integer getJiudianDelete() {
			return jiudianDelete;
		}
		/**
		* 设置： 逻辑删除
		*/
		public void setJiudianDelete(Integer jiudianDelete) {
			this.jiudianDelete = jiudianDelete;
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
		return "JiudianOrderView{" +
			", jiudianOrderValue=" + jiudianOrderValue +
			", jiudianName=" + jiudianName +
			", jiudianUuidNumber=" + jiudianUuidNumber +
			", jiudianPhoto=" + jiudianPhoto +
			", jiudianAddress=" + jiudianAddress +
			", zanNumber=" + zanNumber +
			", caiNumber=" + caiNumber +
			", jiudianVideo=" + jiudianVideo +
			", jiudianKucunNumber=" + jiudianKucunNumber +
			", jiudianNewMoney=" + jiudianNewMoney +
			", jiudianContent=" + jiudianContent +
			", jiudianDelete=" + jiudianDelete +
			", yonghuName=" + yonghuName +
			", yonghuPhone=" + yonghuPhone +
			", yonghuIdNumber=" + yonghuIdNumber +
			", yonghuPhoto=" + yonghuPhoto +
			", newMoney=" + newMoney +
			", yonghuEmail=" + yonghuEmail +
			"} " + super.toString();
	}
}
