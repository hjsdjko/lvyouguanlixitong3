package com.entity.vo;

import com.entity.JiudianEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 酒店
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("jiudian")
public class JiudianVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 酒店名称
     */

    @TableField(value = "jiudian_name")
    private String jiudianName;


    /**
     * 酒店编号
     */

    @TableField(value = "jiudian_uuid_number")
    private String jiudianUuidNumber;


    /**
     * 酒店照片
     */

    @TableField(value = "jiudian_photo")
    private String jiudianPhoto;


    /**
     * 酒店地点
     */

    @TableField(value = "jiudian_address")
    private String jiudianAddress;


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
     * 酒店视频
     */

    @TableField(value = "jiudian_video")
    private String jiudianVideo;


    /**
     * 酒店类型
     */

    @TableField(value = "jiudian_types")
    private Integer jiudianTypes;


    /**
     * 酒店入住人数
     */

    @TableField(value = "jiudian_kucun_number")
    private Integer jiudianKucunNumber;


    /**
     * 现价/积分
     */

    @TableField(value = "jiudian_new_money")
    private Double jiudianNewMoney;


    /**
     * 酒店介绍
     */

    @TableField(value = "jiudian_content")
    private String jiudianContent;


    /**
     * 逻辑删除
     */

    @TableField(value = "jiudian_delete")
    private Integer jiudianDelete;


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
	 * 设置：酒店名称
	 */
    public String getJiudianName() {
        return jiudianName;
    }


    /**
	 * 获取：酒店名称
	 */

    public void setJiudianName(String jiudianName) {
        this.jiudianName = jiudianName;
    }
    /**
	 * 设置：酒店编号
	 */
    public String getJiudianUuidNumber() {
        return jiudianUuidNumber;
    }


    /**
	 * 获取：酒店编号
	 */

    public void setJiudianUuidNumber(String jiudianUuidNumber) {
        this.jiudianUuidNumber = jiudianUuidNumber;
    }
    /**
	 * 设置：酒店照片
	 */
    public String getJiudianPhoto() {
        return jiudianPhoto;
    }


    /**
	 * 获取：酒店照片
	 */

    public void setJiudianPhoto(String jiudianPhoto) {
        this.jiudianPhoto = jiudianPhoto;
    }
    /**
	 * 设置：酒店地点
	 */
    public String getJiudianAddress() {
        return jiudianAddress;
    }


    /**
	 * 获取：酒店地点
	 */

    public void setJiudianAddress(String jiudianAddress) {
        this.jiudianAddress = jiudianAddress;
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
	 * 设置：酒店视频
	 */
    public String getJiudianVideo() {
        return jiudianVideo;
    }


    /**
	 * 获取：酒店视频
	 */

    public void setJiudianVideo(String jiudianVideo) {
        this.jiudianVideo = jiudianVideo;
    }
    /**
	 * 设置：酒店类型
	 */
    public Integer getJiudianTypes() {
        return jiudianTypes;
    }


    /**
	 * 获取：酒店类型
	 */

    public void setJiudianTypes(Integer jiudianTypes) {
        this.jiudianTypes = jiudianTypes;
    }
    /**
	 * 设置：酒店入住人数
	 */
    public Integer getJiudianKucunNumber() {
        return jiudianKucunNumber;
    }


    /**
	 * 获取：酒店入住人数
	 */

    public void setJiudianKucunNumber(Integer jiudianKucunNumber) {
        this.jiudianKucunNumber = jiudianKucunNumber;
    }
    /**
	 * 设置：现价/积分
	 */
    public Double getJiudianNewMoney() {
        return jiudianNewMoney;
    }


    /**
	 * 获取：现价/积分
	 */

    public void setJiudianNewMoney(Double jiudianNewMoney) {
        this.jiudianNewMoney = jiudianNewMoney;
    }
    /**
	 * 设置：酒店介绍
	 */
    public String getJiudianContent() {
        return jiudianContent;
    }


    /**
	 * 获取：酒店介绍
	 */

    public void setJiudianContent(String jiudianContent) {
        this.jiudianContent = jiudianContent;
    }
    /**
	 * 设置：逻辑删除
	 */
    public Integer getJiudianDelete() {
        return jiudianDelete;
    }


    /**
	 * 获取：逻辑删除
	 */

    public void setJiudianDelete(Integer jiudianDelete) {
        this.jiudianDelete = jiudianDelete;
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
