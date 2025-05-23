package com.study.core.core.impl;

import com.study.core.config.GenConfig;
import com.study.core.core.sdk.PutContextHandler;
import com.study.core.entity.TableInfo;
import com.study.core.utils.JdbcUtil;
import com.study.core.utils.YamlUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 从配置的mysql数据源中获取表字段及表备注写入到全局上下文
 *
 * @author loser
 * @date 2023/9/4
 */
public class JdbcPutContextHandler implements PutContextHandler {

    @Override
    public Map<String, Object> putData() {

        GenConfig genConfig = YamlUtils.loadYaml("genCode/gen.yml", GenConfig.class);
        String tableComment = JdbcUtil.getComment(genConfig.getJdbc(), genConfig.getJdbc().getTableName());
        List<TableInfo> fields = JdbcUtil.queryTableInfo(genConfig.getJdbc(), genConfig.getJdbc().getTableName());
        Map<String, Object> res = new HashMap<>();
        res.put("tableComment", tableComment);
        res.put("fields", fields);
        return res;

    }

}
