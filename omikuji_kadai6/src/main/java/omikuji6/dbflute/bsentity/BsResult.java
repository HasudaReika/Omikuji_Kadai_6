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
 * The entity of result as TABLE.
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsResult extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** fortune_telling_date: {date(13)} */
    protected java.time.LocalDate _fortuneTellingDate;

    /** birthday: {date(13)} */
    protected java.time.LocalDate _birthday;

    /** omikuji_code: {int4(10), FK to omikuji} */
    protected Integer _omikujiCode;

    /** updated_by: {NotNull, varchar(20)} */
    protected String _updatedBy;

    /** updated_date: {date(13)} */
    protected java.time.LocalDate _updatedDate;

    /** created_by: {NotNull, varchar(20)} */
    protected String _createdBy;

    /** created_date: {date(13)} */
    protected java.time.LocalDate _createdDate;

    /** result_code: {PK, ID, NotNull, serial(10)} */
    protected Integer _resultCode;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "result";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_resultCode == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** omikuji by my omikuji_code, named 'omikuji'. */
    protected OptionalEntity<Omikuji> _omikuji;

    /**
     * [get] omikuji by my omikuji_code, named 'omikuji'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'omikuji'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<Omikuji> getOmikuji() {
        if (_omikuji == null) { _omikuji = OptionalEntity.relationEmpty(this, "omikuji"); }
        return _omikuji;
    }

    /**
     * [set] omikuji by my omikuji_code, named 'omikuji'.
     * @param omikuji The entity of foreign property 'omikuji'. (NullAllowed)
     */
    public void setOmikuji(OptionalEntity<Omikuji> omikuji) {
        _omikuji = omikuji;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** shipping by result_code, named 'shippingList'. */
    protected List<Shipping> _shippingList;

    /**
     * [get] shipping by result_code, named 'shippingList'.
     * @return The entity list of referrer property 'shippingList'. (NotNull: even if no loading, returns empty list)
     */
    public List<Shipping> getShippingList() {
        if (_shippingList == null) { _shippingList = newReferrerList(); }
        return _shippingList;
    }

    /**
     * [set] shipping by result_code, named 'shippingList'.
     * @param shippingList The entity list of referrer property 'shippingList'. (NullAllowed)
     */
    public void setShippingList(List<Shipping> shippingList) {
        _shippingList = shippingList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsResult) {
            BsResult other = (BsResult)obj;
            if (!xSV(_resultCode, other._resultCode)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _resultCode);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_omikuji != null && _omikuji.isPresent())
        { sb.append(li).append(xbRDS(_omikuji, "omikuji")); }
        if (_shippingList != null) { for (Shipping et : _shippingList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "shippingList")); } } }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_fortuneTellingDate));
        sb.append(dm).append(xfND(_birthday));
        sb.append(dm).append(xfND(_omikujiCode));
        sb.append(dm).append(xfND(_updatedBy));
        sb.append(dm).append(xfND(_updatedDate));
        sb.append(dm).append(xfND(_createdBy));
        sb.append(dm).append(xfND(_createdDate));
        sb.append(dm).append(xfND(_resultCode));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_omikuji != null && _omikuji.isPresent())
        { sb.append(dm).append("omikuji"); }
        if (_shippingList != null && !_shippingList.isEmpty())
        { sb.append(dm).append("shippingList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public Result clone() {
        return (Result)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] fortune_telling_date: {date(13)} <br>
     * @return The value of the column 'fortune_telling_date'. (NullAllowed even if selected: for no constraint)
     */
    public java.time.LocalDate getFortuneTellingDate() {
        checkSpecifiedProperty("fortuneTellingDate");
        return _fortuneTellingDate;
    }

    /**
     * [set] fortune_telling_date: {date(13)} <br>
     * @param fortuneTellingDate The value of the column 'fortune_telling_date'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFortuneTellingDate(java.time.LocalDate fortuneTellingDate) {
        registerModifiedProperty("fortuneTellingDate");
        _fortuneTellingDate = fortuneTellingDate;
    }

    /**
     * [get] birthday: {date(13)} <br>
     * @return The value of the column 'birthday'. (NullAllowed even if selected: for no constraint)
     */
    public java.time.LocalDate getBirthday() {
        checkSpecifiedProperty("birthday");
        return _birthday;
    }

    /**
     * [set] birthday: {date(13)} <br>
     * @param birthday The value of the column 'birthday'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBirthday(java.time.LocalDate birthday) {
        registerModifiedProperty("birthday");
        _birthday = birthday;
    }

    /**
     * [get] omikuji_code: {int4(10), FK to omikuji} <br>
     * @return The value of the column 'omikuji_code'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getOmikujiCode() {
        checkSpecifiedProperty("omikujiCode");
        return _omikujiCode;
    }

    /**
     * [set] omikuji_code: {int4(10), FK to omikuji} <br>
     * @param omikujiCode The value of the column 'omikuji_code'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOmikujiCode(Integer omikujiCode) {
        registerModifiedProperty("omikujiCode");
        _omikujiCode = omikujiCode;
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

    /**
     * [get] result_code: {PK, ID, NotNull, serial(10)} <br>
     * @return The value of the column 'result_code'. (basically NotNull if selected: for the constraint)
     */
    public Integer getResultCode() {
        checkSpecifiedProperty("resultCode");
        return _resultCode;
    }

    /**
     * [set] result_code: {PK, ID, NotNull, serial(10)} <br>
     * @param resultCode The value of the column 'result_code'. (basically NotNull if update: for the constraint)
     */
    public void setResultCode(Integer resultCode) {
        registerModifiedProperty("resultCode");
        _resultCode = resultCode;
    }
}
