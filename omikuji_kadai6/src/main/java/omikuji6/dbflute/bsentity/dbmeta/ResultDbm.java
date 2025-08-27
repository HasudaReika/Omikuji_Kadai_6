package omikuji6.dbflute.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.dbflute.Entity;
import org.dbflute.optional.OptionalEntity;
import org.dbflute.dbmeta.AbstractDBMeta;
import org.dbflute.dbmeta.info.*;
import org.dbflute.dbmeta.name.*;
import org.dbflute.dbmeta.property.PropertyGateway;
import org.dbflute.dbway.DBDef;
import omikuji6.dbflute.allcommon.*;
import omikuji6.dbflute.exentity.*;

/**
 * The DB meta of result. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class ResultDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final ResultDbm _instance = new ResultDbm();
    private ResultDbm() {}
    public static ResultDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((Result)et).getFortuneTellingDate(), (et, vl) -> ((Result)et).setFortuneTellingDate(ctld(vl)), "fortuneTellingDate");
        setupEpg(_epgMap, et -> ((Result)et).getBirthday(), (et, vl) -> ((Result)et).setBirthday(ctld(vl)), "birthday");
        setupEpg(_epgMap, et -> ((Result)et).getOmikujiCode(), (et, vl) -> ((Result)et).setOmikujiCode(cti(vl)), "omikujiCode");
        setupEpg(_epgMap, et -> ((Result)et).getUpdatedBy(), (et, vl) -> ((Result)et).setUpdatedBy((String)vl), "updatedBy");
        setupEpg(_epgMap, et -> ((Result)et).getUpdatedDate(), (et, vl) -> ((Result)et).setUpdatedDate(ctld(vl)), "updatedDate");
        setupEpg(_epgMap, et -> ((Result)et).getCreatedBy(), (et, vl) -> ((Result)et).setCreatedBy((String)vl), "createdBy");
        setupEpg(_epgMap, et -> ((Result)et).getCreatedDate(), (et, vl) -> ((Result)et).setCreatedDate(ctld(vl)), "createdDate");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    @SuppressWarnings("unchecked")
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((Result)et).getOmikuji(), (et, vl) -> ((Result)et).setOmikuji((OptionalEntity<Omikuji>)vl), "omikuji");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "result";
    protected final String _tableDispName = "result";
    protected final String _tablePropertyName = "result";
    protected final TableSqlName _tableSqlName = new TableSqlName("result", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnFortuneTellingDate = cci("fortune_telling_date", "fortune_telling_date", null, null, java.time.LocalDate.class, "fortuneTellingDate", null, false, false, false, "date", 13, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBirthday = cci("birthday", "birthday", null, null, java.time.LocalDate.class, "birthday", null, false, false, false, "date", 13, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOmikujiCode = cci("omikuji_code", "omikuji_code", null, null, Integer.class, "omikujiCode", null, false, false, false, "int4", 10, 0, null, null, false, null, null, "omikuji", null, null, false);
    protected final ColumnInfo _columnUpdatedBy = cci("updated_by", "updated_by", null, null, String.class, "updatedBy", null, false, false, true, "varchar", 20, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdatedDate = cci("updated_date", "updated_date", null, null, java.time.LocalDate.class, "updatedDate", null, false, false, false, "date", 13, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCreatedBy = cci("created_by", "created_by", null, null, String.class, "createdBy", null, false, false, true, "varchar", 20, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCreatedDate = cci("created_date", "created_date", null, null, java.time.LocalDate.class, "createdDate", null, false, false, false, "date", 13, 0, null, null, false, null, null, null, null, null, false);

    /**
     * fortune_telling_date: {date(13)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFortuneTellingDate() { return _columnFortuneTellingDate; }
    /**
     * birthday: {date(13)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBirthday() { return _columnBirthday; }
    /**
     * omikuji_code: {int4(10), FK to omikuji}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOmikujiCode() { return _columnOmikujiCode; }
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
        ls.add(columnFortuneTellingDate());
        ls.add(columnBirthday());
        ls.add(columnOmikujiCode());
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
    /**
     * omikuji by my omikuji_code, named 'omikuji'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignOmikuji() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnOmikujiCode(), OmikujiDbm.getInstance().columnOmikujiCode());
        return cfi("fk_result_omikuji", "omikuji", this, OmikujiDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "resultList", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "omikuji6.dbflute.exentity.Result"; }
    public String getConditionBeanTypeName() { return "omikuji6.dbflute.cbean.ResultCB"; }
    public String getBehaviorTypeName() { return "omikuji6.dbflute.exbhv.ResultBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<Result> getEntityType() { return Result.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Result newEntity() { return new Result(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((Result)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((Result)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
