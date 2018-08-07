package com.demo.dtable;

import com.jfinal.core.Controller;

public class Dtable extends Controller {

   public void index(){
       render("index.html");
   }

   public void culomenRender(){
       render("columens_render.html");
   }

    public void table2(){
        render("table2.html");
    }

   public void getDTables(){
       String json = "[{ \"name\": \"Tiger Nixon\", \"position\": \"System Architect\", \"salary\": \"$3,120\", \"start_date\": \"2011/04/25\", \"office\": \"Edinburgh\", \"extn\": \"5421\" }]";
       renderJson(json);
       //String arrayStr = "[ \"Tiger Nixon\", \"System Architect\", \"Edinburgh\", \"5421\", \"2011/04/25\", \"$3,120\" ]";
       //renderJson(arrayStr);
   }
}
