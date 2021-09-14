# -*- coding: utf-8 -*-
"""
Created on Tue Jan 26 00:49:33 2021

@author: 不是我
"""
import matplotlib.pyplot as plt
import numpy as np

plt.rcParams["font.sans-serif"]=['SimHei']
plt.rcParams['axes.unicode_minus']=False

z=np.array([1,5])
print(z)

z=np.arange(1,5,1)
print(z)
z=np.arange(1,5)
print(z)
z=np.arange(5)
print(z)

z=np.random.randint(5)
print(z)
z=np.random.randint(1,5)
print(z)
z=np.random.randint(1,5,2)
print(z)

z=np.random.rand(5)
print(z)
z=np.random.rand(1,5)
print(z)
z=np.random.rand(1,5,2)
print(z)

y=np.linspace(0,3,3)#初始值是0终止值是3生成三个等差数列
x=["你","我","他"]
plt.plot(x,y,"ro-")
plt.show()
