use xhapi;

-- 接口信息
create table if not exists xhapi.`interface_info`
(
    `id` bigint not null auto_increment comment '主键' primary key,
    `name` varchar(256) not null comment '接口名称',
    `description` varchar(256) null comment '接口描述',
    `url` varchar(512) not null comment '接口地址',
    `request_header` text null comment '请求头',
    `response_header` text null comment '响应头',
    `status` int default 0 not null comment '状态(0 关闭 1 开启)',
    `method` varchar(256) not null comment '请求类型',
    `user_id` bigint not null comment '创建人',
    `create_time` datetime default CURRENT_TIMESTAMP not null comment '创建时间',
    `update_time` datetime default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment '更新时间',
    `is_deleted` tinyint default 0 not null comment '是否删除(0-未删, 1-已删)'
) comment '接口信息';

insert into xhapi.`interface_info` (`name`, `description`, `url`, `request_header`, `response_header`, `method`, `user_id`) values ('石晟睿', '姜子默', 'www.karine-bins.io', '丁思远', '邹鹏煊', '白博涛', 372);
insert into xhapi.`interface_info` (`name`, `description`, `url`, `request_header`, `response_header`, `method`, `user_id`) values ('张绍辉', '傅晋鹏', 'www.mel-barrows.io', '卢凯瑞', '尹楷瑞', '刘鸿煊', 741843640);
insert into xhapi.`interface_info` (`name`, `description`, `url`, `request_header`, `response_header`, `method`, `user_id`) values ('石苑博', '邵擎苍', 'www.arthur-ebert.net', '林瑞霖', '郭笑愚', '阎明轩', 519356171);
insert into xhapi.`interface_info` (`name`, `description`, `url`, `request_header`, `response_header`, `method`, `user_id`) values ('石旭尧', '杨睿渊', 'www.chang-littel.info', '严弘文', '陆越彬', '武鑫鹏', 20);
insert into xhapi.`interface_info` (`name`, `description`, `url`, `request_header`, `response_header`, `method`, `user_id`) values ('郭越泽', '白鸿煊', 'www.isabelle-von.net', '赖昊天', '赵聪健', '杨烨华', 74213937);
insert into xhapi.`interface_info` (`name`, `description`, `url`, `request_header`, `response_header`, `method`, `user_id`) values ('曾绍齐', '卢绍齐', 'www.kyung-lubowitz.biz', '邱天磊', '谢健柏', '顾胤祥', 3336463016);
insert into xhapi.`interface_info` (`name`, `description`, `url`, `request_header`, `response_header`, `method`, `user_id`) values ('尹鹏', '白天磊', 'www.davis-monahan.co', '马子轩', '武绍辉', '贾正豪', 8);
insert into xhapi.`interface_info` (`name`, `description`, `url`, `request_header`, `response_header`, `method`, `user_id`) values ('龚笑愚', '金晟睿', 'www.napoleon-sanford.org', '毛子默', '侯鹭洋', '郑智辉', 602);
insert into xhapi.`interface_info` (`name`, `description`, `url`, `request_header`, `response_header`, `method`, `user_id`) values ('石乐驹', '赵展鹏', 'www.georgine-ondricka.name', '范思聪', '方昊焱', '任鸿煊', 638802591);
insert into xhapi.`interface_info` (`name`, `description`, `url`, `request_header`, `response_header`, `method`, `user_id`) values ('熊梓晨', '姚哲瀚', 'www.sterling-zemlak.info', '邱弘文', '孟昊强', '曹晟睿', 41464);
insert into xhapi.`interface_info` (`name`, `description`, `url`, `request_header`, `response_header`, `method`, `user_id`) values ('黎峻熙', '沈昊然', 'www.isaac-gaylord.name', '曹立果', '谭浩然', '郝浩宇', 56603479);
insert into xhapi.`interface_info` (`name`, `description`, `url`, `request_header`, `response_header`, `method`, `user_id`) values ('邓健柏', '尹俊驰', 'www.lupe-gottlieb.co', '赵鹏飞', '赵天磊', '袁鹭洋', 771027);
insert into xhapi.`interface_info` (`name`, `description`, `url`, `request_header`, `response_header`, `method`, `user_id`) values ('朱语堂', '丁立辉', 'www.matthew-little.io', '周擎宇', '吕胤祥', '魏子骞', 550091346);
insert into xhapi.`interface_info` (`name`, `description`, `url`, `request_header`, `response_header`, `method`, `user_id`) values ('史耀杰', '薛弘文', 'www.silas-schiller.co', '覃立轩', '秦钰轩', '魏雪松', 119);
insert into xhapi.`interface_info` (`name`, `description`, `url`, `request_header`, `response_header`, `method`, `user_id`) values ('陈哲瀚', '戴健雄', 'www.eugenia-herman.biz', '崔潇然', '萧睿渊', '韦鑫磊', 579095269);
insert into xhapi.`interface_info` (`name`, `description`, `url`, `request_header`, `response_header`, `method`, `user_id`) values ('郑旭尧', '韦子轩', 'www.virgilio-kiehn.info', '钟泽洋', '卢鹏', '孔航', 9574269);
insert into xhapi.`interface_info` (`name`, `description`, `url`, `request_header`, `response_header`, `method`, `user_id`) values ('曾泽洋', '刘鑫鹏', 'www.sandy-veum.org', '汪果', '陈果', '林嘉懿', 5729);
insert into xhapi.`interface_info` (`name`, `description`, `url`, `request_header`, `response_header`, `method`, `user_id`) values ('孟瑞霖', '钟晓啸', 'www.quentin-rempel.name', '黎子轩', '程峻熙', '莫鹏', 662851708);
insert into xhapi.`interface_info` (`name`, `description`, `url`, `request_header`, `response_header`, `method`, `user_id`) values ('顾涛', '孔健雄', 'www.melodi-ortiz.com', '万潇然', '范伟祺', '高钰轩', 109985);
insert into xhapi.`interface_info` (`name`, `description`, `url`, `request_header`, `response_header`, `method`, `user_id`) values ('冯语堂', '王文博', 'www.marion-grady.com', '朱立果', '严瑞霖', '黎健雄', 107);

-- 用户调用接口关系表
create table if not exists xhapi.`user_interface_info`
(
    `id` bigint not null auto_increment comment '主键' primary key,
    `user_id` bigint not null comment '调用用户 id',
    `interface_info_id` bigint not null comment '接口 id',
    `total_num` int default 0 not null comment '总调用次数',
    `left_num` int default 0 not null comment '剩余调用次数',
    `status` int default 0 not null comment '0-正常，1-禁用',
    `create_time` datetime default CURRENT_TIMESTAMP not null comment '创建时间',
    `update_time` datetime default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment '更新时间',
    `deleted` tinyint default 0 not null comment '是否删除(0-未删, 1-已删)'
) comment '用户调用接口关系';
