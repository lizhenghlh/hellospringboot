package io.github.lizhenghlh.entity;

import java.util.HashMap;
import java.util.Map;

/**
 * 返回数据
 */
public class Response extends HashMap<String, Object> {

    public Response() {
        put("code", 200);
    }

    public static Response error() {
        return error(500, "未知异常");
    }

    public static Response error(String msg) {
        return error(500, msg);
    }

    public static Response error(int code, String msg) {
        Response r = new Response();
        r.put("code", code);
        r.put("msg", msg);
        return r;
    }

    public static Response build(String msg) {
        Response r = new Response();
        r.put("msg", msg);
        return r;
    }

    public static Response build(Map<String, Object> map) {
        Response r = new Response();
        r.putAll(map);
        return r;
    }

    public static Response build() {
        return new Response();
    }

    public Response put(String key, Object value) {
        super.put(key, value);
        return this;
    }

    public Response data(Object object) {
        super.put("data", object);
        return this;
    }

    public Response success() {
        return success("success");
    }

    public Response success(String msg) {
        super.put("msg", msg);
        return this;
    }

    public Response fail() {
        return fail("fail");
    }

    public Response fail(String msg) {
        super.put("msg", msg);
        return this;
    }
}
