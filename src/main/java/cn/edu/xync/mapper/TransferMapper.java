package cn.edu.xync.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

@Repository
public interface TransferMapper {
    @Update("update account set money = money - #{money} where name = #{out}")
    public void outMoney(@Param("out") String out,@Param("money") Integer money);
    @Update("update account set money = money + #{money} where name = #{in}")
    public void inMoney(@Param("in") String in,@Param("money") Integer money);
}
