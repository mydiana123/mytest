package cn.wjb114514.bootMybatis.mapper;

import cn.wjb114514.bootMybatis.entity.Country;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author wjb
 * @date 2022/10/29 10:30 周六
 */
//@Mapper
public interface CountryMapper {
    Country selectCountryById(Long id);
}
