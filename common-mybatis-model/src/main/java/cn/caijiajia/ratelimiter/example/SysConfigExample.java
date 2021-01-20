package cn.caijiajia.ratelimiter.example;

import cn.caijiajia.ratelimiter.core.common.util.CheckUtils;
import cn.caijiajia.ratelimiter.core.common.util.CollectionUtils;
import cn.caijiajia.ratelimiter.core.mybatis.example.AbstractExample;
import cn.caijiajia.ratelimiter.model.SysConfig;
import tk.mybatis.mapper.entity.EntityColumn;
import tk.mybatis.mapper.entity.Example;

import java.util.Map;
import java.util.Date;

/**
 * sys_config 参数配置表
 *
 * @author xh
 * @since 2021/01/18
 */
public class SysConfigExample extends AbstractExample<SysConfig> {

    /**
     * 排序
     */
    protected OrderBy ORDER_BY;

    public SysConfigExample() {
        super(SysConfig.class);
        this.ORDER_BY = new OrderBy(this, propertyMap);
    }

    /**
     * and
     *
     * @return
     */
    @Override
    public Criteria and() {
        Criteria criteria = new Criteria(propertyMap, exists, notNull);
        criteria.setAndOr("and");
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * order by
     *
     * @return
     */
    public OrderBy orderBy() {
        return ORDER_BY;
    }

    /**
     * order by
     */
    public static class OrderBy extends Example.OrderBy {

        public OrderBy(Example example, Map<String, EntityColumn> propertyMap) {
            super(example, propertyMap);
        }

        /**
         * desc
         *
         * @return
         */
        @Override
        public OrderBy desc() {
            super.desc();
            return this;
        }

        /**
         * asc
         *
         * @return
         */
        @Override
        public OrderBy asc() {
            super.asc();
            return this;
        }
        
        /**
         * order by id
         *
         * @return
         */
        public OrderBy id() {
            this.orderBy("id");
            return this;
        }
        
        /**
         * order by apps
         *
         * @return
         */
        public OrderBy apps() {
            this.orderBy("apps");
            return this;
        }
        
        /**
         * order by code
         *
         * @return
         */
        public OrderBy code() {
            this.orderBy("code");
            return this;
        }
        
        /**
         * order by type
         *
         * @return
         */
        public OrderBy type() {
            this.orderBy("type");
            return this;
        }
        
        /**
         * order by value
         *
         * @return
         */
        public OrderBy value() {
            this.orderBy("value");
            return this;
        }
        
        /**
         * order by json_value
         *
         * @return
         */
        public OrderBy jsonValue() {
            this.orderBy("jsonValue");
            return this;
        }
        
        /**
         * order by remark
         *
         * @return
         */
        public OrderBy remark() {
            this.orderBy("remark");
            return this;
        }
        
        /**
         * order by creator
         *
         * @return
         */
        public OrderBy creator() {
            this.orderBy("creator");
            return this;
        }
        
        /**
         * order by modifier
         *
         * @return
         */
        public OrderBy modifier() {
            this.orderBy("modifier");
            return this;
        }
        
        /**
         * order by create_date
         *
         * @return
         */
        public OrderBy createDate() {
            this.orderBy("createDate");
            return this;
        }
        
        /**
         * order by modify_date
         *
         * @return
         */
        public OrderBy modifyDate() {
            this.orderBy("modifyDate");
            return this;
        }
        
        /**
         * order by del_flag
         *
         * @return
         */
        public OrderBy delFlag() {
            this.orderBy("delFlag");
            return this;
        }
        
    }

    /**
     * where
     */
    public static class Criteria extends Example.Criteria {

        public Criteria(Map<String, EntityColumn> propertyMap, boolean exists, boolean notNull) {
            super(propertyMap, exists, notNull);
        }

        /**
         * and id = value
         *
         * @return
         */
        public Criteria andIdEqualTo(Long value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.andEqualTo("id", value);
            return this;
        }

        /**
         * and id != value
         *
         * @return
         */
        public Criteria andIdNotEqualTo(Long value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.andNotEqualTo("id", value);
            return this;
        }

        /**
         * and id > value
         *
         * @return
         */
        public Criteria andIdGreaterThan(Long value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andGreaterThan("id", value);
            return this;
        }

        /**
         * and id >= value
         *
         * @return
         */
        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andGreaterThanOrEqualTo("id", value);
            return this;
        }

        /**
         * and id < value
         *
         * @return
         */
        public Criteria andIdLessThan(Long value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andLessThan("id", value);
            return this;
        }

        /**
         * and id <= value
         *
         * @return
         */
        public Criteria andIdLessThanOrEqualTo(Long value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andLessThanOrEqualTo("id", value);
            return this;
        }

        /**
         * and id in (value1, value2, ...)
         *
         * @return
         */
        public Criteria andIdIn(Iterable<Long> values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            super.andIn("id", values);
            return this;
        }

        /**
         * and id in (value1, value2, ...)
         *
         * @return
         */
        public Criteria andIdIn(Long... values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            super.andIn("id", CollectionUtils.initList(values));
            return this;
        }

        /**
         * and id not in (value1, value2, ...)
         *
         * @return
         */
        public Criteria andIdNotIn(Iterable<Long> values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            super.andNotIn("id", values);
            return this;
        }

        /**
         * and id not in (value1, value2, ...)
         *
         * @return
         */
        public Criteria andIdNotIn(Long[] values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            super.andNotIn("id", CollectionUtils.initList(values));
            return this;
        }

        /**
         * and id between value1 and value2
         *
         * @return
         */
        public Criteria andIdBetween(Long value1, Long value2) {
            if (CheckUtils.isAnyEmpty(value1, value2)) {
                return this;
            }
            super.andBetween("id", value1, value2);
            return this;
        }

        /**
         * and id not between value1 and value2
         *
         * @return
         */
        public Criteria andIdNotBetween(Long value1, Long value2) {
            if (CheckUtils.isAnyEmpty(value1, value2)) {
                return this;
            }
            super.andNotBetween("id", value1, value2);
            return this;
        }

        /**
         * and id like value
         *
         * @return
         */
        public Criteria andIdLike(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andLike("id", value);
            return this;
        }

        /**
         * and id not like value
         *
         * @return
         */
        public Criteria andIdNotLike(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andNotLike("id", value);
            return this;
        }

        /**
         * or id = value
         *
         * @return
         */
        public Criteria orIdEqualTo(Long value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orEqualTo("id", value);
            return this;
        }

        /**
         * or id != value
         *
         * @return
         */
        public Criteria orIdNotEqualTo(Long value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orNotEqualTo("id", value);
            return this;
        }

        /**
         * or id > value
         *
         * @return
         */
        public Criteria orIdGreaterThan(Long value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orGreaterThan("id", value);
            return this;
        }

        /**
         * or id >= value
         *
         * @return
         */
        public Criteria orIdGreaterThanOrEqualTo(Long value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orGreaterThanOrEqualTo("id", value);
            return this;
        }

        /**
         * or id < value
         *
         * @return
         */
        public Criteria orIdLessThan(Long value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orLessThan("id", value);
            return this;
        }

        /**
         * or id <= value
         *
         * @return
         */
        public Criteria orIdLessThanOrEqualTo(Long value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orLessThanOrEqualTo("id", value);
            return this;
        }

        /**
         * or id in (value1, value2, ...)
         *
         * @return
         */
        public Criteria orIdIn(Iterable<Long> values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            this.orIn("id", values);
            return this;
        }

        /**
         * or id in (value1, value2, ...)
         *
         * @return
         */
        public Criteria orIdIn(Long[] values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            this.orIn("id", CollectionUtils.initList(values));
            return this;
        }

        /**
         * or id not in (value1, value2, ...)
         *
         * @return
         */
        public Criteria orIdNotIn(Iterable<Long> values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            this.orNotIn("id", values);
            return this;
        }

        /**
         * or id not in (value1, value2, ...)
         *
         * @return
         */
        public Criteria orIdNotIn(Long[] values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            this.orNotIn("id", CollectionUtils.initList(values));
            return this;
        }

        /**
         * or id between value1 and value2
         *
         * @return
         */
        public Criteria orIdBetween(Long value1, Long value2) {
            if (CheckUtils.isAnyEmpty(value1, value2)) {
                return this;
            }
            this.orBetween("id", value1, value2);
            return this;
        }

        /**
         * or id not between value1 and value2
         *
         * @return
         */
        public Criteria orIdNotBetween(Long value1, Long value2) {
            if (CheckUtils.isAnyEmpty(value1, value2)) {
                return this;
            }
            this.orNotBetween("id", value1, value2);
            return this;
        }

        /**
         * or id like value
         *
         * @return
         */
        public Criteria orIdLike(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orLike("id", value);
            return this;
        }

        /**
         * or id not like value
         *
         * @return
         */
        public Criteria orIdNotLike(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orNotLike("id", value);
            return this;
        }

        /**
         * and apps = ''
         *
         * @return
         */
        public Criteria andAppsIsEmpty() {
            this.andEqualTo("apps", "");
            return this;
        }

        /**
         * and apps != ''
         *
         * @return
         */
        public Criteria andAppsIsNotEmpty() {
            this.andNotEqualTo("apps", "");
            return this;
        }

        /**
         * and apps = value
         *
         * @return
         */
        public Criteria andAppsEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.andEqualTo("apps", value);
            return this;
        }

