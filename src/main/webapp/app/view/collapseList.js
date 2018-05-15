/**
 * Created by bliss on 2018/5/13.
 */
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
                    var tab1 = tab.add([
                        {title:"用户管理",
                            id:"userTab",
                            closable: true,
                            items:[
                                {
                                    xtype:"user",
                                }
                            ]
                    }
                    ])


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
                        var tab2 = tab.add([
                            {title:"企业信息管理",
                                id:"companyTab",
                                closable: true,
                                items:[
                                    {
                                        xtype:"arraygrid",
                                    }
                                ]
                            }
                        ])



                    }

                },
                {
                    xtype:"button",
                    text:"从业人员管理",
                    width:"100%",
                    margin:"10px",
                    handler:function(){
                        var tab = Ext.getCmp("showtab");
                        var tab3 = tab.add([
                            {title:"从业人员管理",
                                id:"employeeTab",
                                closable: true,
                                items:[
                                    {
                                        xtype:"employee",
                                    }
                                ]
                            }
                        ])

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
                                var tab = Ext.getCmp("showtab");
                                var tab3 = tab.add([
                                    {title:"商品管理",
                                        id:"commodity1",
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
