package com.example.module1.model.dto;

import com.example.core.config.LongDateSerializer;
import com.example.core.config.LongJsonSerializer;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.example.core.model.dto.BaseDTO;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * <p>
 * 支出明细表
 * </p>
 *
 * @description: 支出明细表
 */
@ApiModel("支出明细表")
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ExpendDTO extends BaseDTO implements Serializable {

    /**
     * 类型表id
     */
    @ApiModelProperty(value = "类型表id")
    @JsonSerialize(using = LongJsonSerializer.class)
    private Long categoryId;
    /**
     * 子类型表id
     */
    @ApiModelProperty(value = "子类型表id")
    @JsonSerialize(using = LongJsonSerializer.class)
    private Long subCategoryId;
    /**
     * 金额
     */
    @ApiModelProperty(value = "金额")
    private BigDecimal amount;
    /**
     * 成员表id
     */
    @ApiModelProperty(value = "成员表id")
    @JsonSerialize(using = LongJsonSerializer.class)
    private Long memberId;
    /**
     * 用户表id
     */
    @ApiModelProperty(value = "用户表id")
    @JsonSerialize(using = LongJsonSerializer.class)
    private Long userId;
    /**
     * 备注
     */
    @ApiModelProperty(value = "备注")
    private String remark;
    /**
     * 时间
     */
    @JsonSerialize(using = LongDateSerializer.class)
    private Long date;

    /**
     * 分类名称
     */
    @ApiModelProperty(value = "分类名称")
    private String categoryName;
    /**
     * 子分类名称
     */
    @ApiModelProperty(value = "子分类名称")
    private String subCategoryName;
    /**
     * 成员名称
     */
    @ApiModelProperty(value = "成员名称")
    private String memberName;

}
