package cn.caijiajia.ratelimiter.example;

import cn.caijiajia.ratelimiter.core.common.util.CheckUtils;
import cn.caijiajia.ratelimiter.core.common.util.CollectionUtils;
import cn.caijiajia.ratelimiter.core.mybatis.example.AbstractExample;
import cn.caijiajia.ratelimiter.model.User;
import tk.mybatis.mapper.entity.EntityColumn;
import tk.mybatis.mapper.entity.Example;

import java.util.Map;
import java.util.Date;

/**
 * user 用户
 *
 * @author xh
 * @since 2021/01/19
 */
public class UserExample extends AbstractExample<User> {

    /**
     * 排序
     */
    protected OrderBy ORDER_BY;

    public UserExample() {
        super(User.class);
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
         * order by name
         *
         * @return
         */
        public OrderBy name() {
            this.orderBy("name");
            return this;
        }
        
        /**
         * order by real_name
         *
         * @return
         */
        public OrderBy realName() {
            this.orderBy("realName");
            return this;
        }
        
        /**
         * order by mobile
         *
         * @return
         */
        public OrderBy mobile() {
            this.orderBy("mobile");
            return this;
        }
        
        /**
         * order by login_name
         *
         * @return
         */
        public OrderBy loginName() {
            this.orderBy("loginName");
            return this;
        }
        
        /**
         * order by address
         *
         * @return
         */
        public OrderBy address() {
            this.orderBy("address");
            return this;
        }
        
        /**
         * order by email
         *
         * @return
         */
        public OrderBy email() {
            this.orderBy("email");
            return this;
        }
        
        /**
         * order by last_login_time
         *
         * @return
         */
        public OrderBy lastLoginTime() {
            this.orderBy("lastLoginTime");
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
         * order by create_date
         *
         * @return
         */
        public OrderBy createDate() {
            this.orderBy("createDate");
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
         * order by modify_date
         *
         * @return
         */
        public OrderBy modifyDate() {
            this.orderBy("modifyDate");
            return this;
        }
        
        /**
         * order by password
         *
         * @return
         */
        public OrderBy password() {
            this.orderBy("password");
            return this;
        }
        
        /**
         * order by avatar
         *
         * @return
         */
        public OrderBy avatar() {
            this.orderBy("avatar");
            return this;
        }
        
        /**
         * order by status
         *
         * @return
         */
        public OrderBy status() {
            this.orderBy("status");
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
         * and name = ''
         *
         * @return
         */
        public Criteria andNameIsEmpty() {
            this.andEqualTo("name", "");
            return this;
        }

        /**
         * and name != ''
         *
         * @return
         */
        public Criteria andNameIsNotEmpty() {
            this.andNotEqualTo("name", "");
            return this;
        }

        /**
         * and name = value
         *
         * @return
         */
        public Criteria andNameEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.andEqualTo("name", value);
            return this;
        }

        /**
         * and name != value
         *
         * @return
         */
        public Criteria andNameNotEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.andNotEqualTo("name", value);
            return this;
        }

        /**
         * and name > value
         *
         * @return
         */
        public Criteria andNameGreaterThan(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andGreaterThan("name", value);
            return this;
        }

        /**
         * and name >= value
         *
         * @return
         */
        public Criteria andNameGreaterThanOrEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andGreaterThanOrEqualTo("name", value);
            return this;
        }

        /**
         * and name < value
         *
         * @return
         */
        public Criteria andNameLessThan(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andLessThan("name", value);
            return this;
        }

        /**
         * and name <= value
         *
         * @return
         */
        public Criteria andNameLessThanOrEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andLessThanOrEqualTo("name", value);
            return this;
        }

        /**
         * and name in (value1, value2, ...)
         *
         * @return
         */
        public Criteria andNameIn(Iterable<String> values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            super.andIn("name", values);
            return this;
        }

        /**
         * and name in (value1, value2, ...)
         *
         * @return
         */
        public Criteria andNameIn(String... values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            super.andIn("name", CollectionUtils.initList(values));
            return this;
        }

        /**
         * and name not in (value1, value2, ...)
         *
         * @return
         */
        public Criteria andNameNotIn(Iterable<String> values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            super.andNotIn("name", values);
            return this;
        }

        /**
         * and name not in (value1, value2, ...)
         *
         * @return
         */
        public Criteria andNameNotIn(String[] values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            super.andNotIn("name", CollectionUtils.initList(values));
            return this;
        }

        /**
         * and name between value1 and value2
         *
         * @return
         */
        public Criteria andNameBetween(String value1, String value2) {
            if (CheckUtils.isAnyEmpty(value1, value2)) {
                return this;
            }
            super.andBetween("name", value1, value2);
            return this;
        }

        /**
         * and name not between value1 and value2
         *
         * @return
         */
        public Criteria andNameNotBetween(String value1, String value2) {
            if (CheckUtils.isAnyEmpty(value1, value2)) {
                return this;
            }
            super.andNotBetween("name", value1, value2);
            return this;
        }

        /**
         * and name like value
         *
         * @return
         */
        public Criteria andNameLike(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andLike("name", value);
            return this;
        }

        /**
         * and name not like value
         *
         * @return
         */
        public Criteria andNameNotLike(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andNotLike("name", value);
            return this;
        }

        /**
         * or name = ''
         *
         * @return
         */
        public Criteria orNameIsEmpty() {
            this.orEqualTo("name", "");
            return this;
        }

        /**
         * or name != ''
         *
         * @return
         */
        public Criteria orNameIsNotEmpty() {
            this.orNotEqualTo("name", "");
            return this;
        }

