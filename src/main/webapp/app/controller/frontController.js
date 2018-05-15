Ext.define("ssmDemo.controller.frontController",{

    extend: 'Ext.app.Controller',

    views: [

        "ssmDemo.view.collapseList",
        "ssmDemo.view.ModifyList",
        "ssmDemo.view.ArrayGrid",
        "ssmDemo.view.ShowTab",
        "ssmDemo.view.User",
        "ssmDemo.view.collapseList",
        "ssmDemo.view.Employee",
        "ssmDemo.view.Commodity",

    ],
    stores:["Company","Commodity","Employee","User"],
    models:["Company","Commodity","Employee","User"],
    init: function() {
        this.control({


        });

    },
})