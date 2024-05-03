package com.entity.vo;

import com.entity.LuxianEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 旅游路线
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("luxian")
public class LuxianVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 旅游路线名称
     */

    @TableField(value = "luxian_name")
    private String luxianName;


    /**
     * 旅游路线编号
     */

    @TableField(value = "luxian_uuid_number")
    private String luxianUuidNumber;


    /**
     * 旅游路线照片
     */

    @TableField(value = "luxian_photo")
    private String luxianPhoto;


    /**
     * 旅游出发地
     */

    @TableField(value = "luxian_chufa")
    private String luxianChufa;


    /**
     * 旅游途径地
     */

    @TableField(value = "luxian_tujing")
    private String luxianTujing;


    /**
     * 旅游目的地
     */

    @TableField(value = "luxian_mudi")
    private String luxianMudi;


    /**
     * 赞
     */

    @TableField(value = "zan_number")
    private Integer zanNumber;


    /**
     * 踩
     */

    @TableField(value = "cai_number")
    private Integer caiNumber;


    /**
     * 旅游路线介绍
     */

    @TableField(value = "luxian_content")
    private String luxianContent;


    /**
     * 逻辑删除
     */

    @TableField(value = "luxian_delete")
    private Integer luxianDelete;


    /**
     * 录入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间  show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：旅游路线名称
	 */
    public String getLuxianName() {
        return luxianName;
    }


    /**
	 * 获取：旅游路线名称
	 */

    public void setLuxianName(String luxianName) {
        this.luxianName = luxianName;
    }
    /**
	 * 设置：旅游路线编号
	 */
    public String getLuxianUuidNumber() {
        return luxianUuidNumber;
    }


    /**
	 * 获取：旅游路线编号
	 */

    public void setLuxianUuidNumber(String luxianUuidNumber) {
        this.luxianUuidNumber = luxianUuidNumber;
    }
    /**
	 * 设置：旅游路线照片
	 */
    public String getLuxianPhoto() {
        return luxianPhoto;
    }


    /**
	 * 获取：旅游路线照片
	 */

    public void setLuxianPhoto(String luxianPhoto) {
        this.luxianPhoto = luxianPhoto;
    }
    /**
	 * 设置：旅游出发地
	 */
    public String getLuxianChufa() {
        return luxianChufa;
    }


    /**
	 * 获取：旅游出发地
	 */

    public void setLuxianChufa(String luxianChufa) {
        this.luxianChufa = luxianChufa;
    }
    /**
	 * 设置：旅游途径地
	 */
    public String getLuxianTujing() {
        return luxianTujing;
    }


    /**
	 * 获取：旅游途径地
	 */

    public void setLuxianTujing(String luxianTujing) {
        this.luxianTujing = luxianTujing;
    }
    /**
	 * 设置：旅游目的地
	 */
    public String getLuxianMudi() {
        return luxianMudi;
    }


    /**
	 * 获取：旅游目的地
	 */

    public void setLuxianMudi(String luxianMudi) {
        this.luxianMudi = luxianMudi;
    }
    /**
	 * 设置：赞
	 */
    public Integer getZanNumber() {
        return zanNumber;
    }


    /**
	 * 获取：赞
	 */

    public void setZanNumber(Integer zanNumber) {
        this.zanNumber = zanNumber;
    }
    /**
	 * 设置：踩
	 */
    public Integer getCaiNumber() {
        return caiNumber;
    }


    /**
	 * 获取：踩
	 */

    public void setCaiNumber(Integer caiNumber) {
        this.caiNumber = caiNumber;
    }
    /**
	 * 设置：旅游路线介绍
	 */
    public String getLuxianContent() {
        return luxianContent;
    }


    /**
	 * 获取：旅游路线介绍
	 */

    public void setLuxianContent(String luxianContent) {
        this.luxianContent = luxianContent;
    }
    /**
	 * 设置：逻辑删除
	 */
    public Integer getLuxianDelete() {
        return luxianDelete;
    }


    /**
	 * 获取：逻辑删除
	 */

    public void setLuxianDelete(Integer luxianDelete) {
        this.luxianDelete = luxianDelete;
    }
    /**
	 * 设置：录入时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：录入时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间  show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
