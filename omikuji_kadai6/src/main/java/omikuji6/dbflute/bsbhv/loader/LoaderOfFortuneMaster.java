package omikuji6.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import omikuji6.dbflute.exbhv.*;
import omikuji6.dbflute.exentity.*;
import omikuji6.dbflute.cbean.*;

/**
 * The referrer loader of fortune_master as TABLE.
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfFortuneMaster {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<FortuneMaster> _selectedList;
    protected BehaviorSelector _selector;
    protected FortuneMasterBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfFortuneMaster ready(List<FortuneMaster> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected FortuneMasterBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(FortuneMasterBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<Omikuji> _referrerOmikuji;

    /**
     * Load referrer of omikujiList by the set-upper of referrer. <br>
     * omikuji by fortune_code, named 'omikujiList'.
     * <pre>
     * <span style="color: #0000C0">fortuneMasterBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">fortuneMasterList</span>, <span style="color: #553000">masterLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">masterLoader</span>.<span style="color: #CC4747">loadOmikuji</span>(<span style="color: #553000">omikujiCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">omikujiCB</span>.setupSelect...
     *         <span style="color: #553000">omikujiCB</span>.query().set...
     *         <span style="color: #553000">omikujiCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">omikujiLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    omikujiLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (FortuneMaster fortuneMaster : <span style="color: #553000">fortuneMasterList</span>) {
     *     ... = fortuneMaster.<span style="color: #CC4747">getOmikujiList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setFortuneCode_InScope(pkList);
     * cb.query().addOrderBy_FortuneCode_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfOmikuji> loadOmikuji(ReferrerConditionSetupper<OmikujiCB> refCBLambda) {
        myBhv().loadOmikuji(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerOmikuji = refLs);
        return hd -> hd.handle(new LoaderOfOmikuji().ready(_referrerOmikuji, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<FortuneMaster> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
