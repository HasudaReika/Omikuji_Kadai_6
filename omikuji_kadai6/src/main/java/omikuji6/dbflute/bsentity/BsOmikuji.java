package omikuji6.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.Entity;
import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import org.dbflute.optional.OptionalEntity;
import omikuji6.dbflute.allcommon.DBMetaInstanceHandler;
import omikuji6.dbflute.exentity.*;

/**
 * The entity of omikuji as TABLE.
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsOmikuji extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** omikuji_code: {PK, NotNull, int4(10)} */
    protected Integer _omikujiCode;

    /** fortune_code: {int4(10), FK to fortune_master} */
    protected Integer _fortuneCode;

    /** negaigoto: {varchar(30)} */
    protected String _negaigoto;

    /** akinai: {varchar(30)} */
    protected String _akinai;

    /** gakumon: {varchar(30)} */
    protected String _gakumon;

    /** updated_by: {NotNull, varchar(20)} */
    protected String _updatedBy;

    /** updated_date: {date(13)} */
    protected java.time.LocalDate _updatedDate;

    /** created_by: {NotNull, varchar(20)} */
    protected String _createdBy;

    /** created_date: {date(13)} */
    protected java.time.LocalDate _createdDate;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "omikuji";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_omikujiCode == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** fortune_master by my fortune_code, named 'fortuneMaster'. */
    protected OptionalEntity<FortuneMaster> _fortuneMaster;

    /**
     * [get] fortune_master by my fortune_code, named 'fortuneMaster'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'fortuneMaster'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<FortuneMaster> getFortuneMaster() {
        if (_fortuneMaster == null) { _fortuneMaster = OptionalEntity.relationEmpty(this, "fortuneMaster"); }
        return _fortuneMaster;
    }

    /**
     * [set] fortune_master by my fortune_code, named 'fortuneMaster'.
     * @param fortuneMaster The entity of foreign property 'fortuneMaster'. (NullAllowed)
     */
    public void setFortuneMaster(OptionalEntity<FortuneMaster> fortuneMaster) {
        _fortuneMaster = fortuneMaster;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** result by omikuji_code, named 'resultList'. */
    protected List<Result> _resultList;

    /**
     * [get] result by omikuji_code, named 'resultList'.
     * @return The entity list of referrer property 'resultList'. (NotNull: even if no loading, returns empty list)
     */
    public List<Result> getResultList() {
        if (_resultList == null) { _resultList = newReferrerList(); }
        return _resultList;
    }

    /**
     * [set] result by omikuji_code, named 'resultList'.
     * @param resultList The entity list of referrer property 'resultList'. (NullAllowed)
     */
    public void setResultList(List<Result> resultList) {
        _resultList = resultList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsOmikuji) {
            BsOmikuji other = (BsOmikuji)obj;
            if (!xSV(_omikujiCode, other._omikujiCode)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _omikujiCode);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_fortuneMaster != null && _fortuneMaster.isPresent())
        { sb.append(li).append(xbRDS(_fortuneMaster, "fortuneMaster")); }
        if (_resultList != null) { for (Result et : _resultList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "resultList")); } } }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_omikujiCode));
        sb.append(dm).append(xfND(_fortuneCode));
        sb.append(dm).append(xfND(_negaigoto));
        sb.append(dm).append(xfND(_akinai));
        sb.append(dm).append(xfND(_gakumon));
        sb.append(dm).append(xfND(_updatedBy));
        sb.append(dm).append(xfND(_updatedDate));
        sb.append(dm).append(xfND(_createdBy));
        sb.append(dm).append(xfND(_createdDate));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_fortuneMaster != null && _fortuneMaster.isPresent())
        { sb.append(dm).append("fortuneMaster"); }
        if (_resultList != null && !_resultList.isEmpty())
        { sb.append(dm).append("resultList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public Omikuji clone() {
        return (Omikuji)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] omikuji_code: {PK, NotNull, int4(10)} <br>
     * @return The value of the column 'omikuji_code'. (basically NotNull if selected: for the constraint)
     */
    public Integer getOmikujiCode() {
        checkSpecifiedProperty("omikujiCode");
        return _omikujiCode;
    }

    /**
     * [set] omikuji_code: {PK, NotNull, int4(10)} <br>
     * @param omikujiCode The value of the column 'omikuji_code'. (basically NotNull if update: for the constraint)
     */
    public void setOmikujiCode(Integer omikujiCode) {
        registerModifiedProperty("omikujiCode");
        _omikujiCode = omikujiCode;
    }

    /**
     * [get] fortune_code: {int4(10), FK to fortune_master} <br>
     * @return The value of the column 'fortune_code'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getFortuneCode() {
        checkSpecifiedProperty("fortuneCode");
        return _fortuneCode;
    }

    /**
     * [set] fortune_code: {int4(10), FK to fortune_master} <br>
     * @param fortuneCode The value of the column 'fortune_code'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFortuneCode(Integer fortuneCode) {
        registerModifiedProperty("fortuneCode");
        _fortuneCode = fortuneCode;
    }

    /**
     * [get] negaigoto: {varchar(30)} <br>
     * @return The value of the column 'negaigoto'. (NullAllowed even if selected: for no constraint)
     */
    public String getNegaigoto() {
        checkSpecifiedProperty("negaigoto");
        return _negaigoto;
    }

    /**
     * [set] negaigoto: {varchar(30)} <br>
     * @param negaigoto The value of the column 'negaigoto'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNegaigoto(String negaigoto) {
        registerModifiedProperty("negaigoto");
        _negaigoto = negaigoto;
    }

    /**
     * [get] akinai: {varchar(30)} <br>
     * @return The value of the column 'akinai'. (NullAllowed even if selected: for no constraint)
     */
    public String getAkinai() {
        checkSpecifiedProperty("akinai");
        return _akinai;
    }

    /**
     * [set] akinai: {varchar(30)} <br>
     * @param akinai The value of the column 'akinai'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAkinai(String akinai) {
        registerModifiedProperty("akinai");
        _akinai = akinai;
    }

    /**
     * [get] gakumon: {varchar(30)} <br>
     * @return The value of the column 'gakumon'. (NullAllowed even if selected: for no constraint)
     */
    public String getGakumon() {
        checkSpecifiedProperty("gakumon");
        return _gakumon;
    }

    /**
     * [set] gakumon: {varchar(30)} <br>
     * @param gakumon The value of the column 'gakumon'. (NullAllowed: null update allowed for no constraint)
     */
    public void setGakumon(String gakumon) {
        registerModifiedProperty("gakumon");
        _gakumon = gakumon;
    }

    /**
     * [get] updated_by: {NotNull, varchar(20)} <br>
     * @return The value of the column 'updated_by'. (basically NotNull if selected: for the constraint)
     */
    public String getUpdatedBy() {
        checkSpecifiedProperty("updatedBy");
        return _updatedBy;
    }

    /**
     * [set] updated_by: {NotNull, varchar(20)} <br>
     * @param updatedBy The value of the column 'updated_by'. (basically NotNull if update: for the constraint)
     */
    public void setUpdatedBy(String updatedBy) {
        registerModifiedProperty("updatedBy");
        _updatedBy = updatedBy;
    }

    /**
     * [get] updated_date: {date(13)} <br>
     * @return The value of the column 'updated_date'. (NullAllowed even if selected: for no constraint)
     */
    public java.time.LocalDate getUpdatedDate() {
        checkSpecifiedProperty("updatedDate");
        return _updatedDate;
    }

    /**
     * [set] updated_date: {date(13)} <br>
     * @param updatedDate The value of the column 'updated_date'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUpdatedDate(java.time.LocalDate updatedDate) {
        registerModifiedProperty("updatedDate");
        _updatedDate = updatedDate;
    }

    /**
     * [get] created_by: {NotNull, varchar(20)} <br>
     * @return The value of the column 'created_by'. (basically NotNull if selected: for the constraint)
     */
    public String getCreatedBy() {
        checkSpecifiedProperty("createdBy");
        return _createdBy;
    }

    /**
     * [set] created_by: {NotNull, varchar(20)} <br>
     * @param createdBy The value of the column 'created_by'. (basically NotNull if update: for the constraint)
     */
    public void setCreatedBy(String createdBy) {
        registerModifiedProperty("createdBy");
        _createdBy = createdBy;
    }

    /**
     * [get] created_date: {date(13)} <br>
     * @return The value of the column 'created_date'. (NullAllowed even if selected: for no constraint)
     */
    public java.time.LocalDate getCreatedDate() {
        checkSpecifiedProperty("createdDate");
        return _createdDate;
    }

    /**
     * [set] created_date: {date(13)} <br>
     * @param createdDate The value of the column 'created_date'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCreatedDate(java.time.LocalDate createdDate) {
        registerModifiedProperty("createdDate");
        _createdDate = createdDate;
    }
}
