# -*- coding: utf-8 -*-
"""
Created on Fri Jan  1 21:17:27 2021

@author: 不是我
"""
import numpy as np
import pandas as pd
obj=pd.Series([4,5,6,7])
print(obj.head(3))
print(obj.tail(3))
print(obj.shape)
print(obj.size)
print(obj.unique())
print(obj.isna())
a = pd.Series(data=[1,1,1],index=["a","b","c"])
b = pd.Series(data=[2,2,2],index=["a","d","c"])
d=a+b
print(d)
print(d.isna())
print(a.a)
"""
print(obj)
a=np.arange(10)
print(a)
print(obj.values)
print(obj.index)
obj2=pd.Series(a)
print(obj2)
print(obj2.values)
print(obj2.index)
"""

"""
import numpy as np
import pandas as pd
obj = pd.Series([1,2,3,4,])
print(obj.values)
print(obj.index)
"""