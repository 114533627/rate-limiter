package cn.caijiajia.ratelimiter.example;

import cn.caijiajia.ratelimiter.core.common.util.CheckUtils;
import cn.caijiajia.ratelimiter.core.common.util.CollectionUtils;
import cn.caijiajia.ratelimiter.core.mybatis.example.AbstractExample;
import cn.caijiajia.ratelimiter.model.Permission;
import tk.mybatis.mapper.entity.EntityColumn;
import tk.mybatis.mapper.entity.Example;

import java.util.Map;
import java.util.Date;

/**
 * permission 权限表
 *
 * @author xh
 * @since 2021/01/19
 */
public class PermissionExample extends AbstractExample<Permission> {

    /**
     * 排序
     */
    protected OrderBy ORDER_BY;

    public PermissionExample() {
        super(Permission.class);
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
         * order by permission_code
         *
         * @return
         */
        public OrderBy permissionCode() {
            this.orderBy("permissionCode");
            return this;
        }
        
        /**
         * order by permission_name
         *
         * @return
         */
        public OrderBy permissionName() {
            this.orderBy("permissionName");
            return this;
        }
        
        /**
         * order by resource_level
         *
         * @return
         */
        public OrderBy resourceLevel() {
            this.orderBy("resourceLevel");
            return this;
        }
        
        /**
         * order by description
         *
         * @return
         */
        public OrderBy description() {
            this.orderBy("description");
            return this;
        }
        
        /**
         * order by parent_id
         *
         * @return
         */
        public OrderBy parentId() {
            this.orderBy("parentId");
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
         * and permission_code = ''
         *
         * @return
         */
        public Criteria andPermissionCodeIsEmpty() {
            this.andEqualTo("permissionCode", "");
            return this;
        }

        /**
         * and permission_code != ''
         *
         * @return
         */
        public Criteria andPermissionCodeIsNotEmpty() {
            this.andNotEqualTo("permissionCode", "");
            return this;
        }

        /**
         * and permission_code = value
         *
         * @return
         */
        public Criteria andPermissionCodeEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.andEqualTo("permissionCode", value);
            return this;
        }

        /**
         * and permission_code != value
         *
         * @return
         */
        public Criteria andPermissionCodeNotEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.andNotEqualTo("permissionCode", value);
            return this;
        }

        /**
         * and permission_code > value
         *
         * @return
         */
        public Criteria andPermissionCodeGreaterThan(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andGreaterThan("permissionCode", value);
            return this;
        }

