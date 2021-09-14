# -*- coding: utf-8 -*-
"""
Created on Mon Jan 18 15:13:59 2021

@author: 不是我
"""

import numpy as np
data=np.genfromtxt(r"./testg.txt",delimiter=",",skip_header=1)
#skip_header=1 略过第一行去读，也可以读csv的文件
print(data)
data1=np.loadtxt(r"./testg.txt",delimiter=",")#不能用,skip_header=1
print(data1)
data2=data*2
print(data2)
np.savetxt("./testg2.xlsx",data2,delimiter=",",fmt="%.3f")