        /**
         * and apps != value
         *
         * @return
         */
        public Criteria andAppsNotEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.andNotEqualTo("apps", value);
            return this;
        }

        /**
         * and apps > value
         *
         * @return
         */
        public Criteria andAppsGreaterThan(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andGreaterThan("apps", value);
            return this;
        }

        /**
         * and apps >= value
         *
         * @return
         */
        public Criteria andAppsGreaterThanOrEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andGreaterThanOrEqualTo("apps", value);
            return this;
        }

        /**
         * and apps < value
         *
         * @return
         */
        public Criteria andAppsLessThan(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andLessThan("apps", value);
            return this;
        }

        /**
         * and apps <= value
         *
         * @return
         */
        public Criteria andAppsLessThanOrEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andLessThanOrEqualTo("apps", value);
            return this;
        }

        /**
         * and apps in (value1, value2, ...)
         *
         * @return
         */
        public Criteria andAppsIn(Iterable<String> values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            super.andIn("apps", values);
            return this;
        }

        /**
         * and apps in (value1, value2, ...)
         *
         * @return
         */
        public Criteria andAppsIn(String... values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            super.andIn("apps", CollectionUtils.initList(values));
            return this;
        }

        /**
         * and apps not in (value1, value2, ...)
         *
         * @return
         */
        public Criteria andAppsNotIn(Iterable<String> values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            super.andNotIn("apps", values);
            return this;
        }

        /**
         * and apps not in (value1, value2, ...)
         *
         * @return
         */
        public Criteria andAppsNotIn(String[] values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            super.andNotIn("apps", CollectionUtils.initList(values));
            return this;
        }

        /**
         * and apps between value1 and value2
         *
         * @return
         */
        public Criteria andAppsBetween(String value1, String value2) {
            if (CheckUtils.isAnyEmpty(value1, value2)) {
                return this;
            }
            super.andBetween("apps", value1, value2);
            return this;
        }

        /**
         * and apps not between value1 and value2
         *
         * @return
         */
        public Criteria andAppsNotBetween(String value1, String value2) {
            if (CheckUtils.isAnyEmpty(value1, value2)) {
                return this;
            }
            super.andNotBetween("apps", value1, value2);
            return this;
        }

        /**
         * and apps like value
         *
         * @return
         */
        public Criteria andAppsLike(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andLike("apps", value);
            return this;
        }

        /**
         * and apps not like value
         *
         * @return
         */
        public Criteria andAppsNotLike(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andNotLike("apps", value);
            return this;
        }

        /**
         * or apps = ''
         *
         * @return
         */
        public Criteria orAppsIsEmpty() {
            this.orEqualTo("apps", "");
            return this;
        }

        /**
         * or apps != ''
         *
         * @return
         */
        public Criteria orAppsIsNotEmpty() {
            this.orNotEqualTo("apps", "");
            return this;
        }

        /**
         * or apps = value
         *
         * @return
         */
        public Criteria orAppsEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orEqualTo("apps", value);
            return this;
        }

        /**
         * or apps != value
         *
         * @return
         */
        public Criteria orAppsNotEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orNotEqualTo("apps", value);
            return this;
        }

        /**
         * or apps > value
         *
         * @return
         */
        public Criteria orAppsGreaterThan(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orGreaterThan("apps", value);
            return this;
        }

        /**
         * or apps >= value
         *
         * @return
         */
        public Criteria orAppsGreaterThanOrEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orGreaterThanOrEqualTo("apps", value);
            return this;
        }

        /**
         * or apps < value
         *
         * @return
         */
        public Criteria orAppsLessThan(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orLessThan("apps", value);
            return this;
        }

        /**
         * or apps <= value
         *
         * @return
         */
        public Criteria orAppsLessThanOrEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orLessThanOrEqualTo("apps", value);
            return this;
        }

        /**
         * or apps in (value1, value2, ...)
         *
         * @return
         */
        public Criteria orAppsIn(Iterable<String> values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            this.orIn("apps", values);
            return this;
        }

        /**
         * or apps in (value1, value2, ...)
         *
         * @return
         */
        public Criteria orAppsIn(String[] values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            this.orIn("apps", CollectionUtils.initList(values));
            return this;
        }

        /**
         * or apps not in (value1, value2, ...)
         *
         * @return
         */
        public Criteria orAppsNotIn(Iterable<String> values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            this.orNotIn("apps", values);
            return this;
        }

        /**
         * or apps not in (value1, value2, ...)
         *
         * @return
         */
        public Criteria orAppsNotIn(String[] values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            this.orNotIn("apps", CollectionUtils.initList(values));
            return this;
        }

        /**
         * or apps between value1 and value2
         *
         * @return
         */
        public Criteria orAppsBetween(String value1, String value2) {
            if (CheckUtils.isAnyEmpty(value1, value2)) {
                return this;
            }
            this.orBetween("apps", value1, value2);
            return this;
        }

        /**
         * or apps not between value1 and value2
         *
         * @return
         */
        public Criteria orAppsNotBetween(String value1, String value2) {
            if (CheckUtils.isAnyEmpty(value1, value2)) {
                return this;
            }
            this.orNotBetween("apps", value1, value2);
            return this;
        }

        /**
         * or apps like value
         *
         * @return
         */
        public Criteria orAppsLike(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orLike("apps", value);
            return this;
        }

        /**
         * or apps not like value
         *
         * @return
         */
        public Criteria orAppsNotLike(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orNotLike("apps", value);
            return this;
        }

        /**
         * and code = ''
         *
         * @return
         */
        public Criteria andCodeIsEmpty() {
            this.andEqualTo("code", "");
            return this;
        }

        /**
         * and code != ''
         *
         * @return
         */
        public Criteria andCodeIsNotEmpty() {
            this.andNotEqualTo("code", "");
            return this;
        }

        /**
         * and code = value
         *
         * @return
         */
        public Criteria andCodeEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.andEqualTo("code", value);
            return this;
        }

        /**
         * and code != value
         *
         * @return
         */
        public Criteria andCodeNotEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.andNotEqualTo("code", value);
            return this;
        }

        /**
         * and code > value
         *
         * @return
         */
        public Criteria andCodeGreaterThan(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andGreaterThan("code", value);
            return this;
        }

        /**
         * and code >= value
         *
         * @return
         */
        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andGreaterThanOrEqualTo("code", value);
            return this;
        }

        /**
         * and code < value
         *
         * @return
         */
        public Criteria andCodeLessThan(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andLessThan("code", value);
            return this;
        }

        /**
         * and code <= value
         *
         * @return
         */
        public Criteria andCodeLessThanOrEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andLessThanOrEqualTo("code", value);
            return this;
        }

        /**
         * and code in (value1, value2, ...)
         *
         * @return
         */
        public Criteria andCodeIn(Iterable<String> values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            super.andIn("code", values);
            return this;
        }

        /**
         * and code in (value1, value2, ...)
         *
         * @return
         */
        public Criteria andCodeIn(String... values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            super.andIn("code", CollectionUtils.initList(values));
            return this;
        }

        /**
         * and code not in (value1, value2, ...)
         *
         * @return
         */
        public Criteria andCodeNotIn(Iterable<String> values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            super.andNotIn("code", values);
            return this;
        }

        /**
         * and code not in (value1, value2, ...)
         *
         * @return
         */
        public Criteria andCodeNotIn(String[] values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            super.andNotIn("code", CollectionUtils.initList(values));
            return this;
        }

        /**
         * and code between value1 and value2
         *
         * @return
         */
        public Criteria andCodeBetween(String value1, String value2) {
            if (CheckUtils.isAnyEmpty(value1, value2)) {
                return this;
            }
            super.andBetween("code", value1, value2);
            return this;
        }

        /**
         * and code not between value1 and value2
         *
         * @return
         */
        public Criteria andCodeNotBetween(String value1, String value2) {
            if (CheckUtils.isAnyEmpty(value1, value2)) {
                return this;
            }
            super.andNotBetween("code", value1, value2);
            return this;
        }

        /**
         * and code like value
         *
         * @return
         */
        public Criteria andCodeLike(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andLike("code", value);
            return this;
        }

        /**
         * and code not like value
         *
         * @return
         */
        public Criteria andCodeNotLike(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andNotLike("code", value);
            return this;
        }

        /**
         * or code = ''
         *
         * @return
         */
        public Criteria orCodeIsEmpty() {
            this.orEqualTo("code", "");
            return this;
        }

        /**
         * or code != ''
         *
         * @return
         */
        public Criteria orCodeIsNotEmpty() {
            this.orNotEqualTo("code", "");
            return this;
        }

        /**
         * or code = value
         *
         * @return
         */
        public Criteria orCodeEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orEqualTo("code", value);
            return this;
        }

        /**
         * or code != value
         *
         * @return
         */
        public Criteria orCodeNotEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orNotEqualTo("code", value);
            return this;
        }

        /**
         * or code > value
         *
         * @return
         */
        public Criteria orCodeGreaterThan(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orGreaterThan("code", value);
            return this;
        }

        /**
         * or code >= value
         *
         * @return
         */
        public Criteria orCodeGreaterThanOrEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orGreaterThanOrEqualTo("code", value);
            return this;
        }

        /**
         * or code < value
         *
         * @return
         */
        public Criteria orCodeLessThan(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orLessThan("code", value);
            return this;
        }

        /**
         * or code <= value
         *
         * @return
         */
        public Criteria orCodeLessThanOrEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orLessThanOrEqualTo("code", value);
            return this;
        }

        /**
         * or code in (value1, value2, ...)
         *
         * @return
         */
        public Criteria orCodeIn(Iterable<String> values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            this.orIn("code", values);
            return this;
        }

        /**
         * or code in (value1, value2, ...)
         *
         * @return
         */
        public Criteria orCodeIn(String[] values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            this.orIn("code", CollectionUtils.initList(values));
            return this;
        }

        /**
         * or code not in (value1, value2, ...)
         *
         * @return
         */
        public Criteria orCodeNotIn(Iterable<String> values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            this.orNotIn("code", values);
            return this;
        }

        /**
         * or code not in (value1, value2, ...)
         *
         * @return
         */
        public Criteria orCodeNotIn(String[] values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            this.orNotIn("code", CollectionUtils.initList(values));
            return this;
        }

        /**
         * or code between value1 and value2
         *
         * @return
         */
        public Criteria orCodeBetween(String value1, String value2) {
            if (CheckUtils.isAnyEmpty(value1, value2)) {
                return this;
            }
            this.orBetween("code", value1, value2);
            return this;
        }

        /**
         * or code not between value1 and value2
         *
         * @return
         */
        public Criteria orCodeNotBetween(String value1, String value2) {
            if (CheckUtils.isAnyEmpty(value1, value2)) {
                return this;
            }
            this.orNotBetween("code", value1, value2);
            return this;
        }

        /**
         * or code like value
         *
         * @return
         */
        public Criteria orCodeLike(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orLike("code", value);
            return this;
        }

        /**
         * or code not like value
         *
         * @return
         */
        public Criteria orCodeNotLike(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orNotLike("code", value);
            return this;
        }

        /**
         * and type = value
         *
         * @return
         */
        public Criteria andTypeEqualTo(Integer value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.andEqualTo("type", value);
            return this;
        }

        /**
         * and type != value
         *
         * @return
         */
        public Criteria andTypeNotEqualTo(Integer value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.andNotEqualTo("type", value);
            return this;
        }

        /**
         * and type > value
         *
         * @return
         */
        public Criteria andTypeGreaterThan(Integer value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andGreaterThan("type", value);
            return this;
        }

        /**
         * and type >= value
         *
         * @return
         */
        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andGreaterThanOrEqualTo("type", value);
            return this;
        }

        /**
         * and type < value
         *
         * @return
         */
        public Criteria andTypeLessThan(Integer value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andLessThan("type", value);
            return this;
        }

        /**
         * and type <= value
         *
         * @return
         */
        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andLessThanOrEqualTo("type", value);
            return this;
        }

        /**
         * and type in (value1, value2, ...)
         *
         * @return
         */
        public Criteria andTypeIn(Iterable<Integer> values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            super.andIn("type", values);
            return this;
        }

        /**
         * and type in (value1, value2, ...)
         *
         * @return
         */
        public Criteria andTypeIn(Integer... values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            super.andIn("type", CollectionUtils.initList(values));
            return this;
        }

        /**
         * and type not in (value1, value2, ...)
         *
         * @return
         */
        public Criteria andTypeNotIn(Iterable<Integer> values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            super.andNotIn("type", values);
            return this;
        }

        /**
         * and type not in (value1, value2, ...)
         *
         * @return
         */
        public Criteria andTypeNotIn(Integer[] values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            super.andNotIn("type", CollectionUtils.initList(values));
            return this;
        }

        /**
         * and type between value1 and value2
         *
         * @return
         */
        public Criteria andTypeBetween(Integer value1, Integer value2) {
            if (CheckUtils.isAnyEmpty(value1, value2)) {
                return this;
            }
            super.andBetween("type", value1, value2);
            return this;
        }

        /**
         * and type not between value1 and value2
         *
         * @return
         */
        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            if (CheckUtils.isAnyEmpty(value1, value2)) {
                return this;
            }
            super.andNotBetween("type", value1, value2);
            return this;
        }

        /**
         * and type like value
         *
         * @return
         */
        public Criteria andTypeLike(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andLike("type", value);
            return this;
        }

        /**
         * and type not like value
         *
         * @return
         */
        public Criteria andTypeNotLike(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andNotLike("type", value);
            return this;
        }

        /**
         * or type = value
         *
         * @return
         */
        public Criteria orTypeEqualTo(Integer value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orEqualTo("type", value);
            return this;
        }

        /**
         * or type != value
         *
         * @return
         */
        public Criteria orTypeNotEqualTo(Integer value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orNotEqualTo("type", value);
            return this;
        }

        /**
         * or type > value
         *
         * @return
         */
        public Criteria orTypeGreaterThan(Integer value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orGreaterThan("type", value);
            return this;
        }

        /**
         * or type >= value
         *
         * @return
         */
        public Criteria orTypeGreaterThanOrEqualTo(Integer value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orGreaterThanOrEqualTo("type", value);
            return this;
        }

        /**
         * or type < value
         *
         * @return
         */
        public Criteria orTypeLessThan(Integer value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orLessThan("type", value);
            return this;
        }

        /**
         * or type <= value
         *
         * @return
         */
        public Criteria orTypeLessThanOrEqualTo(Integer value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orLessThanOrEqualTo("type", value);
            return this;
        }

        /**
         * or type in (value1, value2, ...)
         *
         * @return
         */
        public Criteria orTypeIn(Iterable<Integer> values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            this.orIn("type", values);
            return this;
        }

        /**
         * or type in (value1, value2, ...)
         *
         * @return
         */
        public Criteria orTypeIn(Integer[] values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            this.orIn("type", CollectionUtils.initList(values));
            return this;
        }

        /**
         * or type not in (value1, value2, ...)
         *
         * @return
         */
        public Criteria orTypeNotIn(Iterable<Integer> values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            this.orNotIn("type", values);
            return this;
        }

        /**
         * or type not in (value1, value2, ...)
         *
         * @return
         */
        public Criteria orTypeNotIn(Integer[] values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            this.orNotIn("type", CollectionUtils.initList(values));
            return this;
        }

        /**
         * or type between value1 and value2
         *
         * @return
         */
        public Criteria orTypeBetween(Integer value1, Integer value2) {
            if (CheckUtils.isAnyEmpty(value1, value2)) {
                return this;
            }
            this.orBetween("type", value1, value2);
            return this;
        }

        /**
         * or type not between value1 and value2
         *
         * @return
         */
        public Criteria orTypeNotBetween(Integer value1, Integer value2) {
            if (CheckUtils.isAnyEmpty(value1, value2)) {
                return this;
            }
            this.orNotBetween("type", value1, value2);
            return this;
        }

        /**
         * or type like value
         *
         * @return
         */
        public Criteria orTypeLike(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orLike("type", value);
            return this;
        }

        /**
         * or type not like value
         *
         * @return
         */
        public Criteria orTypeNotLike(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orNotLike("type", value);
            return this;
        }

        /**
         * and value = ''
         *
         * @return
         */
        public Criteria andValueIsEmpty() {
            this.andEqualTo("value", "");
            return this;
        }

        /**
         * and value != ''
         *
         * @return
         */
        public Criteria andValueIsNotEmpty() {
            this.andNotEqualTo("value", "");
            return this;
        }

        /**
         * and value = value
         *
         * @return
         */
        public Criteria andValueEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.andEqualTo("value", value);
            return this;
        }

        /**
         * and value != value
         *
         * @return
         */
        public Criteria andValueNotEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.andNotEqualTo("value", value);
            return this;
        }

        /**
         * and value > value
         *
         * @return
         */
        public Criteria andValueGreaterThan(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andGreaterThan("value", value);
            return this;
        }

        /**
         * and value >= value
         *
         * @return
         */
        public Criteria andValueGreaterThanOrEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andGreaterThanOrEqualTo("value", value);
            return this;
        }

        /**
         * and value < value
         *
         * @return
         */
        public Criteria andValueLessThan(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andLessThan("value", value);
            return this;
        }

        /**
         * and value <= value
         *
         * @return
         */
        public Criteria andValueLessThanOrEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andLessThanOrEqualTo("value", value);
            return this;
        }

        /**
         * and value in (value1, value2, ...)
         *
         * @return
         */
        public Criteria andValueIn(Iterable<String> values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            super.andIn("value", values);
            return this;
        }

        /**
         * and value in (value1, value2, ...)
         *
         * @return
         */
        public Criteria andValueIn(String... values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            super.andIn("value", CollectionUtils.initList(values));
            return this;
        }

        /**
         * and value not in (value1, value2, ...)
         *
         * @return
         */
        public Criteria andValueNotIn(Iterable<String> values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            super.andNotIn("value", values);
            return this;
        }

        /**
         * and value not in (value1, value2, ...)
         *
         * @return
         */
        public Criteria andValueNotIn(String[] values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            super.andNotIn("value", CollectionUtils.initList(values));
            return this;
        }

        /**
         * and value between value1 and value2
         *
         * @return
         */
        public Criteria andValueBetween(String value1, String value2) {
            if (CheckUtils.isAnyEmpty(value1, value2)) {
                return this;
            }
            super.andBetween("value", value1, value2);
            return this;
        }

        /**
         * and value not between value1 and value2
         *
         * @return
         */
        public Criteria andValueNotBetween(String value1, String value2) {
            if (CheckUtils.isAnyEmpty(value1, value2)) {
                return this;
            }
            super.andNotBetween("value", value1, value2);
            return this;
        }

        /**
         * and value like value
         *
         * @return
         */
        public Criteria andValueLike(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andLike("value", value);
            return this;
        }

        /**
         * and value not like value
         *
         * @return
         */
        public Criteria andValueNotLike(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andNotLike("value", value);
            return this;
        }

        /**
         * or value = ''
         *
         * @return
         */
        public Criteria orValueIsEmpty() {
            this.orEqualTo("value", "");
            return this;
        }

        /**
         * or value != ''
         *
         * @return
         */
        public Criteria orValueIsNotEmpty() {
            this.orNotEqualTo("value", "");
            return this;
        }

        /**
         * or value = value
         *
         * @return
         */
        public Criteria orValueEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orEqualTo("value", value);
            return this;
        }

        /**
         * or value != value
         *
         * @return
         */
        public Criteria orValueNotEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orNotEqualTo("value", value);
            return this;
        }

        /**
         * or value > value
         *
         * @return
         */
        public Criteria orValueGreaterThan(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orGreaterThan("value", value);
            return this;
        }

        /**
         * or value >= value
         *
         * @return
         */
        public Criteria orValueGreaterThanOrEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orGreaterThanOrEqualTo("value", value);
            return this;
        }

        /**
         * or value < value
         *
         * @return
         */
        public Criteria orValueLessThan(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orLessThan("value", value);
            return this;
        }

        /**
         * or value <= value
         *
         * @return
         */
        public Criteria orValueLessThanOrEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orLessThanOrEqualTo("value", value);
            return this;
        }

        /**
         * or value in (value1, value2, ...)
         *
         * @return
         */
        public Criteria orValueIn(Iterable<String> values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            this.orIn("value", values);
            return this;
        }

        /**
         * or value in (value1, value2, ...)
         *
         * @return
         */
        public Criteria orValueIn(String[] values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            this.orIn("value", CollectionUtils.initList(values));
            return this;
        }

        /**
         * or value not in (value1, value2, ...)
         *
         * @return
         */
        public Criteria orValueNotIn(Iterable<String> values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            this.orNotIn("value", values);
            return this;
        }

        /**
         * or value not in (value1, value2, ...)
         *
         * @return
         */
        public Criteria orValueNotIn(String[] values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            this.orNotIn("value", CollectionUtils.initList(values));
            return this;
        }

        /**
         * or value between value1 and value2
         *
         * @return
         */
        public Criteria orValueBetween(String value1, String value2) {
            if (CheckUtils.isAnyEmpty(value1, value2)) {
                return this;
            }
            this.orBetween("value", value1, value2);
            return this;
        }

        /**
         * or value not between value1 and value2
         *
         * @return
         */
        public Criteria orValueNotBetween(String value1, String value2) {
            if (CheckUtils.isAnyEmpty(value1, value2)) {
                return this;
            }
            this.orNotBetween("value", value1, value2);
            return this;
        }

        /**
         * or value like value
         *
         * @return
         */
        public Criteria orValueLike(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orLike("value", value);
            return this;
        }

        /**
         * or value not like value
         *
         * @return
         */
        public Criteria orValueNotLike(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orNotLike("value", value);
            return this;
        }

        /**
         * and json_value = ''
         *
         * @return
         */
        public Criteria andJsonValueIsEmpty() {
            this.andEqualTo("jsonValue", "");
            return this;
        }

        /**
         * and json_value != ''
         *
         * @return
         */
        public Criteria andJsonValueIsNotEmpty() {
            this.andNotEqualTo("jsonValue", "");
            return this;
        }

        /**
         * and json_value = value
         *
         * @return
         */
        public Criteria andJsonValueEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.andEqualTo("jsonValue", value);
            return this;
        }

        /**
         * and json_value != value
         *
         * @return
         */
        public Criteria andJsonValueNotEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.andNotEqualTo("jsonValue", value);
            return this;
        }

        /**
         * and json_value > value
         *
         * @return
         */
        public Criteria andJsonValueGreaterThan(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andGreaterThan("jsonValue", value);
            return this;
        }

        /**
         * and json_value >= value
         *
         * @return
         */
        public Criteria andJsonValueGreaterThanOrEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andGreaterThanOrEqualTo("jsonValue", value);
            return this;
        }

        /**
         * and json_value < value
         *
         * @return
         */
        public Criteria andJsonValueLessThan(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andLessThan("jsonValue", value);
            return this;
        }

        /**
         * and json_value <= value
         *
         * @return
         */
        public Criteria andJsonValueLessThanOrEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andLessThanOrEqualTo("jsonValue", value);
            return this;
        }

        /**
         * and json_value in (value1, value2, ...)
         *
         * @return
         */
        public Criteria andJsonValueIn(Iterable<String> values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            super.andIn("jsonValue", values);
            return this;
        }

        /**
         * and json_value in (value1, value2, ...)
         *
         * @return
         */
        public Criteria andJsonValueIn(String... values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            super.andIn("jsonValue", CollectionUtils.initList(values));
            return this;
        }

        /**
         * and json_value not in (value1, value2, ...)
         *
         * @return
         */
        public Criteria andJsonValueNotIn(Iterable<String> values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            super.andNotIn("jsonValue", values);
            return this;
        }

        /**
         * and json_value not in (value1, value2, ...)
         *
         * @return
         */
        public Criteria andJsonValueNotIn(String[] values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            super.andNotIn("jsonValue", CollectionUtils.initList(values));
            return this;
        }

        /**
         * and json_value between value1 and value2
         *
         * @return
         */
        public Criteria andJsonValueBetween(String value1, String value2) {
            if (CheckUtils.isAnyEmpty(value1, value2)) {
                return this;
            }
            super.andBetween("jsonValue", value1, value2);
            return this;
        }

        /**
         * and json_value not between value1 and value2
         *
         * @return
         */
        public Criteria andJsonValueNotBetween(String value1, String value2) {
            if (CheckUtils.isAnyEmpty(value1, value2)) {
                return this;
            }
            super.andNotBetween("jsonValue", value1, value2);
            return this;
        }

        /**
         * and json_value like value
         *
         * @return
         */
        public Criteria andJsonValueLike(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andLike("jsonValue", value);
            return this;
        }

        /**
         * and json_value not like value
         *
         * @return
         */
        public Criteria andJsonValueNotLike(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andNotLike("jsonValue", value);
            return this;
        }

        /**
         * or json_value = ''
         *
         * @return
         */
        public Criteria orJsonValueIsEmpty() {
            this.orEqualTo("jsonValue", "");
            return this;
        }

        /**
         * or json_value != ''
         *
         * @return
         */
        public Criteria orJsonValueIsNotEmpty() {
            this.orNotEqualTo("jsonValue", "");
            return this;
        }

        /**
         * or json_value = value
         *
         * @return
         */
        public Criteria orJsonValueEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orEqualTo("jsonValue", value);
            return this;
        }

        /**
         * or json_value != value
         *
         * @return
         */
        public Criteria orJsonValueNotEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orNotEqualTo("jsonValue", value);
            return this;
        }

        /**
         * or json_value > value
         *
         * @return
         */
        public Criteria orJsonValueGreaterThan(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orGreaterThan("jsonValue", value);
            return this;
        }

        /**
         * or json_value >= value
         *
         * @return
         */
        public Criteria orJsonValueGreaterThanOrEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orGreaterThanOrEqualTo("jsonValue", value);
            return this;
        }

        /**
         * or json_value < value
         *
         * @return
         */
        public Criteria orJsonValueLessThan(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orLessThan("jsonValue", value);
            return this;
        }

        /**
         * or json_value <= value
         *
         * @return
         */
        public Criteria orJsonValueLessThanOrEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orLessThanOrEqualTo("jsonValue", value);
            return this;
        }

        /**
         * or json_value in (value1, value2, ...)
         *
         * @return
         */
        public Criteria orJsonValueIn(Iterable<String> values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            this.orIn("jsonValue", values);
            return this;
        }

        /**
         * or json_value in (value1, value2, ...)
         *
         * @return
         */
        public Criteria orJsonValueIn(String[] values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            this.orIn("jsonValue", CollectionUtils.initList(values));
            return this;
        }

        /**
         * or json_value not in (value1, value2, ...)
         *
         * @return
         */
        public Criteria orJsonValueNotIn(Iterable<String> values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            this.orNotIn("jsonValue", values);
            return this;
        }

        /**
         * or json_value not in (value1, value2, ...)
         *
         * @return
         */
        public Criteria orJsonValueNotIn(String[] values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            this.orNotIn("jsonValue", CollectionUtils.initList(values));
            return this;
        }

        /**
         * or json_value between value1 and value2
         *
         * @return
         */
        public Criteria orJsonValueBetween(String value1, String value2) {
            if (CheckUtils.isAnyEmpty(value1, value2)) {
                return this;
            }
            this.orBetween("jsonValue", value1, value2);
            return this;
        }

        /**
         * or json_value not between value1 and value2
         *
         * @return
         */
        public Criteria orJsonValueNotBetween(String value1, String value2) {
            if (CheckUtils.isAnyEmpty(value1, value2)) {
                return this;
            }
            this.orNotBetween("jsonValue", value1, value2);
            return this;
        }

        /**
         * or json_value like value
         *
         * @return
         */
        public Criteria orJsonValueLike(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orLike("jsonValue", value);
            return this;
        }

        /**
         * or json_value not like value
         *
         * @return
         */
        public Criteria orJsonValueNotLike(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orNotLike("jsonValue", value);
            return this;
        }

        /**
         * and remark = ''
         *
         * @return
         */
        public Criteria andRemarkIsEmpty() {
            this.andEqualTo("remark", "");
            return this;
        }

        /**
         * and remark != ''
         *
         * @return
         */
        public Criteria andRemarkIsNotEmpty() {
            this.andNotEqualTo("remark", "");
            return this;
        }

        /**
         * and remark = value
         *
         * @return
         */
        public Criteria andRemarkEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.andEqualTo("remark", value);
            return this;
        }

        /**
         * and remark != value
         *
         * @return
         */
        public Criteria andRemarkNotEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.andNotEqualTo("remark", value);
            return this;
        }

        /**
         * and remark > value
         *
         * @return
         */
        public Criteria andRemarkGreaterThan(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andGreaterThan("remark", value);
            return this;
        }

        /**
         * and remark >= value
         *
         * @return
         */
        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andGreaterThanOrEqualTo("remark", value);
            return this;
        }

        /**
         * and remark < value
         *
         * @return
         */
        public Criteria andRemarkLessThan(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andLessThan("remark", value);
            return this;
        }

        /**
         * and remark <= value
         *
         * @return
         */
        public Criteria andRemarkLessThanOrEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andLessThanOrEqualTo("remark", value);
            return this;
        }

        /**
         * and remark in (value1, value2, ...)
         *
         * @return
         */
        public Criteria andRemarkIn(Iterable<String> values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            super.andIn("remark", values);
            return this;
        }

        /**
         * and remark in (value1, value2, ...)
         *
         * @return
         */
        public Criteria andRemarkIn(String... values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            super.andIn("remark", CollectionUtils.initList(values));
            return this;
        }

        /**
         * and remark not in (value1, value2, ...)
         *
         * @return
         */
        public Criteria andRemarkNotIn(Iterable<String> values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            super.andNotIn("remark", values);
            return this;
        }

        /**
         * and remark not in (value1, value2, ...)
         *
         * @return
         */
        public Criteria andRemarkNotIn(String[] values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            super.andNotIn("remark", CollectionUtils.initList(values));
            return this;
        }

        /**
         * and remark between value1 and value2
         *
         * @return
         */
        public Criteria andRemarkBetween(String value1, String value2) {
            if (CheckUtils.isAnyEmpty(value1, value2)) {
                return this;
            }
            super.andBetween("remark", value1, value2);
            return this;
        }

        /**
         * and remark not between value1 and value2
         *
         * @return
         */
        public Criteria andRemarkNotBetween(String value1, String value2) {
            if (CheckUtils.isAnyEmpty(value1, value2)) {
                return this;
            }
            super.andNotBetween("remark", value1, value2);
            return this;
        }

        /**
         * and remark like value
         *
         * @return
         */
        public Criteria andRemarkLike(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andLike("remark", value);
            return this;
        }

        /**
         * and remark not like value
         *
         * @return
         */
        public Criteria andRemarkNotLike(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andNotLike("remark", value);
            return this;
        }

        /**
         * or remark = ''
         *
         * @return
         */
        public Criteria orRemarkIsEmpty() {
            this.orEqualTo("remark", "");
            return this;
        }

        /**
         * or remark != ''
         *
         * @return
         */
        public Criteria orRemarkIsNotEmpty() {
            this.orNotEqualTo("remark", "");
            return this;
        }

        /**
         * or remark = value
         *
         * @return
         */
        public Criteria orRemarkEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orEqualTo("remark", value);
            return this;
        }

        /**
         * or remark != value
         *
         * @return
         */
        public Criteria orRemarkNotEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orNotEqualTo("remark", value);
            return this;
        }

        /**
         * or remark > value
         *
         * @return
         */
        public Criteria orRemarkGreaterThan(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orGreaterThan("remark", value);
            return this;
        }

        /**
         * or remark >= value
         *
         * @return
         */
        public Criteria orRemarkGreaterThanOrEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orGreaterThanOrEqualTo("remark", value);
            return this;
        }

        /**
         * or remark < value
         *
         * @return
         */
        public Criteria orRemarkLessThan(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orLessThan("remark", value);
            return this;
        }

        /**
         * or remark <= value
         *
         * @return
         */
        public Criteria orRemarkLessThanOrEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orLessThanOrEqualTo("remark", value);
            return this;
        }

        /**
         * or remark in (value1, value2, ...)
         *
         * @return
         */
        public Criteria orRemarkIn(Iterable<String> values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            this.orIn("remark", values);
            return this;
        }

        /**
         * or remark in (value1, value2, ...)
         *
         * @return
         */
        public Criteria orRemarkIn(String[] values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            this.orIn("remark", CollectionUtils.initList(values));
            return this;
        }

        /**
         * or remark not in (value1, value2, ...)
         *
         * @return
         */
        public Criteria orRemarkNotIn(Iterable<String> values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            this.orNotIn("remark", values);
            return this;
        }

        /**
         * or remark not in (value1, value2, ...)
         *
         * @return
         */
        public Criteria orRemarkNotIn(String[] values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            this.orNotIn("remark", CollectionUtils.initList(values));
            return this;
        }

        /**
         * or remark between value1 and value2
         *
         * @return
         */
        public Criteria orRemarkBetween(String value1, String value2) {
            if (CheckUtils.isAnyEmpty(value1, value2)) {
                return this;
            }
            this.orBetween("remark", value1, value2);
            return this;
        }

        /**
         * or remark not between value1 and value2
         *
         * @return
         */
        public Criteria orRemarkNotBetween(String value1, String value2) {
            if (CheckUtils.isAnyEmpty(value1, value2)) {
                return this;
            }
            this.orNotBetween("remark", value1, value2);
            return this;
        }

        /**
         * or remark like value
         *
         * @return
         */
        public Criteria orRemarkLike(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orLike("remark", value);
            return this;
        }

        /**
         * or remark not like value
         *
         * @return
         */
        public Criteria orRemarkNotLike(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orNotLike("remark", value);
            return this;
        }

        /**
         * and creator = ''
         *
         * @return
         */
        public Criteria andCreatorIsEmpty() {
            this.andEqualTo("creator", "");
            return this;
        }

        /**
         * and creator != ''
         *
         * @return
         */
        public Criteria andCreatorIsNotEmpty() {
            this.andNotEqualTo("creator", "");
            return this;
        }

        /**
         * and creator = value
         *
         * @return
         */
        public Criteria andCreatorEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.andEqualTo("creator", value);
            return this;
        }

        /**
         * and creator != value
         *
         * @return
         */
        public Criteria andCreatorNotEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.andNotEqualTo("creator", value);
            return this;
        }

        /**
         * and creator > value
         *
         * @return
         */
        public Criteria andCreatorGreaterThan(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andGreaterThan("creator", value);
            return this;
        }

        /**
         * and creator >= value
         *
         * @return
         */
        public Criteria andCreatorGreaterThanOrEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andGreaterThanOrEqualTo("creator", value);
            return this;
        }

        /**
         * and creator < value
         *
         * @return
         */
        public Criteria andCreatorLessThan(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andLessThan("creator", value);
            return this;
        }

        /**
         * and creator <= value
         *
         * @return
         */
        public Criteria andCreatorLessThanOrEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andLessThanOrEqualTo("creator", value);
            return this;
        }

        /**
         * and creator in (value1, value2, ...)
         *
         * @return
         */
        public Criteria andCreatorIn(Iterable<String> values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            super.andIn("creator", values);
            return this;
        }

        /**
         * and creator in (value1, value2, ...)
         *
         * @return
         */
        public Criteria andCreatorIn(String... values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            super.andIn("creator", CollectionUtils.initList(values));
            return this;
        }

        /**
         * and creator not in (value1, value2, ...)
         *
         * @return
         */
        public Criteria andCreatorNotIn(Iterable<String> values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            super.andNotIn("creator", values);
            return this;
        }

        /**
         * and creator not in (value1, value2, ...)
         *
         * @return
         */
        public Criteria andCreatorNotIn(String[] values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            super.andNotIn("creator", CollectionUtils.initList(values));
            return this;
        }

        /**
         * and creator between value1 and value2
         *
         * @return
         */
        public Criteria andCreatorBetween(String value1, String value2) {
            if (CheckUtils.isAnyEmpty(value1, value2)) {
                return this;
            }
            super.andBetween("creator", value1, value2);
            return this;
        }

        /**
         * and creator not between value1 and value2
         *
         * @return
         */
        public Criteria andCreatorNotBetween(String value1, String value2) {
            if (CheckUtils.isAnyEmpty(value1, value2)) {
                return this;
            }
            super.andNotBetween("creator", value1, value2);
            return this;
        }

        /**
         * and creator like value
         *
         * @return
         */
        public Criteria andCreatorLike(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andLike("creator", value);
            return this;
        }

        /**
         * and creator not like value
         *
         * @return
         */
        public Criteria andCreatorNotLike(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andNotLike("creator", value);
            return this;
        }

        /**
         * or creator = ''
         *
         * @return
         */
        public Criteria orCreatorIsEmpty() {
            this.orEqualTo("creator", "");
            return this;
        }

        /**
         * or creator != ''
         *
         * @return
         */
        public Criteria orCreatorIsNotEmpty() {
            this.orNotEqualTo("creator", "");
            return this;
        }

        /**
         * or creator = value
         *
         * @return
         */
        public Criteria orCreatorEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orEqualTo("creator", value);
            return this;
        }

        /**
         * or creator != value
         *
         * @return
         */
        public Criteria orCreatorNotEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orNotEqualTo("creator", value);
            return this;
        }

        /**
         * or creator > value
         *
         * @return
         */
        public Criteria orCreatorGreaterThan(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orGreaterThan("creator", value);
            return this;
        }

        /**
         * or creator >= value
         *
         * @return
         */
        public Criteria orCreatorGreaterThanOrEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orGreaterThanOrEqualTo("creator", value);
            return this;
        }

        /**
         * or creator < value
         *
         * @return
         */
        public Criteria orCreatorLessThan(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orLessThan("creator", value);
            return this;
        }

        /**
         * or creator <= value
         *
         * @return
         */
        public Criteria orCreatorLessThanOrEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orLessThanOrEqualTo("creator", value);
            return this;
        }

        /**
         * or creator in (value1, value2, ...)
         *
         * @return
         */
        public Criteria orCreatorIn(Iterable<String> values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            this.orIn("creator", values);
            return this;
        }

        /**
         * or creator in (value1, value2, ...)
         *
         * @return
         */
        public Criteria orCreatorIn(String[] values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            this.orIn("creator", CollectionUtils.initList(values));
            return this;
        }

        /**
         * or creator not in (value1, value2, ...)
         *
         * @return
         */
        public Criteria orCreatorNotIn(Iterable<String> values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            this.orNotIn("creator", values);
            return this;
        }

        /**
         * or creator not in (value1, value2, ...)
         *
         * @return
         */
        public Criteria orCreatorNotIn(String[] values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            this.orNotIn("creator", CollectionUtils.initList(values));
            return this;
        }

        /**
         * or creator between value1 and value2
         *
         * @return
         */
        public Criteria orCreatorBetween(String value1, String value2) {
            if (CheckUtils.isAnyEmpty(value1, value2)) {
                return this;
            }
            this.orBetween("creator", value1, value2);
            return this;
        }

        /**
         * or creator not between value1 and value2
         *
         * @return
         */
        public Criteria orCreatorNotBetween(String value1, String value2) {
            if (CheckUtils.isAnyEmpty(value1, value2)) {
                return this;
            }
            this.orNotBetween("creator", value1, value2);
            return this;
        }

        /**
         * or creator like value
         *
         * @return
         */
        public Criteria orCreatorLike(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orLike("creator", value);
            return this;
        }

        /**
         * or creator not like value
         *
         * @return
         */
        public Criteria orCreatorNotLike(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orNotLike("creator", value);
            return this;
        }

        /**
         * and modifier = ''
         *
         * @return
         */
        public Criteria andModifierIsEmpty() {
            this.andEqualTo("modifier", "");
            return this;
        }

        /**
         * and modifier != ''
         *
         * @return
         */
        public Criteria andModifierIsNotEmpty() {
            this.andNotEqualTo("modifier", "");
            return this;
        }

        /**
         * and modifier = value
         *
         * @return
         */
        public Criteria andModifierEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.andEqualTo("modifier", value);
            return this;
        }

        /**
         * and modifier != value
         *
         * @return
         */
        public Criteria andModifierNotEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.andNotEqualTo("modifier", value);
            return this;
        }

        /**
         * and modifier > value
         *
         * @return
         */
        public Criteria andModifierGreaterThan(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andGreaterThan("modifier", value);
            return this;
        }

        /**
         * and modifier >= value
         *
         * @return
         */
        public Criteria andModifierGreaterThanOrEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andGreaterThanOrEqualTo("modifier", value);
            return this;
        }

        /**
         * and modifier < value
         *
         * @return
         */
        public Criteria andModifierLessThan(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andLessThan("modifier", value);
            return this;
        }

        /**
         * and modifier <= value
         *
         * @return
         */
        public Criteria andModifierLessThanOrEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andLessThanOrEqualTo("modifier", value);
            return this;
        }

        /**
         * and modifier in (value1, value2, ...)
         *
         * @return
         */
        public Criteria andModifierIn(Iterable<String> values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            super.andIn("modifier", values);
            return this;
        }

        /**
         * and modifier in (value1, value2, ...)
         *
         * @return
         */
        public Criteria andModifierIn(String... values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            super.andIn("modifier", CollectionUtils.initList(values));
            return this;
        }

        /**
         * and modifier not in (value1, value2, ...)
         *
         * @return
         */
        public Criteria andModifierNotIn(Iterable<String> values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            super.andNotIn("modifier", values);
            return this;
        }

        /**
         * and modifier not in (value1, value2, ...)
         *
         * @return
         */
        public Criteria andModifierNotIn(String[] values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            super.andNotIn("modifier", CollectionUtils.initList(values));
            return this;
        }

        /**
         * and modifier between value1 and value2
         *
         * @return
         */
        public Criteria andModifierBetween(String value1, String value2) {
            if (CheckUtils.isAnyEmpty(value1, value2)) {
                return this;
            }
            super.andBetween("modifier", value1, value2);
            return this;
        }

        /**
         * and modifier not between value1 and value2
         *
         * @return
         */
        public Criteria andModifierNotBetween(String value1, String value2) {
            if (CheckUtils.isAnyEmpty(value1, value2)) {
                return this;
            }
            super.andNotBetween("modifier", value1, value2);
            return this;
        }

        /**
         * and modifier like value
         *
         * @return
         */
        public Criteria andModifierLike(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andLike("modifier", value);
            return this;
        }

        /**
         * and modifier not like value
         *
         * @return
         */
        public Criteria andModifierNotLike(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andNotLike("modifier", value);
            return this;
        }

        /**
         * or modifier = ''
         *
         * @return
         */
        public Criteria orModifierIsEmpty() {
            this.orEqualTo("modifier", "");
            return this;
        }

        /**
         * or modifier != ''
         *
         * @return
         */
        public Criteria orModifierIsNotEmpty() {
            this.orNotEqualTo("modifier", "");
            return this;
        }

        /**
         * or modifier = value
         *
         * @return
         */
        public Criteria orModifierEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orEqualTo("modifier", value);
            return this;
        }

        /**
         * or modifier != value
         *
         * @return
         */
        public Criteria orModifierNotEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orNotEqualTo("modifier", value);
            return this;
        }

        /**
         * or modifier > value
         *
         * @return
         */
        public Criteria orModifierGreaterThan(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orGreaterThan("modifier", value);
            return this;
        }

        /**
         * or modifier >= value
         *
         * @return
         */
        public Criteria orModifierGreaterThanOrEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orGreaterThanOrEqualTo("modifier", value);
            return this;
        }

        /**
         * or modifier < value
         *
         * @return
         */
        public Criteria orModifierLessThan(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orLessThan("modifier", value);
            return this;
        }

        /**
         * or modifier <= value
         *
         * @return
         */
        public Criteria orModifierLessThanOrEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orLessThanOrEqualTo("modifier", value);
            return this;
        }

        /**
         * or modifier in (value1, value2, ...)
         *
         * @return
         */
        public Criteria orModifierIn(Iterable<String> values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            this.orIn("modifier", values);
            return this;
        }

        /**
         * or modifier in (value1, value2, ...)
         *
         * @return
         */
        public Criteria orModifierIn(String[] values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            this.orIn("modifier", CollectionUtils.initList(values));
            return this;
        }

        /**
         * or modifier not in (value1, value2, ...)
         *
         * @return
         */
        public Criteria orModifierNotIn(Iterable<String> values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            this.orNotIn("modifier", values);
            return this;
        }

        /**
         * or modifier not in (value1, value2, ...)
         *
         * @return
         */
        public Criteria orModifierNotIn(String[] values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            this.orNotIn("modifier", CollectionUtils.initList(values));
            return this;
        }

        /**
         * or modifier between value1 and value2
         *
         * @return
         */
        public Criteria orModifierBetween(String value1, String value2) {
            if (CheckUtils.isAnyEmpty(value1, value2)) {
                return this;
            }
            this.orBetween("modifier", value1, value2);
            return this;
        }

        /**
         * or modifier not between value1 and value2
         *
         * @return
         */
        public Criteria orModifierNotBetween(String value1, String value2) {
            if (CheckUtils.isAnyEmpty(value1, value2)) {
                return this;
            }
            this.orNotBetween("modifier", value1, value2);
            return this;
        }

        /**
         * or modifier like value
         *
         * @return
         */
        public Criteria orModifierLike(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orLike("modifier", value);
            return this;
        }

        /**
         * or modifier not like value
         *
         * @return
         */
        public Criteria orModifierNotLike(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orNotLike("modifier", value);
            return this;
        }

        /**
         * and create_date = value
         *
         * @return
         */
        public Criteria andCreateDateEqualTo(Date value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.andEqualTo("createDate", value);
            return this;
        }

        /**
         * and create_date != value
         *
         * @return
         */
        public Criteria andCreateDateNotEqualTo(Date value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.andNotEqualTo("createDate", value);
            return this;
        }

        /**
         * and create_date > value
         *
         * @return
         */
        public Criteria andCreateDateGreaterThan(Date value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andGreaterThan("createDate", value);
            return this;
        }

        /**
         * and create_date >= value
         *
         * @return
         */
        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andGreaterThanOrEqualTo("createDate", value);
            return this;
        }

        /**
         * and create_date < value
         *
         * @return
         */
        public Criteria andCreateDateLessThan(Date value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andLessThan("createDate", value);
            return this;
        }

        /**
         * and create_date <= value
         *
         * @return
         */
        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andLessThanOrEqualTo("createDate", value);
            return this;
        }

        /**
         * and create_date in (value1, value2, ...)
         *
         * @return
         */
        public Criteria andCreateDateIn(Iterable<Date> values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            super.andIn("createDate", values);
            return this;
        }

        /**
         * and create_date in (value1, value2, ...)
         *
         * @return
         */
        public Criteria andCreateDateIn(Date... values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            super.andIn("createDate", CollectionUtils.initList(values));
            return this;
        }

        /**
         * and create_date not in (value1, value2, ...)
         *
         * @return
         */
        public Criteria andCreateDateNotIn(Iterable<Date> values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            super.andNotIn("createDate", values);
            return this;
        }

        /**
         * and create_date not in (value1, value2, ...)
         *
         * @return
         */
        public Criteria andCreateDateNotIn(Date[] values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            super.andNotIn("createDate", CollectionUtils.initList(values));
            return this;
        }

        /**
         * and create_date between value1 and value2
         *
         * @return
         */
        public Criteria andCreateDateBetween(Date value1, Date value2) {
            if (CheckUtils.isAnyEmpty(value1, value2)) {
                return this;
            }
            super.andBetween("createDate", value1, value2);
            return this;
        }

        /**
         * and create_date not between value1 and value2
         *
         * @return
         */
        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            if (CheckUtils.isAnyEmpty(value1, value2)) {
                return this;
            }
            super.andNotBetween("createDate", value1, value2);
            return this;
        }

        /**
         * and create_date like value
         *
         * @return
         */
        public Criteria andCreateDateLike(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andLike("createDate", value);
            return this;
        }

        /**
         * and create_date not like value
         *
         * @return
         */
        public Criteria andCreateDateNotLike(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andNotLike("createDate", value);
            return this;
        }

        /**
         * or create_date = value
         *
         * @return
         */
        public Criteria orCreateDateEqualTo(Date value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orEqualTo("createDate", value);
            return this;
        }

        /**
         * or create_date != value
         *
         * @return
         */
        public Criteria orCreateDateNotEqualTo(Date value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orNotEqualTo("createDate", value);
            return this;
        }

        /**
         * or create_date > value
         *
         * @return
         */
        public Criteria orCreateDateGreaterThan(Date value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orGreaterThan("createDate", value);
            return this;
        }

        /**
         * or create_date >= value
         *
         * @return
         */
        public Criteria orCreateDateGreaterThanOrEqualTo(Date value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orGreaterThanOrEqualTo("createDate", value);
            return this;
        }

        /**
         * or create_date < value
         *
         * @return
         */
        public Criteria orCreateDateLessThan(Date value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orLessThan("createDate", value);
            return this;
        }

        /**
         * or create_date <= value
         *
         * @return
         */
        public Criteria orCreateDateLessThanOrEqualTo(Date value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orLessThanOrEqualTo("createDate", value);
            return this;
        }

        /**
         * or create_date in (value1, value2, ...)
         *
         * @return
         */
        public Criteria orCreateDateIn(Iterable<Date> values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            this.orIn("createDate", values);
            return this;
        }

        /**
         * or create_date in (value1, value2, ...)
         *
         * @return
         */
        public Criteria orCreateDateIn(Date[] values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            this.orIn("createDate", CollectionUtils.initList(values));
            return this;
        }

        /**
         * or create_date not in (value1, value2, ...)
         *
         * @return
         */
        public Criteria orCreateDateNotIn(Iterable<Date> values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            this.orNotIn("createDate", values);
            return this;
        }

        /**
         * or create_date not in (value1, value2, ...)
         *
         * @return
         */
        public Criteria orCreateDateNotIn(Date[] values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            this.orNotIn("createDate", CollectionUtils.initList(values));
            return this;
        }

        /**
         * or create_date between value1 and value2
         *
         * @return
         */
        public Criteria orCreateDateBetween(Date value1, Date value2) {
            if (CheckUtils.isAnyEmpty(value1, value2)) {
                return this;
            }
            this.orBetween("createDate", value1, value2);
            return this;
        }

        /**
         * or create_date not between value1 and value2
         *
         * @return
         */
        public Criteria orCreateDateNotBetween(Date value1, Date value2) {
            if (CheckUtils.isAnyEmpty(value1, value2)) {
                return this;
            }
            this.orNotBetween("createDate", value1, value2);
            return this;
        }

        /**
         * or create_date like value
         *
         * @return
         */
        public Criteria orCreateDateLike(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orLike("createDate", value);
            return this;
        }

        /**
         * or create_date not like value
         *
         * @return
         */
        public Criteria orCreateDateNotLike(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orNotLike("createDate", value);
            return this;
        }

        /**
         * and modify_date = value
         *
         * @return
         */
        public Criteria andModifyDateEqualTo(Date value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.andEqualTo("modifyDate", value);
            return this;
        }

        /**
         * and modify_date != value
         *
         * @return
         */
        public Criteria andModifyDateNotEqualTo(Date value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.andNotEqualTo("modifyDate", value);
            return this;
        }

        /**
         * and modify_date > value
         *
         * @return
         */
        public Criteria andModifyDateGreaterThan(Date value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andGreaterThan("modifyDate", value);
            return this;
        }

        /**
         * and modify_date >= value
         *
         * @return
         */
        public Criteria andModifyDateGreaterThanOrEqualTo(Date value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andGreaterThanOrEqualTo("modifyDate", value);
            return this;
        }

        /**
         * and modify_date < value
         *
         * @return
         */
        public Criteria andModifyDateLessThan(Date value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andLessThan("modifyDate", value);
            return this;
        }

        /**
         * and modify_date <= value
         *
         * @return
         */
        public Criteria andModifyDateLessThanOrEqualTo(Date value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andLessThanOrEqualTo("modifyDate", value);
            return this;
        }

        /**
         * and modify_date in (value1, value2, ...)
         *
         * @return
         */
        public Criteria andModifyDateIn(Iterable<Date> values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            super.andIn("modifyDate", values);
            return this;
        }

        /**
         * and modify_date in (value1, value2, ...)
         *
         * @return
         */
        public Criteria andModifyDateIn(Date... values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            super.andIn("modifyDate", CollectionUtils.initList(values));
            return this;
        }

        /**
         * and modify_date not in (value1, value2, ...)
         *
         * @return
         */
        public Criteria andModifyDateNotIn(Iterable<Date> values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            super.andNotIn("modifyDate", values);
            return this;
        }

        /**
         * and modify_date not in (value1, value2, ...)
         *
         * @return
         */
        public Criteria andModifyDateNotIn(Date[] values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            super.andNotIn("modifyDate", CollectionUtils.initList(values));
            return this;
        }

        /**
         * and modify_date between value1 and value2
         *
         * @return
         */
        public Criteria andModifyDateBetween(Date value1, Date value2) {
            if (CheckUtils.isAnyEmpty(value1, value2)) {
                return this;
            }
            super.andBetween("modifyDate", value1, value2);
            return this;
        }

        /**
         * and modify_date not between value1 and value2
         *
         * @return
         */
        public Criteria andModifyDateNotBetween(Date value1, Date value2) {
            if (CheckUtils.isAnyEmpty(value1, value2)) {
                return this;
            }
            super.andNotBetween("modifyDate", value1, value2);
            return this;
        }

        /**
         * and modify_date like value
         *
         * @return
         */
        public Criteria andModifyDateLike(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andLike("modifyDate", value);
            return this;
        }

        /**
         * and modify_date not like value
         *
         * @return
         */
        public Criteria andModifyDateNotLike(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andNotLike("modifyDate", value);
            return this;
        }

        /**
         * or modify_date = value
         *
         * @return
         */
        public Criteria orModifyDateEqualTo(Date value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orEqualTo("modifyDate", value);
            return this;
        }

        /**
         * or modify_date != value
         *
         * @return
         */
        public Criteria orModifyDateNotEqualTo(Date value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orNotEqualTo("modifyDate", value);
            return this;
        }

        /**
         * or modify_date > value
         *
         * @return
         */
        public Criteria orModifyDateGreaterThan(Date value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orGreaterThan("modifyDate", value);
            return this;
        }

        /**
         * or modify_date >= value
         *
         * @return
         */
        public Criteria orModifyDateGreaterThanOrEqualTo(Date value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orGreaterThanOrEqualTo("modifyDate", value);
            return this;
        }

        /**
         * or modify_date < value
         *
         * @return
         */
        public Criteria orModifyDateLessThan(Date value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orLessThan("modifyDate", value);
            return this;
        }

        /**
         * or modify_date <= value
         *
         * @return
         */
        public Criteria orModifyDateLessThanOrEqualTo(Date value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orLessThanOrEqualTo("modifyDate", value);
            return this;
        }

        /**
         * or modify_date in (value1, value2, ...)
         *
         * @return
         */
        public Criteria orModifyDateIn(Iterable<Date> values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            this.orIn("modifyDate", values);
            return this;
        }

        /**
         * or modify_date in (value1, value2, ...)
         *
         * @return
         */
        public Criteria orModifyDateIn(Date[] values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            this.orIn("modifyDate", CollectionUtils.initList(values));
            return this;
        }

        /**
         * or modify_date not in (value1, value2, ...)
         *
         * @return
         */
        public Criteria orModifyDateNotIn(Iterable<Date> values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            this.orNotIn("modifyDate", values);
            return this;
        }

        /**
         * or modify_date not in (value1, value2, ...)
         *
         * @return
         */
        public Criteria orModifyDateNotIn(Date[] values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            this.orNotIn("modifyDate", CollectionUtils.initList(values));
            return this;
        }

        /**
         * or modify_date between value1 and value2
         *
         * @return
         */
        public Criteria orModifyDateBetween(Date value1, Date value2) {
            if (CheckUtils.isAnyEmpty(value1, value2)) {
                return this;
            }
            this.orBetween("modifyDate", value1, value2);
            return this;
        }

        /**
         * or modify_date not between value1 and value2
         *
         * @return
         */
        public Criteria orModifyDateNotBetween(Date value1, Date value2) {
            if (CheckUtils.isAnyEmpty(value1, value2)) {
                return this;
            }
            this.orNotBetween("modifyDate", value1, value2);
            return this;
        }

        /**
         * or modify_date like value
         *
         * @return
         */
        public Criteria orModifyDateLike(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orLike("modifyDate", value);
            return this;
        }

        /**
         * or modify_date not like value
         *
         * @return
         */
        public Criteria orModifyDateNotLike(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orNotLike("modifyDate", value);
            return this;
        }

        /**
         * and del_flag = value
         *
         * @return
         */
        public Criteria andDelFlagEqualTo(Integer value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.andEqualTo("delFlag", value);
            return this;
        }

        /**
         * and del_flag != value
         *
         * @return
         */
        public Criteria andDelFlagNotEqualTo(Integer value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.andNotEqualTo("delFlag", value);
            return this;
        }

        /**
         * and del_flag > value
         *
         * @return
         */
        public Criteria andDelFlagGreaterThan(Integer value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andGreaterThan("delFlag", value);
            return this;
        }

        /**
         * and del_flag >= value
         *
         * @return
         */
        public Criteria andDelFlagGreaterThanOrEqualTo(Integer value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andGreaterThanOrEqualTo("delFlag", value);
            return this;
        }

        /**
         * and del_flag < value
         *
         * @return
         */
        public Criteria andDelFlagLessThan(Integer value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andLessThan("delFlag", value);
            return this;
        }

        /**
         * and del_flag <= value
         *
         * @return
         */
        public Criteria andDelFlagLessThanOrEqualTo(Integer value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andLessThanOrEqualTo("delFlag", value);
            return this;
        }

        /**
         * and del_flag in (value1, value2, ...)
         *
         * @return
         */
        public Criteria andDelFlagIn(Iterable<Integer> values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            super.andIn("delFlag", values);
            return this;
        }

        /**
         * and del_flag in (value1, value2, ...)
         *
         * @return
         */
        public Criteria andDelFlagIn(Integer... values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            super.andIn("delFlag", CollectionUtils.initList(values));
            return this;
        }

        /**
         * and del_flag not in (value1, value2, ...)
         *
         * @return
         */
        public Criteria andDelFlagNotIn(Iterable<Integer> values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            super.andNotIn("delFlag", values);
            return this;
        }

        /**
         * and del_flag not in (value1, value2, ...)
         *
         * @return
         */
        public Criteria andDelFlagNotIn(Integer[] values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            super.andNotIn("delFlag", CollectionUtils.initList(values));
            return this;
        }

        /**
         * and del_flag between value1 and value2
         *
         * @return
         */
        public Criteria andDelFlagBetween(Integer value1, Integer value2) {
            if (CheckUtils.isAnyEmpty(value1, value2)) {
                return this;
            }
            super.andBetween("delFlag", value1, value2);
            return this;
        }

        /**
         * and del_flag not between value1 and value2
         *
         * @return
         */
        public Criteria andDelFlagNotBetween(Integer value1, Integer value2) {
            if (CheckUtils.isAnyEmpty(value1, value2)) {
                return this;
            }
            super.andNotBetween("delFlag", value1, value2);
            return this;
        }

        /**
         * and del_flag like value
         *
         * @return
         */
        public Criteria andDelFlagLike(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andLike("delFlag", value);
            return this;
        }

        /**
         * and del_flag not like value
         *
         * @return
         */
        public Criteria andDelFlagNotLike(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andNotLike("delFlag", value);
            return this;
        }

        /**
         * or del_flag = value
         *
         * @return
         */
        public Criteria orDelFlagEqualTo(Integer value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orEqualTo("delFlag", value);
            return this;
        }

        /**
         * or del_flag != value
         *
         * @return
         */
        public Criteria orDelFlagNotEqualTo(Integer value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orNotEqualTo("delFlag", value);
            return this;
        }

        /**
         * or del_flag > value
         *
         * @return
         */
        public Criteria orDelFlagGreaterThan(Integer value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orGreaterThan("delFlag", value);
            return this;
        }

        /**
         * or del_flag >= value
         *
         * @return
         */
        public Criteria orDelFlagGreaterThanOrEqualTo(Integer value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orGreaterThanOrEqualTo("delFlag", value);
            return this;
        }

        /**
         * or del_flag < value
         *
         * @return
         */
        public Criteria orDelFlagLessThan(Integer value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orLessThan("delFlag", value);
            return this;
        }

        /**
         * or del_flag <= value
         *
         * @return
         */
        public Criteria orDelFlagLessThanOrEqualTo(Integer value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orLessThanOrEqualTo("delFlag", value);
            return this;
        }

        /**
         * or del_flag in (value1, value2, ...)
         *
         * @return
         */
        public Criteria orDelFlagIn(Iterable<Integer> values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            this.orIn("delFlag", values);
            return this;
        }

        /**
         * or del_flag in (value1, value2, ...)
         *
         * @return
         */
        public Criteria orDelFlagIn(Integer[] values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            this.orIn("delFlag", CollectionUtils.initList(values));
            return this;
        }

        /**
         * or del_flag not in (value1, value2, ...)
         *
         * @return
         */
        public Criteria orDelFlagNotIn(Iterable<Integer> values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            this.orNotIn("delFlag", values);
            return this;
        }

        /**
         * or del_flag not in (value1, value2, ...)
         *
         * @return
         */
        public Criteria orDelFlagNotIn(Integer[] values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            this.orNotIn("delFlag", CollectionUtils.initList(values));
            return this;
        }

        /**
         * or del_flag between value1 and value2
         *
         * @return
         */
        public Criteria orDelFlagBetween(Integer value1, Integer value2) {
            if (CheckUtils.isAnyEmpty(value1, value2)) {
                return this;
            }
            this.orBetween("delFlag", value1, value2);
            return this;
        }

        /**
         * or del_flag not between value1 and value2
         *
         * @return
         */
        public Criteria orDelFlagNotBetween(Integer value1, Integer value2) {
            if (CheckUtils.isAnyEmpty(value1, value2)) {
                return this;
            }
            this.orNotBetween("delFlag", value1, value2);
            return this;
        }

        /**
         * or del_flag like value
         *
         * @return
         */
        public Criteria orDelFlagLike(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orLike("delFlag", value);
            return this;
        }

        /**
         * or del_flag not like value
         *
         * @return
         */
        public Criteria orDelFlagNotLike(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orNotLike("delFlag", value);
            return this;
        }

        /**
         * and deleted = 0
         *
         * @return
         */
        public Criteria andValid() {
            this.andEqualTo("delFlag", 0);
            return this;
        }

        /**
         * and deleted = 1
         *
         * @return
         */
        public Criteria andNotValid() {
            this.andEqualTo("delFlag", 1);
            return this;
        }

        /**
         * or deleted = 0
         *
         * @return
         */
        public Criteria orValid() {
            this.orEqualTo("delFlag", 0);
            return this;
        }

        /**
         * or deleted = 1
         *
         * @return
         */
        public Criteria orNotValid() {
            this.orEqualTo("delFlag", 1);
            return this;
        }

    }

}
