package com.nascent.ecrp.opensdk.openplatformdomain.point;

import lombok.Getter;
import lombok.Setter;

/**
 * Created with IDEA
 * author:ToryXu
 * Date:2018/11/26
 * Time:18:07
 * 标识码
 */
@Getter
@Setter
public class NickListInfo {

    /**
     * 平台唯一标识码
     */
    private String nick;

    /**
     * 平台类型
     */
    private Integer nickType;

}
