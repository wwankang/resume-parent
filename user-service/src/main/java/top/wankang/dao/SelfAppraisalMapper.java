package top.wankang.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import top.wankang.entity.SelfAppraisal;
import top.wankang.entity.SelfAppraisalExample;

import java.util.List;

@Repository
public interface SelfAppraisalMapper {
    long countByExample(SelfAppraisalExample example);

    int deleteByExample(SelfAppraisalExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SelfAppraisal record);

    int insertSelective(SelfAppraisal record);

    List<SelfAppraisal> selectByExample(SelfAppraisalExample example);

    SelfAppraisal selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SelfAppraisal record, @Param("example") SelfAppraisalExample example);

    int updateByExample(@Param("record") SelfAppraisal record, @Param("example") SelfAppraisalExample example);

    int updateByPrimaryKeySelective(SelfAppraisal record);

    int updateByPrimaryKey(SelfAppraisal record);
}
