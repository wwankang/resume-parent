package top.wankang.service.impl;

import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.wankang.dao.SelfAppraisalMapper;
import top.wankang.entity.SelfAppraisal;
import top.wankang.entity.SelfAppraisalExample;
import top.wankang.service.SelfAppraisalService;

import java.util.List;

/**
 * Created with IDEA
 *
 * @author:qianhongshen
 * @Date:2019/9/23 9:44
 * @Desc:
 */
@Service
public class SelfAppraisalServiceImpl implements SelfAppraisalService {
//    private static final Logger logger = LoggerFactory.getLogger(com.hongshen.boke.jianli.service.impl.AppraisalServiceImpl.class);

    @Autowired
    private SelfAppraisalMapper selfAppraisalMapper;

    @Override
    public List<SelfAppraisal> queryList(Integer page, Integer limit) {
        PageHelper.startPage(page,limit);
        SelfAppraisalExample example = new SelfAppraisalExample();
        return selfAppraisalMapper.selectByExample(example);
    }

    @Override
    public SelfAppraisal query(Integer id) {
        return selfAppraisalMapper.selectByPrimaryKey(id);
    }


    @Override
    public SelfAppraisal queryByUserId(Integer UserId) {
        SelfAppraisalExample example = new SelfAppraisalExample();
        SelfAppraisalExample.Criteria criteria = example.createCriteria();
        criteria.andUserIdEqualTo(UserId);
        List<SelfAppraisal> selfAppraisals = selfAppraisalMapper.selectByExample(example);
        if (!selfAppraisals.isEmpty()) {
            return selfAppraisals.get(0);
        }
        return null;
    }
}
