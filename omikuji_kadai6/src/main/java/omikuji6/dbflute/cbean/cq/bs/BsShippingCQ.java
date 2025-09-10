package omikuji6.dbflute.cbean.cq.bs;

import java.util.Map;

import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.exception.IllegalConditionBeanOperationException;
import omikuji6.dbflute.cbean.cq.ciq.*;
import omikuji6.dbflute.cbean.*;
import omikuji6.dbflute.cbean.cq.*;

/**
 * The base condition-query of shipping.
 * @author DBFlute(AutoGenerator)
 */
public class BsShippingCQ extends AbstractBsShippingCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected ShippingCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsShippingCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from shipping) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public ShippingCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected ShippingCIQ xcreateCIQ() {
        ShippingCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected ShippingCIQ xnewCIQ() {
        return new ShippingCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join shipping on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public ShippingCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        ShippingCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _id;
    public ConditionValue xdfgetId()
    { if (_id == null) { _id = nCV(); }
      return _id; }
    protected ConditionValue xgetCValueId() { return xdfgetId(); }

    /**
     * Add order-by as ascend. <br>
     * id: {PK, ID, NotNull, serial(10)}
     * @return this. (NotNull)
     */
    public BsShippingCQ addOrderBy_Id_Asc() { regOBA("id"); return this; }

    /**
     * Add order-by as descend. <br>
     * id: {PK, ID, NotNull, serial(10)}
     * @return this. (NotNull)
     */
    public BsShippingCQ addOrderBy_Id_Desc() { regOBD("id"); return this; }

    protected ConditionValue _resultCode;
    public ConditionValue xdfgetResultCode()
    { if (_resultCode == null) { _resultCode = nCV(); }
      return _resultCode; }
    protected ConditionValue xgetCValueResultCode() { return xdfgetResultCode(); }

    /**
     * Add order-by as ascend. <br>
     * result_code: {int4(10), FK to result}
     * @return this. (NotNull)
     */
    public BsShippingCQ addOrderBy_ResultCode_Asc() { regOBA("result_code"); return this; }

    /**
     * Add order-by as descend. <br>
     * result_code: {int4(10), FK to result}
     * @return this. (NotNull)
     */
    public BsShippingCQ addOrderBy_ResultCode_Desc() { regOBD("result_code"); return this; }

    protected ConditionValue _postCode;
    public ConditionValue xdfgetPostCode()
    { if (_postCode == null) { _postCode = nCV(); }
      return _postCode; }
    protected ConditionValue xgetCValuePostCode() { return xdfgetPostCode(); }

    /**
     * Add order-by as ascend. <br>
     * post_code: {NotNull, varchar(7)}
     * @return this. (NotNull)
     */
    public BsShippingCQ addOrderBy_PostCode_Asc() { regOBA("post_code"); return this; }

    /**
     * Add order-by as descend. <br>
     * post_code: {NotNull, varchar(7)}
     * @return this. (NotNull)
     */
    public BsShippingCQ addOrderBy_PostCode_Desc() { regOBD("post_code"); return this; }

    protected ConditionValue _address;
    public ConditionValue xdfgetAddress()
    { if (_address == null) { _address = nCV(); }
      return _address; }
    protected ConditionValue xgetCValueAddress() { return xdfgetAddress(); }

    /**
     * Add order-by as ascend. <br>
     * address: {NotNull, varchar(200)}
     * @return this. (NotNull)
     */
    public BsShippingCQ addOrderBy_Address_Asc() { regOBA("address"); return this; }

    /**
     * Add order-by as descend. <br>
     * address: {NotNull, varchar(200)}
     * @return this. (NotNull)
     */
    public BsShippingCQ addOrderBy_Address_Desc() { regOBD("address"); return this; }

    protected ConditionValue _name;
    public ConditionValue xdfgetName()
    { if (_name == null) { _name = nCV(); }
      return _name; }
    protected ConditionValue xgetCValueName() { return xdfgetName(); }

    /**
     * Add order-by as ascend. <br>
     * name: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsShippingCQ addOrderBy_Name_Asc() { regOBA("name"); return this; }

    /**
     * Add order-by as descend. <br>
     * name: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsShippingCQ addOrderBy_Name_Desc() { regOBD("name"); return this; }

    protected ConditionValue _phone;
    public ConditionValue xdfgetPhone()
    { if (_phone == null) { _phone = nCV(); }
      return _phone; }
    protected ConditionValue xgetCValuePhone() { return xdfgetPhone(); }

    /**
     * Add order-by as ascend. <br>
     * phone: {NotNull, varchar(11)}
     * @return this. (NotNull)
     */
    public BsShippingCQ addOrderBy_Phone_Asc() { regOBA("phone"); return this; }

    /**
     * Add order-by as descend. <br>
     * phone: {NotNull, varchar(11)}
     * @return this. (NotNull)
     */
    public BsShippingCQ addOrderBy_Phone_Desc() { regOBD("phone"); return this; }

    protected ConditionValue _mail;
    public ConditionValue xdfgetMail()
    { if (_mail == null) { _mail = nCV(); }
      return _mail; }
    protected ConditionValue xgetCValueMail() { return xdfgetMail(); }

    /**
     * Add order-by as ascend. <br>
     * mail: {NotNull, varchar(200)}
     * @return this. (NotNull)
     */
    public BsShippingCQ addOrderBy_Mail_Asc() { regOBA("mail"); return this; }

    /**
     * Add order-by as descend. <br>
     * mail: {NotNull, varchar(200)}
     * @return this. (NotNull)
     */
    public BsShippingCQ addOrderBy_Mail_Desc() { regOBD("mail"); return this; }

    protected ConditionValue _updatedDate;
    public ConditionValue xdfgetUpdatedDate()
    { if (_updatedDate == null) { _updatedDate = nCV(); }
      return _updatedDate; }
    protected ConditionValue xgetCValueUpdatedDate() { return xdfgetUpdatedDate(); }

    /**
     * Add order-by as ascend. <br>
     * updated_date: {NotNull, date(13)}
     * @return this. (NotNull)
     */
    public BsShippingCQ addOrderBy_UpdatedDate_Asc() { regOBA("updated_date"); return this; }

    /**
     * Add order-by as descend. <br>
     * updated_date: {NotNull, date(13)}
     * @return this. (NotNull)
     */
    public BsShippingCQ addOrderBy_UpdatedDate_Desc() { regOBD("updated_date"); return this; }

    // ===================================================================================
    //                                                             SpecifiedDerivedOrderBy
    //                                                             =======================
    /**
     * Add order-by for specified derived column as ascend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #CC4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] asc</span>
     * cb.<span style="color: #CC4747">addSpecifiedDerivedOrderBy_Asc</span>(<span style="color: #CC4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsShippingCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

    /**
     * Add order-by for specified derived column as descend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #CC4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] desc</span>
     * cb.<span style="color: #CC4747">addSpecifiedDerivedOrderBy_Desc</span>(<span style="color: #CC4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsShippingCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        ShippingCQ bq = (ShippingCQ)bqs;
        ShippingCQ uq = (ShippingCQ)uqs;
        if (bq.hasConditionQueryResult()) {
            uq.queryResult().reflectRelationOnUnionQuery(bq.queryResult(), uq.queryResult());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * result by my result_code, named 'result'.
     * @return The instance of condition-query. (NotNull)
     */
    public ResultCQ queryResult() {
        return xdfgetConditionQueryResult();
    }
    public ResultCQ xdfgetConditionQueryResult() {
        String prop = "result";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryResult()); xsetupOuterJoinResult(); }
        return xgetQueRlMap(prop);
    }
    protected ResultCQ xcreateQueryResult() {
        String nrp = xresolveNRP("shipping", "result"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new ResultCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "result", nrp);
    }
    protected void xsetupOuterJoinResult() { xregOutJo("result"); }
    public boolean hasConditionQueryResult() { return xhasQueRlMap("result"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, ShippingCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(ShippingCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, ShippingCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(ShippingCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, ShippingCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(ShippingCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, ShippingCQ> _myselfExistsMap;
    public Map<String, ShippingCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(ShippingCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, ShippingCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(ShippingCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return ShippingCB.class.getName(); }
    protected String xCQ() { return ShippingCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
