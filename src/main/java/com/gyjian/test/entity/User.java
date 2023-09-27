package com.gyjian.test.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@TableName("`user`")
@Schema
public class User {
    @Schema(description = "ID")
    private Long id;
    @Schema(description = "名字")
    private String name;
    @Schema(description = "年龄")
    private Integer age;
    @Schema(description = "电子邮箱")
    private String email;
}
