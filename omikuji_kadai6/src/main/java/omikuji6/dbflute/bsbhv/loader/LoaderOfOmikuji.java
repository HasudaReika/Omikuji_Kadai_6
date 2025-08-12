package omikuji6.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import omikuji6.dbflute.exbhv.*;
import omikuji6.dbflute.exentity.*;
import omikuji6.dbflute.cbean.*;

/**
 * The referrer loader of omikuji as TABLE.
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfOmikuji {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<Omikuji> _selectedList;
    protected BehaviorSelector _selector;
    protected OmikujiBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfOmikuji ready(List<Omikuji> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected OmikujiBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(OmikujiBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<Result> _referrerResult;

    /**
     * Load referrer of resultList by the set-upper of referrer. <br>
     * result by omikuji_code, named 'resultList'.
     * <pre>
     * <span style="color: #0000C0">omikujiBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">omikujiList</span>, <span style="color: #553000">omikujiLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">omikujiLoader</span>.<span style="color: #CC4747">loadResult</span>(<span style="color: #553000">resultCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">resultCB</span>.setupSelect...
     *         <span style="color: #553000">resultCB</span>.query().set...
     *         <span style="color: #553000">resultCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">resultLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    resultLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (Omikuji omikuji : <span style="color: #553000">omikujiList</span>) {
     *     ... = omikuji.<span style="color: #CC4747">getResultList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setOmikujiCode_InScope(pkList);
     * cb.query().addOrderBy_OmikujiCode_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfResult> loadResult(ReferrerConditionSetupper<ResultCB> refCBLambda) {
        myBhv().loadResult(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerResult = refLs);
        return hd -> hd.handle(new LoaderOfResult().ready(_referrerResult, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfFortuneMaster _foreignFortuneMasterLoader;
    public LoaderOfFortuneMaster pulloutFortuneMaster() {
        if (_foreignFortuneMasterLoader == null)
        { _foreignFortuneMasterLoader = new LoaderOfFortuneMaster().ready(myBhv().pulloutFortuneMaster(_selectedList), _selector); }
        return _foreignFortuneMasterLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<Omikuji> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
