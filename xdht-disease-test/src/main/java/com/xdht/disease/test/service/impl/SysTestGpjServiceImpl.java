package com.xdht.disease.test.service.impl;

import com.github.pagehelper.PageHelper;
import com.xdht.disease.common.core.PageResult;
import com.xdht.disease.test.dao.SysTestGpjMapper;
import com.xdht.disease.common.core.AbstractService;
import com.xdht.disease.test.model.SysTestGpj;
import com.xdht.disease.test.service.SysTestGpjService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.entity.Condition;

import java.util.List;


/**
 * Created by gpj on 2018/06/25.
 */
@Service
@Transactional
public class SysTestGpjServiceImpl extends AbstractService<SysTestGpj> implements SysTestGpjService{

    @Autowired
    private SysTestGpjMapper sysTestGpjMapper;

    @Override
    public List<SysTestGpj> queryList(SysTestGpj sysTestGpj) {
        Condition condition = new Condition(SysTestGpj.class);
        condition.createCriteria() .andEqualTo("id", sysTestGpj.getId());
        if (sysTestGpj.getName() != null) {
            condition.getOredCriteria().get(0).andLike("name","%"+sysTestGpj.getName()+"%");
        }
        return this.sysTestGpjMapper.selectByCondition(condition);
    }

    @Override
    public PageResult<SysTestGpj> queryListPage(SysTestGpj sysTestGpj, Integer pageNum, Integer pageSize) {
        Condition condition = new Condition(SysTestGpj.class);
        condition.createCriteria() .andEqualTo("id", sysTestGpj.getId());
        if (sysTestGpj.getName() != null) {
            condition.getOredCriteria().get(0).andLike("name","%"+sysTestGpj.getName()+"%");
        }
        PageHelper.startPage(pageNum, pageSize);
        List<SysTestGpj> dataList = this.sysTestGpjMapper.selectByCondition(condition);
        PageResult<SysTestGpj> pageList = new PageResult<>();
        pageList.setTotal(dataList.size());
        pageList.setDataList(dataList);
        return pageList;
    }
    
    @Override
    public SysTestGpj add(SysTestGpj sysTestGpj) {
        this.sysTestGpjMapper.insertUseGeneratedKeys(sysTestGpj);
        return sysTestGpj;
    }

    @Override
    public SysTestGpj delete(Long id) {
        this.sysTestGpjMapper.deleteByPrimaryKey(id);
        SysTestGpj sysTestGpj = new SysTestGpj();
        sysTestGpj.setId(id);
        return sysTestGpj;
    }

    @Override
    public SysTestGpj update(SysTestGpj sysTestGpj){
        this.sysTestGpjMapper.updateByPrimaryKeySelective(sysTestGpj);
        return sysTestGpj;
    }
}
