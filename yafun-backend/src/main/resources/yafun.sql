CREATE DATABASE yafun;
use yafun;

create table user(
  id int not null primary key auto_increment,
  username varchar(20) not null,
  password varchar(20) not null,
  sex varchar(5),
  photo_url tinytext,
  email varchar(30) not null,
  type int not null,       #类型
  register_date datetime not null,  #注册时间
  signature varchar(50),     #签名
  level int not null default 0 , #等级
  active_code varchar(32),	#激活码
  hasActive int	#用户状态状态
)charset=utf8;
