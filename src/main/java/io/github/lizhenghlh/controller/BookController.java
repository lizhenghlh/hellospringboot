package io.github.lizhenghlh.controller;

import io.github.lizhenghlh.entity.Book;
import io.github.lizhenghlh.entity.Response;
import io.github.lizhenghlh.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("books")
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping
    public Response add(Book book) {
        bookService.insert(book);
        return Response.build().put("data", book).success();
    }

    @DeleteMapping
    public Response delete(Long id) {
        bookService.deleteById(id);
        return Response.build().success("删除成功");
    }

    @PutMapping
    public Response update(Book book) {
        final Book exist = bookService.selectById(book.getId());
        if (null == exist) {
            return Response.build().fail("不存在此记录");
        }
        bookService.updateById(book);
        return Response.build().put("data", book).success();
    }

    @GetMapping
    public Response list() {
        Map<String, Object> result = new HashMap<>();
        result.put("data", bookService.selectList(null));
        return Response.build(result).success();
    }

    @GetMapping("/{id}")
    public Response findById(@PathVariable Long id) {
        final Book book = bookService.selectById(id);
        if (null == book) {
            return Response.build().fail("不存在此记录");
        }
        return Response.build().put("data", book).success();
    }

}