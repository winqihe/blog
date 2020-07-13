package com.blog.service.impl;

import com.blog.entity.Blog;
import com.blog.mapper.BlogMapper;
import com.blog.service.BlogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements BlogService {

}
