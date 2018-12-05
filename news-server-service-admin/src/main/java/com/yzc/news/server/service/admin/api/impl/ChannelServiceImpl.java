package com.yzc.news.server.service.admin.api.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.yzc.news.news.server.commons.constant.DubboVersionConstant;
import com.yzc.news.news.server.commons.utils.IdUtils;
import com.yzc.news.server.admin.api.ChannelService;
import com.yzc.news.server.domain.Channel;
import com.yzc.news.server.service.admin.mapper.ChannelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.entity.Example;

import java.util.Date;
import java.util.List;

/**
 * @ClassName: ChannelServiceImpl
 * @Description: 频道服务
 * @Author: zc_yang
 * @CreateDate: 18/12/5 14:39
 * @Version: 1.0
 * <p>Copyright: Copyright (c) 18/12/5</p>
 */
@Service(version = DubboVersionConstant.DUBBO_VERSION_GAMING_SERVER_SERVICE_CHANNEL)
public class ChannelServiceImpl implements ChannelService {

    @Autowired
    private ChannelMapper channelMapper;

    @Override
    public List<Channel> getAll() {
        return channelMapper.selectAll();
    }

    @Override
    public Channel getById(Long id) {
        return null;
    }

    @Override
    public int save(Channel channel) {
        channel.setId(IdUtils.genId());
        //默认不是
        channel.setIsParent("1");
        channel.setCreateDate(new Date());
        channel.setUpdateDate(new Date());

        //判断是否父级频道
        if (channel.getPid() == null || channel.getPid() == 0L) {
            channel.setIsParent("0");
            channel.setPid(0L);
        }

        return channelMapper.insert(channel);
    }

    @Override
    public List<Channel> selectByPid(Long pid) {
        Example example = new Example(Channel.class);
        example.createCriteria().andEqualTo("pid", pid);
        return channelMapper.selectByExample(example);
    }
}
