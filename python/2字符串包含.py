#!/usr/bin/env python
# -*- coding: utf-8 -*-
# @Time    : 2018/1/18 20:43
# @Author  : Huyd
# @Site    : 
# @File    : 2字符串包含.py
# @Software: PyCharm

'''
给定两个分别由字母组成的字符串A和字符串B，字符串B的长度比字符串A短。请问，如何最快地判断字符串B中所有字母是否都在字符串A里？
为了简单起见，我们规定输入的字符串只包含大写英文字母，请实现函数bool StringContains(string &A, string &B)
比如，如果是下面两个字符串：
String 1：ABCD
String 2：BAD
答案是true，即String2里的字母在String1里也都有，或者说String2是String1的真子集。
如果是下面两个字符串：
String 1：ABCD
String 2：BCE
答案是false，因为字符串String2里的E字母不在字符串String1里。
同时，如果string1：ABCD，string 2：AA，同样返回true。
'''


# 解法一:暴力解法
def stringContains1(s1, s2):
    '''
    暴力解法,时间开销太大
    :param s1: 字符串1
    :param s2: 字符串2
    :return: True 和 False
    '''
    flag = 0  # 标志位，如果为0表示不存在相同字符，否则每遇到相同flag累加
    # 遍历两字符进行比较
    for i in range(len(s2)):
        for j in range(len(s1)):
            if s2[i] == s1[j]:
                flag += 1
                break
    if flag == len(s2):
        return True
    else:
        return False


# 解法二：排序对比法
def stringContains2(str1, str2):
    '''
    先对这两个字符串的字母进行排序，然后再同时对两个字串依次轮询
    :param str1:
    :param str2:
    :return:
    '''
    long_str = sorted(str1)
    short_str = sorted(str2)
    i, j = 0, 0
    while i < len(long_str) and j < len(short_str):
        while long_str[i] < short_str[j] and i < len(long_str) - 1:
            i += 1
        if long_str[i] != short_str[j]:
            break
        j += 1
    return j == len(short_str)


# 解法三：素数对应积整除法
def stringContains3(str1, str2):
    '''
    假设有一个仅由字母组成字串，让每个字母与一个素数对应，从2开始，往后类推，A对应2，B对应3，C对应5，......。
    遍历第一个字串，把每个字母对应素数相乘。最终会得到一个整数。
    利用上面字母和素数的对应关系，对应第二个字符串中的字母，然后轮询，用每个字母对应的素数除前面得到的整数。
    如果结果有余数，说明结果为false。
    如果整个过程中没有余数，则说明第二个字符串是第一个的子集了（判断是不是真子集，可以比较两个字符串对应的素数乘积，若相等则不是真子集）
    :param str1:
    :param str2:
    :return:
    '''
    prime_number = (2, 3, 5, 7,
                    11, 13, 17, 19,
                    23, 29, 31, 37,
                    41, 43, 47, 53,
                    59, 61, 67, 71,
                    73, 79, 83, 89,
                    97, 101)
    m = 1
    for i in range(len(str1)):
        m = m * (prime_number[ord(str1[i]) - ord('A')])
    for j in range(len(str2)):
        if m % prime_number[ord(str2[j]) - ord('A')]:
            return False
    return True


if __name__ == '__main__':
    str1 = "ABCDRE"
    str2 = "BCD"
    print(stringContains1(str1, str2))  # 暴力解法
    print(stringContains2(str1, str2))  # 排序对比法
    print(stringContains3(str1, str2))  # 素数对应积整除法
