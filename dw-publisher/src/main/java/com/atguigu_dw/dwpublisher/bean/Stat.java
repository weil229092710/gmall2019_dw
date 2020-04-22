package com.atguigu_dw.dwpublisher.bean;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

//饼图
@Data
@AllArgsConstructor
public class Stat {

    String title ;

    List<Option> options;
}
