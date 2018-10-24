DROP TABLE IF EXISTS `finance_assets`;
CREATE TABLE `finance_assets` (
  `id` int(11) NOT NULL COMMENT '主键',
  `name` varchar(255) DEFAULT NULL COMMENT '类型名称',
  `money` double DEFAULT NULL COMMENT '当前金额',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='初始化信息表';
-----------------------------------------------------------
DROP TABLE IF EXISTS `finance_user`;
CREATE TABLE finance_user
(
    id int PRIMARY KEY NOT NULL COMMENT '主键' AUTO_INCREMENT,
    roleid int COMMENT '角色信息',
    password varchar(50) DEFAULT null  COMMENT '密码',
    show_name varchar(50) DEFAULT null COMMENT '展示姓名',
    user_code varchar(50) DEFAULT null  COMMENT '登录信息',
    remarks varchar(1000) DEFAULT null  COMMENT '备注'
);
ALTER TABLE finance_user COMMENT = '用户信息表';
-------------------------------------------------------------
DROP TABLE IF EXISTS `finance_role`;

CREATE TABLE `finance_role` (
  `id` int(11) NOT NULL COMMENT '主键' AUTO_INCREMENT,
  `role_code` varchar(1000)  DEFAULT NULL COMMENT '角色代码',
  `role_name` varchar(50) DEFAULT NULL COMMENT '角色名称',
  `remarks` varchar(1000) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ;
ALTER TABLE finance_role COMMENT = '角色信息表';
-------------------------------------------------------------