        /**
         * or name = value
         *
         * @return
         */
        public Criteria orNameEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orEqualTo("name", value);
            return this;
        }

        /**
         * or name != value
         *
         * @return
         */
        public Criteria orNameNotEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orNotEqualTo("name", value);
            return this;
        }

        /**
         * or name > value
         *
         * @return
         */
        public Criteria orNameGreaterThan(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orGreaterThan("name", value);
            return this;
        }

        /**
         * or name >= value
         *
         * @return
         */
        public Criteria orNameGreaterThanOrEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orGreaterThanOrEqualTo("name", value);
            return this;
        }

        /**
         * or name < value
         *
         * @return
         */
        public Criteria orNameLessThan(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orLessThan("name", value);
            return this;
        }

        /**
         * or name <= value
         *
         * @return
         */
        public Criteria orNameLessThanOrEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orLessThanOrEqualTo("name", value);
            return this;
        }

        /**
         * or name in (value1, value2, ...)
         *
         * @return
         */
        public Criteria orNameIn(Iterable<String> values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            this.orIn("name", values);
            return this;
        }

        /**
         * or name in (value1, value2, ...)
         *
         * @return
         */
        public Criteria orNameIn(String[] values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            this.orIn("name", CollectionUtils.initList(values));
            return this;
        }

        /**
         * or name not in (value1, value2, ...)
         *
         * @return
         */
        public Criteria orNameNotIn(Iterable<String> values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            this.orNotIn("name", values);
            return this;
        }

        /**
         * or name not in (value1, value2, ...)
         *
         * @return
         */
        public Criteria orNameNotIn(String[] values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            this.orNotIn("name", CollectionUtils.initList(values));
            return this;
        }

        /**
         * or name between value1 and value2
         *
         * @return
         */
        public Criteria orNameBetween(String value1, String value2) {
            if (CheckUtils.isAnyEmpty(value1, value2)) {
                return this;
            }
            this.orBetween("name", value1, value2);
            return this;
        }

        /**
         * or name not between value1 and value2
         *
         * @return
         */
        public Criteria orNameNotBetween(String value1, String value2) {
            if (CheckUtils.isAnyEmpty(value1, value2)) {
                return this;
            }
            this.orNotBetween("name", value1, value2);
            return this;
        }

        /**
         * or name like value
         *
         * @return
         */
        public Criteria orNameLike(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orLike("name", value);
            return this;
        }

        /**
         * or name not like value
         *
         * @return
         */
        public Criteria orNameNotLike(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orNotLike("name", value);
            return this;
        }

        /**
         * and real_name = ''
         *
         * @return
         */
        public Criteria andRealNameIsEmpty() {
            this.andEqualTo("realName", "");
            return this;
        }

        /**
         * and real_name != ''
         *
         * @return
         */
        public Criteria andRealNameIsNotEmpty() {
            this.andNotEqualTo("realName", "");
            return this;
        }

        /**
         * and real_name = value
         *
         * @return
         */
        public Criteria andRealNameEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.andEqualTo("realName", value);
            return this;
        }

        /**
         * and real_name != value
         *
         * @return
         */
        public Criteria andRealNameNotEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.andNotEqualTo("realName", value);
            return this;
        }

        /**
         * and real_name > value
         *
         * @return
         */
        public Criteria andRealNameGreaterThan(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andGreaterThan("realName", value);
            return this;
        }

        /**
         * and real_name >= value
         *
         * @return
         */
        public Criteria andRealNameGreaterThanOrEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andGreaterThanOrEqualTo("realName", value);
            return this;
        }

        /**
         * and real_name < value
         *
         * @return
         */
        public Criteria andRealNameLessThan(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andLessThan("realName", value);
            return this;
        }

        /**
         * and real_name <= value
         *
         * @return
         */
        public Criteria andRealNameLessThanOrEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andLessThanOrEqualTo("realName", value);
            return this;
        }

        /**
         * and real_name in (value1, value2, ...)
         *
         * @return
         */
        public Criteria andRealNameIn(Iterable<String> values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            super.andIn("realName", values);
            return this;
        }

        /**
         * and real_name in (value1, value2, ...)
         *
         * @return
         */
        public Criteria andRealNameIn(String... values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            super.andIn("realName", CollectionUtils.initList(values));
            return this;
        }

        /**
         * and real_name not in (value1, value2, ...)
         *
         * @return
         */
        public Criteria andRealNameNotIn(Iterable<String> values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            super.andNotIn("realName", values);
            return this;
        }

        /**
         * and real_name not in (value1, value2, ...)
         *
         * @return
         */
        public Criteria andRealNameNotIn(String[] values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            super.andNotIn("realName", CollectionUtils.initList(values));
            return this;
        }

        /**
         * and real_name between value1 and value2
         *
         * @return
         */
        public Criteria andRealNameBetween(String value1, String value2) {
            if (CheckUtils.isAnyEmpty(value1, value2)) {
                return this;
            }
            super.andBetween("realName", value1, value2);
            return this;
        }

        /**
         * and real_name not between value1 and value2
         *
         * @return
         */
        public Criteria andRealNameNotBetween(String value1, String value2) {
            if (CheckUtils.isAnyEmpty(value1, value2)) {
                return this;
            }
            super.andNotBetween("realName", value1, value2);
            return this;
        }

        /**
         * and real_name like value
         *
         * @return
         */
        public Criteria andRealNameLike(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andLike("realName", value);
            return this;
        }

        /**
         * and real_name not like value
         *
         * @return
         */
        public Criteria andRealNameNotLike(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andNotLike("realName", value);
            return this;
        }

        /**
         * or real_name = ''
         *
         * @return
         */
        public Criteria orRealNameIsEmpty() {
            this.orEqualTo("realName", "");
            return this;
        }

        /**
         * or real_name != ''
         *
         * @return
         */
        public Criteria orRealNameIsNotEmpty() {
            this.orNotEqualTo("realName", "");
            return this;
        }

        /**
         * or real_name = value
         *
         * @return
         */
        public Criteria orRealNameEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orEqualTo("realName", value);
            return this;
        }

        /**
         * or real_name != value
         *
         * @return
         */
        public Criteria orRealNameNotEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orNotEqualTo("realName", value);
            return this;
        }

        /**
         * or real_name > value
         *
         * @return
         */
        public Criteria orRealNameGreaterThan(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orGreaterThan("realName", value);
            return this;
        }

        /**
         * or real_name >= value
         *
         * @return
         */
        public Criteria orRealNameGreaterThanOrEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orGreaterThanOrEqualTo("realName", value);
            return this;
        }

        /**
         * or real_name < value
         *
         * @return
         */
        public Criteria orRealNameLessThan(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orLessThan("realName", value);
            return this;
        }

        /**
         * or real_name <= value
         *
         * @return
         */
        public Criteria orRealNameLessThanOrEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orLessThanOrEqualTo("realName", value);
            return this;
        }

        /**
         * or real_name in (value1, value2, ...)
         *
         * @return
         */
        public Criteria orRealNameIn(Iterable<String> values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            this.orIn("realName", values);
            return this;
        }

        /**
         * or real_name in (value1, value2, ...)
         *
         * @return
         */
        public Criteria orRealNameIn(String[] values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            this.orIn("realName", CollectionUtils.initList(values));
            return this;
        }

        /**
         * or real_name not in (value1, value2, ...)
         *
         * @return
         */
        public Criteria orRealNameNotIn(Iterable<String> values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            this.orNotIn("realName", values);
            return this;
        }

        /**
         * or real_name not in (value1, value2, ...)
         *
         * @return
         */
        public Criteria orRealNameNotIn(String[] values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            this.orNotIn("realName", CollectionUtils.initList(values));
            return this;
        }

        /**
         * or real_name between value1 and value2
         *
         * @return
         */
        public Criteria orRealNameBetween(String value1, String value2) {
            if (CheckUtils.isAnyEmpty(value1, value2)) {
                return this;
            }
            this.orBetween("realName", value1, value2);
            return this;
        }

        /**
         * or real_name not between value1 and value2
         *
         * @return
         */
        public Criteria orRealNameNotBetween(String value1, String value2) {
            if (CheckUtils.isAnyEmpty(value1, value2)) {
                return this;
            }
            this.orNotBetween("realName", value1, value2);
            return this;
        }

        /**
         * or real_name like value
         *
         * @return
         */
        public Criteria orRealNameLike(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orLike("realName", value);
            return this;
        }

        /**
         * or real_name not like value
         *
         * @return
         */
        public Criteria orRealNameNotLike(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orNotLike("realName", value);
            return this;
        }

        /**
         * and mobile = ''
         *
         * @return
         */
        public Criteria andMobileIsEmpty() {
            this.andEqualTo("mobile", "");
            return this;
        }

        /**
         * and mobile != ''
         *
         * @return
         */
        public Criteria andMobileIsNotEmpty() {
            this.andNotEqualTo("mobile", "");
            return this;
        }

        /**
         * and mobile = value
         *
         * @return
         */
        public Criteria andMobileEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.andEqualTo("mobile", value);
            return this;
        }

        /**
         * and mobile != value
         *
         * @return
         */
        public Criteria andMobileNotEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.andNotEqualTo("mobile", value);
            return this;
        }

        /**
         * and mobile > value
         *
         * @return
         */
        public Criteria andMobileGreaterThan(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andGreaterThan("mobile", value);
            return this;
        }

        /**
         * and mobile >= value
         *
         * @return
         */
        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andGreaterThanOrEqualTo("mobile", value);
            return this;
        }

        /**
         * and mobile < value
         *
         * @return
         */
        public Criteria andMobileLessThan(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andLessThan("mobile", value);
            return this;
        }

        /**
         * and mobile <= value
         *
         * @return
         */
        public Criteria andMobileLessThanOrEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andLessThanOrEqualTo("mobile", value);
            return this;
        }

        /**
         * and mobile in (value1, value2, ...)
         *
         * @return
         */
        public Criteria andMobileIn(Iterable<String> values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            super.andIn("mobile", values);
            return this;
        }

        /**
         * and mobile in (value1, value2, ...)
         *
         * @return
         */
        public Criteria andMobileIn(String... values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            super.andIn("mobile", CollectionUtils.initList(values));
            return this;
        }

        /**
         * and mobile not in (value1, value2, ...)
         *
         * @return
         */
        public Criteria andMobileNotIn(Iterable<String> values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            super.andNotIn("mobile", values);
            return this;
        }

        /**
         * and mobile not in (value1, value2, ...)
         *
         * @return
         */
        public Criteria andMobileNotIn(String[] values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            super.andNotIn("mobile", CollectionUtils.initList(values));
            return this;
        }

        /**
         * and mobile between value1 and value2
         *
         * @return
         */
        public Criteria andMobileBetween(String value1, String value2) {
            if (CheckUtils.isAnyEmpty(value1, value2)) {
                return this;
            }
            super.andBetween("mobile", value1, value2);
            return this;
        }

        /**
         * and mobile not between value1 and value2
         *
         * @return
         */
        public Criteria andMobileNotBetween(String value1, String value2) {
            if (CheckUtils.isAnyEmpty(value1, value2)) {
                return this;
            }
            super.andNotBetween("mobile", value1, value2);
            return this;
        }

        /**
         * and mobile like value
         *
         * @return
         */
        public Criteria andMobileLike(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andLike("mobile", value);
            return this;
        }

        /**
         * and mobile not like value
         *
         * @return
         */
        public Criteria andMobileNotLike(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andNotLike("mobile", value);
            return this;
        }

        /**
         * or mobile = ''
         *
         * @return
         */
        public Criteria orMobileIsEmpty() {
            this.orEqualTo("mobile", "");
            return this;
        }

        /**
         * or mobile != ''
         *
         * @return
         */
        public Criteria orMobileIsNotEmpty() {
            this.orNotEqualTo("mobile", "");
            return this;
        }

        /**
         * or mobile = value
         *
         * @return
         */
        public Criteria orMobileEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orEqualTo("mobile", value);
            return this;
        }

        /**
         * or mobile != value
         *
         * @return
         */
        public Criteria orMobileNotEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orNotEqualTo("mobile", value);
            return this;
        }

        /**
         * or mobile > value
         *
         * @return
         */
        public Criteria orMobileGreaterThan(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orGreaterThan("mobile", value);
            return this;
        }

        /**
         * or mobile >= value
         *
         * @return
         */
        public Criteria orMobileGreaterThanOrEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orGreaterThanOrEqualTo("mobile", value);
            return this;
        }

        /**
         * or mobile < value
         *
         * @return
         */
        public Criteria orMobileLessThan(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orLessThan("mobile", value);
            return this;
        }

        /**
         * or mobile <= value
         *
         * @return
         */
        public Criteria orMobileLessThanOrEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orLessThanOrEqualTo("mobile", value);
            return this;
        }

        /**
         * or mobile in (value1, value2, ...)
         *
         * @return
         */
        public Criteria orMobileIn(Iterable<String> values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            this.orIn("mobile", values);
            return this;
        }

        /**
         * or mobile in (value1, value2, ...)
         *
         * @return
         */
        public Criteria orMobileIn(String[] values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            this.orIn("mobile", CollectionUtils.initList(values));
            return this;
        }

        /**
         * or mobile not in (value1, value2, ...)
         *
         * @return
         */
        public Criteria orMobileNotIn(Iterable<String> values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            this.orNotIn("mobile", values);
            return this;
        }

        /**
         * or mobile not in (value1, value2, ...)
         *
         * @return
         */
        public Criteria orMobileNotIn(String[] values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            this.orNotIn("mobile", CollectionUtils.initList(values));
            return this;
        }

        /**
         * or mobile between value1 and value2
         *
         * @return
         */
        public Criteria orMobileBetween(String value1, String value2) {
            if (CheckUtils.isAnyEmpty(value1, value2)) {
                return this;
            }
            this.orBetween("mobile", value1, value2);
            return this;
        }

        /**
         * or mobile not between value1 and value2
         *
         * @return
         */
        public Criteria orMobileNotBetween(String value1, String value2) {
            if (CheckUtils.isAnyEmpty(value1, value2)) {
                return this;
            }
            this.orNotBetween("mobile", value1, value2);
            return this;
        }

        /**
         * or mobile like value
         *
         * @return
         */
        public Criteria orMobileLike(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orLike("mobile", value);
            return this;
        }

        /**
         * or mobile not like value
         *
         * @return
         */
        public Criteria orMobileNotLike(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orNotLike("mobile", value);
            return this;
        }

        /**
         * and login_name = ''
         *
         * @return
         */
        public Criteria andLoginNameIsEmpty() {
            this.andEqualTo("loginName", "");
            return this;
        }

        /**
         * and login_name != ''
         *
         * @return
         */
        public Criteria andLoginNameIsNotEmpty() {
            this.andNotEqualTo("loginName", "");
            return this;
        }

        /**
         * and login_name = value
         *
         * @return
         */
        public Criteria andLoginNameEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.andEqualTo("loginName", value);
            return this;
        }

        /**
         * and login_name != value
         *
         * @return
         */
        public Criteria andLoginNameNotEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.andNotEqualTo("loginName", value);
            return this;
        }

        /**
         * and login_name > value
         *
         * @return
         */
        public Criteria andLoginNameGreaterThan(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andGreaterThan("loginName", value);
            return this;
        }

        /**
         * and login_name >= value
         *
         * @return
         */
        public Criteria andLoginNameGreaterThanOrEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andGreaterThanOrEqualTo("loginName", value);
            return this;
        }

        /**
         * and login_name < value
         *
         * @return
         */
        public Criteria andLoginNameLessThan(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andLessThan("loginName", value);
            return this;
        }

        /**
         * and login_name <= value
         *
         * @return
         */
        public Criteria andLoginNameLessThanOrEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andLessThanOrEqualTo("loginName", value);
            return this;
        }

        /**
         * and login_name in (value1, value2, ...)
         *
         * @return
         */
        public Criteria andLoginNameIn(Iterable<String> values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            super.andIn("loginName", values);
            return this;
        }

        /**
         * and login_name in (value1, value2, ...)
         *
         * @return
         */
        public Criteria andLoginNameIn(String... values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            super.andIn("loginName", CollectionUtils.initList(values));
            return this;
        }

        /**
         * and login_name not in (value1, value2, ...)
         *
         * @return
         */
        public Criteria andLoginNameNotIn(Iterable<String> values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            super.andNotIn("loginName", values);
            return this;
        }

        /**
         * and login_name not in (value1, value2, ...)
         *
         * @return
         */
        public Criteria andLoginNameNotIn(String[] values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            super.andNotIn("loginName", CollectionUtils.initList(values));
            return this;
        }

        /**
         * and login_name between value1 and value2
         *
         * @return
         */
        public Criteria andLoginNameBetween(String value1, String value2) {
            if (CheckUtils.isAnyEmpty(value1, value2)) {
                return this;
            }
            super.andBetween("loginName", value1, value2);
            return this;
        }

        /**
         * and login_name not between value1 and value2
         *
         * @return
         */
        public Criteria andLoginNameNotBetween(String value1, String value2) {
            if (CheckUtils.isAnyEmpty(value1, value2)) {
                return this;
            }
            super.andNotBetween("loginName", value1, value2);
            return this;
        }

        /**
         * and login_name like value
         *
         * @return
         */
        public Criteria andLoginNameLike(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andLike("loginName", value);
            return this;
        }

        /**
         * and login_name not like value
         *
         * @return
         */
        public Criteria andLoginNameNotLike(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andNotLike("loginName", value);
            return this;
        }

        /**
         * or login_name = ''
         *
         * @return
         */
        public Criteria orLoginNameIsEmpty() {
            this.orEqualTo("loginName", "");
            return this;
        }

        /**
         * or login_name != ''
         *
         * @return
         */
        public Criteria orLoginNameIsNotEmpty() {
            this.orNotEqualTo("loginName", "");
            return this;
        }

        /**
         * or login_name = value
         *
         * @return
         */
        public Criteria orLoginNameEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orEqualTo("loginName", value);
            return this;
        }

        /**
         * or login_name != value
         *
         * @return
         */
        public Criteria orLoginNameNotEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orNotEqualTo("loginName", value);
            return this;
        }

        /**
         * or login_name > value
         *
         * @return
         */
        public Criteria orLoginNameGreaterThan(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orGreaterThan("loginName", value);
            return this;
        }

        /**
         * or login_name >= value
         *
         * @return
         */
        public Criteria orLoginNameGreaterThanOrEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orGreaterThanOrEqualTo("loginName", value);
            return this;
        }

        /**
         * or login_name < value
         *
         * @return
         */
        public Criteria orLoginNameLessThan(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orLessThan("loginName", value);
            return this;
        }

        /**
         * or login_name <= value
         *
         * @return
         */
        public Criteria orLoginNameLessThanOrEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orLessThanOrEqualTo("loginName", value);
            return this;
        }

        /**
         * or login_name in (value1, value2, ...)
         *
         * @return
         */
        public Criteria orLoginNameIn(Iterable<String> values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            this.orIn("loginName", values);
            return this;
        }

        /**
         * or login_name in (value1, value2, ...)
         *
         * @return
         */
        public Criteria orLoginNameIn(String[] values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            this.orIn("loginName", CollectionUtils.initList(values));
            return this;
        }

        /**
         * or login_name not in (value1, value2, ...)
         *
         * @return
         */
        public Criteria orLoginNameNotIn(Iterable<String> values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            this.orNotIn("loginName", values);
            return this;
        }

        /**
         * or login_name not in (value1, value2, ...)
         *
         * @return
         */
        public Criteria orLoginNameNotIn(String[] values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            this.orNotIn("loginName", CollectionUtils.initList(values));
            return this;
        }

        /**
         * or login_name between value1 and value2
         *
         * @return
         */
        public Criteria orLoginNameBetween(String value1, String value2) {
            if (CheckUtils.isAnyEmpty(value1, value2)) {
                return this;
            }
            this.orBetween("loginName", value1, value2);
            return this;
        }

        /**
         * or login_name not between value1 and value2
         *
         * @return
         */
        public Criteria orLoginNameNotBetween(String value1, String value2) {
            if (CheckUtils.isAnyEmpty(value1, value2)) {
                return this;
            }
            this.orNotBetween("loginName", value1, value2);
            return this;
        }

        /**
         * or login_name like value
         *
         * @return
         */
        public Criteria orLoginNameLike(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orLike("loginName", value);
            return this;
        }

        /**
         * or login_name not like value
         *
         * @return
         */
        public Criteria orLoginNameNotLike(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orNotLike("loginName", value);
            return this;
        }

        /**
         * and address = ''
         *
         * @return
         */
        public Criteria andAddressIsEmpty() {
            this.andEqualTo("address", "");
            return this;
        }

        /**
         * and address != ''
         *
         * @return
         */
        public Criteria andAddressIsNotEmpty() {
            this.andNotEqualTo("address", "");
            return this;
        }

        /**
         * and address = value
         *
         * @return
         */
        public Criteria andAddressEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.andEqualTo("address", value);
            return this;
        }

        /**
         * and address != value
         *
         * @return
         */
        public Criteria andAddressNotEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.andNotEqualTo("address", value);
            return this;
        }

        /**
         * and address > value
         *
         * @return
         */
        public Criteria andAddressGreaterThan(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andGreaterThan("address", value);
            return this;
        }

        /**
         * and address >= value
         *
         * @return
         */
        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andGreaterThanOrEqualTo("address", value);
            return this;
        }

        /**
         * and address < value
         *
         * @return
         */
        public Criteria andAddressLessThan(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andLessThan("address", value);
            return this;
        }

        /**
         * and address <= value
         *
         * @return
         */
        public Criteria andAddressLessThanOrEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andLessThanOrEqualTo("address", value);
            return this;
        }

        /**
         * and address in (value1, value2, ...)
         *
         * @return
         */
        public Criteria andAddressIn(Iterable<String> values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            super.andIn("address", values);
            return this;
        }

        /**
         * and address in (value1, value2, ...)
         *
         * @return
         */
        public Criteria andAddressIn(String... values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            super.andIn("address", CollectionUtils.initList(values));
            return this;
        }

        /**
         * and address not in (value1, value2, ...)
         *
         * @return
         */
        public Criteria andAddressNotIn(Iterable<String> values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            super.andNotIn("address", values);
            return this;
        }

        /**
         * and address not in (value1, value2, ...)
         *
         * @return
         */
        public Criteria andAddressNotIn(String[] values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            super.andNotIn("address", CollectionUtils.initList(values));
            return this;
        }

        /**
         * and address between value1 and value2
         *
         * @return
         */
        public Criteria andAddressBetween(String value1, String value2) {
            if (CheckUtils.isAnyEmpty(value1, value2)) {
                return this;
            }
            super.andBetween("address", value1, value2);
            return this;
        }

        /**
         * and address not between value1 and value2
         *
         * @return
         */
        public Criteria andAddressNotBetween(String value1, String value2) {
            if (CheckUtils.isAnyEmpty(value1, value2)) {
                return this;
            }
            super.andNotBetween("address", value1, value2);
            return this;
        }

        /**
         * and address like value
         *
         * @return
         */
        public Criteria andAddressLike(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andLike("address", value);
            return this;
        }

        /**
         * and address not like value
         *
         * @return
         */
        public Criteria andAddressNotLike(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andNotLike("address", value);
            return this;
        }

        /**
         * or address = ''
         *
         * @return
         */
        public Criteria orAddressIsEmpty() {
            this.orEqualTo("address", "");
            return this;
        }

        /**
         * or address != ''
         *
         * @return
         */
        public Criteria orAddressIsNotEmpty() {
            this.orNotEqualTo("address", "");
            return this;
        }

        /**
         * or address = value
         *
         * @return
         */
        public Criteria orAddressEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orEqualTo("address", value);
            return this;
        }

        /**
         * or address != value
         *
         * @return
         */
        public Criteria orAddressNotEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orNotEqualTo("address", value);
            return this;
        }

        /**
         * or address > value
         *
         * @return
         */
        public Criteria orAddressGreaterThan(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orGreaterThan("address", value);
            return this;
        }

        /**
         * or address >= value
         *
         * @return
         */
        public Criteria orAddressGreaterThanOrEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orGreaterThanOrEqualTo("address", value);
            return this;
        }

        /**
         * or address < value
         *
         * @return
         */
        public Criteria orAddressLessThan(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orLessThan("address", value);
            return this;
        }

        /**
         * or address <= value
         *
         * @return
         */
        public Criteria orAddressLessThanOrEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orLessThanOrEqualTo("address", value);
            return this;
        }

        /**
         * or address in (value1, value2, ...)
         *
         * @return
         */
        public Criteria orAddressIn(Iterable<String> values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            this.orIn("address", values);
            return this;
        }

        /**
         * or address in (value1, value2, ...)
         *
         * @return
         */
        public Criteria orAddressIn(String[] values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            this.orIn("address", CollectionUtils.initList(values));
            return this;
        }

        /**
         * or address not in (value1, value2, ...)
         *
         * @return
         */
        public Criteria orAddressNotIn(Iterable<String> values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            this.orNotIn("address", values);
            return this;
        }

        /**
         * or address not in (value1, value2, ...)
         *
         * @return
         */
        public Criteria orAddressNotIn(String[] values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            this.orNotIn("address", CollectionUtils.initList(values));
            return this;
        }

        /**
         * or address between value1 and value2
         *
         * @return
         */
        public Criteria orAddressBetween(String value1, String value2) {
            if (CheckUtils.isAnyEmpty(value1, value2)) {
                return this;
            }
            this.orBetween("address", value1, value2);
            return this;
        }

        /**
         * or address not between value1 and value2
         *
         * @return
         */
        public Criteria orAddressNotBetween(String value1, String value2) {
            if (CheckUtils.isAnyEmpty(value1, value2)) {
                return this;
            }
            this.orNotBetween("address", value1, value2);
            return this;
        }

        /**
         * or address like value
         *
         * @return
         */
        public Criteria orAddressLike(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orLike("address", value);
            return this;
        }

        /**
         * or address not like value
         *
         * @return
         */
        public Criteria orAddressNotLike(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orNotLike("address", value);
            return this;
        }

        /**
         * and email = ''
         *
         * @return
         */
        public Criteria andEmailIsEmpty() {
            this.andEqualTo("email", "");
            return this;
        }

        /**
         * and email != ''
         *
         * @return
         */
        public Criteria andEmailIsNotEmpty() {
            this.andNotEqualTo("email", "");
            return this;
        }

        /**
         * and email = value
         *
         * @return
         */
        public Criteria andEmailEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.andEqualTo("email", value);
            return this;
        }

        /**
         * and email != value
         *
         * @return
         */
        public Criteria andEmailNotEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.andNotEqualTo("email", value);
            return this;
        }

        /**
         * and email > value
         *
         * @return
         */
        public Criteria andEmailGreaterThan(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andGreaterThan("email", value);
            return this;
        }

        /**
         * and email >= value
         *
         * @return
         */
        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andGreaterThanOrEqualTo("email", value);
            return this;
        }

        /**
         * and email < value
         *
         * @return
         */
        public Criteria andEmailLessThan(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andLessThan("email", value);
            return this;
        }

        /**
         * and email <= value
         *
         * @return
         */
        public Criteria andEmailLessThanOrEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andLessThanOrEqualTo("email", value);
            return this;
        }

        /**
         * and email in (value1, value2, ...)
         *
         * @return
         */
        public Criteria andEmailIn(Iterable<String> values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            super.andIn("email", values);
            return this;
        }

        /**
         * and email in (value1, value2, ...)
         *
         * @return
         */
        public Criteria andEmailIn(String... values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            super.andIn("email", CollectionUtils.initList(values));
            return this;
        }

        /**
         * and email not in (value1, value2, ...)
         *
         * @return
         */
        public Criteria andEmailNotIn(Iterable<String> values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            super.andNotIn("email", values);
            return this;
        }

        /**
         * and email not in (value1, value2, ...)
         *
         * @return
         */
        public Criteria andEmailNotIn(String[] values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            super.andNotIn("email", CollectionUtils.initList(values));
            return this;
        }

        /**
         * and email between value1 and value2
         *
         * @return
         */
        public Criteria andEmailBetween(String value1, String value2) {
            if (CheckUtils.isAnyEmpty(value1, value2)) {
                return this;
            }
            super.andBetween("email", value1, value2);
            return this;
        }

        /**
         * and email not between value1 and value2
         *
         * @return
         */
        public Criteria andEmailNotBetween(String value1, String value2) {
            if (CheckUtils.isAnyEmpty(value1, value2)) {
                return this;
            }
            super.andNotBetween("email", value1, value2);
            return this;
        }

        /**
         * and email like value
         *
         * @return
         */
        public Criteria andEmailLike(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andLike("email", value);
            return this;
        }

        /**
         * and email not like value
         *
         * @return
         */
        public Criteria andEmailNotLike(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andNotLike("email", value);
            return this;
        }

        /**
         * or email = ''
         *
         * @return
         */
        public Criteria orEmailIsEmpty() {
            this.orEqualTo("email", "");
            return this;
        }

        /**
         * or email != ''
         *
         * @return
         */
        public Criteria orEmailIsNotEmpty() {
            this.orNotEqualTo("email", "");
            return this;
        }

        /**
         * or email = value
         *
         * @return
         */
        public Criteria orEmailEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orEqualTo("email", value);
            return this;
        }

        /**
         * or email != value
         *
         * @return
         */
        public Criteria orEmailNotEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orNotEqualTo("email", value);
            return this;
        }

        /**
         * or email > value
         *
         * @return
         */
        public Criteria orEmailGreaterThan(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orGreaterThan("email", value);
            return this;
        }

        /**
         * or email >= value
         *
         * @return
         */
        public Criteria orEmailGreaterThanOrEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orGreaterThanOrEqualTo("email", value);
            return this;
        }

        /**
         * or email < value
         *
         * @return
         */
        public Criteria orEmailLessThan(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orLessThan("email", value);
            return this;
        }

        /**
         * or email <= value
         *
         * @return
         */
        public Criteria orEmailLessThanOrEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orLessThanOrEqualTo("email", value);
            return this;
        }

        /**
         * or email in (value1, value2, ...)
         *
         * @return
         */
        public Criteria orEmailIn(Iterable<String> values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            this.orIn("email", values);
            return this;
        }

        /**
         * or email in (value1, value2, ...)
         *
         * @return
         */
        public Criteria orEmailIn(String[] values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            this.orIn("email", CollectionUtils.initList(values));
            return this;
        }

        /**
         * or email not in (value1, value2, ...)
         *
         * @return
         */
        public Criteria orEmailNotIn(Iterable<String> values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            this.orNotIn("email", values);
            return this;
        }

        /**
         * or email not in (value1, value2, ...)
         *
         * @return
         */
        public Criteria orEmailNotIn(String[] values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            this.orNotIn("email", CollectionUtils.initList(values));
            return this;
        }

        /**
         * or email between value1 and value2
         *
         * @return
         */
        public Criteria orEmailBetween(String value1, String value2) {
            if (CheckUtils.isAnyEmpty(value1, value2)) {
                return this;
            }
            this.orBetween("email", value1, value2);
            return this;
        }

        /**
         * or email not between value1 and value2
         *
         * @return
         */
        public Criteria orEmailNotBetween(String value1, String value2) {
            if (CheckUtils.isAnyEmpty(value1, value2)) {
                return this;
            }
            this.orNotBetween("email", value1, value2);
            return this;
        }

        /**
         * or email like value
         *
         * @return
         */
        public Criteria orEmailLike(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orLike("email", value);
            return this;
        }

        /**
         * or email not like value
         *
         * @return
         */
        public Criteria orEmailNotLike(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orNotLike("email", value);
            return this;
        }

        /**
         * and last_login_time = value
         *
         * @return
         */
        public Criteria andLastLoginTimeEqualTo(Date value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.andEqualTo("lastLoginTime", value);
            return this;
        }

        /**
         * and last_login_time != value
         *
         * @return
         */
        public Criteria andLastLoginTimeNotEqualTo(Date value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.andNotEqualTo("lastLoginTime", value);
            return this;
        }

        /**
         * and last_login_time > value
         *
         * @return
         */
        public Criteria andLastLoginTimeGreaterThan(Date value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andGreaterThan("lastLoginTime", value);
            return this;
        }

        /**
         * and last_login_time >= value
         *
         * @return
         */
        public Criteria andLastLoginTimeGreaterThanOrEqualTo(Date value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andGreaterThanOrEqualTo("lastLoginTime", value);
            return this;
        }

        /**
         * and last_login_time < value
         *
         * @return
         */
        public Criteria andLastLoginTimeLessThan(Date value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andLessThan("lastLoginTime", value);
            return this;
        }

        /**
         * and last_login_time <= value
         *
         * @return
         */
        public Criteria andLastLoginTimeLessThanOrEqualTo(Date value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andLessThanOrEqualTo("lastLoginTime", value);
            return this;
        }

        /**
         * and last_login_time in (value1, value2, ...)
         *
         * @return
         */
        public Criteria andLastLoginTimeIn(Iterable<Date> values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            super.andIn("lastLoginTime", values);
            return this;
        }

        /**
         * and last_login_time in (value1, value2, ...)
         *
         * @return
         */
        public Criteria andLastLoginTimeIn(Date... values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            super.andIn("lastLoginTime", CollectionUtils.initList(values));
            return this;
        }

        /**
         * and last_login_time not in (value1, value2, ...)
         *
         * @return
         */
        public Criteria andLastLoginTimeNotIn(Iterable<Date> values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            super.andNotIn("lastLoginTime", values);
            return this;
        }

        /**
         * and last_login_time not in (value1, value2, ...)
         *
         * @return
         */
        public Criteria andLastLoginTimeNotIn(Date[] values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            super.andNotIn("lastLoginTime", CollectionUtils.initList(values));
            return this;
        }

        /**
         * and last_login_time between value1 and value2
         *
         * @return
         */
        public Criteria andLastLoginTimeBetween(Date value1, Date value2) {
            if (CheckUtils.isAnyEmpty(value1, value2)) {
                return this;
            }
            super.andBetween("lastLoginTime", value1, value2);
            return this;
        }

        /**
         * and last_login_time not between value1 and value2
         *
         * @return
         */
        public Criteria andLastLoginTimeNotBetween(Date value1, Date value2) {
            if (CheckUtils.isAnyEmpty(value1, value2)) {
                return this;
            }
            super.andNotBetween("lastLoginTime", value1, value2);
            return this;
        }

        /**
         * and last_login_time like value
         *
         * @return
         */
        public Criteria andLastLoginTimeLike(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andLike("lastLoginTime", value);
            return this;
        }

        /**
         * and last_login_time not like value
         *
         * @return
         */
        public Criteria andLastLoginTimeNotLike(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andNotLike("lastLoginTime", value);
            return this;
        }

        /**
         * or last_login_time = value
         *
         * @return
         */
        public Criteria orLastLoginTimeEqualTo(Date value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orEqualTo("lastLoginTime", value);
            return this;
        }

        /**
         * or last_login_time != value
         *
         * @return
         */
        public Criteria orLastLoginTimeNotEqualTo(Date value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orNotEqualTo("lastLoginTime", value);
            return this;
        }

        /**
         * or last_login_time > value
         *
         * @return
         */
        public Criteria orLastLoginTimeGreaterThan(Date value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orGreaterThan("lastLoginTime", value);
            return this;
        }

        /**
         * or last_login_time >= value
         *
         * @return
         */
        public Criteria orLastLoginTimeGreaterThanOrEqualTo(Date value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orGreaterThanOrEqualTo("lastLoginTime", value);
            return this;
        }

        /**
         * or last_login_time < value
         *
         * @return
         */
        public Criteria orLastLoginTimeLessThan(Date value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orLessThan("lastLoginTime", value);
            return this;
        }

        /**
         * or last_login_time <= value
         *
         * @return
         */
        public Criteria orLastLoginTimeLessThanOrEqualTo(Date value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orLessThanOrEqualTo("lastLoginTime", value);
            return this;
        }

        /**
         * or last_login_time in (value1, value2, ...)
         *
         * @return
         */
        public Criteria orLastLoginTimeIn(Iterable<Date> values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            this.orIn("lastLoginTime", values);
            return this;
        }

        /**
         * or last_login_time in (value1, value2, ...)
         *
         * @return
         */
        public Criteria orLastLoginTimeIn(Date[] values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            this.orIn("lastLoginTime", CollectionUtils.initList(values));
            return this;
        }

        /**
         * or last_login_time not in (value1, value2, ...)
         *
         * @return
         */
        public Criteria orLastLoginTimeNotIn(Iterable<Date> values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            this.orNotIn("lastLoginTime", values);
            return this;
        }

        /**
         * or last_login_time not in (value1, value2, ...)
         *
         * @return
         */
        public Criteria orLastLoginTimeNotIn(Date[] values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            this.orNotIn("lastLoginTime", CollectionUtils.initList(values));
            return this;
        }

        /**
         * or last_login_time between value1 and value2
         *
         * @return
         */
        public Criteria orLastLoginTimeBetween(Date value1, Date value2) {
            if (CheckUtils.isAnyEmpty(value1, value2)) {
                return this;
            }
            this.orBetween("lastLoginTime", value1, value2);
            return this;
        }

        /**
         * or last_login_time not between value1 and value2
         *
         * @return
         */
        public Criteria orLastLoginTimeNotBetween(Date value1, Date value2) {
            if (CheckUtils.isAnyEmpty(value1, value2)) {
                return this;
            }
            this.orNotBetween("lastLoginTime", value1, value2);
            return this;
        }

        /**
         * or last_login_time like value
         *
         * @return
         */
        public Criteria orLastLoginTimeLike(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orLike("lastLoginTime", value);
            return this;
        }

        /**
         * or last_login_time not like value
         *
         * @return
         */
        public Criteria orLastLoginTimeNotLike(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orNotLike("lastLoginTime", value);
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
         * and password = ''
         *
         * @return
         */
        public Criteria andPasswordIsEmpty() {
            this.andEqualTo("password", "");
            return this;
        }

        /**
         * and password != ''
         *
         * @return
         */
        public Criteria andPasswordIsNotEmpty() {
            this.andNotEqualTo("password", "");
            return this;
        }

        /**
         * and password = value
         *
         * @return
         */
        public Criteria andPasswordEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.andEqualTo("password", value);
            return this;
        }

        /**
         * and password != value
         *
         * @return
         */
        public Criteria andPasswordNotEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.andNotEqualTo("password", value);
            return this;
        }

        /**
         * and password > value
         *
         * @return
         */
        public Criteria andPasswordGreaterThan(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andGreaterThan("password", value);
            return this;
        }

        /**
         * and password >= value
         *
         * @return
         */
        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andGreaterThanOrEqualTo("password", value);
            return this;
        }

        /**
         * and password < value
         *
         * @return
         */
        public Criteria andPasswordLessThan(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andLessThan("password", value);
            return this;
        }

        /**
         * and password <= value
         *
         * @return
         */
        public Criteria andPasswordLessThanOrEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andLessThanOrEqualTo("password", value);
            return this;
        }

        /**
         * and password in (value1, value2, ...)
         *
         * @return
         */
        public Criteria andPasswordIn(Iterable<String> values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            super.andIn("password", values);
            return this;
        }

        /**
         * and password in (value1, value2, ...)
         *
         * @return
         */
        public Criteria andPasswordIn(String... values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            super.andIn("password", CollectionUtils.initList(values));
            return this;
        }

        /**
         * and password not in (value1, value2, ...)
         *
         * @return
         */
        public Criteria andPasswordNotIn(Iterable<String> values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            super.andNotIn("password", values);
            return this;
        }

        /**
         * and password not in (value1, value2, ...)
         *
         * @return
         */
        public Criteria andPasswordNotIn(String[] values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            super.andNotIn("password", CollectionUtils.initList(values));
            return this;
        }

        /**
         * and password between value1 and value2
         *
         * @return
         */
        public Criteria andPasswordBetween(String value1, String value2) {
            if (CheckUtils.isAnyEmpty(value1, value2)) {
                return this;
            }
            super.andBetween("password", value1, value2);
            return this;
        }

        /**
         * and password not between value1 and value2
         *
         * @return
         */
        public Criteria andPasswordNotBetween(String value1, String value2) {
            if (CheckUtils.isAnyEmpty(value1, value2)) {
                return this;
            }
            super.andNotBetween("password", value1, value2);
            return this;
        }

        /**
         * and password like value
         *
         * @return
         */
        public Criteria andPasswordLike(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andLike("password", value);
            return this;
        }

        /**
         * and password not like value
         *
         * @return
         */
        public Criteria andPasswordNotLike(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andNotLike("password", value);
            return this;
        }

        /**
         * or password = ''
         *
         * @return
         */
        public Criteria orPasswordIsEmpty() {
            this.orEqualTo("password", "");
            return this;
        }

        /**
         * or password != ''
         *
         * @return
         */
        public Criteria orPasswordIsNotEmpty() {
            this.orNotEqualTo("password", "");
            return this;
        }

        /**
         * or password = value
         *
         * @return
         */
        public Criteria orPasswordEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orEqualTo("password", value);
            return this;
        }

        /**
         * or password != value
         *
         * @return
         */
        public Criteria orPasswordNotEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orNotEqualTo("password", value);
            return this;
        }

        /**
         * or password > value
         *
         * @return
         */
        public Criteria orPasswordGreaterThan(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orGreaterThan("password", value);
            return this;
        }

        /**
         * or password >= value
         *
         * @return
         */
        public Criteria orPasswordGreaterThanOrEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orGreaterThanOrEqualTo("password", value);
            return this;
        }

        /**
         * or password < value
         *
         * @return
         */
        public Criteria orPasswordLessThan(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orLessThan("password", value);
            return this;
        }

        /**
         * or password <= value
         *
         * @return
         */
        public Criteria orPasswordLessThanOrEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orLessThanOrEqualTo("password", value);
            return this;
        }

        /**
         * or password in (value1, value2, ...)
         *
         * @return
         */
        public Criteria orPasswordIn(Iterable<String> values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            this.orIn("password", values);
            return this;
        }

        /**
         * or password in (value1, value2, ...)
         *
         * @return
         */
        public Criteria orPasswordIn(String[] values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            this.orIn("password", CollectionUtils.initList(values));
            return this;
        }

        /**
         * or password not in (value1, value2, ...)
         *
         * @return
         */
        public Criteria orPasswordNotIn(Iterable<String> values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            this.orNotIn("password", values);
            return this;
        }

        /**
         * or password not in (value1, value2, ...)
         *
         * @return
         */
        public Criteria orPasswordNotIn(String[] values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            this.orNotIn("password", CollectionUtils.initList(values));
            return this;
        }

        /**
         * or password between value1 and value2
         *
         * @return
         */
        public Criteria orPasswordBetween(String value1, String value2) {
            if (CheckUtils.isAnyEmpty(value1, value2)) {
                return this;
            }
            this.orBetween("password", value1, value2);
            return this;
        }

        /**
         * or password not between value1 and value2
         *
         * @return
         */
        public Criteria orPasswordNotBetween(String value1, String value2) {
            if (CheckUtils.isAnyEmpty(value1, value2)) {
                return this;
            }
            this.orNotBetween("password", value1, value2);
            return this;
        }

        /**
         * or password like value
         *
         * @return
         */
        public Criteria orPasswordLike(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orLike("password", value);
            return this;
        }

        /**
         * or password not like value
         *
         * @return
         */
        public Criteria orPasswordNotLike(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orNotLike("password", value);
            return this;
        }

        /**
         * and avatar = ''
         *
         * @return
         */
        public Criteria andAvatarIsEmpty() {
            this.andEqualTo("avatar", "");
            return this;
        }

        /**
         * and avatar != ''
         *
         * @return
         */
        public Criteria andAvatarIsNotEmpty() {
            this.andNotEqualTo("avatar", "");
            return this;
        }

        /**
         * and avatar = value
         *
         * @return
         */
        public Criteria andAvatarEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.andEqualTo("avatar", value);
            return this;
        }

        /**
         * and avatar != value
         *
         * @return
         */
        public Criteria andAvatarNotEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.andNotEqualTo("avatar", value);
            return this;
        }

        /**
         * and avatar > value
         *
         * @return
         */
        public Criteria andAvatarGreaterThan(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andGreaterThan("avatar", value);
            return this;
        }

        /**
         * and avatar >= value
         *
         * @return
         */
        public Criteria andAvatarGreaterThanOrEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andGreaterThanOrEqualTo("avatar", value);
            return this;
        }

        /**
         * and avatar < value
         *
         * @return
         */
        public Criteria andAvatarLessThan(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andLessThan("avatar", value);
            return this;
        }

        /**
         * and avatar <= value
         *
         * @return
         */
        public Criteria andAvatarLessThanOrEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andLessThanOrEqualTo("avatar", value);
            return this;
        }

        /**
         * and avatar in (value1, value2, ...)
         *
         * @return
         */
        public Criteria andAvatarIn(Iterable<String> values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            super.andIn("avatar", values);
            return this;
        }

        /**
         * and avatar in (value1, value2, ...)
         *
         * @return
         */
        public Criteria andAvatarIn(String... values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            super.andIn("avatar", CollectionUtils.initList(values));
            return this;
        }

        /**
         * and avatar not in (value1, value2, ...)
         *
         * @return
         */
        public Criteria andAvatarNotIn(Iterable<String> values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            super.andNotIn("avatar", values);
            return this;
        }

        /**
         * and avatar not in (value1, value2, ...)
         *
         * @return
         */
        public Criteria andAvatarNotIn(String[] values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            super.andNotIn("avatar", CollectionUtils.initList(values));
            return this;
        }

        /**
         * and avatar between value1 and value2
         *
         * @return
         */
        public Criteria andAvatarBetween(String value1, String value2) {
            if (CheckUtils.isAnyEmpty(value1, value2)) {
                return this;
            }
            super.andBetween("avatar", value1, value2);
            return this;
        }

        /**
         * and avatar not between value1 and value2
         *
         * @return
         */
        public Criteria andAvatarNotBetween(String value1, String value2) {
            if (CheckUtils.isAnyEmpty(value1, value2)) {
                return this;
            }
            super.andNotBetween("avatar", value1, value2);
            return this;
        }

        /**
         * and avatar like value
         *
         * @return
         */
        public Criteria andAvatarLike(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andLike("avatar", value);
            return this;
        }

        /**
         * and avatar not like value
         *
         * @return
         */
        public Criteria andAvatarNotLike(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andNotLike("avatar", value);
            return this;
        }

        /**
         * or avatar = ''
         *
         * @return
         */
        public Criteria orAvatarIsEmpty() {
            this.orEqualTo("avatar", "");
            return this;
        }

        /**
         * or avatar != ''
         *
         * @return
         */
        public Criteria orAvatarIsNotEmpty() {
            this.orNotEqualTo("avatar", "");
            return this;
        }

        /**
         * or avatar = value
         *
         * @return
         */
        public Criteria orAvatarEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orEqualTo("avatar", value);
            return this;
        }

        /**
         * or avatar != value
         *
         * @return
         */
        public Criteria orAvatarNotEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orNotEqualTo("avatar", value);
            return this;
        }

        /**
         * or avatar > value
         *
         * @return
         */
        public Criteria orAvatarGreaterThan(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orGreaterThan("avatar", value);
            return this;
        }

        /**
         * or avatar >= value
         *
         * @return
         */
        public Criteria orAvatarGreaterThanOrEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orGreaterThanOrEqualTo("avatar", value);
            return this;
        }

        /**
         * or avatar < value
         *
         * @return
         */
        public Criteria orAvatarLessThan(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orLessThan("avatar", value);
            return this;
        }

        /**
         * or avatar <= value
         *
         * @return
         */
        public Criteria orAvatarLessThanOrEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orLessThanOrEqualTo("avatar", value);
            return this;
        }

        /**
         * or avatar in (value1, value2, ...)
         *
         * @return
         */
        public Criteria orAvatarIn(Iterable<String> values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            this.orIn("avatar", values);
            return this;
        }

        /**
         * or avatar in (value1, value2, ...)
         *
         * @return
         */
        public Criteria orAvatarIn(String[] values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            this.orIn("avatar", CollectionUtils.initList(values));
            return this;
        }

        /**
         * or avatar not in (value1, value2, ...)
         *
         * @return
         */
        public Criteria orAvatarNotIn(Iterable<String> values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            this.orNotIn("avatar", values);
            return this;
        }

        /**
         * or avatar not in (value1, value2, ...)
         *
         * @return
         */
        public Criteria orAvatarNotIn(String[] values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            this.orNotIn("avatar", CollectionUtils.initList(values));
            return this;
        }

        /**
         * or avatar between value1 and value2
         *
         * @return
         */
        public Criteria orAvatarBetween(String value1, String value2) {
            if (CheckUtils.isAnyEmpty(value1, value2)) {
                return this;
            }
            this.orBetween("avatar", value1, value2);
            return this;
        }

        /**
         * or avatar not between value1 and value2
         *
         * @return
         */
        public Criteria orAvatarNotBetween(String value1, String value2) {
            if (CheckUtils.isAnyEmpty(value1, value2)) {
                return this;
            }
            this.orNotBetween("avatar", value1, value2);
            return this;
        }

        /**
         * or avatar like value
         *
         * @return
         */
        public Criteria orAvatarLike(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orLike("avatar", value);
            return this;
        }

        /**
         * or avatar not like value
         *
         * @return
         */
        public Criteria orAvatarNotLike(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orNotLike("avatar", value);
            return this;
        }

        /**
         * and status = value
         *
         * @return
         */
        public Criteria andStatusEqualTo(Integer value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.andEqualTo("status", value);
            return this;
        }

        /**
         * and status != value
         *
         * @return
         */
        public Criteria andStatusNotEqualTo(Integer value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.andNotEqualTo("status", value);
            return this;
        }

        /**
         * and status > value
         *
         * @return
         */
        public Criteria andStatusGreaterThan(Integer value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andGreaterThan("status", value);
            return this;
        }

        /**
         * and status >= value
         *
         * @return
         */
        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andGreaterThanOrEqualTo("status", value);
            return this;
        }

        /**
         * and status < value
         *
         * @return
         */
        public Criteria andStatusLessThan(Integer value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andLessThan("status", value);
            return this;
        }

        /**
         * and status <= value
         *
         * @return
         */
        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andLessThanOrEqualTo("status", value);
            return this;
        }

        /**
         * and status in (value1, value2, ...)
         *
         * @return
         */
        public Criteria andStatusIn(Iterable<Integer> values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            super.andIn("status", values);
            return this;
        }

        /**
         * and status in (value1, value2, ...)
         *
         * @return
         */
        public Criteria andStatusIn(Integer... values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            super.andIn("status", CollectionUtils.initList(values));
            return this;
        }

        /**
         * and status not in (value1, value2, ...)
         *
         * @return
         */
        public Criteria andStatusNotIn(Iterable<Integer> values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            super.andNotIn("status", values);
            return this;
        }

        /**
         * and status not in (value1, value2, ...)
         *
         * @return
         */
        public Criteria andStatusNotIn(Integer[] values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            super.andNotIn("status", CollectionUtils.initList(values));
            return this;
        }

        /**
         * and status between value1 and value2
         *
         * @return
         */
        public Criteria andStatusBetween(Integer value1, Integer value2) {
            if (CheckUtils.isAnyEmpty(value1, value2)) {
                return this;
            }
            super.andBetween("status", value1, value2);
            return this;
        }

        /**
         * and status not between value1 and value2
         *
         * @return
         */
        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            if (CheckUtils.isAnyEmpty(value1, value2)) {
                return this;
            }
            super.andNotBetween("status", value1, value2);
            return this;
        }

        /**
         * and status like value
         *
         * @return
         */
        public Criteria andStatusLike(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andLike("status", value);
            return this;
        }

        /**
         * and status not like value
         *
         * @return
         */
        public Criteria andStatusNotLike(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andNotLike("status", value);
            return this;
        }

        /**
         * or status = value
         *
         * @return
         */
        public Criteria orStatusEqualTo(Integer value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orEqualTo("status", value);
            return this;
        }

        /**
         * or status != value
         *
         * @return
         */
        public Criteria orStatusNotEqualTo(Integer value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orNotEqualTo("status", value);
            return this;
        }

        /**
         * or status > value
         *
         * @return
         */
        public Criteria orStatusGreaterThan(Integer value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orGreaterThan("status", value);
            return this;
        }

        /**
         * or status >= value
         *
         * @return
         */
        public Criteria orStatusGreaterThanOrEqualTo(Integer value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orGreaterThanOrEqualTo("status", value);
            return this;
        }

        /**
         * or status < value
         *
         * @return
         */
        public Criteria orStatusLessThan(Integer value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orLessThan("status", value);
            return this;
        }

        /**
         * or status <= value
         *
         * @return
         */
        public Criteria orStatusLessThanOrEqualTo(Integer value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orLessThanOrEqualTo("status", value);
            return this;
        }

        /**
         * or status in (value1, value2, ...)
         *
         * @return
         */
        public Criteria orStatusIn(Iterable<Integer> values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            this.orIn("status", values);
            return this;
        }

        /**
         * or status in (value1, value2, ...)
         *
         * @return
         */
        public Criteria orStatusIn(Integer[] values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            this.orIn("status", CollectionUtils.initList(values));
            return this;
        }

        /**
         * or status not in (value1, value2, ...)
         *
         * @return
         */
        public Criteria orStatusNotIn(Iterable<Integer> values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            this.orNotIn("status", values);
            return this;
        }

        /**
         * or status not in (value1, value2, ...)
         *
         * @return
         */
        public Criteria orStatusNotIn(Integer[] values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            this.orNotIn("status", CollectionUtils.initList(values));
            return this;
        }

        /**
         * or status between value1 and value2
         *
         * @return
         */
        public Criteria orStatusBetween(Integer value1, Integer value2) {
            if (CheckUtils.isAnyEmpty(value1, value2)) {
                return this;
            }
            this.orBetween("status", value1, value2);
            return this;
        }

        /**
         * or status not between value1 and value2
         *
         * @return
         */
        public Criteria orStatusNotBetween(Integer value1, Integer value2) {
            if (CheckUtils.isAnyEmpty(value1, value2)) {
                return this;
            }
            this.orNotBetween("status", value1, value2);
            return this;
        }

        /**
         * or status like value
         *
         * @return
         */
        public Criteria orStatusLike(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orLike("status", value);
            return this;
        }

        /**
         * or status not like value
         *
         * @return
         */
        public Criteria orStatusNotLike(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orNotLike("status", value);
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
