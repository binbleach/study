# -*- coding: utf-8 -*-
"""
Created on Sat Jan 16 04:33:27 2021

@author: 不是我
"""
#loc显示
#iloc隐式
print("索引什么都不加的时候是列")
print("切片什么都不加的时候是行")
import pandas as pd
dit={
     "姓名":["黄家宾","徐凤年"],
     "年龄":[21,28],
     "时间":["2002-12-14","2021-1-16"]
     }
df = pd.DataFrame(data=dit,index=["A","B"])
print(df.isna())
print(df)
print(df["姓名"]) #显示索引  列
print(df.loc['A'])#显示索引  行
print(df.iloc[0]) #隐式索引 行
print(df.iloc[1,1]) #取二行二列索引
print(df.iloc[[0,1],1])
print(df.iloc[:,1])
print("pppppppppppppppppp")

print(df[["姓名","年龄"]])#取多列
print(df.iloc[[0,1]])    #取多行

#切片
print(df[0:2])#行切片
print(df.iloc[:,1:2])#列切片

df["时间"]=pd.to_datetime(df["时间"])
print(df["时间"].dtype)
print(df)

print(df.set_index("时间"))#inplace=True 加了把原始数据改了不加只是返回