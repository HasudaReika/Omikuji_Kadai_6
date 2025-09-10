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
 * The entity of shipping as TABLE.
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsShipping extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** id: {PK, ID, NotNull, serial(10)} */
    protected Integer _id;

    /** result_code: {int4(10), FK to result} */
    protected Integer _resultCode;

    /** post_code: {NotNull, varchar(7)} */
    protected String _postCode;

    /** address: {NotNull, varchar(200)} */
    protected String _address;

    /** name: {NotNull, varchar(30)} */
    protected String _name;

    /** phone: {NotNull, varchar(11)} */
    protected String _phone;

    /** mail: {NotNull, varchar(200)} */
    protected String _mail;

    /** updated_date: {NotNull, date(13)} */
    protected java.time.LocalDate _updatedDate;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "shipping";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_id == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** result by my result_code, named 'result'. */
    protected OptionalEntity<Result> _result;

    /**
     * [get] result by my result_code, named 'result'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'result'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<Result> getResult() {
        if (_result == null) { _result = OptionalEntity.relationEmpty(this, "result"); }
        return _result;
    }

    /**
     * [set] result by my result_code, named 'result'.
     * @param result The entity of foreign property 'result'. (NullAllowed)
     */
    public void setResult(OptionalEntity<Result> result) {
        _result = result;
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
        if (obj instanceof BsShipping) {
            BsShipping other = (BsShipping)obj;
            if (!xSV(_id, other._id)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _id);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_result != null && _result.isPresent())
        { sb.append(li).append(xbRDS(_result, "result")); }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_id));
        sb.append(dm).append(xfND(_resultCode));
        sb.append(dm).append(xfND(_postCode));
        sb.append(dm).append(xfND(_address));
        sb.append(dm).append(xfND(_name));
        sb.append(dm).append(xfND(_phone));
        sb.append(dm).append(xfND(_mail));
        sb.append(dm).append(xfND(_updatedDate));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_result != null && _result.isPresent())
        { sb.append(dm).append("result"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public Shipping clone() {
        return (Shipping)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] id: {PK, ID, NotNull, serial(10)} <br>
     * @return The value of the column 'id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getId() {
        checkSpecifiedProperty("id");
        return _id;
    }

    /**
     * [set] id: {PK, ID, NotNull, serial(10)} <br>
     * @param id The value of the column 'id'. (basically NotNull if update: for the constraint)
     */
    public void setId(Integer id) {
        registerModifiedProperty("id");
        _id = id;
    }

    /**
     * [get] result_code: {int4(10), FK to result} <br>
     * @return The value of the column 'result_code'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getResultCode() {
        checkSpecifiedProperty("resultCode");
        return _resultCode;
    }

    /**
     * [set] result_code: {int4(10), FK to result} <br>
     * @param resultCode The value of the column 'result_code'. (NullAllowed: null update allowed for no constraint)
     */
    public void setResultCode(Integer resultCode) {
        registerModifiedProperty("resultCode");
        _resultCode = resultCode;
    }

    /**
     * [get] post_code: {NotNull, varchar(7)} <br>
     * @return The value of the column 'post_code'. (basically NotNull if selected: for the constraint)
     */
    public String getPostCode() {
        checkSpecifiedProperty("postCode");
        return _postCode;
    }

    /**
     * [set] post_code: {NotNull, varchar(7)} <br>
     * @param postCode The value of the column 'post_code'. (basically NotNull if update: for the constraint)
     */
    public void setPostCode(String postCode) {
        registerModifiedProperty("postCode");
        _postCode = postCode;
    }

    /**
     * [get] address: {NotNull, varchar(200)} <br>
     * @return The value of the column 'address'. (basically NotNull if selected: for the constraint)
     */
    public String getAddress() {
        checkSpecifiedProperty("address");
        return _address;
    }

    /**
     * [set] address: {NotNull, varchar(200)} <br>
     * @param address The value of the column 'address'. (basically NotNull if update: for the constraint)
     */
    public void setAddress(String address) {
        registerModifiedProperty("address");
        _address = address;
    }

    /**
     * [get] name: {NotNull, varchar(30)} <br>
     * @return The value of the column 'name'. (basically NotNull if selected: for the constraint)
     */
    public String getName() {
        checkSpecifiedProperty("name");
        return _name;
    }

    /**
     * [set] name: {NotNull, varchar(30)} <br>
     * @param name The value of the column 'name'. (basically NotNull if update: for the constraint)
     */
    public void setName(String name) {
        registerModifiedProperty("name");
        _name = name;
    }

    /**
     * [get] phone: {NotNull, varchar(11)} <br>
     * @return The value of the column 'phone'. (basically NotNull if selected: for the constraint)
     */
    public String getPhone() {
        checkSpecifiedProperty("phone");
        return _phone;
    }

    /**
     * [set] phone: {NotNull, varchar(11)} <br>
     * @param phone The value of the column 'phone'. (basically NotNull if update: for the constraint)
     */
    public void setPhone(String phone) {
        registerModifiedProperty("phone");
        _phone = phone;
    }

    /**
     * [get] mail: {NotNull, varchar(200)} <br>
     * @return The value of the column 'mail'. (basically NotNull if selected: for the constraint)
     */
    public String getMail() {
        checkSpecifiedProperty("mail");
        return _mail;
    }

    /**
     * [set] mail: {NotNull, varchar(200)} <br>
     * @param mail The value of the column 'mail'. (basically NotNull if update: for the constraint)
     */
    public void setMail(String mail) {
        registerModifiedProperty("mail");
        _mail = mail;
    }

    /**
     * [get] updated_date: {NotNull, date(13)} <br>
     * @return The value of the column 'updated_date'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDate getUpdatedDate() {
        checkSpecifiedProperty("updatedDate");
        return _updatedDate;
    }

    /**
     * [set] updated_date: {NotNull, date(13)} <br>
     * @param updatedDate The value of the column 'updated_date'. (basically NotNull if update: for the constraint)
     */
    public void setUpdatedDate(java.time.LocalDate updatedDate) {
        registerModifiedProperty("updatedDate");
        _updatedDate = updatedDate;
    }
}
