package top.wankang.service.impl;

import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.wankang.dao.SkillMapper;
import top.wankang.entity.Skill;
import top.wankang.entity.SkillExample;
import top.wankang.service.SkillService;

import java.util.List;

/**
 * Created with IDEA
 *
 * @author:qianhongshen
 * @Date:2019/9/23 16:23
 * @Desc:
 */
@Service
public class SkillServiceImpl implements SkillService {
//    private static final Logger logger = LoggerFactory.getLogger(com.hongshen.boke.jianli.service.impl.SkillServiceImpl.class);

    @Autowired
    private SkillMapper skillMapper;

    @Override
    public List<Skill> queryList(Integer page, Integer limit) {
        PageHelper.startPage(page,limit);
        SkillExample example = new SkillExample();
        return skillMapper.selectByExample(example);
    }

    @Override
    public Skill query(Integer id) {
        return skillMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Skill> queryByUserId(Integer UserId) {
        SkillExample example = new SkillExample();
        SkillExample.Criteria criteria = example.createCriteria();
        criteria.andUserIdEqualTo(UserId);
        List<Skill> skills = skillMapper.selectByExample(example);
        return skills;
    }

}
