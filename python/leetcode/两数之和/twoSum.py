'''
@Description: 
@Version: 
@Author: Huyida
@Date: 2020-01-14 22:04:02
'''
#!/usr/bin/env python
# encoding: utf-8
'''
@author: Huyida
@contact: huyidada@gmail.com
@file: 1TwoSum.py
@time: 2020-01-14 21:45
@desc:
给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。

你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。

示例:

给定 nums = [2, 7, 11, 15], target = 9

因为 nums[0] + nums[1] = 2 + 7 = 9
所以返回 [0, 1]

'''


def twoSum1(nums, target):
    """
    暴力破解法
    解题关键主要是想找到 num2 = target - num1，是否也在 list 中，那么就需要运用以下两个方法：
    num2 in nums，返回 True 说明有戏
    nums.index(num2)，查找 num2 的索引
    执行用时: 944 ms
    """
    lens = len(nums)
    j = -1
    for i in range(lens):
        if (target - nums[i]) in nums:
            if (nums.count(target - nums[i]) == 1) & (
                    target - nums[i] == nums[i]
            ):  # 如果num2=num1,且nums中只出现了一次，说明找到是num1本身。
                continue
            else:
                j = nums.index(target - nums[i],
                               i + 1)  # index(x,i+1)是从num1后的序列后找num2
                break
    if j > 0:
        return [i, j]
    else:
        return []


def twoSum2(nums, target):
    """
    num2 的查找并不需要每次从 nums 查找一遍，只需要从 num1 位置之前或之后查找即可。
    但为了方便 index 这里选择从 num1 位置之前查找
    执行用时: 28 ms
    """
    lens = len(nums)
    j = -1
    for i in range(lens):
        temp = nums[:i]
        if (target - nums[i]) in temp:
            j = temp.index(target - nums[i])
            break
    if j >= 0:
        return [j, i]
    return []


def twoSum3(nums, target):
    """
    遍历列表同时查字典
    执行用时: 24 ms
    """
    dct = {}
    for i, n in enumerate(nums):
        if target - n in dct:
            return [dct[target - n], i]
        dct[n] = i


nums = [2, 11, 7, 15]
print(twoSum3(nums, 9))
