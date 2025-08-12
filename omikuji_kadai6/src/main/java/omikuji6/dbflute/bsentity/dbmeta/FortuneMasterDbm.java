package omikuji6.dbflute.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.dbflute.Entity;
import org.dbflute.dbmeta.AbstractDBMeta;
import org.dbflute.dbmeta.info.*;
import org.dbflute.dbmeta.name.*;
import org.dbflute.dbmeta.property.PropertyGateway;
import org.dbflute.dbway.DBDef;
import omikuji6.dbflute.allcommon.*;
import omikuji6.dbflute.exentity.*;

/**
 * The DB meta of fortune_master. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class FortuneMasterDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final FortuneMasterDbm _instance = new FortuneMasterDbm();
    private FortuneMasterDbm() {}
    public static FortuneMasterDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((FortuneMaster)et).getFortuneCode(), (et, vl) -> ((FortuneMaster)et).setFortuneCode(cti(vl)), "fortuneCode");
        setupEpg(_epgMap, et -> ((FortuneMaster)et).getFortuneName(), (et, vl) -> ((FortuneMaster)et).setFortuneName((String)vl), "fortuneName");
        setupEpg(_epgMap, et -> ((FortuneMaster)et).getUpdatedBy(), (et, vl) -> ((FortuneMaster)et).setUpdatedBy((String)vl), "updatedBy");
        setupEpg(_epgMap, et -> ((FortuneMaster)et).getUpdatedDate(), (et, vl) -> ((FortuneMaster)et).setUpdatedDate(ctld(vl)), "updatedDate");
        setupEpg(_epgMap, et -> ((FortuneMaster)et).getCreatedBy(), (et, vl) -> ((FortuneMaster)et).setCreatedBy((String)vl), "createdBy");
        setupEpg(_epgMap, et -> ((FortuneMaster)et).getCreatedDate(), (et, vl) -> ((FortuneMaster)et).setCreatedDate(ctld(vl)), "createdDate");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "fortune_master";
    protected final String _tableDispName = "fortune_master";
    protected final String _tablePropertyName = "fortuneMaster";
    protected final TableSqlName _tableSqlName = new TableSqlName("fortune_master", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnFortuneCode = cci("fortune_code", "fortune_code", null, null, Integer.class, "fortuneCode", null, true, false, true, "int4", 10, 0, null, null, false, null, null, null, "omikujiList", null, false);
    protected final ColumnInfo _columnFortuneName = cci("fortune_name", "fortune_name", null, null, String.class, "fortuneName", null, false, false, true, "varchar", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdatedBy = cci("updated_by", "updated_by", null, null, String.class, "updatedBy", null, false, false, true, "varchar", 20, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdatedDate = cci("updated_date", "updated_date", null, null, java.time.LocalDate.class, "updatedDate", null, false, false, false, "date", 13, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCreatedBy = cci("created_by", "created_by", null, null, String.class, "createdBy", null, false, false, true, "varchar", 20, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCreatedDate = cci("created_date", "created_date", null, null, java.time.LocalDate.class, "createdDate", null, false, false, false, "date", 13, 0, null, null, false, null, null, null, null, null, false);

    /**
     * fortune_code: {PK, NotNull, int4(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFortuneCode() { return _columnFortuneCode; }
    /**
     * fortune_name: {NotNull, varchar(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFortuneName() { return _columnFortuneName; }
    /**
     * updated_by: {NotNull, varchar(20)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdatedBy() { return _columnUpdatedBy; }
    /**
     * updated_date: {date(13)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdatedDate() { return _columnUpdatedDate; }
    /**
     * created_by: {NotNull, varchar(20)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCreatedBy() { return _columnCreatedBy; }
    /**
     * created_date: {date(13)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCreatedDate() { return _columnCreatedDate; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnFortuneCode());
        ls.add(columnFortuneName());
        ls.add(columnUpdatedBy());
        ls.add(columnUpdatedDate());
        ls.add(columnCreatedBy());
        ls.add(columnCreatedDate());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnFortuneCode()); }
    public boolean hasPrimaryKey() { return true; }
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
    /**
     * omikuji by fortune_code, named 'omikujiList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerOmikujiList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnFortuneCode(), OmikujiDbm.getInstance().columnFortuneCode());
        return cri("omikuji_fortune_code_fkey", "omikujiList", this, OmikujiDbm.getInstance(), mp, false, "fortuneMaster");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "omikuji6.dbflute.exentity.FortuneMaster"; }
    public String getConditionBeanTypeName() { return "omikuji6.dbflute.cbean.FortuneMasterCB"; }
    public String getBehaviorTypeName() { return "omikuji6.dbflute.exbhv.FortuneMasterBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<FortuneMaster> getEntityType() { return FortuneMaster.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public FortuneMaster newEntity() { return new FortuneMaster(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((FortuneMaster)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((FortuneMaster)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
