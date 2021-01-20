

let local = {
    host: 'localhost',
    port: 3306,
    database: 'sequence',
    user: 'root',
    password: 'root'
};

module.exports = {
    jdbc: local,
    // jdbc: local,
    module: 'cn.caijiajia.ratelimiter',
    fieldMap: {
        varchar: 'java.lang.String',
        int: 'java.lang.Integer',
        tinyint: 'java.lang.Integer',
        bigint: 'java.lang.Long',
        decimal: 'java.math.BigDecimal',
        datetime: 'java.util.Date',
        timestamp: 'java.util.Date',
        float: 'java.lang.Double',
        text: 'java.lang.String',
        smallint: 'java.lang.Integer',
        date: 'java.util.Date',
        double: 'java.lang.Double',
        char: 'java.lang.String',
        json: 'java.lang.String',
        longtext: 'java.lang.String',
        mediumtext: 'java.lang.String'
    },
    create: {
        model: true,
        mapper: true,
        example: true
    },
    author: 'xh',
    allTables: false,
    tables: [
        'user','role','permission','user_role','role_permission'//'rate_limiter_info','sys_config','request_info'
    ]
};
