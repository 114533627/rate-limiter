package cn.caijiajia.ratelimiter.example;

import cn.caijiajia.ratelimiter.core.common.util.CheckUtils;
import cn.caijiajia.ratelimiter.core.common.util.CollectionUtils;
import cn.caijiajia.ratelimiter.core.mybatis.example.AbstractExample;
import cn.caijiajia.ratelimiter.model.Role;
import tk.mybatis.mapper.entity.EntityColumn;
import tk.mybatis.mapper.entity.Example;

import java.util.Map;
import java.util.Date;

/**
 * role 角色
 *
 * @author xh
 * @since 2021/01/19
 */
public class RoleExample extends AbstractExample<Role> {

    /**
     * 排序
     */
    protected OrderBy ORDER_BY;

    public RoleExample() {
        super(Role.class);
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
         * order by role_name
         *
         * @return
         */
        public OrderBy roleName() {
            this.orderBy("roleName");
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
        
        /**
         * order by role_code
         *
         * @return
         */
        public OrderBy roleCode() {
            this.orderBy("roleCode");
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
         * and role_name = ''
         *
         * @return
         */
        public Criteria andRoleNameIsEmpty() {
            this.andEqualTo("roleName", "");
            return this;
        }

        /**
         * and role_name != ''
         *
         * @return
         */
        public Criteria andRoleNameIsNotEmpty() {
            this.andNotEqualTo("roleName", "");
            return this;
        }

        /**
         * and role_name = value
         *
         * @return
         */
        public Criteria andRoleNameEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.andEqualTo("roleName", value);
            return this;
        }

        /**
         * and role_name != value
         *
         * @return
         */
        public Criteria andRoleNameNotEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.andNotEqualTo("roleName", value);
            return this;
        }

        /**
         * and role_name > value
         *
         * @return
         */
        public Criteria andRoleNameGreaterThan(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andGreaterThan("roleName", value);
            return this;
        }

        /**
         * and role_name >= value
         *
         * @return
         */
        public Criteria andRoleNameGreaterThanOrEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andGreaterThanOrEqualTo("roleName", value);
            return this;
        }

        /**
         * and role_name < value
         *
         * @return
         */
        public Criteria andRoleNameLessThan(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andLessThan("roleName", value);
            return this;
        }

