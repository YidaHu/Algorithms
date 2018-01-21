#!/usr/bin/env python
# -*- coding: utf-8 -*-
# @Time    : 2018/1/21 19:27
# @Author  : Huyd
# @Site    : 
# @File    : 3字符串转换成整数.py
# @Software: PyCharm
'''
题目描述
输入一个由数字组成的字符串，把它转换成整数并输出。例如：输入字符串"123"，输出整数123。
给定函数原型int StrToInt(const char *str) ，实现字符串转换成整数的功能，不能使用库函数atoi。
'''


# 字符串转数字
def strToInt(str):
    s, t, flag, n = 0, 1, 0, 1.0
    # 遍历字符串
    for i in range(len(str)):
        # 判断字符是否为0到9之间
        if '0' <= str[i] <= '9' and flag == 0:
            s = s * 10 + ord(str[i]) - ord('0')
        elif str[i] == '.' or flag == 1:  # 判断字符是否从小数点开始
            if flag == 0:
                t = 1.0
            else:
                t = t + ((ord(str[i]) - ord('0')) / n)
            flag = 1
            n *= 10
    if flag == 0:
        t = 0
    return s + t


print(strToInt("10522545459834"))
