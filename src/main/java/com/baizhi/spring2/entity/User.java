package com.baizhi.spring2.entity;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import tk.mybatis.mapper.annotation.KeySql;
import tk.mybatis.mapper.code.ORDER;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "COMM_USER")
public class User {
    @Id
    @KeySql(sql = "select COMM_USER_SEQ.nextval from dual", order = ORDER.BEFORE)
    private String id;
    @Column(name = "username")
    private String name;
    private Integer age;
    @Transient
    private Boolean status;

    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd hh:mm:ss")
    @Column(name = "birthday")
//    @Transient
    private Date date;
}
