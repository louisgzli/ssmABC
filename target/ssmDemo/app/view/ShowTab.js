/**
 * Created by bliss on 2018/5/15.
 */
Ext.define("ssmDemo.view.ShowTab", {
    extend:"Ext.tab.Panel",
    alias:"widget.showtab",
    id:"showtab",
    stateId:"showtab",
    closeable:true,
    initComponent: function () {
        this.callParent();
    }
    })