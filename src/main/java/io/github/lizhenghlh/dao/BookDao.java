package io.github.lizhenghlh.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import io.github.lizhenghlh.entity.Book;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BookDao extends BaseMapper<Book> {
}
