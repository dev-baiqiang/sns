#=====================
这个是软件工程的作业 关于数据库建设 以及 dao层建设

需要Spring 3及 Hibernate 3.2以上 因为需要Annotation支持 使用MyEclipse 2013以上版本自带

sql文件夹的 sns.mwb是mysql的模型图 可以直接打开

#===============2014年5月8日
###改动日志 简化评论功能的开发 只允许顺序评论 用顺序模拟嵌套评论

###实现Service层 但是 没有测试

#========================

>对于海洋说的那个留言信息查看与否 已经修改

>下次上传

#============2014年5月9日

>添加Message是否已经读过的属性 

>添加Thing的type属性 约定0代表新鲜事 1代表日志 2代表分享 3代表公共主页消息

>update Service层

>谁帮我测试一下 

    希望大家努力 好好学习

*****

#===============2014年5月13日

>今天把遗留的部分Service层问题解决 将原来的Java Project变为Web Project

>开发的过程中Classpath加入JavaEE6 部署的时候添加JPA代替JavaEE 因为tomcat没有JPA

>引入Struts2包 同步到Github上面

>增加一些分页需要的DAO接口 也可以在Service 使用DAO将数据全部取出放在内存 再分段取 但是时效性不高

>增加一个UsersAction 还模拟一个注册页面 可以成功实现注册

>发现一个重要的问题 我的数据库一个表的属性password写成了passwod竟然没有人提醒我

>网页中加载图片测试成功，发现在移动Enity从dao到model的时候注意一些问题

>我今天就写到这里了 希望大家都看一下
