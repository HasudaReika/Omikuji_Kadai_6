package omikuji6.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import omikuji6.dbflute.allcommon.DBMetaInstanceHandler;
import omikuji6.dbflute.exentity.*;

/**
 * The entity of fortune_master as TABLE.
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsFortuneMaster extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** fortune_code: {PK, NotNull, int4(10)} */
    protected Integer _fortuneCode;

    /** fortune_name: {NotNull, varchar(10)} */
    protected String _fortuneName;

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
        return "fortune_master";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_fortuneCode == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** omikuji by fortune_code, named 'omikujiList'. */
    protected List<Omikuji> _omikujiList;

    /**
     * [get] omikuji by fortune_code, named 'omikujiList'.
     * @return The entity list of referrer property 'omikujiList'. (NotNull: even if no loading, returns empty list)
     */
    public List<Omikuji> getOmikujiList() {
        if (_omikujiList == null) { _omikujiList = newReferrerList(); }
        return _omikujiList;
    }

    /**
     * [set] omikuji by fortune_code, named 'omikujiList'.
     * @param omikujiList The entity list of referrer property 'omikujiList'. (NullAllowed)
     */
    public void setOmikujiList(List<Omikuji> omikujiList) {
        _omikujiList = omikujiList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsFortuneMaster) {
            BsFortuneMaster other = (BsFortuneMaster)obj;
            if (!xSV(_fortuneCode, other._fortuneCode)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _fortuneCode);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_omikujiList != null) { for (Omikuji et : _omikujiList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "omikujiList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_fortuneCode));
        sb.append(dm).append(xfND(_fortuneName));
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
        if (_omikujiList != null && !_omikujiList.isEmpty())
        { sb.append(dm).append("omikujiList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public FortuneMaster clone() {
        return (FortuneMaster)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] fortune_code: {PK, NotNull, int4(10)} <br>
     * @return The value of the column 'fortune_code'. (basically NotNull if selected: for the constraint)
     */
    public Integer getFortuneCode() {
        checkSpecifiedProperty("fortuneCode");
        return _fortuneCode;
    }

    /**
     * [set] fortune_code: {PK, NotNull, int4(10)} <br>
     * @param fortuneCode The value of the column 'fortune_code'. (basically NotNull if update: for the constraint)
     */
    public void setFortuneCode(Integer fortuneCode) {
        registerModifiedProperty("fortuneCode");
        _fortuneCode = fortuneCode;
    }

    /**
     * [get] fortune_name: {NotNull, varchar(10)} <br>
     * @return The value of the column 'fortune_name'. (basically NotNull if selected: for the constraint)
     */
    public String getFortuneName() {
        checkSpecifiedProperty("fortuneName");
        return _fortuneName;
    }

    /**
     * [set] fortune_name: {NotNull, varchar(10)} <br>
     * @param fortuneName The value of the column 'fortune_name'. (basically NotNull if update: for the constraint)
     */
    public void setFortuneName(String fortuneName) {
        registerModifiedProperty("fortuneName");
        _fortuneName = fortuneName;
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