        /**
         * and permission_code >= value
         *
         * @return
         */
        public Criteria andPermissionCodeGreaterThanOrEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andGreaterThanOrEqualTo("permissionCode", value);
            return this;
        }

        /**
         * and permission_code < value
         *
         * @return
         */
        public Criteria andPermissionCodeLessThan(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andLessThan("permissionCode", value);
            return this;
        }

        /**
         * and permission_code <= value
         *
         * @return
         */
        public Criteria andPermissionCodeLessThanOrEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andLessThanOrEqualTo("permissionCode", value);
            return this;
        }

        /**
         * and permission_code in (value1, value2, ...)
         *
         * @return
         */
        public Criteria andPermissionCodeIn(Iterable<String> values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            super.andIn("permissionCode", values);
            return this;
        }

        /**
         * and permission_code in (value1, value2, ...)
         *
         * @return
         */
        public Criteria andPermissionCodeIn(String... values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            super.andIn("permissionCode", CollectionUtils.initList(values));
            return this;
        }

        /**
         * and permission_code not in (value1, value2, ...)
         *
         * @return
         */
        public Criteria andPermissionCodeNotIn(Iterable<String> values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            super.andNotIn("permissionCode", values);
            return this;
        }

        /**
         * and permission_code not in (value1, value2, ...)
         *
         * @return
         */
        public Criteria andPermissionCodeNotIn(String[] values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            super.andNotIn("permissionCode", CollectionUtils.initList(values));
            return this;
        }

        /**
         * and permission_code between value1 and value2
         *
         * @return
         */
        public Criteria andPermissionCodeBetween(String value1, String value2) {
            if (CheckUtils.isAnyEmpty(value1, value2)) {
                return this;
            }
            super.andBetween("permissionCode", value1, value2);
            return this;
        }

        /**
         * and permission_code not between value1 and value2
         *
         * @return
         */
        public Criteria andPermissionCodeNotBetween(String value1, String value2) {
            if (CheckUtils.isAnyEmpty(value1, value2)) {
                return this;
            }
            super.andNotBetween("permissionCode", value1, value2);
            return this;
        }

        /**
         * and permission_code like value
         *
         * @return
         */
        public Criteria andPermissionCodeLike(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andLike("permissionCode", value);
            return this;
        }

        /**
         * and permission_code not like value
         *
         * @return
         */
        public Criteria andPermissionCodeNotLike(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andNotLike("permissionCode", value);
            return this;
        }

        /**
         * or permission_code = ''
         *
         * @return
         */
        public Criteria orPermissionCodeIsEmpty() {
            this.orEqualTo("permissionCode", "");
            return this;
        }

        /**
         * or permission_code != ''
         *
         * @return
         */
        public Criteria orPermissionCodeIsNotEmpty() {
            this.orNotEqualTo("permissionCode", "");
            return this;
        }

        /**
         * or permission_code = value
         *
         * @return
         */
        public Criteria orPermissionCodeEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orEqualTo("permissionCode", value);
            return this;
        }

        /**
         * or permission_code != value
         *
         * @return
         */
        public Criteria orPermissionCodeNotEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orNotEqualTo("permissionCode", value);
            return this;
        }

        /**
         * or permission_code > value
         *
         * @return
         */
        public Criteria orPermissionCodeGreaterThan(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orGreaterThan("permissionCode", value);
            return this;
        }

        /**
         * or permission_code >= value
         *
         * @return
         */
        public Criteria orPermissionCodeGreaterThanOrEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orGreaterThanOrEqualTo("permissionCode", value);
            return this;
        }

        /**
         * or permission_code < value
         *
         * @return
         */
        public Criteria orPermissionCodeLessThan(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orLessThan("permissionCode", value);
            return this;
        }

        /**
         * or permission_code <= value
         *
         * @return
         */
        public Criteria orPermissionCodeLessThanOrEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orLessThanOrEqualTo("permissionCode", value);
            return this;
        }

        /**
         * or permission_code in (value1, value2, ...)
         *
         * @return
         */
        public Criteria orPermissionCodeIn(Iterable<String> values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            this.orIn("permissionCode", values);
            return this;
        }

        /**
         * or permission_code in (value1, value2, ...)
         *
         * @return
         */
        public Criteria orPermissionCodeIn(String[] values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            this.orIn("permissionCode", CollectionUtils.initList(values));
            return this;
        }

        /**
         * or permission_code not in (value1, value2, ...)
         *
         * @return
         */
        public Criteria orPermissionCodeNotIn(Iterable<String> values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            this.orNotIn("permissionCode", values);
            return this;
        }

        /**
         * or permission_code not in (value1, value2, ...)
         *
         * @return
         */
        public Criteria orPermissionCodeNotIn(String[] values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            this.orNotIn("permissionCode", CollectionUtils.initList(values));
            return this;
        }

        /**
         * or permission_code between value1 and value2
         *
         * @return
         */
        public Criteria orPermissionCodeBetween(String value1, String value2) {
            if (CheckUtils.isAnyEmpty(value1, value2)) {
                return this;
            }
            this.orBetween("permissionCode", value1, value2);
            return this;
        }

        /**
         * or permission_code not between value1 and value2
         *
         * @return
         */
        public Criteria orPermissionCodeNotBetween(String value1, String value2) {
            if (CheckUtils.isAnyEmpty(value1, value2)) {
                return this;
            }
            this.orNotBetween("permissionCode", value1, value2);
            return this;
        }

        /**
         * or permission_code like value
         *
         * @return
         */
        public Criteria orPermissionCodeLike(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orLike("permissionCode", value);
            return this;
        }

        /**
         * or permission_code not like value
         *
         * @return
         */
        public Criteria orPermissionCodeNotLike(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orNotLike("permissionCode", value);
            return this;
        }

        /**
         * and permission_name = ''
         *
         * @return
         */
        public Criteria andPermissionNameIsEmpty() {
            this.andEqualTo("permissionName", "");
            return this;
        }

        /**
         * and permission_name != ''
         *
         * @return
         */
        public Criteria andPermissionNameIsNotEmpty() {
            this.andNotEqualTo("permissionName", "");
            return this;
        }

        /**
         * and permission_name = value
         *
         * @return
         */
        public Criteria andPermissionNameEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.andEqualTo("permissionName", value);
            return this;
        }

        /**
         * and permission_name != value
         *
         * @return
         */
        public Criteria andPermissionNameNotEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.andNotEqualTo("permissionName", value);
            return this;
        }

        /**
         * and permission_name > value
         *
         * @return
         */
        public Criteria andPermissionNameGreaterThan(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andGreaterThan("permissionName", value);
            return this;
        }

        /**
         * and permission_name >= value
         *
         * @return
         */
        public Criteria andPermissionNameGreaterThanOrEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andGreaterThanOrEqualTo("permissionName", value);
            return this;
        }

        /**
         * and permission_name < value
         *
         * @return
         */
        public Criteria andPermissionNameLessThan(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andLessThan("permissionName", value);
            return this;
        }

        /**
         * and permission_name <= value
         *
         * @return
         */
        public Criteria andPermissionNameLessThanOrEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andLessThanOrEqualTo("permissionName", value);
            return this;
        }

        /**
         * and permission_name in (value1, value2, ...)
         *
         * @return
         */
        public Criteria andPermissionNameIn(Iterable<String> values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            super.andIn("permissionName", values);
            return this;
        }

        /**
         * and permission_name in (value1, value2, ...)
         *
         * @return
         */
        public Criteria andPermissionNameIn(String... values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            super.andIn("permissionName", CollectionUtils.initList(values));
            return this;
        }

        /**
         * and permission_name not in (value1, value2, ...)
         *
         * @return
         */
        public Criteria andPermissionNameNotIn(Iterable<String> values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            super.andNotIn("permissionName", values);
            return this;
        }

        /**
         * and permission_name not in (value1, value2, ...)
         *
         * @return
         */
        public Criteria andPermissionNameNotIn(String[] values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            super.andNotIn("permissionName", CollectionUtils.initList(values));
            return this;
        }

        /**
         * and permission_name between value1 and value2
         *
         * @return
         */
        public Criteria andPermissionNameBetween(String value1, String value2) {
            if (CheckUtils.isAnyEmpty(value1, value2)) {
                return this;
            }
            super.andBetween("permissionName", value1, value2);
            return this;
        }

        /**
         * and permission_name not between value1 and value2
         *
         * @return
         */
        public Criteria andPermissionNameNotBetween(String value1, String value2) {
            if (CheckUtils.isAnyEmpty(value1, value2)) {
                return this;
            }
            super.andNotBetween("permissionName", value1, value2);
            return this;
        }

        /**
         * and permission_name like value
         *
         * @return
         */
        public Criteria andPermissionNameLike(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andLike("permissionName", value);
            return this;
        }

        /**
         * and permission_name not like value
         *
         * @return
         */
        public Criteria andPermissionNameNotLike(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andNotLike("permissionName", value);
            return this;
        }

        /**
         * or permission_name = ''
         *
         * @return
         */
        public Criteria orPermissionNameIsEmpty() {
            this.orEqualTo("permissionName", "");
            return this;
        }

        /**
         * or permission_name != ''
         *
         * @return
         */
        public Criteria orPermissionNameIsNotEmpty() {
            this.orNotEqualTo("permissionName", "");
            return this;
        }

        /**
         * or permission_name = value
         *
         * @return
         */
        public Criteria orPermissionNameEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orEqualTo("permissionName", value);
            return this;
        }

        /**
         * or permission_name != value
         *
         * @return
         */
        public Criteria orPermissionNameNotEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orNotEqualTo("permissionName", value);
            return this;
        }

        /**
         * or permission_name > value
         *
         * @return
         */
        public Criteria orPermissionNameGreaterThan(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orGreaterThan("permissionName", value);
            return this;
        }

        /**
         * or permission_name >= value
         *
         * @return
         */
        public Criteria orPermissionNameGreaterThanOrEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orGreaterThanOrEqualTo("permissionName", value);
            return this;
        }

        /**
         * or permission_name < value
         *
         * @return
         */
        public Criteria orPermissionNameLessThan(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orLessThan("permissionName", value);
            return this;
        }

        /**
         * or permission_name <= value
         *
         * @return
         */
        public Criteria orPermissionNameLessThanOrEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orLessThanOrEqualTo("permissionName", value);
            return this;
        }

        /**
         * or permission_name in (value1, value2, ...)
         *
         * @return
         */
        public Criteria orPermissionNameIn(Iterable<String> values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            this.orIn("permissionName", values);
            return this;
        }

        /**
         * or permission_name in (value1, value2, ...)
         *
         * @return
         */
        public Criteria orPermissionNameIn(String[] values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            this.orIn("permissionName", CollectionUtils.initList(values));
            return this;
        }

        /**
         * or permission_name not in (value1, value2, ...)
         *
         * @return
         */
        public Criteria orPermissionNameNotIn(Iterable<String> values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            this.orNotIn("permissionName", values);
            return this;
        }

        /**
         * or permission_name not in (value1, value2, ...)
         *
         * @return
         */
        public Criteria orPermissionNameNotIn(String[] values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            this.orNotIn("permissionName", CollectionUtils.initList(values));
            return this;
        }

        /**
         * or permission_name between value1 and value2
         *
         * @return
         */
        public Criteria orPermissionNameBetween(String value1, String value2) {
            if (CheckUtils.isAnyEmpty(value1, value2)) {
                return this;
            }
            this.orBetween("permissionName", value1, value2);
            return this;
        }

        /**
         * or permission_name not between value1 and value2
         *
         * @return
         */
        public Criteria orPermissionNameNotBetween(String value1, String value2) {
            if (CheckUtils.isAnyEmpty(value1, value2)) {
                return this;
            }
            this.orNotBetween("permissionName", value1, value2);
            return this;
        }

        /**
         * or permission_name like value
         *
         * @return
         */
        public Criteria orPermissionNameLike(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orLike("permissionName", value);
            return this;
        }

        /**
         * or permission_name not like value
         *
         * @return
         */
        public Criteria orPermissionNameNotLike(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orNotLike("permissionName", value);
            return this;
        }

        /**
         * and resource_level = value
         *
         * @return
         */
        public Criteria andResourceLevelEqualTo(Integer value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.andEqualTo("resourceLevel", value);
            return this;
        }

        /**
         * and resource_level != value
         *
         * @return
         */
        public Criteria andResourceLevelNotEqualTo(Integer value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.andNotEqualTo("resourceLevel", value);
            return this;
        }

        /**
         * and resource_level > value
         *
         * @return
         */
        public Criteria andResourceLevelGreaterThan(Integer value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andGreaterThan("resourceLevel", value);
            return this;
        }

        /**
         * and resource_level >= value
         *
         * @return
         */
        public Criteria andResourceLevelGreaterThanOrEqualTo(Integer value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andGreaterThanOrEqualTo("resourceLevel", value);
            return this;
        }

        /**
         * and resource_level < value
         *
         * @return
         */
        public Criteria andResourceLevelLessThan(Integer value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andLessThan("resourceLevel", value);
            return this;
        }

        /**
         * and resource_level <= value
         *
         * @return
         */
        public Criteria andResourceLevelLessThanOrEqualTo(Integer value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andLessThanOrEqualTo("resourceLevel", value);
            return this;
        }

        /**
         * and resource_level in (value1, value2, ...)
         *
         * @return
         */
        public Criteria andResourceLevelIn(Iterable<Integer> values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            super.andIn("resourceLevel", values);
            return this;
        }

        /**
         * and resource_level in (value1, value2, ...)
         *
         * @return
         */
        public Criteria andResourceLevelIn(Integer... values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            super.andIn("resourceLevel", CollectionUtils.initList(values));
            return this;
        }

        /**
         * and resource_level not in (value1, value2, ...)
         *
         * @return
         */
        public Criteria andResourceLevelNotIn(Iterable<Integer> values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            super.andNotIn("resourceLevel", values);
            return this;
        }

        /**
         * and resource_level not in (value1, value2, ...)
         *
         * @return
         */
        public Criteria andResourceLevelNotIn(Integer[] values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            super.andNotIn("resourceLevel", CollectionUtils.initList(values));
            return this;
        }

        /**
         * and resource_level between value1 and value2
         *
         * @return
         */
        public Criteria andResourceLevelBetween(Integer value1, Integer value2) {
            if (CheckUtils.isAnyEmpty(value1, value2)) {
                return this;
            }
            super.andBetween("resourceLevel", value1, value2);
            return this;
        }

        /**
         * and resource_level not between value1 and value2
         *
         * @return
         */
        public Criteria andResourceLevelNotBetween(Integer value1, Integer value2) {
            if (CheckUtils.isAnyEmpty(value1, value2)) {
                return this;
            }
            super.andNotBetween("resourceLevel", value1, value2);
            return this;
        }

        /**
         * and resource_level like value
         *
         * @return
         */
        public Criteria andResourceLevelLike(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andLike("resourceLevel", value);
            return this;
        }

        /**
         * and resource_level not like value
         *
         * @return
         */
        public Criteria andResourceLevelNotLike(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andNotLike("resourceLevel", value);
            return this;
        }

        /**
         * or resource_level = value
         *
         * @return
         */
        public Criteria orResourceLevelEqualTo(Integer value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orEqualTo("resourceLevel", value);
            return this;
        }

        /**
         * or resource_level != value
         *
         * @return
         */
        public Criteria orResourceLevelNotEqualTo(Integer value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orNotEqualTo("resourceLevel", value);
            return this;
        }

        /**
         * or resource_level > value
         *
         * @return
         */
        public Criteria orResourceLevelGreaterThan(Integer value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orGreaterThan("resourceLevel", value);
            return this;
        }

        /**
         * or resource_level >= value
         *
         * @return
         */
        public Criteria orResourceLevelGreaterThanOrEqualTo(Integer value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orGreaterThanOrEqualTo("resourceLevel", value);
            return this;
        }

        /**
         * or resource_level < value
         *
         * @return
         */
        public Criteria orResourceLevelLessThan(Integer value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orLessThan("resourceLevel", value);
            return this;
        }

        /**
         * or resource_level <= value
         *
         * @return
         */
        public Criteria orResourceLevelLessThanOrEqualTo(Integer value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orLessThanOrEqualTo("resourceLevel", value);
            return this;
        }

        /**
         * or resource_level in (value1, value2, ...)
         *
         * @return
         */
        public Criteria orResourceLevelIn(Iterable<Integer> values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            this.orIn("resourceLevel", values);
            return this;
        }

        /**
         * or resource_level in (value1, value2, ...)
         *
         * @return
         */
        public Criteria orResourceLevelIn(Integer[] values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            this.orIn("resourceLevel", CollectionUtils.initList(values));
            return this;
        }

        /**
         * or resource_level not in (value1, value2, ...)
         *
         * @return
         */
        public Criteria orResourceLevelNotIn(Iterable<Integer> values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            this.orNotIn("resourceLevel", values);
            return this;
        }

        /**
         * or resource_level not in (value1, value2, ...)
         *
         * @return
         */
        public Criteria orResourceLevelNotIn(Integer[] values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            this.orNotIn("resourceLevel", CollectionUtils.initList(values));
            return this;
        }

        /**
         * or resource_level between value1 and value2
         *
         * @return
         */
        public Criteria orResourceLevelBetween(Integer value1, Integer value2) {
            if (CheckUtils.isAnyEmpty(value1, value2)) {
                return this;
            }
            this.orBetween("resourceLevel", value1, value2);
            return this;
        }

        /**
         * or resource_level not between value1 and value2
         *
         * @return
         */
        public Criteria orResourceLevelNotBetween(Integer value1, Integer value2) {
            if (CheckUtils.isAnyEmpty(value1, value2)) {
                return this;
            }
            this.orNotBetween("resourceLevel", value1, value2);
            return this;
        }

        /**
         * or resource_level like value
         *
         * @return
         */
        public Criteria orResourceLevelLike(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orLike("resourceLevel", value);
            return this;
        }

        /**
         * or resource_level not like value
         *
         * @return
         */
        public Criteria orResourceLevelNotLike(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orNotLike("resourceLevel", value);
            return this;
        }

        /**
         * and description = ''
         *
         * @return
         */
        public Criteria andDescriptionIsEmpty() {
            this.andEqualTo("description", "");
            return this;
        }

        /**
         * and description != ''
         *
         * @return
         */
        public Criteria andDescriptionIsNotEmpty() {
            this.andNotEqualTo("description", "");
            return this;
        }

        /**
         * and description = value
         *
         * @return
         */
        public Criteria andDescriptionEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.andEqualTo("description", value);
            return this;
        }

        /**
         * and description != value
         *
         * @return
         */
        public Criteria andDescriptionNotEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.andNotEqualTo("description", value);
            return this;
        }

        /**
         * and description > value
         *
         * @return
         */
        public Criteria andDescriptionGreaterThan(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andGreaterThan("description", value);
            return this;
        }

        /**
         * and description >= value
         *
         * @return
         */
        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andGreaterThanOrEqualTo("description", value);
            return this;
        }

        /**
         * and description < value
         *
         * @return
         */
        public Criteria andDescriptionLessThan(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andLessThan("description", value);
            return this;
        }

        /**
         * and description <= value
         *
         * @return
         */
        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andLessThanOrEqualTo("description", value);
            return this;
        }

        /**
         * and description in (value1, value2, ...)
         *
         * @return
         */
        public Criteria andDescriptionIn(Iterable<String> values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            super.andIn("description", values);
            return this;
        }

        /**
         * and description in (value1, value2, ...)
         *
         * @return
         */
        public Criteria andDescriptionIn(String... values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            super.andIn("description", CollectionUtils.initList(values));
            return this;
        }

        /**
         * and description not in (value1, value2, ...)
         *
         * @return
         */
        public Criteria andDescriptionNotIn(Iterable<String> values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            super.andNotIn("description", values);
            return this;
        }

        /**
         * and description not in (value1, value2, ...)
         *
         * @return
         */
        public Criteria andDescriptionNotIn(String[] values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            super.andNotIn("description", CollectionUtils.initList(values));
            return this;
        }

        /**
         * and description between value1 and value2
         *
         * @return
         */
        public Criteria andDescriptionBetween(String value1, String value2) {
            if (CheckUtils.isAnyEmpty(value1, value2)) {
                return this;
            }
            super.andBetween("description", value1, value2);
            return this;
        }

        /**
         * and description not between value1 and value2
         *
         * @return
         */
        public Criteria andDescriptionNotBetween(String value1, String value2) {
            if (CheckUtils.isAnyEmpty(value1, value2)) {
                return this;
            }
            super.andNotBetween("description", value1, value2);
            return this;
        }

        /**
         * and description like value
         *
         * @return
         */
        public Criteria andDescriptionLike(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andLike("description", value);
            return this;
        }

        /**
         * and description not like value
         *
         * @return
         */
        public Criteria andDescriptionNotLike(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andNotLike("description", value);
            return this;
        }

        /**
         * or description = ''
         *
         * @return
         */
        public Criteria orDescriptionIsEmpty() {
            this.orEqualTo("description", "");
            return this;
        }

        /**
         * or description != ''
         *
         * @return
         */
        public Criteria orDescriptionIsNotEmpty() {
            this.orNotEqualTo("description", "");
            return this;
        }

        /**
         * or description = value
         *
         * @return
         */
        public Criteria orDescriptionEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orEqualTo("description", value);
            return this;
        }

        /**
         * or description != value
         *
         * @return
         */
        public Criteria orDescriptionNotEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orNotEqualTo("description", value);
            return this;
        }

        /**
         * or description > value
         *
         * @return
         */
        public Criteria orDescriptionGreaterThan(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orGreaterThan("description", value);
            return this;
        }

        /**
         * or description >= value
         *
         * @return
         */
        public Criteria orDescriptionGreaterThanOrEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orGreaterThanOrEqualTo("description", value);
            return this;
        }

        /**
         * or description < value
         *
         * @return
         */
        public Criteria orDescriptionLessThan(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orLessThan("description", value);
            return this;
        }

        /**
         * or description <= value
         *
         * @return
         */
        public Criteria orDescriptionLessThanOrEqualTo(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orLessThanOrEqualTo("description", value);
            return this;
        }

        /**
         * or description in (value1, value2, ...)
         *
         * @return
         */
        public Criteria orDescriptionIn(Iterable<String> values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            this.orIn("description", values);
            return this;
        }

        /**
         * or description in (value1, value2, ...)
         *
         * @return
         */
        public Criteria orDescriptionIn(String[] values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            this.orIn("description", CollectionUtils.initList(values));
            return this;
        }

        /**
         * or description not in (value1, value2, ...)
         *
         * @return
         */
        public Criteria orDescriptionNotIn(Iterable<String> values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            this.orNotIn("description", values);
            return this;
        }

        /**
         * or description not in (value1, value2, ...)
         *
         * @return
         */
        public Criteria orDescriptionNotIn(String[] values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            this.orNotIn("description", CollectionUtils.initList(values));
            return this;
        }

        /**
         * or description between value1 and value2
         *
         * @return
         */
        public Criteria orDescriptionBetween(String value1, String value2) {
            if (CheckUtils.isAnyEmpty(value1, value2)) {
                return this;
            }
            this.orBetween("description", value1, value2);
            return this;
        }

        /**
         * or description not between value1 and value2
         *
         * @return
         */
        public Criteria orDescriptionNotBetween(String value1, String value2) {
            if (CheckUtils.isAnyEmpty(value1, value2)) {
                return this;
            }
            this.orNotBetween("description", value1, value2);
            return this;
        }

        /**
         * or description like value
         *
         * @return
         */
        public Criteria orDescriptionLike(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orLike("description", value);
            return this;
        }

        /**
         * or description not like value
         *
         * @return
         */
        public Criteria orDescriptionNotLike(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orNotLike("description", value);
            return this;
        }

        /**
         * and parent_id = value
         *
         * @return
         */
        public Criteria andParentIdEqualTo(Long value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.andEqualTo("parentId", value);
            return this;
        }

        /**
         * and parent_id != value
         *
         * @return
         */
        public Criteria andParentIdNotEqualTo(Long value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.andNotEqualTo("parentId", value);
            return this;
        }

        /**
         * and parent_id > value
         *
         * @return
         */
        public Criteria andParentIdGreaterThan(Long value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andGreaterThan("parentId", value);
            return this;
        }

        /**
         * and parent_id >= value
         *
         * @return
         */
        public Criteria andParentIdGreaterThanOrEqualTo(Long value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andGreaterThanOrEqualTo("parentId", value);
            return this;
        }

        /**
         * and parent_id < value
         *
         * @return
         */
        public Criteria andParentIdLessThan(Long value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andLessThan("parentId", value);
            return this;
        }

        /**
         * and parent_id <= value
         *
         * @return
         */
        public Criteria andParentIdLessThanOrEqualTo(Long value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andLessThanOrEqualTo("parentId", value);
            return this;
        }

        /**
         * and parent_id in (value1, value2, ...)
         *
         * @return
         */
        public Criteria andParentIdIn(Iterable<Long> values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            super.andIn("parentId", values);
            return this;
        }

        /**
         * and parent_id in (value1, value2, ...)
         *
         * @return
         */
        public Criteria andParentIdIn(Long... values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            super.andIn("parentId", CollectionUtils.initList(values));
            return this;
        }

        /**
         * and parent_id not in (value1, value2, ...)
         *
         * @return
         */
        public Criteria andParentIdNotIn(Iterable<Long> values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            super.andNotIn("parentId", values);
            return this;
        }

        /**
         * and parent_id not in (value1, value2, ...)
         *
         * @return
         */
        public Criteria andParentIdNotIn(Long[] values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            super.andNotIn("parentId", CollectionUtils.initList(values));
            return this;
        }

        /**
         * and parent_id between value1 and value2
         *
         * @return
         */
        public Criteria andParentIdBetween(Long value1, Long value2) {
            if (CheckUtils.isAnyEmpty(value1, value2)) {
                return this;
            }
            super.andBetween("parentId", value1, value2);
            return this;
        }

        /**
         * and parent_id not between value1 and value2
         *
         * @return
         */
        public Criteria andParentIdNotBetween(Long value1, Long value2) {
            if (CheckUtils.isAnyEmpty(value1, value2)) {
                return this;
            }
            super.andNotBetween("parentId", value1, value2);
            return this;
        }

        /**
         * and parent_id like value
         *
         * @return
         */
        public Criteria andParentIdLike(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andLike("parentId", value);
            return this;
        }

        /**
         * and parent_id not like value
         *
         * @return
         */
        public Criteria andParentIdNotLike(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            super.andNotLike("parentId", value);
            return this;
        }

        /**
         * or parent_id = value
         *
         * @return
         */
        public Criteria orParentIdEqualTo(Long value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orEqualTo("parentId", value);
            return this;
        }

        /**
         * or parent_id != value
         *
         * @return
         */
        public Criteria orParentIdNotEqualTo(Long value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orNotEqualTo("parentId", value);
            return this;
        }

        /**
         * or parent_id > value
         *
         * @return
         */
        public Criteria orParentIdGreaterThan(Long value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orGreaterThan("parentId", value);
            return this;
        }

        /**
         * or parent_id >= value
         *
         * @return
         */
        public Criteria orParentIdGreaterThanOrEqualTo(Long value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orGreaterThanOrEqualTo("parentId", value);
            return this;
        }

        /**
         * or parent_id < value
         *
         * @return
         */
        public Criteria orParentIdLessThan(Long value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orLessThan("parentId", value);
            return this;
        }

        /**
         * or parent_id <= value
         *
         * @return
         */
        public Criteria orParentIdLessThanOrEqualTo(Long value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orLessThanOrEqualTo("parentId", value);
            return this;
        }

        /**
         * or parent_id in (value1, value2, ...)
         *
         * @return
         */
        public Criteria orParentIdIn(Iterable<Long> values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            this.orIn("parentId", values);
            return this;
        }

        /**
         * or parent_id in (value1, value2, ...)
         *
         * @return
         */
        public Criteria orParentIdIn(Long[] values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            this.orIn("parentId", CollectionUtils.initList(values));
            return this;
        }

        /**
         * or parent_id not in (value1, value2, ...)
         *
         * @return
         */
        public Criteria orParentIdNotIn(Iterable<Long> values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            this.orNotIn("parentId", values);
            return this;
        }

        /**
         * or parent_id not in (value1, value2, ...)
         *
         * @return
         */
        public Criteria orParentIdNotIn(Long[] values) {
            if (CheckUtils.isEmpty(values)) {
                return this;
            }
            this.orNotIn("parentId", CollectionUtils.initList(values));
            return this;
        }

        /**
         * or parent_id between value1 and value2
         *
         * @return
         */
        public Criteria orParentIdBetween(Long value1, Long value2) {
            if (CheckUtils.isAnyEmpty(value1, value2)) {
                return this;
            }
            this.orBetween("parentId", value1, value2);
            return this;
        }

        /**
         * or parent_id not between value1 and value2
         *
         * @return
         */
        public Criteria orParentIdNotBetween(Long value1, Long value2) {
            if (CheckUtils.isAnyEmpty(value1, value2)) {
                return this;
            }
            this.orNotBetween("parentId", value1, value2);
            return this;
        }

        /**
         * or parent_id like value
         *
         * @return
         */
        public Criteria orParentIdLike(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orLike("parentId", value);
            return this;
        }

        /**
         * or parent_id not like value
         *
         * @return
         */
        public Criteria orParentIdNotLike(String value) {
            if (CheckUtils.isEmpty(value)) {
                return this;
            }
            this.orNotLike("parentId", value);
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
