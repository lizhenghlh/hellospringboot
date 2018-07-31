package io.github.lizhenghlh.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import io.github.lizhenghlh.dao.BookDao;
import io.github.lizhenghlh.entity.Book;
import io.github.lizhenghlh.service.BookService;
import org.springframework.stereotype.Service;

@Service("bookService")
public class BookServiceImpl extends ServiceImpl<BookDao, Book> implements BookService {
}
