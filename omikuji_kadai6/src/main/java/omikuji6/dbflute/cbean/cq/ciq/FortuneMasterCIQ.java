package omikuji6.dbflute.cbean.cq.ciq;

import java.util.Map;
import org.dbflute.cbean.*;
import org.dbflute.cbean.ckey.*;
import org.dbflute.cbean.coption.ConditionOption;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.exception.IllegalConditionBeanOperationException;
import omikuji6.dbflute.cbean.*;
import omikuji6.dbflute.cbean.cq.bs.*;
import omikuji6.dbflute.cbean.cq.*;

/**
 * The condition-query for in-line of fortune_master.
 * @author DBFlute(AutoGenerator)
 */
public class FortuneMasterCIQ extends AbstractBsFortuneMasterCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsFortuneMasterCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public FortuneMasterCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsFortuneMasterCQ myCQ) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
        _myCQ = myCQ;
        _foreignPropertyName = _myCQ.xgetForeignPropertyName(); // accept foreign property name
        _relationPath = _myCQ.xgetRelationPath(); // accept relation path
        _inline = true;
    }

    // ===================================================================================
    //                                                             Override about Register
    //                                                             =======================
    protected void reflectRelationOnUnionQuery(ConditionQuery bq, ConditionQuery uq)
    { throw new IllegalConditionBeanOperationException("InlineView cannot use Union: " + bq + " : " + uq); }

    @Override
    protected void setupConditionValueAndRegisterWhereClause(ConditionKey k, Object v, ConditionValue cv, String col)
    { regIQ(k, v, cv, col); }

    @Override
    protected void setupConditionValueAndRegisterWhereClause(ConditionKey k, Object v, ConditionValue cv, String col, ConditionOption op)
    { regIQ(k, v, cv, col, op); }

    @Override
    protected void registerWhereClause(String wc)
    { registerInlineWhereClause(wc); }

    @Override
    protected boolean isInScopeRelationSuppressLocalAliasName() {
        if (_onClause) { throw new IllegalConditionBeanOperationException("InScopeRelation on OnClause is unsupported."); }
        return true;
    }

    // ===================================================================================
    //                                                                Override about Query
    //                                                                ====================
    protected ConditionValue xgetCValueFortuneCode() { return _myCQ.xdfgetFortuneCode(); }
    public String keepFortuneCode_ExistsReferrer_OmikujiList(OmikujiCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepFortuneCode_NotExistsReferrer_OmikujiList(OmikujiCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepFortuneCode_SpecifyDerivedReferrer_OmikujiList(OmikujiCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepFortuneCode_QueryDerivedReferrer_OmikujiList(OmikujiCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepFortuneCode_QueryDerivedReferrer_OmikujiListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue xgetCValueFortuneName() { return _myCQ.xdfgetFortuneName(); }
    protected ConditionValue xgetCValueUpdatedBy() { return _myCQ.xdfgetUpdatedBy(); }
    protected ConditionValue xgetCValueUpdatedDate() { return _myCQ.xdfgetUpdatedDate(); }
    protected ConditionValue xgetCValueCreatedBy() { return _myCQ.xdfgetCreatedBy(); }
    protected ConditionValue xgetCValueCreatedDate() { return _myCQ.xdfgetCreatedDate(); }
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String pp) { return null; }
    public String keepScalarCondition(FortuneMasterCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(FortuneMasterCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(FortuneMasterCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(FortuneMasterCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return FortuneMasterCB.class.getName(); }
    protected String xinCQ() { return FortuneMasterCQ.class.getName(); }
}
