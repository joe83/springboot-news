package com.yzc.news.server.admin.api;

import com.yzc.news.server.domain.Channel;

import java.util.List;

public interface ChannelService {
    /**
     * 查询所有频道
     *
     * @return
     */
    public List<Channel> getAll();

    /**
     * 根据 Id 查询频道
     *
     * @param id
     * @return
     */
    public Channel getById(Long id);

    /**
     * 根据父节点查询子节点
     *
     * @param pid
     * @return
     */
    public List<Channel> selectByPid(Long pid);

    /**
     * 保存频道
     *
     * @param channel
     * @return
     */
    public int save(Channel channel);
}
