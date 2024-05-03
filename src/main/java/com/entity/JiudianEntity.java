package com.entity;

import com.annotation.ColumnInfo;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;
import java.io.Serializable;
import java.util.*;
import org.apache.tools.ant.util.DateUtils;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.utils.DateUtil;


/**
 * 酒店
 *
 * @author 
 * @email
 */
@TableName("jiudian")
public class JiudianEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public JiudianEntity() {

	}

	public JiudianEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @ColumnInfo(comment="主键",type="int(11)")
    @TableField(value = "id")

    private Integer id;


    /**
     * 酒店名称
     */
    @ColumnInfo(comment="酒店名称",type="varchar(200)")
    @TableField(value = "jiudian_name")

    private String jiudianName;


    /**
     * 酒店编号
     */
    @ColumnInfo(comment="酒店编号",type="varchar(200)")
    @TableField(value = "jiudian_uuid_number")

    private String jiudianUuidNumber;


    /**
     * 酒店照片
     */
    @ColumnInfo(comment="酒店照片",type="varchar(200)")
    @TableField(value = "jiudian_photo")

    private String jiudianPhoto;


    /**
     * 酒店地点
     */
    @ColumnInfo(comment="酒店地点",type="varchar(200)")
    @TableField(value = "jiudian_address")

    private String jiudianAddress;


    /**
     * 赞
     */
    @ColumnInfo(comment="赞",type="int(11)")
    @TableField(value = "zan_number")

    private Integer zanNumber;


    /**
     * 踩
     */
    @ColumnInfo(comment="踩",type="int(11)")
    @TableField(value = "cai_number")

    private Integer caiNumber;


    /**
     * 酒店视频
     */
    @ColumnInfo(comment="酒店视频",type="varchar(200)")
    @TableField(value = "jiudian_video")

    private String jiudianVideo;


    /**
     * 酒店类型
     */
    @ColumnInfo(comment="酒店类型",type="int(11)")
    @TableField(value = "jiudian_types")

    private Integer jiudianTypes;


    /**
     * 酒店入住人数
     */
    @ColumnInfo(comment="酒店入住人数",type="int(11)")
    @TableField(value = "jiudian_kucun_number")

    private Integer jiudianKucunNumber;


    /**
     * 现价/积分
     */
    @ColumnInfo(comment="现价/积分",type="decimal(10,2)")
    @TableField(value = "jiudian_new_money")

    private Double jiudianNewMoney;


    /**
     * 酒店介绍
     */
    @ColumnInfo(comment="酒店介绍",type="longtext")
    @TableField(value = "jiudian_content")

    private String jiudianContent;


    /**
     * 逻辑删除
     */
    @ColumnInfo(comment="逻辑删除",type="int(11)")
    @TableField(value = "jiudian_delete")

    private Integer jiudianDelete;


    /**
     * 录入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="录入时间",type="timestamp")
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="创建时间",type="timestamp")
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }
    /**
	 * 设置：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：酒店名称
	 */
    public String getJiudianName() {
        return jiudianName;
    }
    /**
	 * 设置：酒店名称
	 */

    public void setJiudianName(String jiudianName) {
        this.jiudianName = jiudianName;
    }
    /**
	 * 获取：酒店编号
	 */
    public String getJiudianUuidNumber() {
        return jiudianUuidNumber;
    }
    /**
	 * 设置：酒店编号
	 */

    public void setJiudianUuidNumber(String jiudianUuidNumber) {
        this.jiudianUuidNumber = jiudianUuidNumber;
    }
    /**
	 * 获取：酒店照片
	 */
    public String getJiudianPhoto() {
        return jiudianPhoto;
    }
    /**
	 * 设置：酒店照片
	 */

    public void setJiudianPhoto(String jiudianPhoto) {
        this.jiudianPhoto = jiudianPhoto;
    }
    /**
	 * 获取：酒店地点
	 */
    public String getJiudianAddress() {
        return jiudianAddress;
    }
    /**
	 * 设置：酒店地点
	 */

    public void setJiudianAddress(String jiudianAddress) {
        this.jiudianAddress = jiudianAddress;
    }
    /**
	 * 获取：赞
	 */
    public Integer getZanNumber() {
        return zanNumber;
    }
    /**
	 * 设置：赞
	 */

    public void setZanNumber(Integer zanNumber) {
        this.zanNumber = zanNumber;
    }
    /**
	 * 获取：踩
	 */
    public Integer getCaiNumber() {
        return caiNumber;
    }
    /**
	 * 设置：踩
	 */

    public void setCaiNumber(Integer caiNumber) {
        this.caiNumber = caiNumber;
    }
    /**
	 * 获取：酒店视频
	 */
    public String getJiudianVideo() {
        return jiudianVideo;
    }
    /**
	 * 设置：酒店视频
	 */

    public void setJiudianVideo(String jiudianVideo) {
        this.jiudianVideo = jiudianVideo;
    }
    /**
	 * 获取：酒店类型
	 */
    public Integer getJiudianTypes() {
        return jiudianTypes;
    }
    /**
	 * 设置：酒店类型
	 */

    public void setJiudianTypes(Integer jiudianTypes) {
        this.jiudianTypes = jiudianTypes;
    }
    /**
	 * 获取：酒店入住人数
	 */
    public Integer getJiudianKucunNumber() {
        return jiudianKucunNumber;
    }
    /**
	 * 设置：酒店入住人数
	 */

    public void setJiudianKucunNumber(Integer jiudianKucunNumber) {
        this.jiudianKucunNumber = jiudianKucunNumber;
    }
    /**
	 * 获取：现价/积分
	 */
    public Double getJiudianNewMoney() {
        return jiudianNewMoney;
    }
    /**
	 * 设置：现价/积分
	 */

    public void setJiudianNewMoney(Double jiudianNewMoney) {
        this.jiudianNewMoney = jiudianNewMoney;
    }
    /**
	 * 获取：酒店介绍
	 */
    public String getJiudianContent() {
        return jiudianContent;
    }
    /**
	 * 设置：酒店介绍
	 */

    public void setJiudianContent(String jiudianContent) {
        this.jiudianContent = jiudianContent;
    }
    /**
	 * 获取：逻辑删除
	 */
    public Integer getJiudianDelete() {
        return jiudianDelete;
    }
    /**
	 * 设置：逻辑删除
	 */

    public void setJiudianDelete(Integer jiudianDelete) {
        this.jiudianDelete = jiudianDelete;
    }
    /**
	 * 获取：录入时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }
    /**
	 * 设置：录入时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 设置：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Jiudian{" +
            ", id=" + id +
            ", jiudianName=" + jiudianName +
            ", jiudianUuidNumber=" + jiudianUuidNumber +
            ", jiudianPhoto=" + jiudianPhoto +
            ", jiudianAddress=" + jiudianAddress +
            ", zanNumber=" + zanNumber +
            ", caiNumber=" + caiNumber +
            ", jiudianVideo=" + jiudianVideo +
            ", jiudianTypes=" + jiudianTypes +
            ", jiudianKucunNumber=" + jiudianKucunNumber +
            ", jiudianNewMoney=" + jiudianNewMoney +
            ", jiudianContent=" + jiudianContent +
            ", jiudianDelete=" + jiudianDelete +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
