package omikuji6.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import omikuji6.dbflute.exbhv.*;
import omikuji6.dbflute.exentity.*;

/**
 * The referrer loader of post_code_data as TABLE.
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfPostCodeData {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<PostCodeData> _selectedList;
    protected BehaviorSelector _selector;
    protected PostCodeDataBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfPostCodeData ready(List<PostCodeData> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected PostCodeDataBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(PostCodeDataBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<PostCodeData> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
