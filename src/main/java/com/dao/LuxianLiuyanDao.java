package com.dao;

import com.entity.LuxianLiuyanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.LuxianLiuyanView;

/**
 * 旅游路线评论 Dao 接口
 *
 * @author 
 */
public interface LuxianLiuyanDao extends BaseMapper<LuxianLiuyanEntity> {

   List<LuxianLiuyanView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
