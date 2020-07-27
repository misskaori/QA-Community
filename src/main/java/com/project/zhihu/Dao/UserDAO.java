package com.project.zhihu.Dao;
import com.project.zhihu.Model.User;
import org.apache.ibatis.annotations.*;

@Mapper
public interface UserDAO {
    String TABLE_NAME = "userdata";
    String INSERT_FIELDS = "NAME, PASSWORD, SALT, HEADURL";
    String SELECT_FIELDS = "ID," + INSERT_FIELDS;

    @Insert({"insert into", TABLE_NAME, "(",INSERT_FIELDS, ")", "values (#{name}, #{password}, #{salt}, #{headUrl})"})
    void addUser(User user);

    @Select({"select max(ID) from", TABLE_NAME})
    int selectMaxID();

    @Select({"select", SELECT_FIELDS, "from", TABLE_NAME, "where ID = #{id}"})
    User selectById(long id);

    @Delete({"delete from", TABLE_NAME, "where ID = #{id}"})
    void deleteById(long id);

    @Update({"update", TABLE_NAME, "set PASSWORD = #{password} where ID = #{id}"})
    void updatePassword(User user);
}
