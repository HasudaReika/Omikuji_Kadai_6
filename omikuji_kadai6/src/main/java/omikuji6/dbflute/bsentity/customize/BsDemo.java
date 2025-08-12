package omikuji6.dbflute.bsentity.customize;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.CustomizeEntity;
import omikuji6.dbflute.exentity.customize.*;

/**
 * The entity of Demo.
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsDemo extends AbstractEntity implements CustomizeEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** count: {int8(19)} */
    protected Long _count;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return omikuji6.dbflute.bsentity.customize.dbmeta.DemoDbm.getInstance();
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "Demo";
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
        if (obj instanceof BsDemo) {
            BsDemo other = (BsDemo)obj;
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
    public Demo clone() {
        return (Demo)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
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
