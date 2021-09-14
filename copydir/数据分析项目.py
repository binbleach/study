# -*- coding: utf-8 -*-
"""
Created on Sat Jan 16 02:28:23 2021

@author: 不是我
"""
import numpy as np
import pandas as pd

df = pd.read_excel(r"d:\文件\商家A的订单数据.xlsx")
#print(df.info())
#print(list(df.groupby("商品名称")))
#df1=list(df.groupby("下单时间"))
#df.set_index("下单时间",inplace=True)
print(df.info())
#print(df.head())
#print(dict(df["2020-07"].groupby("商品id")))
#list(df["2020-07"].groupby("商品id")
#df=pd.DataFrame(df["2020-07"].groupby("商品id"))
#df.to_excel("./7月份商品进货03.xlsx")
#print(df["商品名称"][df["商品名称"].str.contains("裤")])
#print(df["商品名称"][df["商品名称"].isin(["裤"])])
print(df.apply(lambda x: sum(x.isnull())/len(x),axis=0))
df["下单时间"]=df["下单时间"].dt.date
print(df.head())