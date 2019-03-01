package com.hki.mpdemo.professor.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 专家库名单表
 * </p>
 *
 * @author jobob
 * @since 2019-03-01
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Professor implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 姓名
     */
    private String name;

    /**
     * 性别
     */
    private String sex;

    /**
     * 出生年月
     */
    private LocalDateTime createTime;

    /**
     * 身份证号码
     */
    private String userId;

    /**
     * 最高学历/学位
     */
    private String education;

    /**
     * 毕业院校
     */
    private String school;

    /**
     * 手机
     */
    private String tel;

    /**
     * 电子邮箱
     */
    private String eamil;

    /**
     * 现任职公司
     */
    private String work;

    /**
     * 部门/职务
     */
    private String dep;

    /**
     * 公司地址
     */
    @TableField("Com_add")
    private String comAdd;

    /**
     * 委员类别
     */
    @TableField("Member_category")
    private String memberCategory;

    /**
     * 照片
     */
    @TableField("Photo_url")
    private String photoUrl;

    /**
     * 其他重要情况（重要工作业绩、论文专著、获奖等）
     */
    private String other;

    /**
     * 签字承诺书地址
     */
    @TableField("Stamp_url")
    private String stampUrl;


}
