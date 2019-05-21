# 2018年华为软件精英挑战赛--“云动”
服务器预测和分配问题

## 主要思路
1. 预测部分
预测部分采用ARIMA算法通过历史数据来预测；
2. 分配问题
考虑为背包问题

## 比赛过程名次记录
其实初赛的成绩还不错，在前三名好久，但是最后没时间弄了，最后连32强都没进，各种原因放后面总结吧。
P.S. 我们的队名叫“响亮的队名”O(∩_∩)O

![2018年03月14日](https://raw.githubusercontent.com/JayVae/pictures/master/res/20180314.jpg)
![20180317](https://raw.githubusercontent.com/JayVae/pictures/master/res/20180317.png)
![20180318](https://raw.githubusercontent.com/JayVae/pictures/master/res/20180318.png)
![20180319](https://raw.githubusercontent.com/JayVae/pictures/master/res/20180319.png)

## 经验教训
1. 首先是代码的质量太差，比如背包算法的实现空间使用极大，使用了三维的数组，在大case中直接崩掉，后来处理为二维数据，其次，背包算法还有可以优化的空间；
2. 预测部分的代码不知道为什么会有随机性...真的很尴尬，最后也不知道；
3. 预测部分的思路不清晰，基本一直在各种试，但是并没有提出一个比较好的评判方法；
4. 没有写对拍程序，这个是严重错误，其实应该自己造一些数据集来进行验证的；
5. 这个算是bug吧...正式比赛的时候，官方数据的最后一行多了一行空行，而测试数据是没有的，而我恰恰是从后往前处理数据的，所以接连试了好几次都是报错，耽误了有限的提交次数，所以还是缺少对bug分析以及程序鲁棒性的经验。
