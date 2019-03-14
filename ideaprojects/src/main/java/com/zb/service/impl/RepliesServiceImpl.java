package com.zb.service.impl;

import com.zb.entity.Replies;
import com.zb.mapper.RepliesMapper;
import com.zb.service.RepliesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("repliesService")
public class RepliesServiceImpl implements RepliesService {
    @Autowired
    private RepliesMapper repliesMapper;

    @Override
    public List<Replies> getRepliesList() {
        return repliesMapper.getRepliesList();
    }
}
