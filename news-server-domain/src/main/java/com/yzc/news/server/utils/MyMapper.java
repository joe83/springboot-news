package com.yzc.news.server.utils;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 *
 * @ClassName:      MyMapper
 * @Description:    自己的 Mapper
 * @Author:         zc_yang
 * @CreateDate:     2018/12/3 14:22
 * @Version:        1.0
 * <p>Copyright: Copyright (c) 2018/12/3</p>
 *
 */

public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {

}