        /**
         * and role_name <= value
         *
         * @return
         */
        public Criteria andRoleNameLessThanOrEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andLessThanOrEqualTo("roleName", value);
            return this;
        }

        /**
         * and role_name in (value1, value2, ...)
         *
         * @return
         */
        public Criteria andRoleNameIn(Iterable<String> values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            super.andIn("roleName", values);
            return this;
        }

        /**
         * and role_name in (value1, value2, ...)
         *
         * @return
         */
        public Criteria andRoleNameIn(String... values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            super.andIn("roleName", CollectionUtils.initList(values));
            return this;
        }

        /**
         * and role_name not in (value1, value2, ...)
         *
         * @return
         */
        public Criteria andRoleNameNotIn(Iterable<String> values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            super.andNotIn("roleName", values);
            return this;
        }

        /**
         * and role_name not in (value1, value2, ...)
         *
         * @return
         */
        public Criteria andRoleNameNotIn(String[] values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            super.andNotIn("roleName", CollectionUtils.initList(values));
            return this;
        }

        /**
         * and role_name between value1 and value2
         *
         * @return
         */
        public Criteria andRoleNameBetween(String value1, String value2) {
            if (CheckUtils.isAnyEmpty(value1, value2)) {
                return this;
            }
            super.andBetween("roleName", value1, value2);
            return this;
        }

        /**
         * and role_name not between value1 and value2
         *
         * @return
         */
        public Criteria andRoleNameNotBetween(String value1, String value2) {
            if (CheckUtils.isAnyEmpty(value1, value2)) {
                return this;
            }
            super.andNotBetween("roleName", value1, value2);
            return this;
        }

        /**
         * and role_name like value
         *
         * @return
         */
        public Criteria andRoleNameLike(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andLike("roleName", value);
            return this;
        }

        /**
         * and role_name not like value
         *
         * @return
         */
        public Criteria andRoleNameNotLike(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andNotLike("roleName", value);
            return this;
        }

        /**
         * or role_name = ''
         *
         * @return
         */
        public Criteria orRoleNameIsEmpty() {
            this.orEqualTo("roleName", "");
            return this;
        }

        /**
         * or role_name != ''
         *
         * @return
         */
        public Criteria orRoleNameIsNotEmpty() {
            this.orNotEqualTo("roleName", "");
            return this;
        }

        /**
         * or role_name = value
         *
         * @return
         */
        public Criteria orRoleNameEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orEqualTo("roleName", value);
            return this;
        }

        /**
         * or role_name != value
         *
         * @return
         */
        public Criteria orRoleNameNotEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orNotEqualTo("roleName", value);
            return this;
        }

        /**
         * or role_name > value
         *
         * @return
         */
        public Criteria orRoleNameGreaterThan(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orGreaterThan("roleName", value);
            return this;
        }

        /**
         * or role_name >= value
         *
         * @return
         */
        public Criteria orRoleNameGreaterThanOrEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orGreaterThanOrEqualTo("roleName", value);
            return this;
        }

        /**
         * or role_name < value
         *
         * @return
         */
        public Criteria orRoleNameLessThan(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orLessThan("roleName", value);
            return this;
        }

        /**
         * or role_name <= value
         *
         * @return
         */
        public Criteria orRoleNameLessThanOrEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orLessThanOrEqualTo("roleName", value);
            return this;
        }

        /**
         * or role_name in (value1, value2, ...)
         *
         * @return
         */
        public Criteria orRoleNameIn(Iterable<String> values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            this.orIn("roleName", values);
            return this;
        }

        /**
         * or role_name in (value1, value2, ...)
         *
         * @return
         */
        public Criteria orRoleNameIn(String[] values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            this.orIn("roleName", CollectionUtils.initList(values));
            return this;
        }

        /**
         * or role_name not in (value1, value2, ...)
         *
         * @return
         */
        public Criteria orRoleNameNotIn(Iterable<String> values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            this.orNotIn("roleName", values);
            return this;
        }

        /**
         * or role_name not in (value1, value2, ...)
         *
         * @return
         */
        public Criteria orRoleNameNotIn(String[] values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            this.orNotIn("roleName", CollectionUtils.initList(values));
            return this;
        }

        /**
         * or role_name between value1 and value2
         *
         * @return
         */
        public Criteria orRoleNameBetween(String value1, String value2) {
            if (CheckUtils.isAnyEmpty(value1, value2)) {
                return this;
            }
            this.orBetween("roleName", value1, value2);
            return this;
        }

        /**
         * or role_name not between value1 and value2
         *
         * @return
         */
        public Criteria orRoleNameNotBetween(String value1, String value2) {
            if (CheckUtils.isAnyEmpty(value1, value2)) {
                return this;
            }
            this.orNotBetween("roleName", value1, value2);
            return this;
        }

        /**
         * or role_name like value
         *
         * @return
         */
        public Criteria orRoleNameLike(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orLike("roleName", value);
            return this;
        }

        /**
         * or role_name not like value
         *
         * @return
         */
        public Criteria orRoleNameNotLike(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orNotLike("roleName", value);
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
         * and role_code = ''
         *
         * @return
         */
        public Criteria andRoleCodeIsEmpty() {
            this.andEqualTo("roleCode", "");
            return this;
        }

        /**
         * and role_code != ''
         *
         * @return
         */
        public Criteria andRoleCodeIsNotEmpty() {
            this.andNotEqualTo("roleCode", "");
            return this;
        }

        /**
         * and role_code = value
         *
         * @return
         */
        public Criteria andRoleCodeEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.andEqualTo("roleCode", value);
            return this;
        }

        /**
         * and role_code != value
         *
         * @return
         */
        public Criteria andRoleCodeNotEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.andNotEqualTo("roleCode", value);
            return this;
        }

        /**
         * and role_code > value
         *
         * @return
         */
        public Criteria andRoleCodeGreaterThan(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andGreaterThan("roleCode", value);
            return this;
        }

        /**
         * and role_code >= value
         *
         * @return
         */
        public Criteria andRoleCodeGreaterThanOrEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andGreaterThanOrEqualTo("roleCode", value);
            return this;
        }

        /**
         * and role_code < value
         *
         * @return
         */
        public Criteria andRoleCodeLessThan(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andLessThan("roleCode", value);
            return this;
        }

        /**
         * and role_code <= value
         *
         * @return
         */
        public Criteria andRoleCodeLessThanOrEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andLessThanOrEqualTo("roleCode", value);
            return this;
        }

        /**
         * and role_code in (value1, value2, ...)
         *
         * @return
         */
        public Criteria andRoleCodeIn(Iterable<String> values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            super.andIn("roleCode", values);
            return this;
        }

        /**
         * and role_code in (value1, value2, ...)
         *
         * @return
         */
        public Criteria andRoleCodeIn(String... values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            super.andIn("roleCode", CollectionUtils.initList(values));
            return this;
        }

        /**
         * and role_code not in (value1, value2, ...)
         *
         * @return
         */
        public Criteria andRoleCodeNotIn(Iterable<String> values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            super.andNotIn("roleCode", values);
            return this;
        }

        /**
         * and role_code not in (value1, value2, ...)
         *
         * @return
         */
        public Criteria andRoleCodeNotIn(String[] values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            super.andNotIn("roleCode", CollectionUtils.initList(values));
            return this;
        }

        /**
         * and role_code between value1 and value2
         *
         * @return
         */
        public Criteria andRoleCodeBetween(String value1, String value2) {
            if (CheckUtils.isAnyEmpty(value1, value2)) {
                return this;
            }
            super.andBetween("roleCode", value1, value2);
            return this;
        }

        /**
         * and role_code not between value1 and value2
         *
         * @return
         */
        public Criteria andRoleCodeNotBetween(String value1, String value2) {
            if (CheckUtils.isAnyEmpty(value1, value2)) {
                return this;
            }
            super.andNotBetween("roleCode", value1, value2);
            return this;
        }

        /**
         * and role_code like value
         *
         * @return
         */
        public Criteria andRoleCodeLike(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andLike("roleCode", value);
            return this;
        }

        /**
         * and role_code not like value
         *
         * @return
         */
        public Criteria andRoleCodeNotLike(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andNotLike("roleCode", value);
            return this;
        }

        /**
         * or role_code = ''
         *
         * @return
         */
        public Criteria orRoleCodeIsEmpty() {
            this.orEqualTo("roleCode", "");
            return this;
        }

        /**
         * or role_code != ''
         *
         * @return
         */
        public Criteria orRoleCodeIsNotEmpty() {
            this.orNotEqualTo("roleCode", "");
            return this;
        }

        /**
         * or role_code = value
         *
         * @return
         */
        public Criteria orRoleCodeEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orEqualTo("roleCode", value);
            return this;
        }

        /**
         * or role_code != value
         *
         * @return
         */
        public Criteria orRoleCodeNotEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orNotEqualTo("roleCode", value);
            return this;
        }

        /**
         * or role_code > value
         *
         * @return
         */
        public Criteria orRoleCodeGreaterThan(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orGreaterThan("roleCode", value);
            return this;
        }

        /**
         * or role_code >= value
         *
         * @return
         */
        public Criteria orRoleCodeGreaterThanOrEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orGreaterThanOrEqualTo("roleCode", value);
            return this;
        }

        /**
         * or role_code < value
         *
         * @return
         */
        public Criteria orRoleCodeLessThan(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orLessThan("roleCode", value);
            return this;
        }

        /**
         * or role_code <= value
         *
         * @return
         */
        public Criteria orRoleCodeLessThanOrEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orLessThanOrEqualTo("roleCode", value);
            return this;
        }

        /**
         * or role_code in (value1, value2, ...)
         *
         * @return
         */
        public Criteria orRoleCodeIn(Iterable<String> values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            this.orIn("roleCode", values);
            return this;
        }

        /**
         * or role_code in (value1, value2, ...)
         *
         * @return
         */
        public Criteria orRoleCodeIn(String[] values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            this.orIn("roleCode", CollectionUtils.initList(values));
            return this;
        }

        /**
         * or role_code not in (value1, value2, ...)
         *
         * @return
         */
        public Criteria orRoleCodeNotIn(Iterable<String> values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            this.orNotIn("roleCode", values);
            return this;
        }

        /**
         * or role_code not in (value1, value2, ...)
         *
         * @return
         */
        public Criteria orRoleCodeNotIn(String[] values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            this.orNotIn("roleCode", CollectionUtils.initList(values));
            return this;
        }

        /**
         * or role_code between value1 and value2
         *
         * @return
         */
        public Criteria orRoleCodeBetween(String value1, String value2) {
            if (CheckUtils.isAnyEmpty(value1, value2)) {
                return this;
            }
            this.orBetween("roleCode", value1, value2);
            return this;
        }

        /**
         * or role_code not between value1 and value2
         *
         * @return
         */
        public Criteria orRoleCodeNotBetween(String value1, String value2) {
            if (CheckUtils.isAnyEmpty(value1, value2)) {
                return this;
            }
            this.orNotBetween("roleCode", value1, value2);
            return this;
        }

        /**
         * or role_code like value
         *
         * @return
         */
        public Criteria orRoleCodeLike(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orLike("roleCode", value);
            return this;
        }

        /**
         * or role_code not like value
         *
         * @return
         */
        public Criteria orRoleCodeNotLike(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orNotLike("roleCode", value);
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
