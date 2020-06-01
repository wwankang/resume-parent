package top.wankang.service.impl;

import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.wankang.dao.WorkExperienceMapper;
import top.wankang.entity.WorkExperience;
import top.wankang.entity.WorkExperienceExample;
import top.wankang.service.WorkExperienceService;

import java.util.List;

/**
 * Created with IDEA
 *
 * @author:qianhongshen
 * @Date:2019/9/23 9:44
 * @Desc:
 */
@Service
public class WorkServiceImpl implements WorkExperienceService {
//    private static final Logger logger = LoggerFactory.getLogger(com.hongshen.boke.jianli.service.impl.WorkServiceImpl.class);

    @Autowired
    private WorkExperienceMapper workExperienceMapper;

    @Override
    public List<WorkExperience> queryList(Integer page, Integer limit) {
        PageHelper.startPage(page,limit);
        WorkExperienceExample example = new WorkExperienceExample();
        return workExperienceMapper.selectByExample(example);
    }

    @Override
    public WorkExperience query(Integer id) {
        return workExperienceMapper.selectByPrimaryKey(id);
    }
    @Override
    public List<WorkExperience> queryByUserId(Integer UserId) {
        WorkExperienceExample example = new WorkExperienceExample();
        WorkExperienceExample.Criteria criteria = example.createCriteria();
        criteria.andUserIdEqualTo(UserId);
        List<WorkExperience> workExperiences = workExperienceMapper.selectByExample(example);
        return workExperiences;
    }
}
