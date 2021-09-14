# -*- coding: utf-8 -*-
"""
Created on Mon Jan 18 16:00:52 2021

@author: 不是我
"""

import pandas as pd
df=pd.read_csv(r"./pandas1.csv",na_values=4)#na_values=su ,su代表缺失值，读excle不能用
print(df)
df.to_excel("./pandas1.xlsx")