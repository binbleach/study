# -*- coding: utf-8 -*-
"""
Created on Fri Jan 29 17:17:17 2021

@author: 不是我
"""

import pandas as pd
import matplotlib.pyplot as plt
df = pd.read_excel(r"d:\文件\商家A的订单数据.xlsx")
#df.set_index("下单时间",inplace=True) #设置新的行索引

print(df.info()) #查看数据信息

#Tx=0
#for i in df["商品名称"]:
#    if "T恤" in i:
#        Tx+=1
#        print(i)
#print("T恤的数量是",Tx)

dfa=df["商品名称"][df["商品名称"].str.contains("T恤")]
dfb=df["商品名称"][df["商品名称"].str.contains("卫衣")]
dfc=df["商品名称"][df["商品名称"].str.contains("毛衣")]
dfd=df["商品名称"][df["商品名称"].str.contains("衫")]
dfe=df["商品名称"][df["商品名称"].str.contains("外套")]
dff=df["商品名称"][df["商品名称"].str.contains("牛仔裤")]
dfg=df["商品名称"][df["商品名称"].str.contains("披肩")]
dfh=df["商品名称"][df["商品名称"].str.contains("背心")]
dfi=df["商品名称"][df["商品名称"].str.contains("西裤")]
dfj=df["商品名称"][df["商品名称"].str.contains("马甲")]
dfk=df["商品名称"][df["商品名称"].str.contains("休闲裤")]
dfl=df["商品名称"][df["商品名称"].str.contains("连衣裙")]
dfn=df["商品名称"][df["商品名称"].str.contains("套装")]
dfm=df["商品名称"][df["商品名称"].str.contains("短裤")]
dfo=df["商品名称"][df["商品名称"].str.contains("半身裙")]
#dfp=df["商品名称"][df["商品名称"].str.contains("")]
#dfq=df["商品名称"][df["商品名称"].str.contains("")]
#dfr=df["商品名称"][df["商品名称"].str.contains("")]

#print(df.apply(lambda x: sum(x.isnull())/len(x),axis=0)) #查看缺失率

df["下单时间"]=df["下单时间"].dt.date  #提出年月日

print(df.head())

#count=df["商品名称"].count()
#print("商品总件数:",count)

print("T恤总件数：",dfa.count())
print("卫衣总件数：",dfb.count())
print("毛衣总件数：",dfc.count())
print("衫的总件数：",dfd.count())
print("外套的总件数：",dfe.count())
print("牛仔裤的总件数：",dff.count())
print("披肩的总件数：",dfg.count())
print("背心的总件数：",dfh.count())
print("西装裤的总件数：",dfi.count())
print("马甲的总件数：",dfj.count())
print("休闲裤的总件数：",dfk.count())
print("连衣裙的总件数：",dfl.count())
print("套装的总件数：",dfn.count())
print("短裤的总件数：",dfm.count())
print("半身裙的总件数：",dfo.count())
print(type(dfa.count))

RanKing={"T恤":dfa.count(),"卫衣":dfb.count(),"毛衣":dfc.count(),"衫":dfd.count(),"外套":dfe.count(),"牛仔裤":dff.count(),"披肩":dfg.count(),"背心":dfh.count(),"西装裤":dfi.count(),"马甲":dfj.count(),"休闲裤":dfk.count(),"连衣裙":dfl.count(),"套装":dfn.count(),"短裤":dfm.count(),"半身裙":dfo.count()}
print("商品订货排行：",sorted(RanKing.items(),key = lambda item:item[1],reverse=True))

def draw_from_dict(dicdata,RANGE, heng=0):
    #dicdata：字典的数据。
    #RANGE：截取显示的字典的长度。
    #heng=0，代表条状图的柱子是竖直向上的。heng=1，代表柱子是横向的。考虑到文字是从左到右的，让柱子横向排列更容易观察坐标轴。
    by_value = sorted(dicdata.items(),key = lambda item:item[1],reverse=True)
    x = []
    y = []
    for d in by_value:
        x.append(d[0])
        y.append(d[1])
    if heng == 0:
        plt.bar(x[0:RANGE], y[0:RANGE])
        plt.show()
        return 
    elif heng == 1:
        plt.barh(x[0:RANGE], y[0:RANGE])
        plt.show()
        return 
    else:
        return "heng的值仅为0或1！"
draw_from_dict(RanKing,15)