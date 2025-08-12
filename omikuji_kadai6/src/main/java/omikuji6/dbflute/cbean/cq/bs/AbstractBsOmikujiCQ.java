package omikuji6.dbflute.cbean.cq.bs;

import java.util.*;

import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.ckey.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.ordering.*;
import org.dbflute.cbean.scoping.*;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.dbmeta.DBMetaProvider;
import omikuji6.dbflute.allcommon.*;
import omikuji6.dbflute.cbean.*;
import omikuji6.dbflute.cbean.cq.*;

/**
 * The abstract condition-query of omikuji.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsOmikujiCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsOmikujiCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    @Override
    protected DBMetaProvider xgetDBMetaProvider() {
        return DBMetaInstanceHandler.getProvider();
    }

    public String asTableDbName() {
        return "omikuji";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * omikuji_code: {PK, NotNull, int4(10)}
     * @param omikujiCode The value of omikujiCode as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setOmikujiCode_Equal(Integer omikujiCode) {
        doSetOmikujiCode_Equal(omikujiCode);
    }

    protected void doSetOmikujiCode_Equal(Integer omikujiCode) {
        regOmikujiCode(CK_EQ, omikujiCode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * omikuji_code: {PK, NotNull, int4(10)}
     * @param omikujiCode The value of omikujiCode as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOmikujiCode_NotEqual(Integer omikujiCode) {
        doSetOmikujiCode_NotEqual(omikujiCode);
    }

    protected void doSetOmikujiCode_NotEqual(Integer omikujiCode) {
        regOmikujiCode(CK_NES, omikujiCode);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * omikuji_code: {PK, NotNull, int4(10)}
     * @param omikujiCode The value of omikujiCode as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setOmikujiCode_GreaterThan(Integer omikujiCode) {
        regOmikujiCode(CK_GT, omikujiCode);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * omikuji_code: {PK, NotNull, int4(10)}
     * @param omikujiCode The value of omikujiCode as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setOmikujiCode_LessThan(Integer omikujiCode) {
        regOmikujiCode(CK_LT, omikujiCode);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * omikuji_code: {PK, NotNull, int4(10)}
     * @param omikujiCode The value of omikujiCode as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOmikujiCode_GreaterEqual(Integer omikujiCode) {
        regOmikujiCode(CK_GE, omikujiCode);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * omikuji_code: {PK, NotNull, int4(10)}
     * @param omikujiCode The value of omikujiCode as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOmikujiCode_LessEqual(Integer omikujiCode) {
        regOmikujiCode(CK_LE, omikujiCode);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * omikuji_code: {PK, NotNull, int4(10)}
     * @param minNumber The min number of omikujiCode. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of omikujiCode. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setOmikujiCode_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setOmikujiCode_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * omikuji_code: {PK, NotNull, int4(10)}
     * @param minNumber The min number of omikujiCode. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of omikujiCode. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setOmikujiCode_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueOmikujiCode(), "omikuji_code", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * omikuji_code: {PK, NotNull, int4(10)}
     * @param omikujiCodeList The collection of omikujiCode as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOmikujiCode_InScope(Collection<Integer> omikujiCodeList) {
        doSetOmikujiCode_InScope(omikujiCodeList);
    }

    protected void doSetOmikujiCode_InScope(Collection<Integer> omikujiCodeList) {
        regINS(CK_INS, cTL(omikujiCodeList), xgetCValueOmikujiCode(), "omikuji_code");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * omikuji_code: {PK, NotNull, int4(10)}
     * @param omikujiCodeList The collection of omikujiCode as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOmikujiCode_NotInScope(Collection<Integer> omikujiCodeList) {
        doSetOmikujiCode_NotInScope(omikujiCodeList);
    }

    protected void doSetOmikujiCode_NotInScope(Collection<Integer> omikujiCodeList) {
        regINS(CK_NINS, cTL(omikujiCodeList), xgetCValueOmikujiCode(), "omikuji_code");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select omikuji_code from result where ...)} <br>
     * result by omikuji_code, named 'resultAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsResult</span>(resultCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     resultCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ResultList for 'exists'. (NotNull)
     */
    public void existsResult(SubQuery<ResultCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        ResultCB cb = new ResultCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepOmikujiCode_ExistsReferrer_ResultList(cb.query());
        registerExistsReferrer(cb.query(), "omikuji_code", "omikuji_code", pp, "resultList");
    }
    public abstract String keepOmikujiCode_ExistsReferrer_ResultList(ResultCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select omikuji_code from result where ...)} <br>
     * result by omikuji_code, named 'resultAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsResult</span>(resultCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     resultCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of OmikujiCode_NotExistsReferrer_ResultList for 'not exists'. (NotNull)
     */
    public void notExistsResult(SubQuery<ResultCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        ResultCB cb = new ResultCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepOmikujiCode_NotExistsReferrer_ResultList(cb.query());
        registerNotExistsReferrer(cb.query(), "omikuji_code", "omikuji_code", pp, "resultList");
    }
    public abstract String keepOmikujiCode_NotExistsReferrer_ResultList(ResultCQ sq);

    public void xsderiveResultList(String fn, SubQuery<ResultCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        ResultCB cb = new ResultCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepOmikujiCode_SpecifyDerivedReferrer_ResultList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "omikuji_code", "omikuji_code", pp, "resultList", al, op);
    }
    public abstract String keepOmikujiCode_SpecifyDerivedReferrer_ResultList(ResultCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from result where ...)} <br>
     * result by omikuji_code, named 'resultAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedResult()</span>.<span style="color: #CC4747">max</span>(resultCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     resultCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     resultCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<ResultCB> derivedResult() {
        return xcreateQDRFunctionResultList();
    }
    protected HpQDRFunction<ResultCB> xcreateQDRFunctionResultList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveResultList(fn, sq, rd, vl, op));
    }
    public void xqderiveResultList(String fn, SubQuery<ResultCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        ResultCB cb = new ResultCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepOmikujiCode_QueryDerivedReferrer_ResultList(cb.query()); String prpp = keepOmikujiCode_QueryDerivedReferrer_ResultListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "omikuji_code", "omikuji_code", sqpp, "resultList", rd, vl, prpp, op);
    }
    public abstract String keepOmikujiCode_QueryDerivedReferrer_ResultList(ResultCQ sq);
    public abstract String keepOmikujiCode_QueryDerivedReferrer_ResultListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * omikuji_code: {PK, NotNull, int4(10)}
     */
    public void setOmikujiCode_IsNull() { regOmikujiCode(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * omikuji_code: {PK, NotNull, int4(10)}
     */
    public void setOmikujiCode_IsNotNull() { regOmikujiCode(CK_ISNN, DOBJ); }

    protected void regOmikujiCode(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOmikujiCode(), "omikuji_code"); }
    protected abstract ConditionValue xgetCValueOmikujiCode();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * fortune_code: {int4(10), FK to fortune_master}
     * @param fortuneCode The value of fortuneCode as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setFortuneCode_Equal(Integer fortuneCode) {
        doSetFortuneCode_Equal(fortuneCode);
    }

    protected void doSetFortuneCode_Equal(Integer fortuneCode) {
        regFortuneCode(CK_EQ, fortuneCode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * fortune_code: {int4(10), FK to fortune_master}
     * @param fortuneCode The value of fortuneCode as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFortuneCode_NotEqual(Integer fortuneCode) {
        doSetFortuneCode_NotEqual(fortuneCode);
    }

    protected void doSetFortuneCode_NotEqual(Integer fortuneCode) {
        regFortuneCode(CK_NES, fortuneCode);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * fortune_code: {int4(10), FK to fortune_master}
     * @param fortuneCode The value of fortuneCode as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setFortuneCode_GreaterThan(Integer fortuneCode) {
        regFortuneCode(CK_GT, fortuneCode);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * fortune_code: {int4(10), FK to fortune_master}
     * @param fortuneCode The value of fortuneCode as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setFortuneCode_LessThan(Integer fortuneCode) {
        regFortuneCode(CK_LT, fortuneCode);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * fortune_code: {int4(10), FK to fortune_master}
     * @param fortuneCode The value of fortuneCode as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFortuneCode_GreaterEqual(Integer fortuneCode) {
        regFortuneCode(CK_GE, fortuneCode);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * fortune_code: {int4(10), FK to fortune_master}
     * @param fortuneCode The value of fortuneCode as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFortuneCode_LessEqual(Integer fortuneCode) {
        regFortuneCode(CK_LE, fortuneCode);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * fortune_code: {int4(10), FK to fortune_master}
     * @param minNumber The min number of fortuneCode. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of fortuneCode. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setFortuneCode_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setFortuneCode_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * fortune_code: {int4(10), FK to fortune_master}
     * @param minNumber The min number of fortuneCode. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of fortuneCode. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setFortuneCode_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueFortuneCode(), "fortune_code", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * fortune_code: {int4(10), FK to fortune_master}
     * @param fortuneCodeList The collection of fortuneCode as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFortuneCode_InScope(Collection<Integer> fortuneCodeList) {
        doSetFortuneCode_InScope(fortuneCodeList);
    }

    protected void doSetFortuneCode_InScope(Collection<Integer> fortuneCodeList) {
        regINS(CK_INS, cTL(fortuneCodeList), xgetCValueFortuneCode(), "fortune_code");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * fortune_code: {int4(10), FK to fortune_master}
     * @param fortuneCodeList The collection of fortuneCode as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFortuneCode_NotInScope(Collection<Integer> fortuneCodeList) {
        doSetFortuneCode_NotInScope(fortuneCodeList);
    }

    protected void doSetFortuneCode_NotInScope(Collection<Integer> fortuneCodeList) {
        regINS(CK_NINS, cTL(fortuneCodeList), xgetCValueFortuneCode(), "fortune_code");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * fortune_code: {int4(10), FK to fortune_master}
     */
    public void setFortuneCode_IsNull() { regFortuneCode(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * fortune_code: {int4(10), FK to fortune_master}
     */
    public void setFortuneCode_IsNotNull() { regFortuneCode(CK_ISNN, DOBJ); }

    protected void regFortuneCode(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFortuneCode(), "fortune_code"); }
    protected abstract ConditionValue xgetCValueFortuneCode();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * negaigoto: {varchar(30)}
     * @param negaigoto The value of negaigoto as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNegaigoto_Equal(String negaigoto) {
        doSetNegaigoto_Equal(fRES(negaigoto));
    }

    protected void doSetNegaigoto_Equal(String negaigoto) {
        regNegaigoto(CK_EQ, negaigoto);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * negaigoto: {varchar(30)}
     * @param negaigoto The value of negaigoto as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNegaigoto_NotEqual(String negaigoto) {
        doSetNegaigoto_NotEqual(fRES(negaigoto));
    }

    protected void doSetNegaigoto_NotEqual(String negaigoto) {
        regNegaigoto(CK_NES, negaigoto);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * negaigoto: {varchar(30)}
     * @param negaigoto The value of negaigoto as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNegaigoto_GreaterThan(String negaigoto) {
        regNegaigoto(CK_GT, fRES(negaigoto));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * negaigoto: {varchar(30)}
     * @param negaigoto The value of negaigoto as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNegaigoto_LessThan(String negaigoto) {
        regNegaigoto(CK_LT, fRES(negaigoto));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * negaigoto: {varchar(30)}
     * @param negaigoto The value of negaigoto as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNegaigoto_GreaterEqual(String negaigoto) {
        regNegaigoto(CK_GE, fRES(negaigoto));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * negaigoto: {varchar(30)}
     * @param negaigoto The value of negaigoto as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNegaigoto_LessEqual(String negaigoto) {
        regNegaigoto(CK_LE, fRES(negaigoto));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * negaigoto: {varchar(30)}
     * @param negaigotoList The collection of negaigoto as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNegaigoto_InScope(Collection<String> negaigotoList) {
        doSetNegaigoto_InScope(negaigotoList);
    }

    protected void doSetNegaigoto_InScope(Collection<String> negaigotoList) {
        regINS(CK_INS, cTL(negaigotoList), xgetCValueNegaigoto(), "negaigoto");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * negaigoto: {varchar(30)}
     * @param negaigotoList The collection of negaigoto as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNegaigoto_NotInScope(Collection<String> negaigotoList) {
        doSetNegaigoto_NotInScope(negaigotoList);
    }

    protected void doSetNegaigoto_NotInScope(Collection<String> negaigotoList) {
        regINS(CK_NINS, cTL(negaigotoList), xgetCValueNegaigoto(), "negaigoto");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * negaigoto: {varchar(30)} <br>
     * <pre>e.g. setNegaigoto_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param negaigoto The value of negaigoto as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setNegaigoto_LikeSearch(String negaigoto, ConditionOptionCall<LikeSearchOption> opLambda) {
        setNegaigoto_LikeSearch(negaigoto, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * negaigoto: {varchar(30)} <br>
     * <pre>e.g. setNegaigoto_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param negaigoto The value of negaigoto as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setNegaigoto_LikeSearch(String negaigoto, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(negaigoto), xgetCValueNegaigoto(), "negaigoto", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * negaigoto: {varchar(30)}
     * @param negaigoto The value of negaigoto as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setNegaigoto_NotLikeSearch(String negaigoto, ConditionOptionCall<LikeSearchOption> opLambda) {
        setNegaigoto_NotLikeSearch(negaigoto, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * negaigoto: {varchar(30)}
     * @param negaigoto The value of negaigoto as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setNegaigoto_NotLikeSearch(String negaigoto, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(negaigoto), xgetCValueNegaigoto(), "negaigoto", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * negaigoto: {varchar(30)}
     */
    public void setNegaigoto_IsNull() { regNegaigoto(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * negaigoto: {varchar(30)}
     */
    public void setNegaigoto_IsNullOrEmpty() { regNegaigoto(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * negaigoto: {varchar(30)}
     */
    public void setNegaigoto_IsNotNull() { regNegaigoto(CK_ISNN, DOBJ); }

    protected void regNegaigoto(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNegaigoto(), "negaigoto"); }
    protected abstract ConditionValue xgetCValueNegaigoto();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * akinai: {varchar(30)}
     * @param akinai The value of akinai as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAkinai_Equal(String akinai) {
        doSetAkinai_Equal(fRES(akinai));
    }

    protected void doSetAkinai_Equal(String akinai) {
        regAkinai(CK_EQ, akinai);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * akinai: {varchar(30)}
     * @param akinai The value of akinai as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAkinai_NotEqual(String akinai) {
        doSetAkinai_NotEqual(fRES(akinai));
    }

    protected void doSetAkinai_NotEqual(String akinai) {
        regAkinai(CK_NES, akinai);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * akinai: {varchar(30)}
     * @param akinai The value of akinai as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAkinai_GreaterThan(String akinai) {
        regAkinai(CK_GT, fRES(akinai));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * akinai: {varchar(30)}
     * @param akinai The value of akinai as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAkinai_LessThan(String akinai) {
        regAkinai(CK_LT, fRES(akinai));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * akinai: {varchar(30)}
     * @param akinai The value of akinai as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAkinai_GreaterEqual(String akinai) {
        regAkinai(CK_GE, fRES(akinai));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * akinai: {varchar(30)}
     * @param akinai The value of akinai as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAkinai_LessEqual(String akinai) {
        regAkinai(CK_LE, fRES(akinai));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * akinai: {varchar(30)}
     * @param akinaiList The collection of akinai as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAkinai_InScope(Collection<String> akinaiList) {
        doSetAkinai_InScope(akinaiList);
    }

    protected void doSetAkinai_InScope(Collection<String> akinaiList) {
        regINS(CK_INS, cTL(akinaiList), xgetCValueAkinai(), "akinai");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * akinai: {varchar(30)}
     * @param akinaiList The collection of akinai as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAkinai_NotInScope(Collection<String> akinaiList) {
        doSetAkinai_NotInScope(akinaiList);
    }

    protected void doSetAkinai_NotInScope(Collection<String> akinaiList) {
        regINS(CK_NINS, cTL(akinaiList), xgetCValueAkinai(), "akinai");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * akinai: {varchar(30)} <br>
     * <pre>e.g. setAkinai_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param akinai The value of akinai as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setAkinai_LikeSearch(String akinai, ConditionOptionCall<LikeSearchOption> opLambda) {
        setAkinai_LikeSearch(akinai, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * akinai: {varchar(30)} <br>
     * <pre>e.g. setAkinai_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param akinai The value of akinai as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setAkinai_LikeSearch(String akinai, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(akinai), xgetCValueAkinai(), "akinai", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * akinai: {varchar(30)}
     * @param akinai The value of akinai as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setAkinai_NotLikeSearch(String akinai, ConditionOptionCall<LikeSearchOption> opLambda) {
        setAkinai_NotLikeSearch(akinai, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * akinai: {varchar(30)}
     * @param akinai The value of akinai as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setAkinai_NotLikeSearch(String akinai, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(akinai), xgetCValueAkinai(), "akinai", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * akinai: {varchar(30)}
     */
    public void setAkinai_IsNull() { regAkinai(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * akinai: {varchar(30)}
     */
    public void setAkinai_IsNullOrEmpty() { regAkinai(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * akinai: {varchar(30)}
     */
    public void setAkinai_IsNotNull() { regAkinai(CK_ISNN, DOBJ); }

    protected void regAkinai(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAkinai(), "akinai"); }
    protected abstract ConditionValue xgetCValueAkinai();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * gakumon: {varchar(30)}
     * @param gakumon The value of gakumon as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGakumon_Equal(String gakumon) {
        doSetGakumon_Equal(fRES(gakumon));
    }

    protected void doSetGakumon_Equal(String gakumon) {
        regGakumon(CK_EQ, gakumon);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * gakumon: {varchar(30)}
     * @param gakumon The value of gakumon as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGakumon_NotEqual(String gakumon) {
        doSetGakumon_NotEqual(fRES(gakumon));
    }

    protected void doSetGakumon_NotEqual(String gakumon) {
        regGakumon(CK_NES, gakumon);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * gakumon: {varchar(30)}
     * @param gakumon The value of gakumon as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGakumon_GreaterThan(String gakumon) {
        regGakumon(CK_GT, fRES(gakumon));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * gakumon: {varchar(30)}
     * @param gakumon The value of gakumon as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGakumon_LessThan(String gakumon) {
        regGakumon(CK_LT, fRES(gakumon));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * gakumon: {varchar(30)}
     * @param gakumon The value of gakumon as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGakumon_GreaterEqual(String gakumon) {
        regGakumon(CK_GE, fRES(gakumon));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * gakumon: {varchar(30)}
     * @param gakumon The value of gakumon as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGakumon_LessEqual(String gakumon) {
        regGakumon(CK_LE, fRES(gakumon));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * gakumon: {varchar(30)}
     * @param gakumonList The collection of gakumon as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGakumon_InScope(Collection<String> gakumonList) {
        doSetGakumon_InScope(gakumonList);
    }

    protected void doSetGakumon_InScope(Collection<String> gakumonList) {
        regINS(CK_INS, cTL(gakumonList), xgetCValueGakumon(), "gakumon");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * gakumon: {varchar(30)}
     * @param gakumonList The collection of gakumon as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGakumon_NotInScope(Collection<String> gakumonList) {
        doSetGakumon_NotInScope(gakumonList);
    }

    protected void doSetGakumon_NotInScope(Collection<String> gakumonList) {
        regINS(CK_NINS, cTL(gakumonList), xgetCValueGakumon(), "gakumon");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * gakumon: {varchar(30)} <br>
     * <pre>e.g. setGakumon_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param gakumon The value of gakumon as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setGakumon_LikeSearch(String gakumon, ConditionOptionCall<LikeSearchOption> opLambda) {
        setGakumon_LikeSearch(gakumon, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * gakumon: {varchar(30)} <br>
     * <pre>e.g. setGakumon_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param gakumon The value of gakumon as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setGakumon_LikeSearch(String gakumon, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(gakumon), xgetCValueGakumon(), "gakumon", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * gakumon: {varchar(30)}
     * @param gakumon The value of gakumon as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setGakumon_NotLikeSearch(String gakumon, ConditionOptionCall<LikeSearchOption> opLambda) {
        setGakumon_NotLikeSearch(gakumon, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * gakumon: {varchar(30)}
     * @param gakumon The value of gakumon as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setGakumon_NotLikeSearch(String gakumon, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(gakumon), xgetCValueGakumon(), "gakumon", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * gakumon: {varchar(30)}
     */
    public void setGakumon_IsNull() { regGakumon(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * gakumon: {varchar(30)}
     */
    public void setGakumon_IsNullOrEmpty() { regGakumon(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * gakumon: {varchar(30)}
     */
    public void setGakumon_IsNotNull() { regGakumon(CK_ISNN, DOBJ); }

    protected void regGakumon(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueGakumon(), "gakumon"); }
    protected abstract ConditionValue xgetCValueGakumon();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * updated_by: {NotNull, varchar(20)}
     * @param updatedBy The value of updatedBy as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdatedBy_Equal(String updatedBy) {
        doSetUpdatedBy_Equal(fRES(updatedBy));
    }

    protected void doSetUpdatedBy_Equal(String updatedBy) {
        regUpdatedBy(CK_EQ, updatedBy);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * updated_by: {NotNull, varchar(20)}
     * @param updatedBy The value of updatedBy as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdatedBy_NotEqual(String updatedBy) {
        doSetUpdatedBy_NotEqual(fRES(updatedBy));
    }

    protected void doSetUpdatedBy_NotEqual(String updatedBy) {
        regUpdatedBy(CK_NES, updatedBy);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * updated_by: {NotNull, varchar(20)}
     * @param updatedBy The value of updatedBy as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdatedBy_GreaterThan(String updatedBy) {
        regUpdatedBy(CK_GT, fRES(updatedBy));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * updated_by: {NotNull, varchar(20)}
     * @param updatedBy The value of updatedBy as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdatedBy_LessThan(String updatedBy) {
        regUpdatedBy(CK_LT, fRES(updatedBy));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * updated_by: {NotNull, varchar(20)}
     * @param updatedBy The value of updatedBy as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdatedBy_GreaterEqual(String updatedBy) {
        regUpdatedBy(CK_GE, fRES(updatedBy));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * updated_by: {NotNull, varchar(20)}
     * @param updatedBy The value of updatedBy as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdatedBy_LessEqual(String updatedBy) {
        regUpdatedBy(CK_LE, fRES(updatedBy));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * updated_by: {NotNull, varchar(20)}
     * @param updatedByList The collection of updatedBy as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdatedBy_InScope(Collection<String> updatedByList) {
        doSetUpdatedBy_InScope(updatedByList);
    }

    protected void doSetUpdatedBy_InScope(Collection<String> updatedByList) {
        regINS(CK_INS, cTL(updatedByList), xgetCValueUpdatedBy(), "updated_by");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * updated_by: {NotNull, varchar(20)}
     * @param updatedByList The collection of updatedBy as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdatedBy_NotInScope(Collection<String> updatedByList) {
        doSetUpdatedBy_NotInScope(updatedByList);
    }

    protected void doSetUpdatedBy_NotInScope(Collection<String> updatedByList) {
        regINS(CK_NINS, cTL(updatedByList), xgetCValueUpdatedBy(), "updated_by");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * updated_by: {NotNull, varchar(20)} <br>
     * <pre>e.g. setUpdatedBy_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param updatedBy The value of updatedBy as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setUpdatedBy_LikeSearch(String updatedBy, ConditionOptionCall<LikeSearchOption> opLambda) {
        setUpdatedBy_LikeSearch(updatedBy, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * updated_by: {NotNull, varchar(20)} <br>
     * <pre>e.g. setUpdatedBy_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param updatedBy The value of updatedBy as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setUpdatedBy_LikeSearch(String updatedBy, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(updatedBy), xgetCValueUpdatedBy(), "updated_by", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * updated_by: {NotNull, varchar(20)}
     * @param updatedBy The value of updatedBy as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setUpdatedBy_NotLikeSearch(String updatedBy, ConditionOptionCall<LikeSearchOption> opLambda) {
        setUpdatedBy_NotLikeSearch(updatedBy, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * updated_by: {NotNull, varchar(20)}
     * @param updatedBy The value of updatedBy as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setUpdatedBy_NotLikeSearch(String updatedBy, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(updatedBy), xgetCValueUpdatedBy(), "updated_by", likeSearchOption);
    }

    protected void regUpdatedBy(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUpdatedBy(), "updated_by"); }
    protected abstract ConditionValue xgetCValueUpdatedBy();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * updated_date: {date(13)}
     * @param updatedDate The value of updatedDate as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdatedDate_Equal(java.time.LocalDate updatedDate) {
        regUpdatedDate(CK_EQ,  updatedDate);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * updated_date: {date(13)}
     * @param updatedDate The value of updatedDate as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdatedDate_GreaterThan(java.time.LocalDate updatedDate) {
        regUpdatedDate(CK_GT,  updatedDate);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * updated_date: {date(13)}
     * @param updatedDate The value of updatedDate as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdatedDate_LessThan(java.time.LocalDate updatedDate) {
        regUpdatedDate(CK_LT,  updatedDate);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * updated_date: {date(13)}
     * @param updatedDate The value of updatedDate as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdatedDate_GreaterEqual(java.time.LocalDate updatedDate) {
        regUpdatedDate(CK_GE,  updatedDate);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * updated_date: {date(13)}
     * @param updatedDate The value of updatedDate as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdatedDate_LessEqual(java.time.LocalDate updatedDate) {
        regUpdatedDate(CK_LE, updatedDate);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * updated_date: {date(13)}
     * <pre>e.g. setUpdatedDate_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updatedDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updatedDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setUpdatedDate_FromTo(java.time.LocalDate fromDatetime, java.time.LocalDate toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setUpdatedDate_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * updated_date: {date(13)}
     * <pre>e.g. setUpdatedDate_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updatedDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updatedDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setUpdatedDate_FromTo(java.time.LocalDate fromDatetime, java.time.LocalDate toDatetime, FromToOption fromToOption) {
        String nm = "updated_date"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueUpdatedDate(), nm, op);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * updated_date: {date(13)}
     */
    public void setUpdatedDate_IsNull() { regUpdatedDate(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * updated_date: {date(13)}
     */
    public void setUpdatedDate_IsNotNull() { regUpdatedDate(CK_ISNN, DOBJ); }

    protected void regUpdatedDate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUpdatedDate(), "updated_date"); }
    protected abstract ConditionValue xgetCValueUpdatedDate();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * created_by: {NotNull, varchar(20)}
     * @param createdBy The value of createdBy as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreatedBy_Equal(String createdBy) {
        doSetCreatedBy_Equal(fRES(createdBy));
    }

    protected void doSetCreatedBy_Equal(String createdBy) {
        regCreatedBy(CK_EQ, createdBy);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * created_by: {NotNull, varchar(20)}
     * @param createdBy The value of createdBy as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreatedBy_NotEqual(String createdBy) {
        doSetCreatedBy_NotEqual(fRES(createdBy));
    }

    protected void doSetCreatedBy_NotEqual(String createdBy) {
        regCreatedBy(CK_NES, createdBy);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * created_by: {NotNull, varchar(20)}
     * @param createdBy The value of createdBy as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreatedBy_GreaterThan(String createdBy) {
        regCreatedBy(CK_GT, fRES(createdBy));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * created_by: {NotNull, varchar(20)}
     * @param createdBy The value of createdBy as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreatedBy_LessThan(String createdBy) {
        regCreatedBy(CK_LT, fRES(createdBy));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * created_by: {NotNull, varchar(20)}
     * @param createdBy The value of createdBy as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreatedBy_GreaterEqual(String createdBy) {
        regCreatedBy(CK_GE, fRES(createdBy));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * created_by: {NotNull, varchar(20)}
     * @param createdBy The value of createdBy as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreatedBy_LessEqual(String createdBy) {
        regCreatedBy(CK_LE, fRES(createdBy));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * created_by: {NotNull, varchar(20)}
     * @param createdByList The collection of createdBy as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreatedBy_InScope(Collection<String> createdByList) {
        doSetCreatedBy_InScope(createdByList);
    }

    protected void doSetCreatedBy_InScope(Collection<String> createdByList) {
        regINS(CK_INS, cTL(createdByList), xgetCValueCreatedBy(), "created_by");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * created_by: {NotNull, varchar(20)}
     * @param createdByList The collection of createdBy as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreatedBy_NotInScope(Collection<String> createdByList) {
        doSetCreatedBy_NotInScope(createdByList);
    }

    protected void doSetCreatedBy_NotInScope(Collection<String> createdByList) {
        regINS(CK_NINS, cTL(createdByList), xgetCValueCreatedBy(), "created_by");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * created_by: {NotNull, varchar(20)} <br>
     * <pre>e.g. setCreatedBy_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param createdBy The value of createdBy as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setCreatedBy_LikeSearch(String createdBy, ConditionOptionCall<LikeSearchOption> opLambda) {
        setCreatedBy_LikeSearch(createdBy, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * created_by: {NotNull, varchar(20)} <br>
     * <pre>e.g. setCreatedBy_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param createdBy The value of createdBy as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setCreatedBy_LikeSearch(String createdBy, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(createdBy), xgetCValueCreatedBy(), "created_by", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * created_by: {NotNull, varchar(20)}
     * @param createdBy The value of createdBy as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setCreatedBy_NotLikeSearch(String createdBy, ConditionOptionCall<LikeSearchOption> opLambda) {
        setCreatedBy_NotLikeSearch(createdBy, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * created_by: {NotNull, varchar(20)}
     * @param createdBy The value of createdBy as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setCreatedBy_NotLikeSearch(String createdBy, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(createdBy), xgetCValueCreatedBy(), "created_by", likeSearchOption);
    }

    protected void regCreatedBy(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCreatedBy(), "created_by"); }
    protected abstract ConditionValue xgetCValueCreatedBy();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * created_date: {date(13)}
     * @param createdDate The value of createdDate as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCreatedDate_Equal(java.time.LocalDate createdDate) {
        regCreatedDate(CK_EQ,  createdDate);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * created_date: {date(13)}
     * @param createdDate The value of createdDate as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCreatedDate_GreaterThan(java.time.LocalDate createdDate) {
        regCreatedDate(CK_GT,  createdDate);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * created_date: {date(13)}
     * @param createdDate The value of createdDate as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCreatedDate_LessThan(java.time.LocalDate createdDate) {
        regCreatedDate(CK_LT,  createdDate);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * created_date: {date(13)}
     * @param createdDate The value of createdDate as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCreatedDate_GreaterEqual(java.time.LocalDate createdDate) {
        regCreatedDate(CK_GE,  createdDate);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * created_date: {date(13)}
     * @param createdDate The value of createdDate as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCreatedDate_LessEqual(java.time.LocalDate createdDate) {
        regCreatedDate(CK_LE, createdDate);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * created_date: {date(13)}
     * <pre>e.g. setCreatedDate_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of createdDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of createdDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setCreatedDate_FromTo(java.time.LocalDate fromDatetime, java.time.LocalDate toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setCreatedDate_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * created_date: {date(13)}
     * <pre>e.g. setCreatedDate_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of createdDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of createdDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setCreatedDate_FromTo(java.time.LocalDate fromDatetime, java.time.LocalDate toDatetime, FromToOption fromToOption) {
        String nm = "created_date"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueCreatedDate(), nm, op);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * created_date: {date(13)}
     */
    public void setCreatedDate_IsNull() { regCreatedDate(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * created_date: {date(13)}
     */
    public void setCreatedDate_IsNotNull() { regCreatedDate(CK_ISNN, DOBJ); }

    protected void regCreatedDate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCreatedDate(), "created_date"); }
    protected abstract ConditionValue xgetCValueCreatedDate();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO = (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<OmikujiCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, OmikujiCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO &lt;&gt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<OmikujiCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, OmikujiCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br>
     * {where FOO &gt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<OmikujiCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, OmikujiCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br>
     * {where FOO &lt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<OmikujiCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, OmikujiCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br>
     * {where FOO &gt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<OmikujiCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, OmikujiCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;OmikujiCB&gt;() {
     *     public void query(OmikujiCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<OmikujiCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, OmikujiCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        OmikujiCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(OmikujiCQ sq);

    protected OmikujiCB xcreateScalarConditionCB() {
        OmikujiCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected OmikujiCB xcreateScalarConditionPartitionByCB() {
        OmikujiCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<OmikujiCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        OmikujiCB cb = new OmikujiCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "omikuji_code";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(OmikujiCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<OmikujiCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(OmikujiCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        OmikujiCB cb = new OmikujiCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "omikuji_code";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(OmikujiCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<OmikujiCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        OmikujiCB cb = new OmikujiCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(OmikujiCQ sq);

    // ===================================================================================
    //                                                                        Manual Order
    //                                                                        ============
    /**
     * Order along manual ordering information.
     * <pre>
     * cb.query().addOrderBy_Birthdate_Asc().<span style="color: #CC4747">withManualOrder</span>(<span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_GreaterEqual</span>(priorityDate); <span style="color: #3F7E5E">// e.g. 2000/01/01</span>
     * });
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when BIRTHDATE &gt;= '2000/01/01' then 0</span>
     * <span style="color: #3F7E5E">//     else 1</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     *
     * cb.query().addOrderBy_MemberStatusCode_Asc().<span style="color: #CC4747">withManualOrder</span>(<span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Withdrawal);
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Formalized);
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Provisional);
     * });
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'WDL' then 0</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'FML' then 1</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'PRV' then 2</span>
     * <span style="color: #3F7E5E">//     else 3</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     * </pre>
     * <p>This function with Union is unsupported!</p>
     * <p>The order values are bound (treated as bind parameter).</p>
     * @param opLambda The callback for option of manual-order containing order values. (NotNull)
     */
    public void withManualOrder(ManualOrderOptionCall opLambda) { // is user public!
        xdoWithManualOrder(cMOO(opLambda));
    }

    // ===================================================================================
    //                                                                    Small Adjustment
    //                                                                    ================
    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    protected OmikujiCB newMyCB() {
        return new OmikujiCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return OmikujiCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
