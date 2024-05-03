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
 * 旅游路线
 *
 * @author 
 * @email
 */
@TableName("luxian")
public class LuxianEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public LuxianEntity() {

	}

	public LuxianEntity(T t) {
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
     * 旅游路线名称
     */
    @ColumnInfo(comment="旅游路线名称",type="varchar(200)")
    @TableField(value = "luxian_name")

    private String luxianName;


    /**
     * 旅游路线编号
     */
    @ColumnInfo(comment="旅游路线编号",type="varchar(200)")
    @TableField(value = "luxian_uuid_number")

    private String luxianUuidNumber;


    /**
     * 旅游路线照片
     */
    @ColumnInfo(comment="旅游路线照片",type="varchar(200)")
    @TableField(value = "luxian_photo")

    private String luxianPhoto;


    /**
     * 旅游出发地
     */
    @ColumnInfo(comment="旅游出发地",type="varchar(200)")
    @TableField(value = "luxian_chufa")

    private String luxianChufa;


    /**
     * 旅游途径地
     */
    @ColumnInfo(comment="旅游途径地",type="varchar(200)")
    @TableField(value = "luxian_tujing")

    private String luxianTujing;


    /**
     * 旅游目的地
     */
    @ColumnInfo(comment="旅游目的地",type="varchar(200)")
    @TableField(value = "luxian_mudi")

    private String luxianMudi;


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
     * 旅游路线介绍
     */
    @ColumnInfo(comment="旅游路线介绍",type="longtext")
    @TableField(value = "luxian_content")

    private String luxianContent;


    /**
     * 逻辑删除
     */
    @ColumnInfo(comment="逻辑删除",type="int(11)")
    @TableField(value = "luxian_delete")

    private Integer luxianDelete;


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
	 * 获取：旅游路线名称
	 */
    public String getLuxianName() {
        return luxianName;
    }
    /**
	 * 设置：旅游路线名称
	 */

    public void setLuxianName(String luxianName) {
        this.luxianName = luxianName;
    }
    /**
	 * 获取：旅游路线编号
	 */
    public String getLuxianUuidNumber() {
        return luxianUuidNumber;
    }
    /**
	 * 设置：旅游路线编号
	 */

    public void setLuxianUuidNumber(String luxianUuidNumber) {
        this.luxianUuidNumber = luxianUuidNumber;
    }
    /**
	 * 获取：旅游路线照片
	 */
    public String getLuxianPhoto() {
        return luxianPhoto;
    }
    /**
	 * 设置：旅游路线照片
	 */

    public void setLuxianPhoto(String luxianPhoto) {
        this.luxianPhoto = luxianPhoto;
    }
    /**
	 * 获取：旅游出发地
	 */
    public String getLuxianChufa() {
        return luxianChufa;
    }
    /**
	 * 设置：旅游出发地
	 */

    public void setLuxianChufa(String luxianChufa) {
        this.luxianChufa = luxianChufa;
    }
    /**
	 * 获取：旅游途径地
	 */
    public String getLuxianTujing() {
        return luxianTujing;
    }
    /**
	 * 设置：旅游途径地
	 */

    public void setLuxianTujing(String luxianTujing) {
        this.luxianTujing = luxianTujing;
    }
    /**
	 * 获取：旅游目的地
	 */
    public String getLuxianMudi() {
        return luxianMudi;
    }
    /**
	 * 设置：旅游目的地
	 */

    public void setLuxianMudi(String luxianMudi) {
        this.luxianMudi = luxianMudi;
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
	 * 获取：旅游路线介绍
	 */
    public String getLuxianContent() {
        return luxianContent;
    }
    /**
	 * 设置：旅游路线介绍
	 */

    public void setLuxianContent(String luxianContent) {
        this.luxianContent = luxianContent;
    }
    /**
	 * 获取：逻辑删除
	 */
    public Integer getLuxianDelete() {
        return luxianDelete;
    }
    /**
	 * 设置：逻辑删除
	 */

    public void setLuxianDelete(Integer luxianDelete) {
        this.luxianDelete = luxianDelete;
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
        return "Luxian{" +
            ", id=" + id +
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
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
