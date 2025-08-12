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
        return false;
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
            if (!xSV(_fortuneTellingDate, other._fortuneTellingDate)) { return false; }
            if (!xSV(_birthday, other._birthday)) { return false; }
            if (!xSV(_omikujiCode, other._omikujiCode)) { return false; }
            if (!xSV(_updatedBy, other._updatedBy)) { return false; }
            if (!xSV(_updatedDate, other._updatedDate)) { return false; }
            if (!xSV(_createdBy, other._createdBy)) { return false; }
            if (!xSV(_createdDate, other._createdDate)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _fortuneTellingDate);
        hs = xCH(hs, _birthday);
        hs = xCH(hs, _omikujiCode);
        hs = xCH(hs, _updatedBy);
        hs = xCH(hs, _updatedDate);
        hs = xCH(hs, _createdBy);
        hs = xCH(hs, _createdDate);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_omikuji != null && _omikuji.isPresent())
        { sb.append(li).append(xbRDS(_omikuji, "omikuji")); }
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
}
