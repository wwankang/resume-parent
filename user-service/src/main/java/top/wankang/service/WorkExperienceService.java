package top.wankang.service;



import top.wankang.entity.WorkExperience;

import java.util.List;

/**
 * Created with IDEA
 *
 * @author:qianhongshen
 * @Date:2019/9/23 9:43
 * @Desc:
 */
public interface WorkExperienceService {

    /**
     * 查询列表
     * @param page
     * @param limit
     * @return
     */
    List<WorkExperience> queryList(Integer page, Integer limit);


    /**
     * 查询
     * @param id
     * @return
     */
    WorkExperience query(Integer id);


    List<WorkExperience> queryByUserId(Integer id);
}
