package com.project.zhihu.Dao;

import com.project.zhihu.Model.Question;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;


@Mapper
public interface QuestionDAO {
    String TABLE_NAME = " questiondata ";
    String INSERT_FIELDS = " TITLE, CONTENT, CREATE_DATE, USERID, COMMENT_COUNT ";
    String SELECT_FIELDS = " ID, " + INSERT_FIELDS;

    @Insert({"insert into ", TABLE_NAME, "(", INSERT_FIELDS,
            ") values (#{title},#{content},#{createdDate},#{userId},#{commentCount})"})
    int addQuestion(Question question);

    List<Question> selectLatestQuestions(@Param("userId") int userId, @Param("offset") int offset,
                                         @Param("limit") int limit);

}
