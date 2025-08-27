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
 * The DB meta of omikuji. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class OmikujiDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final OmikujiDbm _instance = new OmikujiDbm();
    private OmikujiDbm() {}
    public static OmikujiDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((Omikuji)et).getOmikujiCode(), (et, vl) -> ((Omikuji)et).setOmikujiCode(cti(vl)), "omikujiCode");
        setupEpg(_epgMap, et -> ((Omikuji)et).getFortuneCode(), (et, vl) -> ((Omikuji)et).setFortuneCode(cti(vl)), "fortuneCode");
        setupEpg(_epgMap, et -> ((Omikuji)et).getNegaigoto(), (et, vl) -> ((Omikuji)et).setNegaigoto((String)vl), "negaigoto");
        setupEpg(_epgMap, et -> ((Omikuji)et).getAkinai(), (et, vl) -> ((Omikuji)et).setAkinai((String)vl), "akinai");
        setupEpg(_epgMap, et -> ((Omikuji)et).getGakumon(), (et, vl) -> ((Omikuji)et).setGakumon((String)vl), "gakumon");
        setupEpg(_epgMap, et -> ((Omikuji)et).getUpdatedBy(), (et, vl) -> ((Omikuji)et).setUpdatedBy((String)vl), "updatedBy");
        setupEpg(_epgMap, et -> ((Omikuji)et).getUpdatedDate(), (et, vl) -> ((Omikuji)et).setUpdatedDate(ctld(vl)), "updatedDate");
        setupEpg(_epgMap, et -> ((Omikuji)et).getCreatedBy(), (et, vl) -> ((Omikuji)et).setCreatedBy((String)vl), "createdBy");
        setupEpg(_epgMap, et -> ((Omikuji)et).getCreatedDate(), (et, vl) -> ((Omikuji)et).setCreatedDate(ctld(vl)), "createdDate");
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
        setupEfpg(_efpgMap, et -> ((Omikuji)et).getFortuneMaster(), (et, vl) -> ((Omikuji)et).setFortuneMaster((OptionalEntity<FortuneMaster>)vl), "fortuneMaster");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "omikuji";
    protected final String _tableDispName = "omikuji";
    protected final String _tablePropertyName = "omikuji";
    protected final TableSqlName _tableSqlName = new TableSqlName("omikuji", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnOmikujiCode = cci("omikuji_code", "omikuji_code", null, null, Integer.class, "omikujiCode", null, true, false, true, "int4", 10, 0, null, null, false, null, null, null, "resultList", null, false);
    protected final ColumnInfo _columnFortuneCode = cci("fortune_code", "fortune_code", null, null, Integer.class, "fortuneCode", null, false, false, false, "int4", 10, 0, null, null, false, null, null, "fortuneMaster", null, null, false);
    protected final ColumnInfo _columnNegaigoto = cci("negaigoto", "negaigoto", null, null, String.class, "negaigoto", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAkinai = cci("akinai", "akinai", null, null, String.class, "akinai", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnGakumon = cci("gakumon", "gakumon", null, null, String.class, "gakumon", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdatedBy = cci("updated_by", "updated_by", null, null, String.class, "updatedBy", null, false, false, true, "varchar", 20, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdatedDate = cci("updated_date", "updated_date", null, null, java.time.LocalDate.class, "updatedDate", null, false, false, false, "date", 13, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCreatedBy = cci("created_by", "created_by", null, null, String.class, "createdBy", null, false, false, true, "varchar", 20, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCreatedDate = cci("created_date", "created_date", null, null, java.time.LocalDate.class, "createdDate", null, false, false, false, "date", 13, 0, null, null, false, null, null, null, null, null, false);

    /**
     * omikuji_code: {PK, NotNull, int4(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOmikujiCode() { return _columnOmikujiCode; }
    /**
     * fortune_code: {int4(10), FK to fortune_master}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFortuneCode() { return _columnFortuneCode; }
    /**
     * negaigoto: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNegaigoto() { return _columnNegaigoto; }
    /**
     * akinai: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAkinai() { return _columnAkinai; }
    /**
     * gakumon: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnGakumon() { return _columnGakumon; }
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
        ls.add(columnOmikujiCode());
        ls.add(columnFortuneCode());
        ls.add(columnNegaigoto());
        ls.add(columnAkinai());
        ls.add(columnGakumon());
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
    protected UniqueInfo cpui() { return hpcpui(columnOmikujiCode()); }
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
    /**
     * fortune_master by my fortune_code, named 'fortuneMaster'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignFortuneMaster() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnFortuneCode(), FortuneMasterDbm.getInstance().columnFortuneCode());
        return cfi("omikuji_fortune_code_fkey", "fortuneMaster", this, FortuneMasterDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "omikujiList", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * result by omikuji_code, named 'resultList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerResultList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnOmikujiCode(), ResultDbm.getInstance().columnOmikujiCode());
        return cri("fk_result_omikuji", "resultList", this, ResultDbm.getInstance(), mp, false, "omikuji");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasSequence() { return true; }
    public String getSequenceName() { return "SEQ_OMIKUJI_CODE"; }
    public Integer getSequenceIncrementSize() { return 1; }
    public Integer getSequenceCacheSize() { return null; }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "omikuji6.dbflute.exentity.Omikuji"; }
    public String getConditionBeanTypeName() { return "omikuji6.dbflute.cbean.OmikujiCB"; }
    public String getBehaviorTypeName() { return "omikuji6.dbflute.exbhv.OmikujiBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<Omikuji> getEntityType() { return Omikuji.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Omikuji newEntity() { return new Omikuji(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((Omikuji)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((Omikuji)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
