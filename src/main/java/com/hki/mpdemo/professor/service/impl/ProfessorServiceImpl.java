package com.hki.mpdemo.professor.service.impl;

import com.hki.mpdemo.professor.entity.Professor;
import com.hki.mpdemo.professor.mapper.ProfessorMapper;
import com.hki.mpdemo.professor.service.IProfessorService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 专家库名单表 服务实现类
 * </p>
 *
 * @author jobob
 * @since 2019-03-01
 */
@Service
public class ProfessorServiceImpl extends ServiceImpl<ProfessorMapper, Professor> implements IProfessorService {

}
