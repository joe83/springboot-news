package com.yzc.news.server.service.admin;

import com.yzc.news.server.domain.Channel;
import com.yzc.news.server.mapper.ChannelMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class NewsServerServiceAdminApplicationTests {

    @Autowired
    private ChannelMapper channelMapper;

    @Test
    public void testChannelSelectAll() {
        List<Channel> channels = channelMapper.selectAll();
        System.out.println(channels);
    }

}
