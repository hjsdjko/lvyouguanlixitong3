package com.service.impl;

import com.utils.StringUtil;
import com.service.DictionaryService;
import com.utils.ClazzDiff;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.lang.reflect.Field;
import java.util.*;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.transaction.annotation.Transactional;
import com.utils.PageUtils;
import com.utils.Query;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import org.springframework.lang.Nullable;
import org.springframework.util.Assert;
import com.dao.LuxianLiuyanDao;
import com.entity.LuxianLiuyanEntity;
import com.service.LuxianLiuyanService;
import com.entity.view.LuxianLiuyanView;

/**
 * 旅游路线评论 服务实现类
 */
@Service("luxianLiuyanService")
@Transactional
public class LuxianLiuyanServiceImpl extends ServiceImpl<LuxianLiuyanDao, LuxianLiuyanEntity> implements LuxianLiuyanService {

    @Override
    public PageUtils queryPage(Map<String,Object> params) {
        Page<LuxianLiuyanView> page =new Query<LuxianLiuyanView>(params).getPage();
        page.setRecords(baseMapper.selectListView(page,params));
        return new PageUtils(page);
    }


}
