from java import jclass
import math
import copy
import numpy as np
import os

def get_path(path):
    path1 = path    #'res3'
    direction = 'look-down'
    ip =  '192.168.151.16'
    return os.path.join(path1,ip,direction)


# 使用numpy
def print_numpy():
    y = np.zeros((5,), dtype = np.int)
    print(y)

def greet(name):
    print("--- hello,%s ---" % name)

def add(a,b):
    return a + b

def getsqrt(a):
    return math.sqrt(a)

def test_copy():
    a = [1, 2, 3, 4, ['a', 'b']] #原始对象
    b = a #赋值，传对象的引用
    c = copy.copy(a) #对象拷贝，浅拷贝
    return c

def test_deepcopy():
    a = [1, 2, 3, 4, ['a', 'b']] #原始对象
    d = copy.deepcopy(a) #对象拷贝，深拷贝
    return d

def sub(count,a=0,b=0,c=0):
    return count - a - b -c

def get_list(a,b,c,d):
    return [a,b,c,d]

def print_list(data):
    print(type(data))
    # 遍历Java的ArrayList对象
    for i in range(data.size()):
        print(data.get(i))

# python调用Java类
def get_java_bean():
    JavaBean = jclass("com.xiangxun.wane.dao.JavaBean")#用自己的包名
    jb = JavaBean("python")
    jb.setData("json")
    jb.setData("xml")
    jb.setData("xhtml")
    return jb
# python调用Java类
def get_check_value():
    checkvalue = jclass("com.xiangxun.wane.dao.CheckValue")#用自己的包名
    result = checkvalue()
    result.setCurveRadius(1)
    result.setCurvePointX(2)
    result.setCurvePointX(3)
    result.setK_left(1.53389)
    result.setB_left(72.37242)
    result.setK_right(0.00419)
    result.setB_right(-5.28399)
    result.setCrossPointX(8)
    result.setCrossPointY(9)
    return result