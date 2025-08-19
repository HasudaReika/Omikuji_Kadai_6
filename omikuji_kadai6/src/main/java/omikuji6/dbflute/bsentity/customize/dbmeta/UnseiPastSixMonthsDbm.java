package omikuji6.dbflute.bsentity.customize.dbmeta;

import java.util.List;
import java.util.Map;

import org.dbflute.Entity;
import org.dbflute.dbmeta.AbstractDBMeta;
import org.dbflute.dbmeta.info.*;
import org.dbflute.dbmeta.name.*;
import org.dbflute.dbmeta.property.PropertyGateway;
import org.dbflute.dbway.DBDef;
import omikuji6.dbflute.allcommon.*;
import omikuji6.dbflute.exentity.customize.*;

/**
 * The DB meta of UnseiPastSixMonths. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class UnseiPastSixMonthsDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final UnseiPastSixMonthsDbm _instance = new UnseiPastSixMonthsDbm();
    private UnseiPastSixMonthsDbm() {}
    public static UnseiPastSixMonthsDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public String getProjectName() { return DBCurrent.getInstance().projectName(); }
    public String getProjectPrefix() { return DBCurrent.getInstance().projectPrefix(); }
    public String getGenerationGapBasePrefix() { return DBCurrent.getInstance().generationGapBasePrefix(); }
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    // -----------------------------------------------------
    //                                       Column Property
    //                                       ---------------
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    { xsetupEpg(); }
    protected void xsetupEpg() {
        setupEpg(_epgMap, et -> ((UnseiPastSixMonths)et).getFortuneName(), (et, vl) -> ((UnseiPastSixMonths)et).setFortuneName((String)vl), "fortuneName");
        setupEpg(_epgMap, et -> ((UnseiPastSixMonths)et).getCount(), (et, vl) -> ((UnseiPastSixMonths)et).setCount(ctl(vl)), "count");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "UnseiPastSixMonths";
    protected final String _tableDispName = "UnseiPastSixMonths";
    protected final String _tablePropertyName = "unseiPastSixMonths";
    protected final TableSqlName _tableSqlName = new TableSqlName("UnseiPastSixMonths", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnFortuneName = cci("fortune_name", "fortune_name", null, null, String.class, "fortuneName", null, false, false, false, "varchar", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCount = cci("count", "count", null, null, Long.class, "count", null, false, false, false, "int8", 19, 0, null, null, false, null, null, null, null, null, false);

    /**
     * fortune_name: {varchar(10), refers to fortune_master.fortune_name}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFortuneName() { return _columnFortuneName; }
    /**
     * count: {int8(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCount() { return _columnCount; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnFortuneName());
        ls.add(columnCount());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() {
        throw new UnsupportedOperationException("The table does not have primary key: " + getTableDbName());
    }
    public boolean hasPrimaryKey() { return false; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "omikuji6.dbflute.exentity.customize.UnseiPastSixMonths"; }
    public String getConditionBeanTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<UnseiPastSixMonths> getEntityType() { return UnseiPastSixMonths.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public UnseiPastSixMonths newEntity() { return new UnseiPastSixMonths(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((UnseiPastSixMonths)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((UnseiPastSixMonths)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
