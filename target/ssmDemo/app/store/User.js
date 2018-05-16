/**
 * Created by Administrator on 2018/5/14 0014.
 */
Ext.define("ssmDemo.store.User",{
    extend:"Ext.data.Store",
    model:"ssmDemo.model.User",
    autoLoad:true,
    proxy:{

        type:"ajax",
        url:"user/loadUser.action",

        reader:{
            type:"json",
            root:"users",
        },



    },

})