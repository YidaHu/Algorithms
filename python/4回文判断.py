#!/usr/bin/env python
# -*- coding: utf-8 -*-
# @Time    : 2018/2/11 15:57
# @Author  : Huyd
# @Site    : 
# @File    : 4回文判断.py
# @Software: PyCharm
'''
题目描述
回文，英文palindrome，指一个顺着读和反过来读都一样的字符串，比如madam、我爱我，这样的短句在智力性、趣味性和艺术性上都颇有特色，中国历史上还有很多有趣的回文诗。
那么，我们的第一个问题就是：判断一个字串是否是回文？
'''


def IsPalindrome(str):
    flag = True
    lenNum = len(str) - 1
    mid = lenNum / 2
    i = 0
    while (i < mid):
        if str[i] != str[lenNum - i]:
            flag = False
        i += 1

    return flag;


print(IsPalindrome('strrts'))
