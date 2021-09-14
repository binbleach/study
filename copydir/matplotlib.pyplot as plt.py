# -*- coding: utf-8 -*-
"""
Created on Tue Jan 26 01:25:54 2021

@author: 不是我
"""

import matplotlib.pyplot as plt
import numpy as np

plt.rcParams["font.sans-serif"]=['SimHei']
plt.rcParams['axes.unicode_minus']=False

y=np.linspace(0,3,3)#初始值是0终止值是3生成三个等差数列
x=["你","我","他"]
plt.plot(x,y,"ro-")
plt.show()