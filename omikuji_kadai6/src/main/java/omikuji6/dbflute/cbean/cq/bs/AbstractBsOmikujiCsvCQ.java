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
 * The abstract condition-query of omikuji_csv.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsOmikujiCsvCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsOmikujiCsvCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "omikuji_csv";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * number: {NotNull, serial(10), default=[nextval('omikuji_csv_number_seq'::regclass)]}
     * @param number The value of number as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setNumber_Equal(Integer number) {
        doSetNumber_Equal(number);
    }

    protected void doSetNumber_Equal(Integer number) {
        regNumber(CK_EQ, number);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * number: {NotNull, serial(10), default=[nextval('omikuji_csv_number_seq'::regclass)]}
     * @param number The value of number as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNumber_NotEqual(Integer number) {
        doSetNumber_NotEqual(number);
    }

    protected void doSetNumber_NotEqual(Integer number) {
        regNumber(CK_NES, number);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * number: {NotNull, serial(10), default=[nextval('omikuji_csv_number_seq'::regclass)]}
     * @param number The value of number as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNumber_GreaterThan(Integer number) {
        regNumber(CK_GT, number);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * number: {NotNull, serial(10), default=[nextval('omikuji_csv_number_seq'::regclass)]}
     * @param number The value of number as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNumber_LessThan(Integer number) {
        regNumber(CK_LT, number);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * number: {NotNull, serial(10), default=[nextval('omikuji_csv_number_seq'::regclass)]}
     * @param number The value of number as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNumber_GreaterEqual(Integer number) {
        regNumber(CK_GE, number);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * number: {NotNull, serial(10), default=[nextval('omikuji_csv_number_seq'::regclass)]}
     * @param number The value of number as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNumber_LessEqual(Integer number) {
        regNumber(CK_LE, number);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * number: {NotNull, serial(10), default=[nextval('omikuji_csv_number_seq'::regclass)]}
     * @param minNumber The min number of number. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of number. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setNumber_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setNumber_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * number: {NotNull, serial(10), default=[nextval('omikuji_csv_number_seq'::regclass)]}
     * @param minNumber The min number of number. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of number. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setNumber_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueNumber(), "number", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * number: {NotNull, serial(10), default=[nextval('omikuji_csv_number_seq'::regclass)]}
     * @param numberList The collection of number as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNumber_InScope(Collection<Integer> numberList) {
        doSetNumber_InScope(numberList);
    }

    protected void doSetNumber_InScope(Collection<Integer> numberList) {
        regINS(CK_INS, cTL(numberList), xgetCValueNumber(), "number");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * number: {NotNull, serial(10), default=[nextval('omikuji_csv_number_seq'::regclass)]}
     * @param numberList The collection of number as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNumber_NotInScope(Collection<Integer> numberList) {
        doSetNumber_NotInScope(numberList);
    }

    protected void doSetNumber_NotInScope(Collection<Integer> numberList) {
        regINS(CK_NINS, cTL(numberList), xgetCValueNumber(), "number");
    }

    protected void regNumber(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNumber(), "number"); }
    protected abstract ConditionValue xgetCValueNumber();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * unsei: {varchar(10)}
     * @param unsei The value of unsei as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnsei_Equal(String unsei) {
        doSetUnsei_Equal(fRES(unsei));
    }

    protected void doSetUnsei_Equal(String unsei) {
        regUnsei(CK_EQ, unsei);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * unsei: {varchar(10)}
     * @param unsei The value of unsei as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnsei_NotEqual(String unsei) {
        doSetUnsei_NotEqual(fRES(unsei));
    }

    protected void doSetUnsei_NotEqual(String unsei) {
        regUnsei(CK_NES, unsei);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * unsei: {varchar(10)}
     * @param unsei The value of unsei as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnsei_GreaterThan(String unsei) {
        regUnsei(CK_GT, fRES(unsei));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * unsei: {varchar(10)}
     * @param unsei The value of unsei as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnsei_LessThan(String unsei) {
        regUnsei(CK_LT, fRES(unsei));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * unsei: {varchar(10)}
     * @param unsei The value of unsei as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnsei_GreaterEqual(String unsei) {
        regUnsei(CK_GE, fRES(unsei));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * unsei: {varchar(10)}
     * @param unsei The value of unsei as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnsei_LessEqual(String unsei) {
        regUnsei(CK_LE, fRES(unsei));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * unsei: {varchar(10)}
     * @param unseiList The collection of unsei as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnsei_InScope(Collection<String> unseiList) {
        doSetUnsei_InScope(unseiList);
    }

    protected void doSetUnsei_InScope(Collection<String> unseiList) {
        regINS(CK_INS, cTL(unseiList), xgetCValueUnsei(), "unsei");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * unsei: {varchar(10)}
     * @param unseiList The collection of unsei as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnsei_NotInScope(Collection<String> unseiList) {
        doSetUnsei_NotInScope(unseiList);
    }

    protected void doSetUnsei_NotInScope(Collection<String> unseiList) {
        regINS(CK_NINS, cTL(unseiList), xgetCValueUnsei(), "unsei");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * unsei: {varchar(10)} <br>
     * <pre>e.g. setUnsei_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param unsei The value of unsei as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setUnsei_LikeSearch(String unsei, ConditionOptionCall<LikeSearchOption> opLambda) {
        setUnsei_LikeSearch(unsei, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * unsei: {varchar(10)} <br>
     * <pre>e.g. setUnsei_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param unsei The value of unsei as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setUnsei_LikeSearch(String unsei, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(unsei), xgetCValueUnsei(), "unsei", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * unsei: {varchar(10)}
     * @param unsei The value of unsei as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setUnsei_NotLikeSearch(String unsei, ConditionOptionCall<LikeSearchOption> opLambda) {
        setUnsei_NotLikeSearch(unsei, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * unsei: {varchar(10)}
     * @param unsei The value of unsei as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setUnsei_NotLikeSearch(String unsei, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(unsei), xgetCValueUnsei(), "unsei", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * unsei: {varchar(10)}
     */
    public void setUnsei_IsNull() { regUnsei(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * unsei: {varchar(10)}
     */
    public void setUnsei_IsNullOrEmpty() { regUnsei(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * unsei: {varchar(10)}
     */
    public void setUnsei_IsNotNull() { regUnsei(CK_ISNN, DOBJ); }

    protected void regUnsei(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUnsei(), "unsei"); }
    protected abstract ConditionValue xgetCValueUnsei();

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
    public HpSLCFunction<OmikujiCsvCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, OmikujiCsvCB.class);
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
    public HpSLCFunction<OmikujiCsvCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, OmikujiCsvCB.class);
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
    public HpSLCFunction<OmikujiCsvCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, OmikujiCsvCB.class);
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
    public HpSLCFunction<OmikujiCsvCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, OmikujiCsvCB.class);
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
    public HpSLCFunction<OmikujiCsvCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, OmikujiCsvCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;OmikujiCsvCB&gt;() {
     *     public void query(OmikujiCsvCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<OmikujiCsvCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, OmikujiCsvCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        OmikujiCsvCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(OmikujiCsvCQ sq);

    protected OmikujiCsvCB xcreateScalarConditionCB() {
        OmikujiCsvCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected OmikujiCsvCB xcreateScalarConditionPartitionByCB() {
        OmikujiCsvCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

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
    protected OmikujiCsvCB newMyCB() {
        return new OmikujiCsvCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return OmikujiCsvCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
