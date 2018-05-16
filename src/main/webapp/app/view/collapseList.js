/**
 * Created by bliss on 2018/5/13.
 */
Ext.define("tab_arraygrid",{
    extend:"Ext.panel.Panel",
    items:[{
        xtype:"arraygrid",
    }]

});
Ext.define("tab_user",{
    extend:"Ext.panel.Panel",
    items:[{
        xtype:"user",
    }]
})
Ext.define("tab_employee",{
    extend:"Ext.panel.Panel",
    items:[{
        xtype:"employee",
    }]
})
Ext.define("tab_commodity",{
    extend:"Ext.panel.Panel",
    items:[{
        xtype:"commodity",
    }]
})
Ext.define(


    'ssmDemo.view.collapseList', {
    extend:"Ext.panel.Panel",
    title: 'Accordion Layout',
    width: "100%",
    height: "80%",
    defaults: {
        // applied to each contained panel
        bodyStyle: 'padding:15px'
    },
    layout: {
        // layout-specific configs go here
        type: 'accordion',
        titleCollapse: false,
        animate: true,
        activeOnTop: true
    },
    items: [{
        title: '系统管理',
        layout : 'vbox',
        items:[
            {

                xtype:"button",
                text:"用户管理",
                width:"100%",
                handler:function(){
                    var tab = Ext.getCmp("showtab");
                    if(Ext.getCmp("usertab")==undefined){
                        tab.add(
                            [
                                {
                                    id:"usertab",
                                    title:"用户管理",
                                    closable: true,
                                    items:Ext.create("tab_user")

                                }
                            ]
                        )

                    }


                }


            },

        ]
    },
        {
        title: '企业管理',

            layout : 'vbox',


            items:[

                {
                    xtype:"button",
                    text:"企业信息管理",
                    width:"100%",
                    margin:"10px",
                    handler:function(){
                        var tab = Ext.getCmp("showtab");
                        if(Ext.getCmp("arraygridtab")==undefined){
                            tab.add(
                                [
                                    {
                                        id:"arraygridtab",
                                        title:"企业信息管理",
                                        closable: true,
                                        items:Ext.create("tab_arraygrid")

                                    }
                                ]
                            )

                        }




                    }

                },
                {
                    xtype:"button",
                    text:"从业人员管理",
                    width:"100%",
                    margin:"10px",
                    handler:function(){
                        var tab = Ext.getCmp("showtab");
                        if(Ext.getCmp("employeetab")==undefined){
                            tab.add(
                                [
                                    {
                                        id:"employeetab",
                                        title:"从业人员管理",
                                        closable: true,
                                        items:Ext.create("tab_employee")

                                    }
                                ]
                            )

                        }

                    }

                },


            ]
    },{

        title: '商品管理',

            layout: {
                // layout-specific configs go here
                type: 'accordion',
                titleCollapse: false,
                animate: true,
                activeOnTop: true
            },
            items:[

                {

                    title: '大类',
                    layout : 'vbox',
                    items:[
                        {

                            xtype:"button",
                            text:"小类",
                            width:"100%",
                            handler:function(){

                                if(Ext.getCmp("employeetab")==undefined){
                                    tab.add(
                                        [
                                            {
                                                id:"employeetab",
                                                title:"从业人员管理",
                                                closable: true,
                                                items:Ext.create("tab_employee")

                                            }
                                        ]
                                    )

                                }

                            }

                        },
                        {

                            xtype:"button",
                            text:"小类",
                            width:"100%",
                            handler:function(){
                                var tab = Ext.getCmp("showtab");
                                var tab3 = tab.add([
                                    {title:"商品管理",
                                        id:"commodity2",
                                        closable: true,
                                        items:[
                                            {
                                                xtype:"commodity",
                                            }
                                        ]
                                    }
                                ])

                            }

                        },

                    ]
                },
                {

                    title: '大类',
                    layout : 'vbox',
                    items:[
                        {

                            xtype:"button",
                            text:"小类",
                            width:"100%",
                            handler:function(){
                                var tab = Ext.getCmp("showtab");
                                var tab3 = tab.add([
                                    {title:"商品管理",
                                        id:"commodity3",
                                        closable: true,
                                        items:[
                                            {
                                                xtype:"commodity",
                                            }
                                        ]
                                    }
                                ])

                            }

                        },
                        {

                            xtype:"button",
                            text:"小类",
                            width:"100%",
                            handler:function(){
                                var tab = Ext.getCmp("showtab");
                                var tab3 = tab.add([
                                    {title:"商品管理",
                                        id:"commodity4",
                                        closable: true,
                                        items:[
                                            {
                                                xtype:"commodity",
                                            }
                                        ]
                                    }
                                ])

                            }

                        },

                    ]
                },
            ]
    }],
});
