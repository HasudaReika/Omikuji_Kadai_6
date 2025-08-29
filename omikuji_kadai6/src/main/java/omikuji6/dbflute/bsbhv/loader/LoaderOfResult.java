package omikuji6.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import omikuji6.dbflute.exbhv.*;
import omikuji6.dbflute.exentity.*;
import omikuji6.dbflute.cbean.*;

/**
 * The referrer loader of result as TABLE.
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfResult {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<Result> _selectedList;
    protected BehaviorSelector _selector;
    protected ResultBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfResult ready(List<Result> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected ResultBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(ResultBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<Shipping> _referrerShipping;

    /**
     * Load referrer of shippingList by the set-upper of referrer. <br>
     * shipping by result_code, named 'shippingList'.
     * <pre>
     * <span style="color: #0000C0">resultBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">resultList</span>, <span style="color: #553000">resultLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">resultLoader</span>.<span style="color: #CC4747">loadShipping</span>(<span style="color: #553000">shippingCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">shippingCB</span>.setupSelect...
     *         <span style="color: #553000">shippingCB</span>.query().set...
     *         <span style="color: #553000">shippingCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">shippingLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    shippingLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (Result result : <span style="color: #553000">resultList</span>) {
     *     ... = result.<span style="color: #CC4747">getShippingList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setResultCode_InScope(pkList);
     * cb.query().addOrderBy_ResultCode_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfShipping> loadShipping(ReferrerConditionSetupper<ShippingCB> refCBLambda) {
        myBhv().loadShipping(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerShipping = refLs);
        return hd -> hd.handle(new LoaderOfShipping().ready(_referrerShipping, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfOmikuji _foreignOmikujiLoader;
    public LoaderOfOmikuji pulloutOmikuji() {
        if (_foreignOmikujiLoader == null)
        { _foreignOmikujiLoader = new LoaderOfOmikuji().ready(myBhv().pulloutOmikuji(_selectedList), _selector); }
        return _foreignOmikujiLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<Result> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
