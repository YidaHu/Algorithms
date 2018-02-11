#!/usr/bin/env python
# -*- coding: utf-8 -*-
# @Time    : 2018/2/11 16:54
# @Author  : Huyd
# @Site    : 
# @File    : 5全排列.py
# @Software: PyCharm
'''
题目描述
输入一个字符串，打印出该字符串中字符的所有排列。
例如输入字符串abc，则输出由字符a、b、c 所能排列出来的所有字符串
abc、acb、bac、bca、cab 和 cba。
'''
import itertools
from click._compat import raw_input

line = raw_input("please input some char:\n")
for i in itertools.permutations(list(line)):
    print("".join(i))
