package omikuji6.dbflute.bsentity.customize;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.CustomizeEntity;
import omikuji6.dbflute.exentity.customize.*;

/**
 * The entity of UnseiToday.
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsUnseiToday extends AbstractEntity implements CustomizeEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** fortune_name: {varchar(10), refers to fortune_master.fortune_name} */
    protected String _fortuneName;

    /** count: {int8(19)} */
    protected Long _count;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return omikuji6.dbflute.bsentity.customize.dbmeta.UnseiTodayDbm.getInstance();
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "UnseiToday";
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
        if (obj instanceof BsUnseiToday) {
            BsUnseiToday other = (BsUnseiToday)obj;
            if (!xSV(_fortuneName, other._fortuneName)) { return false; }
            if (!xSV(_count, other._count)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _fortuneName);
        hs = xCH(hs, _count);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_fortuneName));
        sb.append(dm).append(xfND(_count));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        return "";
    }

    @Override
    public UnseiToday clone() {
        return (UnseiToday)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] fortune_name: {varchar(10), refers to fortune_master.fortune_name} <br>
     * @return The value of the column 'fortune_name'. (NullAllowed even if selected: for no constraint)
     */
    public String getFortuneName() {
        checkSpecifiedProperty("fortuneName");
        return _fortuneName;
    }

    /**
     * [set] fortune_name: {varchar(10), refers to fortune_master.fortune_name} <br>
     * @param fortuneName The value of the column 'fortune_name'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFortuneName(String fortuneName) {
        registerModifiedProperty("fortuneName");
        _fortuneName = fortuneName;
    }

    /**
     * [get] count: {int8(19)} <br>
     * @return The value of the column 'count'. (NullAllowed even if selected: for no constraint)
     */
    public Long getCount() {
        checkSpecifiedProperty("count");
        return _count;
    }

    /**
     * [set] count: {int8(19)} <br>
     * @param count The value of the column 'count'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCount(Long count) {
        registerModifiedProperty("count");
        _count = count;
    }
}
