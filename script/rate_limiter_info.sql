DROP TABLE  IF EXISTS rate_limiter_info;
CREATE TABLE `rate_limiter_info` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL DEFAULT '',
  `apps` varchar(1000) NOT NULL DEFAULT '',
  `max_permits` int(11) NOT NULL,
  `rate` int(11) NOT NULL,
  `creator` varchar(50) DEFAULT NULL,
  `modifier` varchar(50) DEFAULT NULL,
  `create_date` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `modify_date` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `del_flag` tinyint(4) not null default 0,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=38 DEFAULT CHARSET=utf8mb4;

DROP TABLE  IF EXISTS sys_config;
CREATE TABLE `sys_config` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT ,
  `apps` varchar(50) NOT NULL DEFAULT '',
  `code` varchar(50) NOT NULL DEFAULT '',
  `type` int(11) NOT NULL DEFAULT 0 comment '类型 0 单值 1 json' ,
  `value` varchar(50) DEFAULT '',
  `json_value` varchar(500) DEFAULT '{}',
  `remark` varchar(200) default '',
  `creator` varchar(50) DEFAULT NULL,
  `modifier` varchar(50) DEFAULT NULL,
  `create_date` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `modify_date` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `del_flag` tinyint(4) not null default 0,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1   COMMENT='参数配置表' CHARSET=utf8mb4;

DROP TABLE  IF EXISTS request_info;
CREATE TABLE `request_info` (
  `id` bigint(20)  NOT NULL  AUTO_INCREMENT,
  `ip` varchar(50) NOT NULL DEFAULT '',
  `apps` varchar(50) NOT NULL DEFAULT '',
  `user_id` varchar(50) ,
  `req_time` datetime ,
  `param` varchar(500) NOT NULL default '{}',
  `creator` varchar(50) DEFAULT NULL,
  `modifier` varchar(50) DEFAULT NULL,
  `create_date` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `modify_date` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `del_flag` tinyint(4) not null default 0,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1  COMMENT='日志记录' CHARSET=utf8mb4;