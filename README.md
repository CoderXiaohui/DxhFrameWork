### 说明：
通过一个案例，仿写Spring框架的核心内容，从而学习Spring框架

#### Init (2020-08-05):
- 架子搭建完毕~

#### 0.1 (2020-08-06):
实体类、Service层、Controller层代码架子的搭建
- 1.增加了`entity` 包含了`bo`和`dto`
    - BO: 两个业务对象，头部banner条和商品类别。
    - DTO: 两个数据传输对象，一个是为了首页同时返回的头部banner条和商品类别，另一个是统一返回结果Result.java。
    - Result.java ，使用泛型类，方便返回不同类型的结果。
- 2.增加了`service`层,包含了`solo`和`combine`包
    - solo中分别是两个业务对象的增删改查的实现（伪实现）。
    - combine中是主页所展示的内容的实现（伪实现）。
- 3.增加了controller层，包含了`frontend包`和`DispatcherServlet.java`
    - frontend包下的功能主要是实现主页内容，和管理员才能操作(superadmin包下)的增删改查。
    - 通过DispatcherServlet.java进行请求的统一拦截。根据`request path`和`request method`来执行不同的方法。