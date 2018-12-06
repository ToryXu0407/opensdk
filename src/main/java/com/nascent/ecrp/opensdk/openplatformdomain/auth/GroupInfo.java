package com.nascent.ecrp.opensdk.openplatformdomain.auth;

import lombok.Getter;
import lombok.Setter;

/**
 * Created with IDEA
 * author:ToryXu
 * Date:2018/11/27
 * Time:15:50
 * 品牌信息
 * 所在接口：查询品牌列表接口
 */
@Getter
@Setter
public class GroupInfo {
    /**
     * 集团ID
     */
    private Long groupId;

    /**
     * 集团名称
     */
    private String groupName;

}
