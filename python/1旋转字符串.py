#!/usr/bin/env python
# -*- coding: utf-8 -*-
# @Time    : 2018/1/2 23:16
# @Author  : Huyd
# @Site    : 
# @File    : 1旋转字符串.py
# @Software: PyCharm

'''
题目描述
给定一个字符串，要求把字符串前面的若干个字符移动到字符串的尾部
如把字符串“abcdef”前面的2个字符'a'和'b'移动到字符串的尾部，使得原字符串变成字符串“cdefab”。
请写一个函数完成此功能，要求对长度为n的字符串操作的时间复杂度为 O(n)，空间复杂度为 O(1)。
'''


# 解法一：暴力移位法
def violence_reverse(s, n):
    str_before, str_after = [], []
    for i in range(len(s)):
        # 分别存储需要移动的字符
        if i < n:
            str_after.append(s[i])
        else:
            str_before.append(s[i])
    str_before.extend(str_after)  # 把需要移动的字符串放到后面
    # 返回合并的字符串
    return "".join(str_before)


# 解法二：三步反转法
def reverse(s, start, end):
    '''
    首先将原字符串分为两个部分，即X:abc，Y:def；
    将X反转，X->X^T，即得：abc->cba；将Y反转，Y->Y^T，即得：def->fed。
    反转上述步骤得到的结果字符串X^TY^T，即反转字符串cbafed的两部分（cba和fed）给予反转，cbafed得到defabc，形式化表示为(X^TY^T)^T=YX，这就实现了整个反转。
    '''

    n = end - start + 1
    for i in range(int(n / 2)):
        s[start + i], s[end - i] = s[end - i], s[start + i]


def reverse_solution(s, n):
    s = list(s)
    m = len(s)
    reverse(s, 0, n - 1)  # 反转[0..n - 1]，套用到上面举的例子中，就是X->X^T，即 abc->cba
    reverse(s, n, m - 1)  # 反转[m..m - 1]，例如Y->Y^T，即 def->fed
    reverse(s, 0, m - 1)  # 反转[0..m - 1]，即如整个反转，(X^TY^T)^T=YX，即 cbafed->defabc。
    return "".join(s)


if __name__ == '__main__':
    str = "abcdef"  # 源字符串
    print("暴力移位法->", violence_reverse(str, 2))  # 暴力移位法
    print("三步反转法->", reverse_solution(str, 2))  # 三步反转法
