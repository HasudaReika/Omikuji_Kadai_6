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
 * The abstract condition-query of shipping.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsShippingCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsShippingCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "shipping";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * id: {PK, ID, NotNull, serial(10)}
     * @param id The value of id as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setId_Equal(Integer id) {
        doSetId_Equal(id);
    }

    protected void doSetId_Equal(Integer id) {
        regId(CK_EQ, id);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * id: {PK, ID, NotNull, serial(10)}
     * @param id The value of id as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setId_NotEqual(Integer id) {
        doSetId_NotEqual(id);
    }

    protected void doSetId_NotEqual(Integer id) {
        regId(CK_NES, id);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * id: {PK, ID, NotNull, serial(10)}
     * @param id The value of id as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setId_GreaterThan(Integer id) {
        regId(CK_GT, id);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * id: {PK, ID, NotNull, serial(10)}
     * @param id The value of id as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setId_LessThan(Integer id) {
        regId(CK_LT, id);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * id: {PK, ID, NotNull, serial(10)}
     * @param id The value of id as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setId_GreaterEqual(Integer id) {
        regId(CK_GE, id);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * id: {PK, ID, NotNull, serial(10)}
     * @param id The value of id as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setId_LessEqual(Integer id) {
        regId(CK_LE, id);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * id: {PK, ID, NotNull, serial(10)}
     * @param minNumber The min number of id. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of id. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * id: {PK, ID, NotNull, serial(10)}
     * @param minNumber The min number of id. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of id. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueId(), "id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * id: {PK, ID, NotNull, serial(10)}
     * @param idList The collection of id as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setId_InScope(Collection<Integer> idList) {
        doSetId_InScope(idList);
    }

    protected void doSetId_InScope(Collection<Integer> idList) {
        regINS(CK_INS, cTL(idList), xgetCValueId(), "id");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * id: {PK, ID, NotNull, serial(10)}
     * @param idList The collection of id as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setId_NotInScope(Collection<Integer> idList) {
        doSetId_NotInScope(idList);
    }

    protected void doSetId_NotInScope(Collection<Integer> idList) {
        regINS(CK_NINS, cTL(idList), xgetCValueId(), "id");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * id: {PK, ID, NotNull, serial(10)}
     */
    public void setId_IsNull() { regId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * id: {PK, ID, NotNull, serial(10)}
     */
    public void setId_IsNotNull() { regId(CK_ISNN, DOBJ); }

    protected void regId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueId(), "id"); }
    protected abstract ConditionValue xgetCValueId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * result_code: {int4(10), FK to result}
     * @param resultCode The value of resultCode as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setResultCode_Equal(Integer resultCode) {
        doSetResultCode_Equal(resultCode);
    }

    protected void doSetResultCode_Equal(Integer resultCode) {
        regResultCode(CK_EQ, resultCode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * result_code: {int4(10), FK to result}
     * @param resultCode The value of resultCode as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setResultCode_NotEqual(Integer resultCode) {
        doSetResultCode_NotEqual(resultCode);
    }

    protected void doSetResultCode_NotEqual(Integer resultCode) {
        regResultCode(CK_NES, resultCode);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * result_code: {int4(10), FK to result}
     * @param resultCode The value of resultCode as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setResultCode_GreaterThan(Integer resultCode) {
        regResultCode(CK_GT, resultCode);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * result_code: {int4(10), FK to result}
     * @param resultCode The value of resultCode as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setResultCode_LessThan(Integer resultCode) {
        regResultCode(CK_LT, resultCode);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * result_code: {int4(10), FK to result}
     * @param resultCode The value of resultCode as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setResultCode_GreaterEqual(Integer resultCode) {
        regResultCode(CK_GE, resultCode);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * result_code: {int4(10), FK to result}
     * @param resultCode The value of resultCode as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setResultCode_LessEqual(Integer resultCode) {
        regResultCode(CK_LE, resultCode);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * result_code: {int4(10), FK to result}
     * @param minNumber The min number of resultCode. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of resultCode. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setResultCode_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setResultCode_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * result_code: {int4(10), FK to result}
     * @param minNumber The min number of resultCode. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of resultCode. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setResultCode_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueResultCode(), "result_code", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * result_code: {int4(10), FK to result}
     * @param resultCodeList The collection of resultCode as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setResultCode_InScope(Collection<Integer> resultCodeList) {
        doSetResultCode_InScope(resultCodeList);
    }

    protected void doSetResultCode_InScope(Collection<Integer> resultCodeList) {
        regINS(CK_INS, cTL(resultCodeList), xgetCValueResultCode(), "result_code");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * result_code: {int4(10), FK to result}
     * @param resultCodeList The collection of resultCode as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setResultCode_NotInScope(Collection<Integer> resultCodeList) {
        doSetResultCode_NotInScope(resultCodeList);
    }

    protected void doSetResultCode_NotInScope(Collection<Integer> resultCodeList) {
        regINS(CK_NINS, cTL(resultCodeList), xgetCValueResultCode(), "result_code");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * result_code: {int4(10), FK to result}
     */
    public void setResultCode_IsNull() { regResultCode(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * result_code: {int4(10), FK to result}
     */
    public void setResultCode_IsNotNull() { regResultCode(CK_ISNN, DOBJ); }

    protected void regResultCode(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueResultCode(), "result_code"); }
    protected abstract ConditionValue xgetCValueResultCode();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * post_code: {NotNull, varchar(7)}
     * @param postCode The value of postCode as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPostCode_Equal(String postCode) {
        doSetPostCode_Equal(fRES(postCode));
    }

    protected void doSetPostCode_Equal(String postCode) {
        regPostCode(CK_EQ, postCode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * post_code: {NotNull, varchar(7)}
     * @param postCode The value of postCode as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPostCode_NotEqual(String postCode) {
        doSetPostCode_NotEqual(fRES(postCode));
    }

    protected void doSetPostCode_NotEqual(String postCode) {
        regPostCode(CK_NES, postCode);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * post_code: {NotNull, varchar(7)}
     * @param postCode The value of postCode as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPostCode_GreaterThan(String postCode) {
        regPostCode(CK_GT, fRES(postCode));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * post_code: {NotNull, varchar(7)}
     * @param postCode The value of postCode as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPostCode_LessThan(String postCode) {
        regPostCode(CK_LT, fRES(postCode));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * post_code: {NotNull, varchar(7)}
     * @param postCode The value of postCode as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPostCode_GreaterEqual(String postCode) {
        regPostCode(CK_GE, fRES(postCode));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * post_code: {NotNull, varchar(7)}
     * @param postCode The value of postCode as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPostCode_LessEqual(String postCode) {
        regPostCode(CK_LE, fRES(postCode));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * post_code: {NotNull, varchar(7)}
     * @param postCodeList The collection of postCode as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPostCode_InScope(Collection<String> postCodeList) {
        doSetPostCode_InScope(postCodeList);
    }

    protected void doSetPostCode_InScope(Collection<String> postCodeList) {
        regINS(CK_INS, cTL(postCodeList), xgetCValuePostCode(), "post_code");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * post_code: {NotNull, varchar(7)}
     * @param postCodeList The collection of postCode as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPostCode_NotInScope(Collection<String> postCodeList) {
        doSetPostCode_NotInScope(postCodeList);
    }

    protected void doSetPostCode_NotInScope(Collection<String> postCodeList) {
        regINS(CK_NINS, cTL(postCodeList), xgetCValuePostCode(), "post_code");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * post_code: {NotNull, varchar(7)} <br>
     * <pre>e.g. setPostCode_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param postCode The value of postCode as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setPostCode_LikeSearch(String postCode, ConditionOptionCall<LikeSearchOption> opLambda) {
        setPostCode_LikeSearch(postCode, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * post_code: {NotNull, varchar(7)} <br>
     * <pre>e.g. setPostCode_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param postCode The value of postCode as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setPostCode_LikeSearch(String postCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(postCode), xgetCValuePostCode(), "post_code", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * post_code: {NotNull, varchar(7)}
     * @param postCode The value of postCode as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setPostCode_NotLikeSearch(String postCode, ConditionOptionCall<LikeSearchOption> opLambda) {
        setPostCode_NotLikeSearch(postCode, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * post_code: {NotNull, varchar(7)}
     * @param postCode The value of postCode as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setPostCode_NotLikeSearch(String postCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(postCode), xgetCValuePostCode(), "post_code", likeSearchOption);
    }

    protected void regPostCode(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePostCode(), "post_code"); }
    protected abstract ConditionValue xgetCValuePostCode();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * address: {NotNull, varchar(200)}
     * @param address The value of address as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress_Equal(String address) {
        doSetAddress_Equal(fRES(address));
    }

    protected void doSetAddress_Equal(String address) {
        regAddress(CK_EQ, address);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * address: {NotNull, varchar(200)}
     * @param address The value of address as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress_NotEqual(String address) {
        doSetAddress_NotEqual(fRES(address));
    }

    protected void doSetAddress_NotEqual(String address) {
        regAddress(CK_NES, address);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * address: {NotNull, varchar(200)}
     * @param address The value of address as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress_GreaterThan(String address) {
        regAddress(CK_GT, fRES(address));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * address: {NotNull, varchar(200)}
     * @param address The value of address as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress_LessThan(String address) {
        regAddress(CK_LT, fRES(address));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * address: {NotNull, varchar(200)}
     * @param address The value of address as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress_GreaterEqual(String address) {
        regAddress(CK_GE, fRES(address));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * address: {NotNull, varchar(200)}
     * @param address The value of address as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress_LessEqual(String address) {
        regAddress(CK_LE, fRES(address));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * address: {NotNull, varchar(200)}
     * @param addressList The collection of address as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress_InScope(Collection<String> addressList) {
        doSetAddress_InScope(addressList);
    }

    protected void doSetAddress_InScope(Collection<String> addressList) {
        regINS(CK_INS, cTL(addressList), xgetCValueAddress(), "address");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * address: {NotNull, varchar(200)}
     * @param addressList The collection of address as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress_NotInScope(Collection<String> addressList) {
        doSetAddress_NotInScope(addressList);
    }

    protected void doSetAddress_NotInScope(Collection<String> addressList) {
        regINS(CK_NINS, cTL(addressList), xgetCValueAddress(), "address");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * address: {NotNull, varchar(200)} <br>
     * <pre>e.g. setAddress_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param address The value of address as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setAddress_LikeSearch(String address, ConditionOptionCall<LikeSearchOption> opLambda) {
        setAddress_LikeSearch(address, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * address: {NotNull, varchar(200)} <br>
     * <pre>e.g. setAddress_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param address The value of address as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setAddress_LikeSearch(String address, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(address), xgetCValueAddress(), "address", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * address: {NotNull, varchar(200)}
     * @param address The value of address as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setAddress_NotLikeSearch(String address, ConditionOptionCall<LikeSearchOption> opLambda) {
        setAddress_NotLikeSearch(address, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * address: {NotNull, varchar(200)}
     * @param address The value of address as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setAddress_NotLikeSearch(String address, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(address), xgetCValueAddress(), "address", likeSearchOption);
    }

    protected void regAddress(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAddress(), "address"); }
    protected abstract ConditionValue xgetCValueAddress();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * name: {NotNull, varchar(30)}
     * @param name The value of name as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setName_Equal(String name) {
        doSetName_Equal(fRES(name));
    }

    protected void doSetName_Equal(String name) {
        regName(CK_EQ, name);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * name: {NotNull, varchar(30)}
     * @param name The value of name as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setName_NotEqual(String name) {
        doSetName_NotEqual(fRES(name));
    }

    protected void doSetName_NotEqual(String name) {
        regName(CK_NES, name);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * name: {NotNull, varchar(30)}
     * @param name The value of name as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setName_GreaterThan(String name) {
        regName(CK_GT, fRES(name));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * name: {NotNull, varchar(30)}
     * @param name The value of name as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setName_LessThan(String name) {
        regName(CK_LT, fRES(name));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * name: {NotNull, varchar(30)}
     * @param name The value of name as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setName_GreaterEqual(String name) {
        regName(CK_GE, fRES(name));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * name: {NotNull, varchar(30)}
     * @param name The value of name as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setName_LessEqual(String name) {
        regName(CK_LE, fRES(name));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * name: {NotNull, varchar(30)}
     * @param nameList The collection of name as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setName_InScope(Collection<String> nameList) {
        doSetName_InScope(nameList);
    }

    protected void doSetName_InScope(Collection<String> nameList) {
        regINS(CK_INS, cTL(nameList), xgetCValueName(), "name");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * name: {NotNull, varchar(30)}
     * @param nameList The collection of name as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setName_NotInScope(Collection<String> nameList) {
        doSetName_NotInScope(nameList);
    }

    protected void doSetName_NotInScope(Collection<String> nameList) {
        regINS(CK_NINS, cTL(nameList), xgetCValueName(), "name");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * name: {NotNull, varchar(30)} <br>
     * <pre>e.g. setName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param name The value of name as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setName_LikeSearch(String name, ConditionOptionCall<LikeSearchOption> opLambda) {
        setName_LikeSearch(name, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * name: {NotNull, varchar(30)} <br>
     * <pre>e.g. setName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param name The value of name as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setName_LikeSearch(String name, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(name), xgetCValueName(), "name", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * name: {NotNull, varchar(30)}
     * @param name The value of name as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setName_NotLikeSearch(String name, ConditionOptionCall<LikeSearchOption> opLambda) {
        setName_NotLikeSearch(name, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * name: {NotNull, varchar(30)}
     * @param name The value of name as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setName_NotLikeSearch(String name, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(name), xgetCValueName(), "name", likeSearchOption);
    }

    protected void regName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueName(), "name"); }
    protected abstract ConditionValue xgetCValueName();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * phone: {NotNull, varchar(11)}
     * @param phone The value of phone as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhone_Equal(String phone) {
        doSetPhone_Equal(fRES(phone));
    }

    protected void doSetPhone_Equal(String phone) {
        regPhone(CK_EQ, phone);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * phone: {NotNull, varchar(11)}
     * @param phone The value of phone as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhone_NotEqual(String phone) {
        doSetPhone_NotEqual(fRES(phone));
    }

    protected void doSetPhone_NotEqual(String phone) {
        regPhone(CK_NES, phone);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * phone: {NotNull, varchar(11)}
     * @param phone The value of phone as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhone_GreaterThan(String phone) {
        regPhone(CK_GT, fRES(phone));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * phone: {NotNull, varchar(11)}
     * @param phone The value of phone as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhone_LessThan(String phone) {
        regPhone(CK_LT, fRES(phone));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * phone: {NotNull, varchar(11)}
     * @param phone The value of phone as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhone_GreaterEqual(String phone) {
        regPhone(CK_GE, fRES(phone));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * phone: {NotNull, varchar(11)}
     * @param phone The value of phone as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhone_LessEqual(String phone) {
        regPhone(CK_LE, fRES(phone));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * phone: {NotNull, varchar(11)}
     * @param phoneList The collection of phone as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhone_InScope(Collection<String> phoneList) {
        doSetPhone_InScope(phoneList);
    }

    protected void doSetPhone_InScope(Collection<String> phoneList) {
        regINS(CK_INS, cTL(phoneList), xgetCValuePhone(), "phone");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * phone: {NotNull, varchar(11)}
     * @param phoneList The collection of phone as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhone_NotInScope(Collection<String> phoneList) {
        doSetPhone_NotInScope(phoneList);
    }

    protected void doSetPhone_NotInScope(Collection<String> phoneList) {
        regINS(CK_NINS, cTL(phoneList), xgetCValuePhone(), "phone");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * phone: {NotNull, varchar(11)} <br>
     * <pre>e.g. setPhone_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param phone The value of phone as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setPhone_LikeSearch(String phone, ConditionOptionCall<LikeSearchOption> opLambda) {
        setPhone_LikeSearch(phone, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * phone: {NotNull, varchar(11)} <br>
     * <pre>e.g. setPhone_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param phone The value of phone as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setPhone_LikeSearch(String phone, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(phone), xgetCValuePhone(), "phone", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * phone: {NotNull, varchar(11)}
     * @param phone The value of phone as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setPhone_NotLikeSearch(String phone, ConditionOptionCall<LikeSearchOption> opLambda) {
        setPhone_NotLikeSearch(phone, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * phone: {NotNull, varchar(11)}
     * @param phone The value of phone as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setPhone_NotLikeSearch(String phone, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(phone), xgetCValuePhone(), "phone", likeSearchOption);
    }

    protected void regPhone(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePhone(), "phone"); }
    protected abstract ConditionValue xgetCValuePhone();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * mail: {NotNull, varchar(200)}
     * @param mail The value of mail as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMail_Equal(String mail) {
        doSetMail_Equal(fRES(mail));
    }

    protected void doSetMail_Equal(String mail) {
        regMail(CK_EQ, mail);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * mail: {NotNull, varchar(200)}
     * @param mail The value of mail as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMail_NotEqual(String mail) {
        doSetMail_NotEqual(fRES(mail));
    }

    protected void doSetMail_NotEqual(String mail) {
        regMail(CK_NES, mail);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * mail: {NotNull, varchar(200)}
     * @param mail The value of mail as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMail_GreaterThan(String mail) {
        regMail(CK_GT, fRES(mail));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * mail: {NotNull, varchar(200)}
     * @param mail The value of mail as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMail_LessThan(String mail) {
        regMail(CK_LT, fRES(mail));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * mail: {NotNull, varchar(200)}
     * @param mail The value of mail as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMail_GreaterEqual(String mail) {
        regMail(CK_GE, fRES(mail));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * mail: {NotNull, varchar(200)}
     * @param mail The value of mail as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMail_LessEqual(String mail) {
        regMail(CK_LE, fRES(mail));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * mail: {NotNull, varchar(200)}
     * @param mailList The collection of mail as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMail_InScope(Collection<String> mailList) {
        doSetMail_InScope(mailList);
    }

    protected void doSetMail_InScope(Collection<String> mailList) {
        regINS(CK_INS, cTL(mailList), xgetCValueMail(), "mail");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * mail: {NotNull, varchar(200)}
     * @param mailList The collection of mail as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMail_NotInScope(Collection<String> mailList) {
        doSetMail_NotInScope(mailList);
    }

    protected void doSetMail_NotInScope(Collection<String> mailList) {
        regINS(CK_NINS, cTL(mailList), xgetCValueMail(), "mail");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * mail: {NotNull, varchar(200)} <br>
     * <pre>e.g. setMail_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param mail The value of mail as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setMail_LikeSearch(String mail, ConditionOptionCall<LikeSearchOption> opLambda) {
        setMail_LikeSearch(mail, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * mail: {NotNull, varchar(200)} <br>
     * <pre>e.g. setMail_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param mail The value of mail as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setMail_LikeSearch(String mail, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(mail), xgetCValueMail(), "mail", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * mail: {NotNull, varchar(200)}
     * @param mail The value of mail as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setMail_NotLikeSearch(String mail, ConditionOptionCall<LikeSearchOption> opLambda) {
        setMail_NotLikeSearch(mail, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * mail: {NotNull, varchar(200)}
     * @param mail The value of mail as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setMail_NotLikeSearch(String mail, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(mail), xgetCValueMail(), "mail", likeSearchOption);
    }

    protected void regMail(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMail(), "mail"); }
    protected abstract ConditionValue xgetCValueMail();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * updated_date: {NotNull, date(13)}
     * @param updatedDate The value of updatedDate as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdatedDate_Equal(java.time.LocalDate updatedDate) {
        regUpdatedDate(CK_EQ,  updatedDate);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * updated_date: {NotNull, date(13)}
     * @param updatedDate The value of updatedDate as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdatedDate_GreaterThan(java.time.LocalDate updatedDate) {
        regUpdatedDate(CK_GT,  updatedDate);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * updated_date: {NotNull, date(13)}
     * @param updatedDate The value of updatedDate as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdatedDate_LessThan(java.time.LocalDate updatedDate) {
        regUpdatedDate(CK_LT,  updatedDate);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * updated_date: {NotNull, date(13)}
     * @param updatedDate The value of updatedDate as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdatedDate_GreaterEqual(java.time.LocalDate updatedDate) {
        regUpdatedDate(CK_GE,  updatedDate);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * updated_date: {NotNull, date(13)}
     * @param updatedDate The value of updatedDate as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdatedDate_LessEqual(java.time.LocalDate updatedDate) {
        regUpdatedDate(CK_LE, updatedDate);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * updated_date: {NotNull, date(13)}
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
     * updated_date: {NotNull, date(13)}
     * <pre>e.g. setUpdatedDate_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updatedDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updatedDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setUpdatedDate_FromTo(java.time.LocalDate fromDatetime, java.time.LocalDate toDatetime, FromToOption fromToOption) {
        String nm = "updated_date"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueUpdatedDate(), nm, op);
    }

    protected void regUpdatedDate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUpdatedDate(), "updated_date"); }
    protected abstract ConditionValue xgetCValueUpdatedDate();

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
    public HpSLCFunction<ShippingCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, ShippingCB.class);
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
    public HpSLCFunction<ShippingCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, ShippingCB.class);
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
    public HpSLCFunction<ShippingCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, ShippingCB.class);
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
    public HpSLCFunction<ShippingCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, ShippingCB.class);
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
    public HpSLCFunction<ShippingCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, ShippingCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;ShippingCB&gt;() {
     *     public void query(ShippingCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<ShippingCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, ShippingCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        ShippingCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(ShippingCQ sq);

    protected ShippingCB xcreateScalarConditionCB() {
        ShippingCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected ShippingCB xcreateScalarConditionPartitionByCB() {
        ShippingCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<ShippingCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        ShippingCB cb = new ShippingCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "id";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(ShippingCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<ShippingCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(ShippingCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        ShippingCB cb = new ShippingCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "id";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(ShippingCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<ShippingCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        ShippingCB cb = new ShippingCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(ShippingCQ sq);

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
    protected ShippingCB newMyCB() {
        return new ShippingCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return ShippingCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
