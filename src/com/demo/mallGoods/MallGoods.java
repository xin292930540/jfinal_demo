package com.demo.mallGoods;

import com.jfinal.core.Controller;

public class MallGoods extends Controller {

    MallGoodsService goodsService = MallGoodsService.me;

    public void getMallGoodsList(){
        renderJson(goodsService.getPaginte(getParaToInt(0,1),10));
    }
}
