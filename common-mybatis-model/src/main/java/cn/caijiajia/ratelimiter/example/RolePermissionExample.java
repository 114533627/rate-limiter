package cn.caijiajia.ratelimiter.example;

import cn.caijiajia.ratelimiter.core.common.util.CheckUtils;
import cn.caijiajia.ratelimiter.core.common.util.CollectionUtils;
import cn.caijiajia.ratelimiter.core.mybatis.example.AbstractExample;
import cn.caijiajia.ratelimiter.model.RolePermission;
import tk.mybatis.mapper.entity.EntityColumn;
import tk.mybatis.mapper.entity.Example;

import java.util.Map;
import java.util.Date;

/**
 * role_permission 角色权限表
 *
 * @author xh
 * @since 2021/01/19
 */
public class RolePermissionExample extends AbstractExample<RolePermission> {

    /**
     * 排序
     */
    protected OrderBy ORDER_BY;

    public RolePermissionExample() {
        super(RolePermission.class);
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
         * order by role_id
         *
         * @return
         */
        public OrderBy roleId() {
            this.orderBy("roleId");
            return this;
        }
        
        /**
         * order by permission_id
         *
         * @return
         */
        public OrderBy permissionId() {
            this.orderBy("permissionId");
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
         * order by create_date
         *
         * @return
         */
        public OrderBy createDate() {
            this.orderBy("createDate");
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
         * and role_id = value
         *
         * @return
         */
        public Criteria andRoleIdEqualTo(Long value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.andEqualTo("roleId", value);
            return this;
        }

        /**
         * and role_id != value
         *
         * @return
         */
        public Criteria andRoleIdNotEqualTo(Long value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.andNotEqualTo("roleId", value);
            return this;
        }

        /**
         * and role_id > value
         *
         * @return
         */
        public Criteria andRoleIdGreaterThan(Long value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andGreaterThan("roleId", value);
            return this;
        }

        /**
         * and role_id >= value
         *
         * @return
         */
        public Criteria andRoleIdGreaterThanOrEqualTo(Long value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andGreaterThanOrEqualTo("roleId", value);
            return this;
        }

        /**
         * and role_id < value
         *
         * @return
         */
        public Criteria andRoleIdLessThan(Long value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andLessThan("roleId", value);
            return this;
        }

        /**
         * and role_id <= value
         *
         * @return
         */
        public Criteria andRoleIdLessThanOrEqualTo(Long value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andLessThanOrEqualTo("roleId", value);
            return this;
        }

        /**
         * and role_id in (value1, value2, ...)
         *
         * @return
         */
        public Criteria andRoleIdIn(Iterable<Long> values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            super.andIn("roleId", values);
            return this;
        }

        /**
         * and role_id in (value1, value2, ...)
         *
         * @return
         */
        public Criteria andRoleIdIn(Long... values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            super.andIn("roleId", CollectionUtils.initList(values));
            return this;
        }

        /**
         * and role_id not in (value1, value2, ...)
         *
         * @return
         */
        public Criteria andRoleIdNotIn(Iterable<Long> values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            super.andNotIn("roleId", values);
            return this;
        }

        /**
         * and role_id not in (value1, value2, ...)
         *
         * @return
         */
        public Criteria andRoleIdNotIn(Long[] values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            super.andNotIn("roleId", CollectionUtils.initList(values));
            return this;
        }

        /**
         * and role_id between value1 and value2
         *
         * @return
         */
        public Criteria andRoleIdBetween(Long value1, Long value2) {
            if (CheckUtils.isAnyEmpty(value1, value2)) {
                return this;
            }
            super.andBetween("roleId", value1, value2);
            return this;
        }

        /**
         * and role_id not between value1 and value2
         *
         * @return
         */
        public Criteria andRoleIdNotBetween(Long value1, Long value2) {
            if (CheckUtils.isAnyEmpty(value1, value2)) {
                return this;
            }
            super.andNotBetween("roleId", value1, value2);
            return this;
        }

        /**
         * and role_id like value
         *
         * @return
         */
        public Criteria andRoleIdLike(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andLike("roleId", value);
            return this;
        }

        /**
         * and role_id not like value
         *
         * @return
         */
        public Criteria andRoleIdNotLike(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andNotLike("roleId", value);
            return this;
        }

        /**
         * or role_id = value
         *
         * @return
         */
        public Criteria orRoleIdEqualTo(Long value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orEqualTo("roleId", value);
            return this;
        }

        /**
         * or role_id != value
         *
         * @return
         */
        public Criteria orRoleIdNotEqualTo(Long value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orNotEqualTo("roleId", value);
            return this;
        }

        /**
         * or role_id > value
         *
         * @return
         */
        public Criteria orRoleIdGreaterThan(Long value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orGreaterThan("roleId", value);
            return this;
        }

        /**
         * or role_id >= value
         *
         * @return
         */
        public Criteria orRoleIdGreaterThanOrEqualTo(Long value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orGreaterThanOrEqualTo("roleId", value);
            return this;
        }

        /**
         * or role_id < value
         *
         * @return
         */
        public Criteria orRoleIdLessThan(Long value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orLessThan("roleId", value);
            return this;
        }

        /**
         * or role_id <= value
         *
         * @return
         */
        public Criteria orRoleIdLessThanOrEqualTo(Long value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orLessThanOrEqualTo("roleId", value);
            return this;
        }

        /**
         * or role_id in (value1, value2, ...)
         *
         * @return
         */
        public Criteria orRoleIdIn(Iterable<Long> values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            this.orIn("roleId", values);
            return this;
        }

        /**
         * or role_id in (value1, value2, ...)
         *
         * @return
         */
        public Criteria orRoleIdIn(Long[] values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            this.orIn("roleId", CollectionUtils.initList(values));
            return this;
        }

        /**
         * or role_id not in (value1, value2, ...)
         *
         * @return
         */
        public Criteria orRoleIdNotIn(Iterable<Long> values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            this.orNotIn("roleId", values);
            return this;
        }

        /**
         * or role_id not in (value1, value2, ...)
         *
         * @return
         */
        public Criteria orRoleIdNotIn(Long[] values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            this.orNotIn("roleId", CollectionUtils.initList(values));
            return this;
        }

        /**
         * or role_id between value1 and value2
         *
         * @return
         */
        public Criteria orRoleIdBetween(Long value1, Long value2) {
            if (CheckUtils.isAnyEmpty(value1, value2)) {
                return this;
            }
            this.orBetween("roleId", value1, value2);
            return this;
        }

        /**
         * or role_id not between value1 and value2
         *
         * @return
         */
        public Criteria orRoleIdNotBetween(Long value1, Long value2) {
            if (CheckUtils.isAnyEmpty(value1, value2)) {
                return this;
            }
            this.orNotBetween("roleId", value1, value2);
            return this;
        }

        /**
         * or role_id like value
         *
         * @return
         */
        public Criteria orRoleIdLike(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orLike("roleId", value);
            return this;
        }

        /**
         * or role_id not like value
         *
         * @return
         */
        public Criteria orRoleIdNotLike(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orNotLike("roleId", value);
            return this;
        }

        /**
         * and permission_id = value
         *
         * @return
         */
        public Criteria andPermissionIdEqualTo(Long value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.andEqualTo("permissionId", value);
            return this;
        }

        /**
         * and permission_id != value
         *
         * @return
         */
        public Criteria andPermissionIdNotEqualTo(Long value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.andNotEqualTo("permissionId", value);
            return this;
        }

        /**
         * and permission_id > value
         *
         * @return
         */
        public Criteria andPermissionIdGreaterThan(Long value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andGreaterThan("permissionId", value);
            return this;
        }

        /**
         * and permission_id >= value
         *
         * @return
         */
        public Criteria andPermissionIdGreaterThanOrEqualTo(Long value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andGreaterThanOrEqualTo("permissionId", value);
            return this;
        }

        /**
         * and permission_id < value
         *
         * @return
         */
        public Criteria andPermissionIdLessThan(Long value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andLessThan("permissionId", value);
            return this;
        }

        /**
         * and permission_id <= value
         *
         * @return
         */
        public Criteria andPermissionIdLessThanOrEqualTo(Long value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andLessThanOrEqualTo("permissionId", value);
            return this;
        }

        /**
         * and permission_id in (value1, value2, ...)
         *
         * @return
         */
        public Criteria andPermissionIdIn(Iterable<Long> values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            super.andIn("permissionId", values);
            return this;
        }

        /**
         * and permission_id in (value1, value2, ...)
         *
         * @return
         */
        public Criteria andPermissionIdIn(Long... values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            super.andIn("permissionId", CollectionUtils.initList(values));
            return this;
        }

        /**
         * and permission_id not in (value1, value2, ...)
         *
         * @return
         */
        public Criteria andPermissionIdNotIn(Iterable<Long> values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            super.andNotIn("permissionId", values);
            return this;
        }

        /**
         * and permission_id not in (value1, value2, ...)
         *
         * @return
         */
        public Criteria andPermissionIdNotIn(Long[] values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            super.andNotIn("permissionId", CollectionUtils.initList(values));
            return this;
        }

        /**
         * and permission_id between value1 and value2
         *
         * @return
         */
        public Criteria andPermissionIdBetween(Long value1, Long value2) {
            if (CheckUtils.isAnyEmpty(value1, value2)) {
                return this;
            }
            super.andBetween("permissionId", value1, value2);
            return this;
        }

        /**
         * and permission_id not between value1 and value2
         *
         * @return
         */
        public Criteria andPermissionIdNotBetween(Long value1, Long value2) {
            if (CheckUtils.isAnyEmpty(value1, value2)) {
                return this;
            }
            super.andNotBetween("permissionId", value1, value2);
            return this;
        }

        /**
         * and permission_id like value
         *
         * @return
         */
        public Criteria andPermissionIdLike(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andLike("permissionId", value);
            return this;
        }

        /**
         * and permission_id not like value
         *
         * @return
         */
        public Criteria andPermissionIdNotLike(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andNotLike("permissionId", value);
            return this;
        }

        /**
         * or permission_id = value
         *
         * @return
         */
        public Criteria orPermissionIdEqualTo(Long value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orEqualTo("permissionId", value);
            return this;
        }

        /**
         * or permission_id != value
         *
         * @return
         */
        public Criteria orPermissionIdNotEqualTo(Long value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orNotEqualTo("permissionId", value);
            return this;
        }

        /**
         * or permission_id > value
         *
         * @return
         */
        public Criteria orPermissionIdGreaterThan(Long value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orGreaterThan("permissionId", value);
            return this;
        }

        /**
         * or permission_id >= value
         *
         * @return
         */
        public Criteria orPermissionIdGreaterThanOrEqualTo(Long value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orGreaterThanOrEqualTo("permissionId", value);
            return this;
        }

        /**
         * or permission_id < value
         *
         * @return
         */
        public Criteria orPermissionIdLessThan(Long value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orLessThan("permissionId", value);
            return this;
        }

        /**
         * or permission_id <= value
         *
         * @return
         */
        public Criteria orPermissionIdLessThanOrEqualTo(Long value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orLessThanOrEqualTo("permissionId", value);
            return this;
        }

        /**
         * or permission_id in (value1, value2, ...)
         *
         * @return
         */
        public Criteria orPermissionIdIn(Iterable<Long> values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            this.orIn("permissionId", values);
            return this;
        }

        /**
         * or permission_id in (value1, value2, ...)
         *
         * @return
         */
        public Criteria orPermissionIdIn(Long[] values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            this.orIn("permissionId", CollectionUtils.initList(values));
            return this;
        }

        /**
         * or permission_id not in (value1, value2, ...)
         *
         * @return
         */
        public Criteria orPermissionIdNotIn(Iterable<Long> values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            this.orNotIn("permissionId", values);
            return this;
        }

        /**
         * or permission_id not in (value1, value2, ...)
         *
         * @return
         */
        public Criteria orPermissionIdNotIn(Long[] values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            this.orNotIn("permissionId", CollectionUtils.initList(values));
            return this;
        }

        /**
         * or permission_id between value1 and value2
         *
         * @return
         */
        public Criteria orPermissionIdBetween(Long value1, Long value2) {
            if (CheckUtils.isAnyEmpty(value1, value2)) {
                return this;
            }
            this.orBetween("permissionId", value1, value2);
            return this;
        }

        /**
         * or permission_id not between value1 and value2
         *
         * @return
         */
        public Criteria orPermissionIdNotBetween(Long value1, Long value2) {
            if (CheckUtils.isAnyEmpty(value1, value2)) {
                return this;
            }
            this.orNotBetween("permissionId", value1, value2);
            return this;
        }

        /**
         * or permission_id like value
         *
         * @return
         */
        public Criteria orPermissionIdLike(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orLike("permissionId", value);
            return this;
        }

        /**
         * or permission_id not like value
         *
         * @return
         */
        public Criteria orPermissionIdNotLike(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orNotLike("permissionId", value);
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
